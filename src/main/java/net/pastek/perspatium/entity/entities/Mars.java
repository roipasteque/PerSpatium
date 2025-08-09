package net.pastek.perspatium.entity.entities;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.EnumSet;

public class Mars extends Monster {
    public Mars(EntityType<? extends Monster> pEntityType, Level level) {
        super(pEntityType, level);
        this.xpReward = 500;
    }

    public final AnimationState idleAnimationState_1 = new AnimationState();
    public final AnimationState idleAnimationState_2 = new AnimationState();
    public final AnimationState attackAnimationState_1 = new AnimationState();
    public final AnimationState attackAnimationState_2 = new AnimationState();
    private int idleAnimationTimeout_1 = 0;
    private int idleAnimationTimeout_2 = 0;
    private int attackAnimationTimeout_1 = 0;
    private int attackAnimationTimeout_2 = 0;
    private static final EntityDataAccessor<Boolean> ATTACKING = SynchedEntityData.defineId(Mars.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Byte> CHARGED = SynchedEntityData.defineId(Mars.class, EntityDataSerializers.BYTE);


    private void setupAnimationStates() {
        if(this.idleAnimationTimeout_2 <= 0 && attackAnimationTimeout_1 <= 0 && attackAnimationTimeout_2 <= 0) {
            this.idleAnimationTimeout_2 = this.random.nextInt(40) + 280;
            this.idleAnimationState_2.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout_2;
            if (this.idleAnimationTimeout_1 <= 0 && attackAnimationTimeout_1 <= 0 && attackAnimationTimeout_2 <= 0) {
                this.idleAnimationTimeout_1 = 120;
                this.idleAnimationState_1.start(this.tickCount);
            } else {
                --this.idleAnimationTimeout_1;
            }
        }

        if(this.isAttacking() && attackAnimationTimeout_1 <= 0 && attackAnimationTimeout_2 <= 0) {
            attackAnimationTimeout_1 = 20;
            attackAnimationState_1.start(this.tickCount);
        } else {
            --this.attackAnimationTimeout_1;
        }

        if(!this.isAttacking()) {
            attackAnimationState_1.stop();
        }

        if(this.isCharged() && attackAnimationTimeout_1 <= 0 && attackAnimationTimeout_2 <= 0) {
            this.attackAnimationTimeout_2 = 25;
            this.attackAnimationState_2.start(this.tickCount);
        } else {
            --this.attackAnimationTimeout_2;
        }

        if(!this.isCharged()) {
            this.attackAnimationState_2.stop();
        }
    }


    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 300D)
                .add(Attributes.FOLLOW_RANGE, 14D)
                .add(Attributes.MOVEMENT_SPEED, 0.2D)
                .add(Attributes.ARMOR_TOUGHNESS, 3f)
                .add(Attributes.KNOCKBACK_RESISTANCE, 2f)
                .add(Attributes.ATTACK_DAMAGE, 5f)
                .add(Attributes.ATTACK_KNOCKBACK, 3f);
    }

    @Override
    protected void registerGoals() {
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(1, new MarsBurningGoal(this, 1.0D, true));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 3f));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.WITHER_SKELETON_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource p_32235_) {
        return SoundEvents.WITHER_SKELETON_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.WITHER_SKELETON_DEATH;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ATTACKING, false);
        this.entityData.define(CHARGED, (byte)0);
    }

    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if(this.getPose() == Pose.STANDING) {
            f = Math.min(pPartialTick * 6F, 1f);
        } else {
            f = 0f;
        }

        this.walkAnimation.update(f, 0.2f);
    }

    public void setAttacking(boolean attacking) {
        this.entityData.set(ATTACKING, attacking);
    }

    public boolean isAttacking() {
        return this.entityData.get(ATTACKING);
    }

    private boolean isCharged() {
        return (this.entityData.get(CHARGED) & 1) != 0;
    }

    void setCharged(boolean p_32241_) {
        byte b0 = this.entityData.get(CHARGED);
        if (p_32241_) {
            b0 = (byte)(b0 | 1);
        } else {
            b0 = (byte)(b0 & -2);
        }

        this.entityData.set(CHARGED, b0);
    }

    @Override
    public void tick() {
        super.tick();

        if(this.level().isClientSide()) {
            setupAnimationStates();
        }
    }

    static class MarsBurningGoal extends MeleeAttackGoal {
        private final Mars mars;
        private int attackStep;
        private int attackTime;
        private int lastSeen;


        public MarsBurningGoal(PathfinderMob pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
            super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
            this.mars = ((Mars) pMob);
            this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
        }

        public boolean canUse() {
            LivingEntity livingentity = this.mars.getTarget();
            return livingentity != null && livingentity.isAlive() && this.mars.canAttack(livingentity);
        }

        public void start() {
            this.attackStep = 0;
        }

        public void stop() {
            this.mars.setCharged(false);
            this.lastSeen = 0;
        }

        public boolean requiresUpdateEveryTick() {
            return true;
        }

        private double getFollowDistance() {
            return this.mars.getAttributeValue(Attributes.FOLLOW_RANGE);
        }

        public void tick() {
            --this.attackTime;
            LivingEntity livingentity = this.mars.getTarget();
            if (livingentity != null) {
                boolean flag = this.mars.getSensing().hasLineOfSight(livingentity);
                if (flag) {
                    this.lastSeen = 0;
                } else {
                    ++this.lastSeen;
                }

                double d0 = this.mars.distanceToSqr(livingentity);
                if (d0 < 4.0D) {
                    if (!flag) {
                        return;
                    }

                    if (this.attackTime <= 0) {
                        this.attackTime = 20;
                        mars.setAttacking(true);
                        mars.swing(InteractionHand.MAIN_HAND);
                        this.mars.doHurtTarget(livingentity);
                    } else {mars.setAttacking(false);}

                    this.mars.getMoveControl().setWantedPosition(livingentity.getX(), livingentity.getY(), livingentity.getZ(), 1.0D);
                }


                else if (d0 < this.getFollowDistance() * this.getFollowDistance() && flag) {
                    double d1 = livingentity.getX() - this.mars.getX();
                    double d2 = livingentity.getY(0.5D) - this.mars.getY(0.5D);
                    double d3 = livingentity.getZ() - this.mars.getZ();
                    if (this.attackTime <= 0) {
                        ++this.attackStep;
                        if (this.attackStep == 1) {
                            this.attackTime = 20;
                            this.mars.setCharged(true);
                        } else if (this.attackStep <= 4) {
                            this.attackTime = 6;
                        } else {
                            this.attackTime = 40;
                            this.attackStep = 0;
                            this.mars.setCharged(false);
                        }

                        if (this.attackStep > 1) {
                            double d4 = Math.sqrt(Math.sqrt(d0)) * 0.5D;
                            if (!this.mars.isSilent()) {
                                this.mars.level().levelEvent((Player)null, 1018, this.mars.blockPosition(), 0);
                            }

                            for(int i = 0; i < 3; ++i) {
                                SmallFireball smallfireball = new SmallFireball(this.mars.level(), this.mars, this.mars.getRandom().triangle(d1, 2.297D * d4), d2, this.mars.getRandom().triangle(d3, 2.297D * d4));
                                smallfireball.setPos(smallfireball.getX(), this.mars.getY(0.5D) + 0.5D, smallfireball.getZ());
                                this.mars.level().addFreshEntity(smallfireball);
                            }
                        }

                    }

                    this.mars.getLookControl().setLookAt(livingentity, 10.0F, 10.0F);
                } else if (this.lastSeen < 5) {
                    this.mars.getMoveControl().setWantedPosition(livingentity.getX(), livingentity.getY(), livingentity.getZ(), 1.0D);
                }

                super.tick();
            }
        }
    }
}
