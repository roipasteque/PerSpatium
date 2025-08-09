package net.pastek.perspatium.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.pastek.perspatium.PerSpatium;
import net.pastek.perspatium.registers.PSBlocks;

public class PerSpatiumBlockStateProvider extends BlockStateProvider {
    public PerSpatiumBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PerSpatium.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(((RotatedPillarBlock) PSBlocks.DOOR_PILLAR_BLUE.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.DOOR_PILLAR_GREEN.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.DOOR_PILLAR_YELLOW.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.DOOR_PILLAR_RED.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.DOOR_PILLAR_PURPLE.get()));

        blockWithItem(PSBlocks.MIRROR_STONE);
        blockWithItem(PSBlocks.MIRROR_BRICKS);
        stairsBlock(((StairBlock) PSBlocks.MIRROR_BRICKS_STAIRS.get()), blockTexture(PSBlocks.MIRROR_BRICKS.get()));
        slabBlock(((SlabBlock) PSBlocks.MIRROR_BRICKS_SLAB.get()), blockTexture(PSBlocks.MIRROR_BRICKS.get()), blockTexture(PSBlocks.MIRROR_BRICKS.get()));
        fenceBlock(((FenceBlock) PSBlocks.MIRROR_BRICKS_FENCE.get()), blockTexture(PSBlocks.MIRROR_BRICKS.get()));
        fenceGateBlock(((FenceGateBlock) PSBlocks.MIRROR_BRICKS_FENCE_GATE.get()), blockTexture(PSBlocks.MIRROR_BRICKS.get()));
        wallBlock(((WallBlock) PSBlocks.MIRROR_BRICKS_WALL.get()), blockTexture(PSBlocks.MIRROR_BRICKS.get()));
        blockWithItem(PSBlocks.MIRROR_COBBLESTONE);
        blockWithItem(PSBlocks.MIRROR_STONE_POLISHED);
        blockWithItem(PSBlocks.MIRROR_STONE_EMBEDDED);
        logBlock(((RotatedPillarBlock) PSBlocks.MIRROR_CHISELED_STONE.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.MIRROR_CHISELED_BRICKS.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.MIRROR_STONE_PILLAR.get()));

        blockWithItem(PSBlocks.BLOOD_STONE);
        blockWithItem(PSBlocks.BLOOD_BRICKS);
        stairsBlock(((StairBlock) PSBlocks.BLOOD_BRICKS_STAIRS.get()), blockTexture(PSBlocks.BLOOD_BRICKS.get()));
        slabBlock(((SlabBlock) PSBlocks.BLOOD_BRICKS_SLAB.get()), blockTexture(PSBlocks.BLOOD_BRICKS.get()), blockTexture(PSBlocks.BLOOD_BRICKS.get()));
        fenceBlock(((FenceBlock) PSBlocks.BLOOD_BRICKS_FENCE.get()), blockTexture(PSBlocks.BLOOD_BRICKS.get()));
        fenceGateBlock(((FenceGateBlock) PSBlocks.BLOOD_BRICKS_FENCE_GATE.get()), blockTexture(PSBlocks.BLOOD_BRICKS.get()));
        wallBlock(((WallBlock) PSBlocks.BLOOD_BRICKS_WALL.get()), blockTexture(PSBlocks.BLOOD_BRICKS.get()));
        blockWithItem(PSBlocks.BLOOD_COBBLESTONE);
        blockWithItem(PSBlocks.BLOOD_STONE_POLISHED);
        blockWithItem(PSBlocks.BLOOD_STONE_EMBEDDED);
        logBlock(((RotatedPillarBlock) PSBlocks.BLOOD_CHISELED_STONE.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.BLOOD_CHISELED_BRICKS.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.BLOOD_STONE_PILLAR.get()));
        blockWithItem(PSBlocks.BLOOD_STONE_LAMP);
        logBlock(((RotatedPillarBlock) PSBlocks.BLOOD_LOG.get()));
        blockWithItem(PSBlocks.BLOOD_PLANKS);
        stairsBlock(((StairBlock) PSBlocks.BLOOD_PLANKS_STAIRS.get()), blockTexture(PSBlocks.BLOOD_PLANKS.get()));
        slabBlock(((SlabBlock) PSBlocks.BLOOD_PLANKS_SLAB.get()), blockTexture(PSBlocks.BLOOD_PLANKS.get()), blockTexture(PSBlocks.BLOOD_PLANKS.get()));
        blockWithItem(PSBlocks.BLOOD_WEB);

        blockWithItem(PSBlocks.SF_STONE);
        stairsBlock(((StairBlock) PSBlocks.SF_STONE_STAIRS.get()), blockTexture(PSBlocks.SF_STONE.get()));
        slabBlock(((SlabBlock) PSBlocks.SF_STONE_SLAB.get()), blockTexture(PSBlocks.SF_STONE.get()), blockTexture(PSBlocks.SF_STONE.get()));
        wallBlock(((WallBlock) PSBlocks.SF_STONE_WALL.get()), blockTexture(PSBlocks.SF_STONE.get()));
        blockWithItem(PSBlocks.SF_COBBLESTONE);
        stairsBlock(((StairBlock) PSBlocks.SF_COBBLESTONE_STAIRS.get()), blockTexture(PSBlocks.SF_COBBLESTONE.get()));
        slabBlock(((SlabBlock) PSBlocks.SF_COBBLESTONE_SLAB.get()), blockTexture(PSBlocks.SF_COBBLESTONE.get()), blockTexture(PSBlocks.SF_COBBLESTONE.get()));
        wallBlock(((WallBlock) PSBlocks.SF_COBBLESTONE_WALL.get()), blockTexture(PSBlocks.SF_COBBLESTONE.get()));
        blockWithItem(PSBlocks.SF_STONE_BRICKS);
        stairsBlock(((StairBlock) PSBlocks.SF_STONE_BRICKS_STAIRS.get()), blockTexture(PSBlocks.SF_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) PSBlocks.SF_STONE_BRICKS_SLAB.get()), blockTexture(PSBlocks.SF_STONE_BRICKS.get()), blockTexture(PSBlocks.SF_STONE_BRICKS.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.SF_CHISELED_STONE_BRICKS.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.SF_GLOWING_CHISELED_STONE_BRICKS.get()));
        blockWithItem(PSBlocks.SF_SMALL_STONE_BRICKS);
        stairsBlock(((StairBlock) PSBlocks.SF_SMALL_STONE_BRICKS_STAIRS.get()), blockTexture(PSBlocks.SF_SMALL_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) PSBlocks.SF_SMALL_STONE_BRICKS_SLAB.get()), blockTexture(PSBlocks.SF_SMALL_STONE_BRICKS.get()), blockTexture(PSBlocks.SF_SMALL_STONE_BRICKS.get()));
        blockWithItem(PSBlocks.SF_CRACKED_SMALL_STONE_BRICKS);
        blockWithItem(PSBlocks.SF_RED_STONE_BRICKS);
        stairsBlock(((StairBlock) PSBlocks.SF_RED_STONE_BRICKS_STAIRS.get()), blockTexture(PSBlocks.SF_RED_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) PSBlocks.SF_RED_STONE_BRICKS_SLAB.get()), blockTexture(PSBlocks.SF_RED_STONE_BRICKS.get()), blockTexture(PSBlocks.SF_RED_STONE_BRICKS.get()));
        blockWithItem(PSBlocks.SF_BLACK_STONE);
        stairsBlock(((StairBlock) PSBlocks.SF_BLACK_STONE_STAIRS.get()), blockTexture(PSBlocks.SF_BLACK_STONE.get()));
        slabBlock(((SlabBlock) PSBlocks.SF_BLACK_STONE_SLAB.get()), blockTexture(PSBlocks.SF_BLACK_STONE.get()), blockTexture(PSBlocks.SF_BLACK_STONE.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.SF_BLACK_STONE_PILLAR.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.SF_CHISELED_BLACK_STONE_PILLAR.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.SF_STONE_PILLAR.get()));

        blockWithItem(PSBlocks.IP_STONE);
        stairsBlock(((StairBlock) PSBlocks.IP_STONE_STAIRS.get()), blockTexture(PSBlocks.IP_STONE.get()));
        slabBlock(((SlabBlock) PSBlocks.IP_STONE_SLAB.get()), blockTexture(PSBlocks.IP_STONE.get()), blockTexture(PSBlocks.IP_STONE.get()));
        blockWithItem(PSBlocks.IP_COBBLESTONE);
        stairsBlock(((StairBlock) PSBlocks.IP_COBBLESTONE_STAIRS.get()), blockTexture(PSBlocks.IP_COBBLESTONE.get()));
        slabBlock(((SlabBlock) PSBlocks.IP_COBBLESTONE_SLAB.get()), blockTexture(PSBlocks.IP_COBBLESTONE.get()), blockTexture(PSBlocks.IP_COBBLESTONE.get()));
        blockWithItem(PSBlocks.IP_CHISELED_STONE_BRICKS);
        stairsBlock(((StairBlock) PSBlocks.IP_CHISELED_STONE_BRICKS_STAIRS.get()), blockTexture(PSBlocks.IP_CHISELED_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) PSBlocks.IP_CHISELED_STONE_BRICKS_SLAB.get()), blockTexture(PSBlocks.IP_CHISELED_STONE_BRICKS.get()), blockTexture(PSBlocks.IP_CHISELED_STONE_BRICKS.get()));
        blockWithItem(PSBlocks.IP_SMALL_STONE_BRICKS);
        stairsBlock(((StairBlock) PSBlocks.IP_SMALL_STONE_BRICKS_STAIRS.get()), blockTexture(PSBlocks.IP_SMALL_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) PSBlocks.IP_SMALL_STONE_BRICKS_SLAB.get()), blockTexture(PSBlocks.IP_SMALL_STONE_BRICKS.get()), blockTexture(PSBlocks.IP_SMALL_STONE_BRICKS.get()));
        wallBlock(((WallBlock) PSBlocks.IP_SMALL_STONE_BRICKS_WALL.get()), blockTexture(PSBlocks.IP_SMALL_STONE_BRICKS.get()));
        blockWithItem(PSBlocks.IP_CRACKED_SMALL_STONE_BRICKS);
        blockWithItem(PSBlocks.IP_POLISHED_STONE);
        stairsBlock(((StairBlock) PSBlocks.IP_POLISHED_STONE_STAIRS.get()), blockTexture(PSBlocks.IP_POLISHED_STONE.get()));
        slabBlock(((SlabBlock) PSBlocks.IP_POLISHED_STONE_SLAB.get()), blockTexture(PSBlocks.IP_POLISHED_STONE.get()), blockTexture(PSBlocks.IP_POLISHED_STONE.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.IP_STONE_PILLAR.get()));
        blockWithItem(PSBlocks.IP_FROZEN_COBBLESTONE);
        blockWithItem(PSBlocks.IP_FROZEN_STONE_BRICKS);
        stairsBlock(((StairBlock) PSBlocks.IP_FROZEN_STONE_BRICKS_STAIRS.get()), blockTexture(PSBlocks.IP_FROZEN_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) PSBlocks.IP_FROZEN_STONE_BRICKS_SLAB.get()), blockTexture(PSBlocks.IP_FROZEN_STONE_BRICKS.get()), blockTexture(PSBlocks.IP_FROZEN_STONE_BRICKS.get()));
        wallBlock(((WallBlock) PSBlocks.IP_FROZEN_STONE_BRICKS_WALL.get()), blockTexture(PSBlocks.IP_FROZEN_STONE_BRICKS.get()));
        blockWithItem(PSBlocks.IP_CRACKED_FROZEN_STONE_BRICKS);
        blockWithItem(PSBlocks.IP_FROZEN_SMALL_STONE_BRICKS);
        blockWithItem(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS);
        stairsBlock(((StairBlock) PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS_STAIRS.get()), blockTexture(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS_SLAB.get()), blockTexture(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS.get()), blockTexture(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS.get()));
        blockWithItem(PSBlocks.IP_FROZEN_POLISHED_STONE);
        stairsBlock(((StairBlock) PSBlocks.IP_FROZEN_POLISHED_STONE_STAIRS.get()), blockTexture(PSBlocks.IP_FROZEN_POLISHED_STONE.get()));
        slabBlock(((SlabBlock) PSBlocks.IP_FROZEN_POLISHED_STONE_SLAB.get()), blockTexture(PSBlocks.IP_FROZEN_POLISHED_STONE.get()), blockTexture(PSBlocks.IP_FROZEN_POLISHED_STONE.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.IP_FROZEN_STONE_PILLAR.get()));

        blockWithItem(PSBlocks.SCARLET_STONE);
        stairsBlock(((StairBlock) PSBlocks.SCARLET_STONE_STAIRS.get()), blockTexture(PSBlocks.SCARLET_STONE.get()));
        slabBlock(((SlabBlock) PSBlocks.SCARLET_STONE_SLAB.get()), blockTexture(PSBlocks.SCARLET_STONE.get()), blockTexture(PSBlocks.SCARLET_STONE.get()));
        blockWithItem(PSBlocks.SCARLET_COBBLESTONE);
        stairsBlock(((StairBlock) PSBlocks.SCARLET_COBBLESTONE_STAIRS.get()), blockTexture(PSBlocks.SCARLET_COBBLESTONE.get()));
        slabBlock(((SlabBlock) PSBlocks.SCARLET_COBBLESTONE_SLAB.get()), blockTexture(PSBlocks.SCARLET_COBBLESTONE.get()), blockTexture(PSBlocks.SCARLET_COBBLESTONE.get()));
        blockWithItem(PSBlocks.SCARLET_STONE_BRICKS);
        stairsBlock(((StairBlock) PSBlocks.SCARLET_STONE_BRICKS_STAIRS.get()), blockTexture(PSBlocks.SCARLET_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) PSBlocks.SCARLET_STONE_BRICKS_SLAB.get()), blockTexture(PSBlocks.SCARLET_STONE_BRICKS.get()), blockTexture(PSBlocks.SCARLET_STONE_BRICKS.get()));
        wallBlock(((WallBlock) PSBlocks.SCARLET_STONE_BRICKS_WALL.get()), blockTexture(PSBlocks.SCARLET_STONE_BRICKS.get()));
        blockWithItem(PSBlocks.SCARLET_CHISELED_STONE_BRICKS);
        stairsBlock(((StairBlock) PSBlocks.SCARLET_CHISELED_STONE_BRICKS_STAIRS.get()), blockTexture(PSBlocks.SCARLET_CHISELED_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) PSBlocks.SCARLET_CHISELED_STONE_BRICKS_SLAB.get()), blockTexture(PSBlocks.SCARLET_CHISELED_STONE_BRICKS.get()), blockTexture(PSBlocks.SCARLET_CHISELED_STONE_BRICKS.get()));
        logBlock(((RotatedPillarBlock) PSBlocks.SCARLET_STONE_PILLAR.get()));

        blockWithItem(PSBlocks.RT_BROWN_CONCRETE);
        stairsBlock(((StairBlock) PSBlocks.RT_BROWN_CONCRETE_STAIRS.get()), blockTexture(PSBlocks.RT_BROWN_CONCRETE.get()));
        slabBlock(((SlabBlock) PSBlocks.RT_BROWN_CONCRETE_SLAB.get()), blockTexture(PSBlocks.RT_BROWN_CONCRETE.get()), blockTexture(PSBlocks.RT_BROWN_CONCRETE.get()));
        blockWithItem(PSBlocks.RT_WHITE_CONCRETE);
        stairsBlock(((StairBlock) PSBlocks.RT_WHITE_CONCRETE_STAIRS.get()), blockTexture(PSBlocks.RT_WHITE_CONCRETE.get()));
        slabBlock(((SlabBlock) PSBlocks.RT_WHITE_CONCRETE_SLAB.get()), blockTexture(PSBlocks.RT_WHITE_CONCRETE.get()), blockTexture(PSBlocks.RT_WHITE_CONCRETE.get()));
        blockWithItem(PSBlocks.RT_BLACK_CONCRETE);
        stairsBlock(((StairBlock) PSBlocks.RT_BLACK_CONCRETE_STAIRS.get()), blockTexture(PSBlocks.RT_BLACK_CONCRETE.get()));
        slabBlock(((SlabBlock) PSBlocks.RT_BLACK_CONCRETE_SLAB.get()), blockTexture(PSBlocks.RT_BLACK_CONCRETE.get()), blockTexture(PSBlocks.RT_BLACK_CONCRETE.get()));
        blockWithItem(PSBlocks.RT_RED_CONCRETE);
        stairsBlock(((StairBlock) PSBlocks.RT_RED_CONCRETE_STAIRS.get()), blockTexture(PSBlocks.RT_RED_CONCRETE.get()));
        slabBlock(((SlabBlock) PSBlocks.RT_RED_CONCRETE_SLAB.get()), blockTexture(PSBlocks.RT_RED_CONCRETE.get()), blockTexture(PSBlocks.RT_RED_CONCRETE.get()));
        blockWithItem(PSBlocks.RT_CONCRETE_TILES);
        blockWithItem(PSBlocks.RT_WHITE_METAL);
        stairsBlock(((StairBlock) PSBlocks.RT_WHITE_METAL_STAIRS.get()), blockTexture(PSBlocks.RT_WHITE_METAL.get()));
        slabBlock(((SlabBlock) PSBlocks.RT_WHITE_METAL_SLAB.get()), blockTexture(PSBlocks.RT_WHITE_METAL.get()), blockTexture(PSBlocks.RT_WHITE_METAL.get()));
        wallBlock(((WallBlock) PSBlocks.RT_WHITE_METAL_WALL.get()), blockTexture(PSBlocks.RT_WHITE_METAL.get()));
        blockWithItem(PSBlocks.RT_BLACK_METAL);
        stairsBlock(((StairBlock) PSBlocks.RT_BLACK_METAL_STAIRS.get()), blockTexture(PSBlocks.RT_BLACK_METAL.get()));
        slabBlock(((SlabBlock) PSBlocks.RT_BLACK_METAL_SLAB.get()), blockTexture(PSBlocks.RT_BLACK_METAL.get()), blockTexture(PSBlocks.RT_BLACK_METAL.get()));
        wallBlock(((WallBlock) PSBlocks.RT_BLACK_METAL_WALL.get()), blockTexture(PSBlocks.RT_BLACK_METAL.get()));
        blockWithItem(PSBlocks.RT_GLOWING_BROWN_CONCRETE);
        blockWithItem(PSBlocks.RT_GLOWING_WHITE_CONCRETE);
        blockWithItem(PSBlocks.RT_GLOWING_BLACK_CONCRETE);
        blockWithItem(PSBlocks.RT_GLOWING_RED_CONCRETE);
        blockWithItem(PSBlocks.RT_PINK_LAMP);
        logBlock(((RotatedPillarBlock) PSBlocks.RT_LIGHT_PROJECTOR.get()));
        blockWithItem(PSBlocks.RT_GLASS);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}