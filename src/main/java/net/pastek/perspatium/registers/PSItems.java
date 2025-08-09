package net.pastek.perspatium.registers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pastek.perspatium.PerSpatium;
import net.pastek.perspatium.registers.item.TorchOfSins;

public class PSItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PerSpatium.MOD_ID);

    public static final RegistryObject<Item> TORCH_OF_SINS= ITEMS.register("torchofsins",
            () -> new TorchOfSins(Tiers.DIAMOND, new Item.Properties().stacksTo(1).durability(600)));
    public static final RegistryObject<Item> PERSPATIUM_TOKEN= ITEMS.register("perspatium_token",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BURNER_SPAWN_EGG = ITEMS.register("burner_spawn_egg",
            () -> new ForgeSpawnEggItem(PSEntities.BURNER, 0x1F2324, 0xCB4F25, new Item.Properties()));
    public static final RegistryObject<Item> ASCHER_SPAWN_EGG = ITEMS.register("ascher_spawn_egg",
            () -> new ForgeSpawnEggItem(PSEntities.ASCHER, 0x6b706d, 0xCB4F25, new Item.Properties()));
    public static final RegistryObject<Item> MARS_SPAWN_EGG = ITEMS.register("mars_spawn_egg",
            () -> new ForgeSpawnEggItem(PSEntities.MARS, 0xECCC2D, 0xCB4F25, new Item.Properties()));
    public static final RegistryObject<Item> FROOST_SPAWN_EGG = ITEMS.register("froost_spawn_egg",
            () -> new ForgeSpawnEggItem(PSEntities.FROOST, 0xf7faff, 0xfff532, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
