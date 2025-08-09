package net.pastek.perspatium.entity.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.pastek.perspatium.PerSpatium;

public class PSModelLayers {
    public static final ModelLayerLocation SFBURNER_LAYER = new ModelLayerLocation(
            new ResourceLocation(PerSpatium.MOD_ID, "sfburner_layer"), "main");

    public static final ModelLayerLocation ASCHER_LAYER = new ModelLayerLocation(
            new ResourceLocation(PerSpatium.MOD_ID, "ascher_layer"), "main");

    public static final ModelLayerLocation MARS_LAYER = new ModelLayerLocation(
            new ResourceLocation(PerSpatium.MOD_ID, "mars_layer"), "main");

    public static final ModelLayerLocation FROOST_LAYER = new ModelLayerLocation(
            new ResourceLocation(PerSpatium.MOD_ID, "froost_layer"), "main");
}
