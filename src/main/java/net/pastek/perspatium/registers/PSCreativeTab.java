package net.pastek.perspatium.registers;

import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pastek.perspatium.PerSpatium;

public class PSCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PerSpatium.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PER_SPATIUM = CREATIVE_MODE_TABS.register("perspatium",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PSItems.PERSPATIUM_TOKEN.get())).title(Component.translatable("creativetab.perspatium"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(PSItems.PERSPATIUM_TOKEN.get());
                        pOutput.accept(PSBlocks.DOOR_PILLAR_BLUE.get());
                        pOutput.accept(PSBlocks.DOOR_PILLAR_GREEN.get());
                        pOutput.accept(PSBlocks.DOOR_PILLAR_YELLOW.get());
                        pOutput.accept(PSBlocks.DOOR_PILLAR_RED.get());
                        pOutput.accept(PSBlocks.DOOR_PILLAR_PURPLE.get());

                        pOutput.accept(PSBlocks.MIRROR_STONE.get());
                        pOutput.accept(PSBlocks.MIRROR_BRICKS.get());
                        pOutput.accept(PSBlocks.MIRROR_BRICKS_STAIRS.get());
                        pOutput.accept(PSBlocks.MIRROR_BRICKS_SLAB.get());
                        pOutput.accept(PSBlocks.MIRROR_BRICKS_FENCE.get());
                        pOutput.accept(PSBlocks.MIRROR_BRICKS_FENCE_GATE.get());
                        pOutput.accept(PSBlocks.MIRROR_BRICKS_WALL.get());
                        pOutput.accept(PSBlocks.MIRROR_COBBLESTONE.get());
                        pOutput.accept(PSBlocks.MIRROR_STONE_POLISHED.get());
                        pOutput.accept(PSBlocks.MIRROR_STONE_EMBEDDED.get());
                        pOutput.accept(PSBlocks.MIRROR_CHISELED_BRICKS.get());
                        pOutput.accept(PSBlocks.MIRROR_CHISELED_STONE.get());
                        pOutput.accept(PSBlocks.MIRROR_STONE_PILLAR.get());


                        pOutput.accept(PSBlocks.BLOOD_STONE.get());
                        pOutput.accept(PSBlocks.BLOOD_BRICKS.get());
                        pOutput.accept(PSBlocks.BLOOD_BRICKS_STAIRS.get());
                        pOutput.accept(PSBlocks.BLOOD_BRICKS_SLAB.get());
                        pOutput.accept(PSBlocks.BLOOD_BRICKS_FENCE.get());
                        pOutput.accept(PSBlocks.BLOOD_BRICKS_FENCE_GATE.get());
                        pOutput.accept(PSBlocks.BLOOD_BRICKS_WALL.get());
                        pOutput.accept(PSBlocks.BLOOD_COBBLESTONE.get());
                        pOutput.accept(PSBlocks.BLOOD_STONE_POLISHED.get());
                        pOutput.accept(PSBlocks.BLOOD_STONE_EMBEDDED.get());
                        pOutput.accept(PSBlocks.BLOOD_CHISELED_BRICKS.get());
                        pOutput.accept(PSBlocks.BLOOD_CHISELED_STONE.get());
                        pOutput.accept(PSBlocks.BLOOD_STONE_PILLAR.get());
                        pOutput.accept(PSBlocks.BLOOD_STONE_LAMP.get());
                        pOutput.accept(PSBlocks.BLOOD_LOG.get());
                        pOutput.accept(PSBlocks.BLOOD_PLANKS.get());
                        pOutput.accept(PSBlocks.BLOOD_PLANKS_STAIRS.get());
                        pOutput.accept(PSBlocks.BLOOD_PLANKS_SLAB.get());
                        pOutput.accept(PSBlocks.BLOOD_WEB.get());
                        pOutput.accept(PSItems.TORCH_OF_SINS.get());

                        pOutput.accept(PSBlocks.SF_STONE.get());
                        pOutput.accept(PSBlocks.SF_STONE_STAIRS.get());
                        pOutput.accept(PSBlocks.SF_STONE_SLAB.get());
                        pOutput.accept(PSBlocks.SF_STONE_WALL.get());
                        pOutput.accept(PSBlocks.SF_COBBLESTONE.get());
                        pOutput.accept(PSBlocks.SF_COBBLESTONE_STAIRS.get());
                        pOutput.accept(PSBlocks.SF_COBBLESTONE_SLAB.get());
                        pOutput.accept(PSBlocks.SF_COBBLESTONE_WALL.get());
                        pOutput.accept(PSBlocks.SF_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.SF_STONE_BRICKS_STAIRS.get());
                        pOutput.accept(PSBlocks.SF_STONE_BRICKS_SLAB.get());
                        pOutput.accept(PSBlocks.SF_CHISELED_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.SF_GLOWING_CHISELED_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.SF_SMALL_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.SF_SMALL_STONE_BRICKS_STAIRS.get());
                        pOutput.accept(PSBlocks.SF_SMALL_STONE_BRICKS_SLAB.get());
                        pOutput.accept(PSBlocks.SF_CRACKED_SMALL_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.SF_RED_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.SF_RED_STONE_BRICKS_STAIRS.get());
                        pOutput.accept(PSBlocks.SF_RED_STONE_BRICKS_SLAB.get());
                        pOutput.accept(PSBlocks.SF_BLACK_STONE.get());
                        pOutput.accept(PSBlocks.SF_BLACK_STONE_STAIRS.get());
                        pOutput.accept(PSBlocks.SF_BLACK_STONE_SLAB.get());
                        pOutput.accept(PSBlocks.SF_BLACK_STONE_PILLAR.get());
                        pOutput.accept(PSBlocks.SF_CHISELED_BLACK_STONE_PILLAR.get());
                        pOutput.accept(PSBlocks.SF_STONE_PILLAR.get());
                        pOutput.accept(PSBlocks.SF_BARS.get());
                        pOutput.accept(PSItems.BURNER_SPAWN_EGG.get());
                        pOutput.accept(PSItems.ASCHER_SPAWN_EGG.get());
                        pOutput.accept(PSItems.MARS_SPAWN_EGG.get());

                        pOutput.accept(PSBlocks.IP_STONE.get());
                        pOutput.accept(PSBlocks.IP_STONE_STAIRS.get());
                        pOutput.accept(PSBlocks.IP_STONE_SLAB.get());
                        pOutput.accept(PSBlocks.IP_COBBLESTONE.get());
                        pOutput.accept(PSBlocks.IP_COBBLESTONE_STAIRS.get());
                        pOutput.accept(PSBlocks.IP_COBBLESTONE_SLAB.get());
                        pOutput.accept(PSBlocks.IP_CHISELED_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.IP_CHISELED_STONE_BRICKS_STAIRS.get());
                        pOutput.accept(PSBlocks.IP_CHISELED_STONE_BRICKS_SLAB.get());
                        pOutput.accept(PSBlocks.IP_SMALL_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.IP_SMALL_STONE_BRICKS_STAIRS.get());
                        pOutput.accept(PSBlocks.IP_SMALL_STONE_BRICKS_SLAB.get());
                        pOutput.accept(PSBlocks.IP_SMALL_STONE_BRICKS_WALL.get());
                        pOutput.accept(PSBlocks.IP_CRACKED_SMALL_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.IP_POLISHED_STONE.get());
                        pOutput.accept(PSBlocks.IP_POLISHED_STONE_STAIRS.get());
                        pOutput.accept(PSBlocks.IP_POLISHED_STONE_SLAB.get());
                        pOutput.accept(PSBlocks.IP_STONE_PILLAR.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_COBBLESTONE.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_STONE_BRICKS_STAIRS.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_STONE_BRICKS_SLAB.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_STONE_BRICKS_WALL.get());
                        pOutput.accept(PSBlocks.IP_CRACKED_FROZEN_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_SMALL_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS_STAIRS.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS_SLAB.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_POLISHED_STONE.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_POLISHED_STONE_STAIRS.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_POLISHED_STONE_SLAB.get());
                        pOutput.accept(PSBlocks.IP_FROZEN_STONE_PILLAR.get());
                        pOutput.accept(PSItems.FROOST_SPAWN_EGG.get());

                        pOutput.accept(PSBlocks.SCARLET_STONE.get());
                        pOutput.accept(PSBlocks.SCARLET_STONE_STAIRS.get());
                        pOutput.accept(PSBlocks.SCARLET_STONE_SLAB.get());
                        pOutput.accept(PSBlocks.SCARLET_COBBLESTONE.get());
                        pOutput.accept(PSBlocks.SCARLET_COBBLESTONE_STAIRS.get());
                        pOutput.accept(PSBlocks.SCARLET_COBBLESTONE_SLAB.get());
                        pOutput.accept(PSBlocks.SCARLET_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.SCARLET_STONE_BRICKS_STAIRS.get());
                        pOutput.accept(PSBlocks.SCARLET_STONE_BRICKS_SLAB.get());
                        pOutput.accept(PSBlocks.SCARLET_STONE_BRICKS_WALL.get());
                        pOutput.accept(PSBlocks.SCARLET_CHISELED_STONE_BRICKS.get());
                        pOutput.accept(PSBlocks.SCARLET_CHISELED_STONE_BRICKS_STAIRS.get());
                        pOutput.accept(PSBlocks.SCARLET_CHISELED_STONE_BRICKS_SLAB.get());
                        pOutput.accept(PSBlocks.SCARLET_STONE_PILLAR.get());

                        pOutput.accept(PSBlocks.RT_BROWN_CONCRETE.get());
                        pOutput.accept(PSBlocks.RT_BROWN_CONCRETE_STAIRS.get());
                        pOutput.accept(PSBlocks.RT_BROWN_CONCRETE_SLAB.get());
                        pOutput.accept(PSBlocks.RT_WHITE_CONCRETE.get());
                        pOutput.accept(PSBlocks.RT_WHITE_CONCRETE_STAIRS.get());
                        pOutput.accept(PSBlocks.RT_WHITE_CONCRETE_SLAB.get());
                        pOutput.accept(PSBlocks.RT_BLACK_CONCRETE.get());
                        pOutput.accept(PSBlocks.RT_BLACK_CONCRETE_STAIRS.get());
                        pOutput.accept(PSBlocks.RT_BLACK_CONCRETE_SLAB.get());
                        pOutput.accept(PSBlocks.RT_RED_CONCRETE.get());
                        pOutput.accept(PSBlocks.RT_RED_CONCRETE_STAIRS.get());
                        pOutput.accept(PSBlocks.RT_RED_CONCRETE_SLAB.get());
                        pOutput.accept(PSBlocks.RT_CONCRETE_TILES.get());
                        pOutput.accept(PSBlocks.RT_WHITE_METAL.get());
                        pOutput.accept(PSBlocks.RT_WHITE_METAL_STAIRS.get());
                        pOutput.accept(PSBlocks.RT_WHITE_METAL_SLAB.get());
                        pOutput.accept(PSBlocks.RT_WHITE_METAL_WALL.get());
                        pOutput.accept(PSBlocks.RT_BLACK_METAL.get());
                        pOutput.accept(PSBlocks.RT_BLACK_METAL_STAIRS.get());
                        pOutput.accept(PSBlocks.RT_BLACK_METAL_SLAB.get());
                        pOutput.accept(PSBlocks.RT_BLACK_METAL_WALL.get());
                        pOutput.accept(PSBlocks.RT_GLOWING_BROWN_CONCRETE.get());
                        pOutput.accept(PSBlocks.RT_GLOWING_WHITE_CONCRETE.get());
                        pOutput.accept(PSBlocks.RT_GLOWING_BLACK_CONCRETE.get());
                        pOutput.accept(PSBlocks.RT_GLOWING_RED_CONCRETE.get());
                        pOutput.accept(PSBlocks.RT_PINK_LAMP.get());
                        pOutput.accept(PSBlocks.RT_LIGHT_PROJECTOR.get());
                        pOutput.accept(PSBlocks.RT_GLASS.get());

                            }
                    ).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}