package net.pastek.perspatium.registers;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pastek.perspatium.PerSpatium;
import net.pastek.perspatium.entity.entities.Ascher;
import net.pastek.perspatium.entity.entities.Burner;
import net.pastek.perspatium.entity.entities.Froost;
import net.pastek.perspatium.entity.entities.Mars;

public class PSEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PerSpatium.MOD_ID);

    public static final RegistryObject<EntityType<Burner>> BURNER =
            ENTITY_TYPES.register("burner", () -> EntityType.Builder.of(Burner::new, MobCategory.MONSTER)
                    .sized(1.4f, 1.4f)
                    .fireImmune()
                    .build("burner"));
    public static final RegistryObject<EntityType<Ascher>> ASCHER =
            ENTITY_TYPES.register("ascher", () -> EntityType.Builder.of(Ascher::new, MobCategory.MONSTER)
                    .sized(0.7f, 3f)
                    .fireImmune()
                    .build("ascher"));
    public static final RegistryObject<EntityType<Mars>> MARS =
            ENTITY_TYPES.register("mars", () -> EntityType.Builder.of(Mars::new, MobCategory.MONSTER)
                    .sized(1.5f, 6f)
                    .fireImmune()
                    .build("mars"));

    public static final RegistryObject<EntityType<Froost>> FROOST =
            ENTITY_TYPES.register("froost", () -> EntityType.Builder.of(Froost::new, MobCategory.MONSTER)
                    .sized(1f, 1f)
                    .build("froost"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}