package net.pastek.perspatium.registers;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.pastek.perspatium.PerSpatium;

public class PSTags {
    public static class Blocks {
        public static final TagKey<Block> MINEABLE_WITH_TORCHOFSINS = tag("mineable/torchofsins");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(PerSpatium.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(PerSpatium.MOD_ID, name));
        }
    }
}
