package net.pastek.perspatium.entity.entities;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.EnumSet;

public class Burner extends Monster {
    public Burner(EntityType<? extends Monster> pEntityType, Level level) {
        super(pEntityType, level);
        this.xpReward = 6;
    }

    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState idle2AnimationState = new AnimationState();
    private static final EntityDataAccessor<Byte> DATA_FLAGS_ID = SynchedEntityData.defineId(Burner.class, EntityDataSerializers.BYTE);
    private int idleAnimationTimeout = 0;
    private int idle2AnimationTimeout = 0;
    public final AnimationState attackAnimationState = new AnimationState();
    private int attackAnimationTimeout = 0;


    private void setupAnimationStates() {
        if(this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
            if (this.idle2AnimationTimeout <= 0) {
                this.idle2AnimationTimeout = this.random.nextInt(40) + 80;
                this.idle2AnimationState.start(this.tickCount);
            } else {
                --this.idle2AnimationTimeout;
            }
        }

        if(this.isCharged() && attackAnimationTimeout <= 0) {
            this.attackAnimationTimeout = 65;
            this.attackAnimationState.start(this.tickCount);
        } else {
            --this.attackAnimationTimeout;
        }

        if(!this.isCharged()) {
            this.attackAnimationState.stop();
        }
    }


    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 50D)
                .add(Attributes.FOLLOW_RANGE, 12D)
                .add(Attributes.MOVEMENT_SPEED, 0D)
                .add(Attributes.ARMOR_TOUGHNESS, 0.5f)
                .add(Attributes.ATTACK_DAMAGE, 3f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.1f)
                .add(Attributes.KNOCKBACK_RESISTANCE, 10f);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(4, new Burner.BurnerAttackGoal(this));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 3f));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.BLAZE_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource p_32235_) {
        return SoundEvents.BLAZE_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.BLAZE_DEATH;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_FLAGS_ID, (byte)0);
    }

    private boolean isCharged() {
        return (this.entityData.get(DATA_FLAGS_ID) & 1) != 0;
    }

    void setCharged(boolean p_32241_) {
        byte b0 = this.entityData.get(DATA_FLAGS_ID);
        if (p_32241_) {
            b0 = (byte)(b0 | 1);
        } else {
            b0 = (byte)(b0 & -2);
        }

        this.entityData.set(DATA_FLAGS_ID, b0);
    }

    @Override
    public void tick() {
        super.tick();

        if(this.level().isClientSide()) {
            setupAnimationStates();
        }
    }

    static class BurnerAttackGoal extends Goal {
        private final Burner burner;
        private int attackStep;
        private int attackTime;
        private int lastSeen;


        public BurnerAttackGoal(Burner p_32247_) {
            this.burner = p_32247_;
            this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
        }

        public boolean canUse() {
            LivingEntity livingentity = this.burner.getTarget();
            return livingentity != null && livingentity.isAlive() && this.burner.canAttack(livingentity);
        }

        public void start() {
            this.attackStep = 0;
        }

        public void stop() {
            this.burner.setCharged(false);
            this.lastSeen = 0;
        }

        public boolean requiresUpdateEveryTick() {
            return true;
        }

        private double getFollowDistance() {
            return this.burner.getAttributeValue(Attributes.FOLLOW_RANGE);
        }

        public void tick() {
            --this.attackTime;
            LivingEntity livingentity = this.burner.getTarget();
            if (livingentity != null) {
                boolean flag = this.burner.getSensing().hasLineOfSight(livingentity);
                if (flag) {
                    this.lastSeen = 0;
                } else {
                    ++this.lastSeen;
                }

                double d0 = this.burner.distanceToSqr(livingentity);
                if (d0 < 4.0D) {
                    if (!flag) {
                        return;
                    }

                    if (this.attackTime <= 0) {
                        this.attackTime = 20;
                        this.burner.doHurtTarget(livingentity);
                    }

                    this.burner.getMoveControl().setWantedPosition(livingentity.getX(), livingentity.getY(), livingentity.getZ(), 1.0D);
                } else if (d0 < this.getFollowDistance() * this.getFollowDistance() && flag) {
                    double d1 = livingentity.getX() - this.burner.getX();
                    double d2 = livingentity.getY(0.5D) - this.burner.getY(0.5D);
                    double d3 = livingentity.getZ() - this.burner.getZ();
                    if (this.attackTime <= 0) {
                        ++this.attackStep;
                        if (this.attackStep == 1) {
                            this.attackTime = 20;
                            this.burner.setCharged(true);
                        } else if (this.attackStep <= 4) {
                            this.attackTime = 6;
                        } else {
                            this.attackTime = 40;
                            this.attackStep = 0;
                            this.burner.setCharged(false);
                        }

                        if (this.attackStep > 1) {
                            double d4 = Math.sqrt(Math.sqrt(d0)) * 0.5D;
                            if (!this.burner.isSilent()) {
                                this.burner.level().levelEvent((Player)null, 1018, this.burner.blockPosition(), 0);
                            }

                            for(int i = 0; i < 3; ++i) {
                                SmallFireball smallfireball = new SmallFireball(this.burner.level(), this.burner, this.burner.getRandom().triangle(d1, 2.297D * d4), d2, this.burner.getRandom().triangle(d3, 2.297D * d4));
                                smallfireball.setPos(smallfireball.getX(), this.burner.getY(0.5D) + 0.5D, smallfireball.getZ());
                                this.burner.level().addFreshEntity(smallfireball);
                            }
                        }

                    }

                    this.burner.getLookControl().setLookAt(livingentity, 10.0F, 10.0F);
                } else if (this.lastSeen < 5) {
                    this.burner.getMoveControl().setWantedPosition(livingentity.getX(), livingentity.getY(), livingentity.getZ(), 1.0D);
                }

                super.tick();
            }
        }
    }
}
