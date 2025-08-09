package net.pastek.perspatium.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pastek.perspatium.PerSpatium;
import net.pastek.perspatium.registers.PSBlocks;
import net.pastek.perspatium.registers.PSItems;

public class PerSpatiumItemModelProvider extends ItemModelProvider {
    public PerSpatiumItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PerSpatium.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        withExistingParent(PSItems.PERSPATIUM_TOKEN.getId().toString(), mcLoc("item/generated")).texture("layer0", "item/perspatium_token");

        evenSimplerBlockItem(PSBlocks.DOOR_PILLAR_BLUE);
        evenSimplerBlockItem(PSBlocks.DOOR_PILLAR_GREEN);
        evenSimplerBlockItem(PSBlocks.DOOR_PILLAR_YELLOW);
        evenSimplerBlockItem(PSBlocks.DOOR_PILLAR_RED);
        evenSimplerBlockItem(PSBlocks.DOOR_PILLAR_PURPLE);

        fenceItem(PSBlocks.MIRROR_BRICKS_FENCE, PSBlocks.MIRROR_BRICKS);
        wallItem(PSBlocks.MIRROR_BRICKS_WALL, PSBlocks.MIRROR_BRICKS);
        evenSimplerBlockItem(PSBlocks.MIRROR_BRICKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.MIRROR_BRICKS_SLAB);
        evenSimplerBlockItem(PSBlocks.MIRROR_BRICKS_FENCE_GATE);
        evenSimplerBlockItem(PSBlocks.MIRROR_CHISELED_STONE);
        evenSimplerBlockItem(PSBlocks.MIRROR_CHISELED_BRICKS);
        evenSimplerBlockItem(PSBlocks.MIRROR_STONE_PILLAR);

        fenceItem(PSBlocks.BLOOD_BRICKS_FENCE, PSBlocks.BLOOD_BRICKS);
        wallItem(PSBlocks.BLOOD_BRICKS_WALL, PSBlocks.BLOOD_BRICKS);
        evenSimplerBlockItem(PSBlocks.BLOOD_BRICKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.BLOOD_BRICKS_SLAB);
        evenSimplerBlockItem(PSBlocks.BLOOD_BRICKS_FENCE_GATE);
        evenSimplerBlockItem(PSBlocks.BLOOD_CHISELED_STONE);
        evenSimplerBlockItem(PSBlocks.BLOOD_CHISELED_BRICKS);
        evenSimplerBlockItem(PSBlocks.BLOOD_STONE_PILLAR);
        evenSimplerBlockItem(PSBlocks.BLOOD_LOG);
        evenSimplerBlockItem(PSBlocks.BLOOD_PLANKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.BLOOD_PLANKS_SLAB);

        evenSimplerBlockItem(PSBlocks.SF_STONE_STAIRS);
        evenSimplerBlockItem(PSBlocks.SF_STONE_SLAB);
        wallItem(PSBlocks.SF_STONE_WALL, PSBlocks.SF_STONE);
        evenSimplerBlockItem(PSBlocks.SF_COBBLESTONE_STAIRS);
        evenSimplerBlockItem(PSBlocks.SF_COBBLESTONE_SLAB);
        wallItem(PSBlocks.SF_COBBLESTONE_WALL, PSBlocks.SF_COBBLESTONE);
        evenSimplerBlockItem(PSBlocks.SF_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.SF_STONE_BRICKS_SLAB);
        evenSimplerBlockItem(PSBlocks.SF_CHISELED_STONE_BRICKS);
        evenSimplerBlockItem(PSBlocks.SF_GLOWING_CHISELED_STONE_BRICKS);
        evenSimplerBlockItem(PSBlocks.SF_SMALL_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.SF_SMALL_STONE_BRICKS_SLAB);
        evenSimplerBlockItem(PSBlocks.SF_RED_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.SF_RED_STONE_BRICKS_SLAB);
        evenSimplerBlockItem(PSBlocks.SF_BLACK_STONE_STAIRS);
        evenSimplerBlockItem(PSBlocks.SF_BLACK_STONE_SLAB);
        evenSimplerBlockItem(PSBlocks.SF_BLACK_STONE_PILLAR);
        evenSimplerBlockItem(PSBlocks.SF_CHISELED_BLACK_STONE_PILLAR);
        evenSimplerBlockItem(PSBlocks.SF_STONE_PILLAR);

        evenSimplerBlockItem(PSBlocks.IP_STONE_STAIRS);
        evenSimplerBlockItem(PSBlocks.IP_STONE_SLAB);
        evenSimplerBlockItem(PSBlocks.IP_COBBLESTONE_STAIRS);
        evenSimplerBlockItem(PSBlocks.IP_COBBLESTONE_SLAB);
        evenSimplerBlockItem(PSBlocks.IP_CHISELED_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.IP_CHISELED_STONE_BRICKS_SLAB);
        evenSimplerBlockItem(PSBlocks.IP_SMALL_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.IP_SMALL_STONE_BRICKS_SLAB);
        wallItem(PSBlocks.IP_SMALL_STONE_BRICKS_WALL, PSBlocks.IP_SMALL_STONE_BRICKS);
        evenSimplerBlockItem(PSBlocks.IP_POLISHED_STONE_STAIRS);
        evenSimplerBlockItem(PSBlocks.IP_POLISHED_STONE_SLAB);
        evenSimplerBlockItem(PSBlocks.IP_STONE_PILLAR);
        evenSimplerBlockItem(PSBlocks.IP_FROZEN_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.IP_FROZEN_STONE_BRICKS_SLAB);
        wallItem(PSBlocks.IP_FROZEN_STONE_BRICKS_WALL, PSBlocks.IP_FROZEN_STONE_BRICKS);
        evenSimplerBlockItem(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.IP_FROZEN_CHISELED_STONE_BRICKS_SLAB);
        evenSimplerBlockItem(PSBlocks.IP_FROZEN_POLISHED_STONE_STAIRS);
        evenSimplerBlockItem(PSBlocks.IP_FROZEN_POLISHED_STONE_SLAB);
        evenSimplerBlockItem(PSBlocks.IP_FROZEN_STONE_PILLAR);

        evenSimplerBlockItem(PSBlocks.SCARLET_STONE_STAIRS);
        evenSimplerBlockItem(PSBlocks.SCARLET_STONE_SLAB);
        evenSimplerBlockItem(PSBlocks.SCARLET_COBBLESTONE_STAIRS);
        evenSimplerBlockItem(PSBlocks.SCARLET_COBBLESTONE_SLAB);
        evenSimplerBlockItem(PSBlocks.SCARLET_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.SCARLET_STONE_BRICKS_SLAB);
        wallItem(PSBlocks.SCARLET_STONE_BRICKS_WALL, PSBlocks.SCARLET_STONE_BRICKS);
        evenSimplerBlockItem(PSBlocks.SCARLET_CHISELED_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(PSBlocks.SCARLET_CHISELED_STONE_BRICKS_SLAB);
        evenSimplerBlockItem(PSBlocks.SCARLET_STONE_PILLAR);

        evenSimplerBlockItem(PSBlocks.RT_BROWN_CONCRETE_STAIRS);
        evenSimplerBlockItem(PSBlocks.RT_BROWN_CONCRETE_SLAB);
        evenSimplerBlockItem(PSBlocks.RT_WHITE_CONCRETE_STAIRS);
        evenSimplerBlockItem(PSBlocks.RT_WHITE_CONCRETE_SLAB);
        evenSimplerBlockItem(PSBlocks.RT_BLACK_CONCRETE_STAIRS);
        evenSimplerBlockItem(PSBlocks.RT_BLACK_CONCRETE_SLAB);
        evenSimplerBlockItem(PSBlocks.RT_RED_CONCRETE_STAIRS);
        evenSimplerBlockItem(PSBlocks.RT_RED_CONCRETE_SLAB);
        evenSimplerBlockItem(PSBlocks.RT_WHITE_METAL_STAIRS);
        evenSimplerBlockItem(PSBlocks.RT_WHITE_METAL_SLAB);
        wallItem(PSBlocks.RT_WHITE_METAL_WALL, PSBlocks.RT_WHITE_METAL);
        evenSimplerBlockItem(PSBlocks.RT_BLACK_METAL_STAIRS);
        evenSimplerBlockItem(PSBlocks.RT_BLACK_METAL_SLAB);
        wallItem(PSBlocks.RT_BLACK_METAL_WALL, PSBlocks.RT_BLACK_METAL);
        evenSimplerBlockItem(PSBlocks.RT_LIGHT_PROJECTOR);


        withExistingParent(PSItems.BURNER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(PSItems.ASCHER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(PSItems.MARS_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(PSItems.FROOST_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(PerSpatium.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(PerSpatium.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(PerSpatium.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(PerSpatium.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PerSpatium.MOD_ID,"item/" + item.getId().getPath()));
    }
}