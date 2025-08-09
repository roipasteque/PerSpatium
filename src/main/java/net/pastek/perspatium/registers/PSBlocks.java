package net.pastek.perspatium.registers;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pastek.perspatium.PerSpatium;


import java.util.function.Supplier;

public class PSBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PerSpatium.MOD_ID);

    // Per Spatium
    public static final RegistryObject<Block> DOOR_PILLAR_BLUE = registerBlock("door_pillar_blue",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).lightLevel(BlockState -> 12)));
    public static final RegistryObject<Block> DOOR_PILLAR_GREEN = registerBlock("door_pillar_green",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).lightLevel(BlockState -> 12)));
    public static final RegistryObject<Block> DOOR_PILLAR_YELLOW = registerBlock("door_pillar_yellow",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).lightLevel(BlockState -> 12)));
    public static final RegistryObject<Block> DOOR_PILLAR_RED = registerBlock("door_pillar_red",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).lightLevel(BlockState -> 12)));
    public static final RegistryObject<Block> DOOR_PILLAR_PURPLE = registerBlock("door_pillar_purple",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).lightLevel(BlockState -> 12)));

    // Mirror Temple
    public static final RegistryObject<Block> MIRROR_STONE = registerBlock("mirror_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> MIRROR_BRICKS = registerBlock("mirror_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> MIRROR_BRICKS_STAIRS = registerBlock("mirror_bricks_stairs",
            () -> new StairBlock(() -> PSBlocks.MIRROR_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> MIRROR_BRICKS_SLAB = registerBlock("mirror_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> MIRROR_BRICKS_FENCE = registerBlock("mirror_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> MIRROR_BRICKS_FENCE_GATE = registerBlock("mirror_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> MIRROR_BRICKS_WALL = registerBlock("mirror_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> MIRROR_COBBLESTONE = registerBlock("mirror_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> MIRROR_STONE_POLISHED = registerBlock("polished_mirror_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> MIRROR_STONE_EMBEDDED = registerBlock("embedded_mirror_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> MIRROR_CHISELED_BRICKS = registerBlock("chiseled_mirror_bricks",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> MIRROR_CHISELED_STONE = registerBlock("chiseled_mirror_stone",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> MIRROR_STONE_PILLAR = registerBlock("mirror_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));

    //Mercury
    public static final RegistryObject<Block> BLOOD_STONE = registerBlock("blood_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_BRICKS = registerBlock("blood_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_BRICKS_STAIRS = registerBlock("blood_bricks_stairs",
            () -> new StairBlock(() -> PSBlocks.BLOOD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_BRICKS_SLAB = registerBlock("blood_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_BRICKS_FENCE = registerBlock("blood_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_BRICKS_FENCE_GATE = registerBlock("blood_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> BLOOD_BRICKS_WALL = registerBlock("blood_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_COBBLESTONE = registerBlock("blood_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_STONE_POLISHED = registerBlock("polished_blood_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_STONE_EMBEDDED = registerBlock("embedded_blood_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_CHISELED_BRICKS = registerBlock("chiseled_blood_bricks",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_CHISELED_STONE = registerBlock("chiseled_blood_stone",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_STONE_PILLAR = registerBlock("blood_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> BLOOD_STONE_LAMP = registerBlock("blood_stone_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).lightLevel(BlockState -> 15)));
    public static final RegistryObject<Block> BLOOD_LOG = registerBlock("blood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> BLOOD_PLANKS = registerBlock("blood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> BLOOD_PLANKS_STAIRS = registerBlock("blood_planks_stairs",
            () -> new StairBlock(() -> PSBlocks.BLOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> BLOOD_PLANKS_SLAB = registerBlock("blood_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> BLOOD_WEB = registerBlock("blood_web",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(20f).sound(SoundType.SOUL_SAND).requiresCorrectToolForDrops()));

    // Stone fortress
    public static final RegistryObject<Block> SF_STONE = registerBlock("sf_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_STONE_STAIRS = registerBlock("sf_stone_stairs",
            () -> new StairBlock(() -> PSBlocks.SF_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_STONE_SLAB = registerBlock("sf_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_STONE_WALL = registerBlock("sf_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_COBBLESTONE = registerBlock("sf_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_COBBLESTONE_STAIRS = registerBlock("sf_cobblestone_stairs",
            () -> new StairBlock(() -> PSBlocks.SF_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_COBBLESTONE_SLAB = registerBlock("sf_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_COBBLESTONE_WALL = registerBlock("sf_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_STONE_BRICKS = registerBlock("sf_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_STONE_BRICKS_STAIRS = registerBlock("sf_stone_bricks_stairs",
            () -> new StairBlock(() -> PSBlocks.SF_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_STONE_BRICKS_SLAB = registerBlock("sf_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_CHISELED_STONE_BRICKS = registerBlock("sf_chiseled_stone_bricks",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_GLOWING_CHISELED_STONE_BRICKS = registerBlock("sf_glowing_chiseled_stone_bricks",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).lightLevel(BlockState -> 15)));
    public static final RegistryObject<Block> SF_SMALL_STONE_BRICKS = registerBlock("sf_small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_SMALL_STONE_BRICKS_STAIRS = registerBlock("sf_small_stone_bricks_stairs",
            () -> new StairBlock(() -> PSBlocks.SF_SMALL_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_SMALL_STONE_BRICKS_SLAB = registerBlock("sf_small_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_CRACKED_SMALL_STONE_BRICKS = registerBlock("sf_cracked_small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f)));
    public static final RegistryObject<Block> SF_RED_STONE_BRICKS = registerBlock("sf_red_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_RED_STONE_BRICKS_STAIRS = registerBlock("sf_red_stone_bricks_stairs",
            () -> new StairBlock(() -> PSBlocks.SF_RED_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_RED_STONE_BRICKS_SLAB = registerBlock("sf_red_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_BLACK_STONE = registerBlock("sf_black_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_BLACK_STONE_STAIRS = registerBlock("sf_black_stone_stairs",
            () -> new StairBlock(() -> PSBlocks.SF_BLACK_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_BLACK_STONE_SLAB = registerBlock("sf_black_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_BLACK_STONE_PILLAR = registerBlock("sf_black_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_CHISELED_BLACK_STONE_PILLAR = registerBlock("sf_chiseled_black_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_STONE_PILLAR = registerBlock("sf_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SF_BARS = registerBlock("sf_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).noOcclusion()));

    //Ice peak
    public static final RegistryObject<Block> IP_STONE = registerBlock("ip_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_STONE_STAIRS = registerBlock("ip_stone_stairs",
            () -> new StairBlock(() -> PSBlocks.IP_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_STONE_SLAB = registerBlock("ip_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_COBBLESTONE = registerBlock("ip_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_COBBLESTONE_STAIRS = registerBlock("ip_cobblestone_stairs",
            () -> new StairBlock(() -> PSBlocks.IP_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_COBBLESTONE_SLAB = registerBlock("ip_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_CHISELED_STONE_BRICKS = registerBlock("ip_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_CHISELED_STONE_BRICKS_STAIRS = registerBlock("ip_chiseled_stone_bricks_stairs",
            () -> new StairBlock(() -> PSBlocks.IP_CHISELED_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_CHISELED_STONE_BRICKS_SLAB = registerBlock("ip_chiseled_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_SMALL_STONE_BRICKS = registerBlock("ip_small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_SMALL_STONE_BRICKS_STAIRS = registerBlock("ip_small_stone_bricks_stairs",
            () -> new StairBlock(() -> PSBlocks.IP_SMALL_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_SMALL_STONE_BRICKS_SLAB = registerBlock("ip_small_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_SMALL_STONE_BRICKS_WALL = registerBlock("ip_small_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_CRACKED_SMALL_STONE_BRICKS = registerBlock("ip_cracked_small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f)));
    public static final RegistryObject<Block> IP_POLISHED_STONE = registerBlock("ip_polished_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_POLISHED_STONE_STAIRS = registerBlock("ip_polished_stone_stairs",
            () -> new StairBlock(() -> PSBlocks.IP_POLISHED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_POLISHED_STONE_SLAB = registerBlock("ip_polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_STONE_PILLAR = registerBlock("ip_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_COBBLESTONE = registerBlock("ip_frozen_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_STONE_BRICKS = registerBlock("ip_frozen_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_STONE_BRICKS_STAIRS = registerBlock("ip_frozen_stone_bricks_stairs",
            () -> new StairBlock(() -> PSBlocks.IP_FROZEN_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_STONE_BRICKS_SLAB = registerBlock("ip_frozen_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_STONE_BRICKS_WALL = registerBlock("ip_frozen_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_CRACKED_FROZEN_STONE_BRICKS = registerBlock("ip_frozen_cracked_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f)));
    public static final RegistryObject<Block> IP_FROZEN_SMALL_STONE_BRICKS = registerBlock("ip_frozen_small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_CHISELED_STONE_BRICKS = registerBlock("ip_frozen_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_CHISELED_STONE_BRICKS_STAIRS = registerBlock("ip_frozen_chiseled_stone_bricks_stairs",
            () -> new StairBlock(() -> PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_CHISELED_STONE_BRICKS_SLAB = registerBlock("ip_frozen_chiseled_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_POLISHED_STONE = registerBlock("ip_frozen_polished_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_POLISHED_STONE_STAIRS = registerBlock("ip_frozen_polished_stone_stairs",
            () -> new StairBlock(() -> PSBlocks.IP_FROZEN_POLISHED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_POLISHED_STONE_SLAB = registerBlock("ip_frozen_polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> IP_FROZEN_STONE_PILLAR = registerBlock("ip_frozen_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));

    //Mercury Fortress
    public static final RegistryObject<Block> SCARLET_STONE = registerBlock("scarlet_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_STONE_STAIRS = registerBlock("scarlet_stone_stairs",
            () -> new StairBlock(() -> PSBlocks.SCARLET_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_STONE_SLAB = registerBlock("scarlet_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_COBBLESTONE = registerBlock("scarlet_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_COBBLESTONE_STAIRS = registerBlock("scarlet_cobblestone_stairs",
            () -> new StairBlock(() -> PSBlocks.SCARLET_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_COBBLESTONE_SLAB = registerBlock("scarlet_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_STONE_BRICKS = registerBlock("scarlet_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_STONE_BRICKS_STAIRS = registerBlock("scarlet_stone_bricks_stairs",
            () -> new StairBlock(() -> PSBlocks.SCARLET_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_STONE_BRICKS_SLAB = registerBlock("scarlet_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_STONE_BRICKS_WALL = registerBlock("scarlet_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_CHISELED_STONE_BRICKS = registerBlock("scarlet_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_CHISELED_STONE_BRICKS_STAIRS = registerBlock("scarlet_chiseled_stone_bricks_stairs",
            () -> new StairBlock(() -> PSBlocks.SCARLET_CHISELED_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_CHISELED_STONE_BRICKS_SLAB = registerBlock("scarlet_chiseled_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> SCARLET_STONE_PILLAR = registerBlock("scarlet_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));

    //Radio Tower
    public static final RegistryObject<Block> RT_BROWN_CONCRETE = registerBlock("rt_brown_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_BROWN_CONCRETE_STAIRS = registerBlock("rt_brown_concrete_stairs",
            () -> new StairBlock(() -> PSBlocks.RT_BROWN_CONCRETE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_BROWN_CONCRETE_SLAB = registerBlock("rt_brown_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_WHITE_CONCRETE = registerBlock("rt_white_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_WHITE_CONCRETE_STAIRS = registerBlock("rt_white_concrete_stairs",
            () -> new StairBlock(() -> PSBlocks.RT_WHITE_CONCRETE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_WHITE_CONCRETE_SLAB = registerBlock("rt_white_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_BLACK_CONCRETE = registerBlock("rt_black_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_BLACK_CONCRETE_STAIRS = registerBlock("rt_black_concrete_stairs",
            () -> new StairBlock(() -> PSBlocks.RT_BLACK_CONCRETE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_BLACK_CONCRETE_SLAB = registerBlock("rt_black_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_RED_CONCRETE = registerBlock("rt_red_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_RED_CONCRETE_STAIRS = registerBlock("rt_red_concrete_stairs",
            () -> new StairBlock(() -> PSBlocks.RT_RED_CONCRETE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_RED_CONCRETE_SLAB = registerBlock("rt_red_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_CONCRETE_TILES = registerBlock("rt_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f)));
    public static final RegistryObject<Block> RT_WHITE_METAL = registerBlock("rt_white_metal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(15f)));
    public static final RegistryObject<Block> RT_WHITE_METAL_STAIRS = registerBlock("rt_white_metal_stairs",
            () -> new StairBlock(() -> PSBlocks.RT_WHITE_METAL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(15f)));
    public static final RegistryObject<Block> RT_WHITE_METAL_SLAB = registerBlock("rt_white_metal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(15f)));
    public static final RegistryObject<Block> RT_WHITE_METAL_WALL = registerBlock("rt_white_metal_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(15f)));
    public static final RegistryObject<Block> RT_BLACK_METAL = registerBlock("rt_black_metal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(15f)));
    public static final RegistryObject<Block> RT_BLACK_METAL_STAIRS = registerBlock("rt_black_metal_stairs",
            () -> new StairBlock(() -> PSBlocks.RT_BLACK_METAL.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(15f)));
    public static final RegistryObject<Block> RT_BLACK_METAL_SLAB = registerBlock("rt_black_metal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(15f)));
    public static final RegistryObject<Block> RT_BLACK_METAL_WALL = registerBlock("rt_black_metal_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(15f)));
    public static final RegistryObject<Block> RT_GLOWING_BROWN_CONCRETE = registerBlock("rt_glowing_brown_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).lightLevel(BlockState -> 15)));
    public static final RegistryObject<Block> RT_GLOWING_WHITE_CONCRETE = registerBlock("rt_glowing_white_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).lightLevel(BlockState -> 15)));
    public static final RegistryObject<Block> RT_GLOWING_BLACK_CONCRETE = registerBlock("rt_glowing_black_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).lightLevel(BlockState -> 15)));
    public static final RegistryObject<Block> RT_GLOWING_RED_CONCRETE = registerBlock("rt_glowing_red_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(15f).lightLevel(BlockState -> 15)));
    public static final RegistryObject<Block> RT_PINK_LAMP = registerBlock("rt_pink_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PEARLESCENT_FROGLIGHT).strength(15f).lightLevel(BlockState -> 15)));
    public static final RegistryObject<Block> RT_LIGHT_PROJECTOR = registerBlock("rt_light_projector",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(15f).lightLevel(BlockState -> 15)));
    public static final RegistryObject<Block> RT_GLASS = registerBlock("rt_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(15f).noOcclusion()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return PSItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
