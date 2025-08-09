package net.pastek.perspatium.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pastek.perspatium.PerSpatium;
import net.pastek.perspatium.entity.entities.Mars;

public class MarsRenderer extends MobRenderer<Mars, MarsModel<Mars>> {
    public MarsRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MarsModel<>(pContext.bakeLayer(PSModelLayers.MARS_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(Mars pEntity) {
        return new ResourceLocation(PerSpatium.MOD_ID, "textures/entity/mars.png");
    }

    @Override
    public void render(Mars pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(1f, 1f, 1f);


        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}