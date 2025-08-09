package net.pastek.perspatium.registers.item;

import javax.annotation.Nonnull;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolActions;
import net.pastek.perspatium.registers.PSTags;

public class TorchOfSins extends DiggerItem {

    public TorchOfSins(Tier tier, Properties prop) {
        super(0, -2.4f, tier, PSTags.Blocks.MINEABLE_WITH_TORCHOFSINS, prop.durability(600));
    }

    @Deprecated(forRemoval = true)


    @Override
    public boolean isCorrectToolForDrops(BlockState state) {
        if (net.minecraftforge.common.TierSortingRegistry.isTierSorted(getTier()))
            return net.minecraftforge.common.TierSortingRegistry.isCorrectTierForDrops(getTier(), state)
                    && (state.is(PSTags.Blocks.MINEABLE_WITH_TORCHOFSINS));
        int i = getTier().getLevel();
        if (i < 3 && state.is(BlockTags.NEEDS_DIAMOND_TOOL)
                || i < 2 && state.is(BlockTags.NEEDS_IRON_TOOL))
            return false;
        return i >= 1 && state.is(BlockTags.NEEDS_STONE_TOOL)
                && (state.is(PSTags.Blocks.MINEABLE_WITH_TORCHOFSINS));
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }

    // FORGE START
    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
        return (state.is(PSTags.Blocks.MINEABLE_WITH_TORCHOFSINS))
                && net.minecraftforge.common.TierSortingRegistry.isCorrectTierForDrops(getTier(), state);
    }

    @Override
    public float getDestroySpeed(@Nonnull ItemStack stack, BlockState state) {
        if (isCorrectToolForDrops(stack, state))
            return getTier().getSpeed();
        return 1;
    }

    @Nonnull
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();
        ItemStack stack = context.getItemInHand();
        BlockState state = world.getBlockState(pos);
        BlockState result = state.getToolModifiedState(context, ToolActions.AXE_WAX_OFF, false);
        if (result != null) {
            world.playSound(player, pos, SoundEvents.GENERIC_EXTINGUISH_FIRE, SoundSource.BLOCKS, 1.0F, 1.0F);
        } else {
            if (state.getBlock() instanceof CampfireBlock
                    && state.getValue(CampfireBlock.LIT) == Boolean.FALSE) {
                if (!world.isClientSide) {
                    world.levelEvent(null, 1009, pos, 0);
                }
                CampfireBlock.dowse(player, world, pos, state);
                result = state.setValue(CampfireBlock.LIT, true);
            }
        }
        if (result == null)
            return InteractionResult.PASS;
        if (!world.isClientSide) {
            world.setBlock(pos, result, Block.UPDATE_ALL);
            if (player != null) {
                stack.hurtAndBreak(1, player, onBroken -> onBroken.broadcastBreakEvent(context.getHand()));
            }
        }
        return InteractionResult.sidedSuccess(world.isClientSide);
    }
}