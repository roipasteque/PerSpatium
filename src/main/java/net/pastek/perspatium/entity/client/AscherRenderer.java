package net.pastek.perspatium.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pastek.perspatium.PerSpatium;
import net.pastek.perspatium.entity.entities.Ascher;

public class AscherRenderer extends MobRenderer<Ascher, AscherModel<Ascher>> {
    public AscherRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new AscherModel<>(pContext.bakeLayer(PSModelLayers.ASCHER_LAYER)), 0.4f);
    }

    @Override
    public ResourceLocation getTextureLocation(Ascher pEntity) {
        return new ResourceLocation(PerSpatium.MOD_ID, "textures/entity/ascher.png");
    }

    @Override
    public void render(Ascher pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(2f, 2f, 2f);


        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}