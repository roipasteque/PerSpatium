package net.pastek.perspatium.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.pastek.perspatium.PerSpatium;
import net.pastek.perspatium.registers.PSBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class PerSpatiumTagGenerator extends BlockTagsProvider {
    public PerSpatiumTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PerSpatium.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.FENCES)
                .add(PSBlocks.MIRROR_BRICKS_FENCE.get())
                .add(PSBlocks.BLOOD_BRICKS_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(PSBlocks.MIRROR_BRICKS_FENCE_GATE.get())
                .add(PSBlocks.BLOOD_BRICKS_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(PSBlocks.MIRROR_BRICKS_WALL.get())
                .add(PSBlocks.BLOOD_BRICKS_WALL.get())
                .add(PSBlocks.SF_STONE_WALL.get())
                .add(PSBlocks.SF_COBBLESTONE_WALL.get())
                .add(PSBlocks.IP_SMALL_STONE_BRICKS_WALL.get())
                .add(PSBlocks.IP_FROZEN_STONE_BRICKS_WALL.get())
                .add(PSBlocks.SCARLET_STONE_BRICKS_WALL.get())
                .add(PSBlocks.RT_WHITE_METAL_WALL.get())
                .add(PSBlocks.RT_BLACK_METAL_WALL.get());

    }
}