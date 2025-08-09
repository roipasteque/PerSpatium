package net.pastek.perspatium.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pastek.perspatium.PerSpatium;
import net.pastek.perspatium.entity.entities.Ascher;
import net.pastek.perspatium.entity.entities.Burner;
import net.pastek.perspatium.entity.entities.Froost;
import net.pastek.perspatium.entity.entities.Mars;
import net.pastek.perspatium.registers.PSEntities;

@Mod.EventBusSubscriber(modid = PerSpatium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PSEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(PSEntities.BURNER.get(), Burner.createAttributes().build());
        event.put(PSEntities.ASCHER.get(), Ascher.createAttributes().build());
        event.put(PSEntities.MARS.get(), Mars.createAttributes().build());
        event.put(PSEntities.FROOST.get(), Froost.createAttributes().build());
    }
}