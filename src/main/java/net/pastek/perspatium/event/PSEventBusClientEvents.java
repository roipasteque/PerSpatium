package net.pastek.perspatium.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pastek.perspatium.PerSpatium;
import net.pastek.perspatium.entity.client.*;

@Mod.EventBusSubscriber(modid = PerSpatium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PSEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(PSModelLayers.SFBURNER_LAYER, BurnerModel::createBodyLayer);
        event.registerLayerDefinition(PSModelLayers.ASCHER_LAYER, AscherModel::createBodyLayer);
        event.registerLayerDefinition(PSModelLayers.MARS_LAYER, MarsModel::createBodyLayer);
        event.registerLayerDefinition(PSModelLayers.FROOST_LAYER, FroostModel::createBodyLayer);
    }

}