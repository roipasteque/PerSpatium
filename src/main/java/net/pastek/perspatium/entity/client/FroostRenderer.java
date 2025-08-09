package net.pastek.perspatium.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pastek.perspatium.PerSpatium;
import net.pastek.perspatium.entity.entities.Froost;

public class FroostRenderer extends MobRenderer<Froost, FroostModel<Froost>> {
    public FroostRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new FroostModel<>(pContext.bakeLayer(PSModelLayers.FROOST_LAYER)), 0.6f);
    }

    @Override
    public ResourceLocation getTextureLocation(Froost pEntity) {
        return new ResourceLocation(PerSpatium.MOD_ID, "textures/entity/froost.png");
    }

    @Override
    public void render(Froost pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(1f, 1f, 1f);

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}