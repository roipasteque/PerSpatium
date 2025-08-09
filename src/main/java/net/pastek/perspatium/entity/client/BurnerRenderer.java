package net.pastek.perspatium.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pastek.perspatium.PerSpatium;
import net.pastek.perspatium.entity.entities.Burner;

public class BurnerRenderer extends MobRenderer<Burner, BurnerModel<Burner>> {
    public BurnerRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BurnerModel<>(pContext.bakeLayer(PSModelLayers.SFBURNER_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Burner pEntity) {
        return new ResourceLocation(PerSpatium.MOD_ID, "textures/entity/burner.png");
    }

    @Override
    public void render(Burner pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(2f, 2f, 2f);

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}