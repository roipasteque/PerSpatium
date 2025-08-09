package net.pastek.perspatium.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.pastek.perspatium.registers.PSBlocks;

import java.util.Set;

public class PerSpatiumBlockLootProvider extends BlockLootSubProvider {
    public PerSpatiumBlockLootProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(PSBlocks.DOOR_PILLAR_BLUE.get());
        this.dropSelf(PSBlocks.DOOR_PILLAR_GREEN.get());
        this.dropSelf(PSBlocks.DOOR_PILLAR_YELLOW.get());
        this.dropSelf(PSBlocks.DOOR_PILLAR_RED.get());
        this.dropSelf(PSBlocks.DOOR_PILLAR_PURPLE.get());

        this.dropSelf(PSBlocks.MIRROR_STONE.get());
        this.dropSelf(PSBlocks.MIRROR_BRICKS.get());
        this.dropSelf(PSBlocks.MIRROR_BRICKS_STAIRS.get());
        this.dropSelf(PSBlocks.MIRROR_BRICKS_SLAB.get());
        this.dropSelf(PSBlocks.MIRROR_BRICKS_FENCE.get());
        this.dropSelf(PSBlocks.MIRROR_BRICKS_FENCE_GATE.get());
        this.dropSelf(PSBlocks.MIRROR_BRICKS_WALL.get());
        this.dropSelf(PSBlocks.MIRROR_COBBLESTONE.get());
        this.dropSelf(PSBlocks.MIRROR_STONE_POLISHED.get());
        this.dropSelf(PSBlocks.MIRROR_STONE_EMBEDDED.get());
        this.dropSelf(PSBlocks.MIRROR_CHISELED_STONE.get());
        this.dropSelf(PSBlocks.MIRROR_CHISELED_BRICKS.get());
        this.dropSelf(PSBlocks.MIRROR_STONE_PILLAR.get());

        this.dropSelf(PSBlocks.BLOOD_STONE.get());
        this.dropSelf(PSBlocks.BLOOD_BRICKS.get());
        this.dropSelf(PSBlocks.BLOOD_BRICKS_STAIRS.get());
        this.dropSelf(PSBlocks.BLOOD_BRICKS_SLAB.get());
        this.dropSelf(PSBlocks.BLOOD_BRICKS_FENCE.get());
        this.dropSelf(PSBlocks.BLOOD_BRICKS_FENCE_GATE.get());
        this.dropSelf(PSBlocks.BLOOD_BRICKS_WALL.get());
        this.dropSelf(PSBlocks.BLOOD_COBBLESTONE.get());
        this.dropSelf(PSBlocks.BLOOD_STONE_POLISHED.get());
        this.dropSelf(PSBlocks.BLOOD_STONE_EMBEDDED.get());
        this.dropSelf(PSBlocks.BLOOD_CHISELED_STONE.get());
        this.dropSelf(PSBlocks.BLOOD_CHISELED_BRICKS.get());
        this.dropSelf(PSBlocks.BLOOD_STONE_PILLAR.get());
        this.dropSelf(PSBlocks.BLOOD_STONE_LAMP.get());
        this.dropSelf(PSBlocks.BLOOD_LOG.get());
        this.dropSelf(PSBlocks.BLOOD_PLANKS.get());
        this.dropSelf(PSBlocks.BLOOD_PLANKS_STAIRS.get());
        this.dropSelf(PSBlocks.BLOOD_PLANKS_SLAB.get());
        this.dropSelf(PSBlocks.BLOOD_WEB.get());

        this.dropSelf(PSBlocks.SF_STONE.get());
        this.dropSelf(PSBlocks.SF_STONE_STAIRS.get());
        this.dropSelf(PSBlocks.SF_STONE_SLAB.get());
        this.dropSelf(PSBlocks.SF_STONE_WALL.get());
        this.dropSelf(PSBlocks.SF_COBBLESTONE.get());
        this.dropSelf(PSBlocks.SF_COBBLESTONE_STAIRS.get());
        this.dropSelf(PSBlocks.SF_COBBLESTONE_SLAB.get());
        this.dropSelf(PSBlocks.SF_COBBLESTONE_WALL.get());
        this.dropSelf(PSBlocks.SF_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.SF_STONE_BRICKS_STAIRS.get());
        this.dropSelf(PSBlocks.SF_STONE_BRICKS_SLAB.get());
        this.dropSelf(PSBlocks.SF_CHISELED_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.SF_GLOWING_CHISELED_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.SF_SMALL_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.SF_SMALL_STONE_BRICKS_STAIRS.get());
        this.dropSelf(PSBlocks.SF_SMALL_STONE_BRICKS_SLAB.get());
        this.dropSelf(PSBlocks.SF_CRACKED_SMALL_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.SF_RED_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.SF_RED_STONE_BRICKS_STAIRS.get());
        this.dropSelf(PSBlocks.SF_RED_STONE_BRICKS_SLAB.get());
        this.dropSelf(PSBlocks.SF_BLACK_STONE.get());
        this.dropSelf(PSBlocks.SF_BLACK_STONE_STAIRS.get());
        this.dropSelf(PSBlocks.SF_BLACK_STONE_SLAB.get());
        this.dropSelf(PSBlocks.SF_BLACK_STONE_PILLAR.get());
        this.dropSelf(PSBlocks.SF_CHISELED_BLACK_STONE_PILLAR.get());
        this.dropSelf(PSBlocks.SF_STONE_PILLAR.get());
        this.dropSelf(PSBlocks.SF_BARS.get());

        this.dropSelf(PSBlocks.IP_STONE.get());
        this.dropSelf(PSBlocks.IP_STONE_STAIRS.get());
        this.dropSelf(PSBlocks.IP_STONE_SLAB.get());
        this.dropSelf(PSBlocks.IP_COBBLESTONE.get());
        this.dropSelf(PSBlocks.IP_COBBLESTONE_STAIRS.get());
        this.dropSelf(PSBlocks.IP_COBBLESTONE_SLAB.get());
        this.dropSelf(PSBlocks.IP_CHISELED_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.IP_CHISELED_STONE_BRICKS_STAIRS.get());
        this.dropSelf(PSBlocks.IP_CHISELED_STONE_BRICKS_SLAB.get());
        this.dropSelf(PSBlocks.IP_SMALL_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.IP_SMALL_STONE_BRICKS_STAIRS.get());
        this.dropSelf(PSBlocks.IP_SMALL_STONE_BRICKS_SLAB.get());
        this.dropSelf(PSBlocks.IP_SMALL_STONE_BRICKS_WALL.get());
        this.dropSelf(PSBlocks.IP_CRACKED_SMALL_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.IP_POLISHED_STONE.get());
        this.dropSelf(PSBlocks.IP_POLISHED_STONE_STAIRS.get());
        this.dropSelf(PSBlocks.IP_POLISHED_STONE_SLAB.get());
        this.dropSelf(PSBlocks.IP_STONE_PILLAR.get());
        this.dropSelf(PSBlocks.IP_FROZEN_COBBLESTONE.get());
        this.dropSelf(PSBlocks.IP_FROZEN_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.IP_FROZEN_STONE_BRICKS_STAIRS.get());
        this.dropSelf(PSBlocks.IP_FROZEN_STONE_BRICKS_SLAB.get());
        this.dropSelf(PSBlocks.IP_FROZEN_STONE_BRICKS_WALL.get());
        this.dropSelf(PSBlocks.IP_CRACKED_FROZEN_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.IP_FROZEN_SMALL_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS_STAIRS.get());
        this.dropSelf(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS_SLAB.get());
        this.dropSelf(PSBlocks.IP_FROZEN_POLISHED_STONE.get());
        this.dropSelf(PSBlocks.IP_FROZEN_POLISHED_STONE_STAIRS.get());
        this.dropSelf(PSBlocks.IP_FROZEN_POLISHED_STONE_SLAB.get());
        this.dropSelf(PSBlocks.IP_FROZEN_STONE_PILLAR.get());

        this.dropSelf(PSBlocks.SCARLET_STONE.get());
        this.dropSelf(PSBlocks.SCARLET_STONE_STAIRS.get());
        this.dropSelf(PSBlocks.SCARLET_STONE_SLAB.get());
        this.dropSelf(PSBlocks.SCARLET_COBBLESTONE.get());
        this.dropSelf(PSBlocks.SCARLET_COBBLESTONE_STAIRS.get());
        this.dropSelf(PSBlocks.SCARLET_COBBLESTONE_SLAB.get());
        this.dropSelf(PSBlocks.SCARLET_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.SCARLET_STONE_BRICKS_STAIRS.get());
        this.dropSelf(PSBlocks.SCARLET_STONE_BRICKS_SLAB.get());
        this.dropSelf(PSBlocks.SCARLET_STONE_BRICKS_WALL.get());
        this.dropSelf(PSBlocks.SCARLET_CHISELED_STONE_BRICKS.get());
        this.dropSelf(PSBlocks.SCARLET_CHISELED_STONE_BRICKS_STAIRS.get());
        this.dropSelf(PSBlocks.SCARLET_CHISELED_STONE_BRICKS_SLAB.get());
        this.dropSelf(PSBlocks.SCARLET_STONE_PILLAR.get());

        this.dropSelf(PSBlocks.RT_BROWN_CONCRETE.get());
        this.dropSelf(PSBlocks.RT_BROWN_CONCRETE_STAIRS.get());
        this.dropSelf(PSBlocks.RT_BROWN_CONCRETE_SLAB.get());
        this.dropSelf(PSBlocks.RT_WHITE_CONCRETE.get());
        this.dropSelf(PSBlocks.RT_WHITE_CONCRETE_STAIRS.get());
        this.dropSelf(PSBlocks.RT_WHITE_CONCRETE_SLAB.get());
        this.dropSelf(PSBlocks.RT_BLACK_CONCRETE.get());
        this.dropSelf(PSBlocks.RT_BLACK_CONCRETE_STAIRS.get());
        this.dropSelf(PSBlocks.RT_BLACK_CONCRETE_SLAB.get());
        this.dropSelf(PSBlocks.RT_RED_CONCRETE.get());
        this.dropSelf(PSBlocks.RT_RED_CONCRETE_STAIRS.get());
        this.dropSelf(PSBlocks.RT_RED_CONCRETE_SLAB.get());
        this.dropSelf(PSBlocks.RT_CONCRETE_TILES.get());
        this.dropSelf(PSBlocks.RT_WHITE_METAL.get());
        this.dropSelf(PSBlocks.RT_WHITE_METAL_STAIRS.get());
        this.dropSelf(PSBlocks.RT_WHITE_METAL_SLAB.get());
        this.dropSelf(PSBlocks.RT_WHITE_METAL_WALL.get());
        this.dropSelf(PSBlocks.RT_BLACK_METAL.get());
        this.dropSelf(PSBlocks.RT_BLACK_METAL_STAIRS.get());
        this.dropSelf(PSBlocks.RT_BLACK_METAL_SLAB.get());
        this.dropSelf(PSBlocks.RT_BLACK_METAL_WALL.get());
        this.dropSelf(PSBlocks.RT_GLOWING_BROWN_CONCRETE.get());
        this.dropSelf(PSBlocks.RT_GLOWING_WHITE_CONCRETE.get());
        this.dropSelf(PSBlocks.RT_GLOWING_BLACK_CONCRETE.get());
        this.dropSelf(PSBlocks.RT_GLOWING_RED_CONCRETE.get());
        this.dropSelf(PSBlocks.RT_PINK_LAMP.get());
        this.dropSelf(PSBlocks.RT_LIGHT_PROJECTOR.get());
        this.dropSelf(PSBlocks.RT_GLASS.get());

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return PSBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}