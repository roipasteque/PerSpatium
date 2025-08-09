package net.pastek.perspatium.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.pastek.perspatium.entity.animations.PSAnimationsDefinitions;
import net.pastek.perspatium.entity.entities.Ascher;
import net.pastek.perspatium.entity.entities.Froost;

public class FroostModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart froost;
	private final ModelPart head;
	private final ModelPart ears;
	private final ModelPart left_ear;
	private final ModelPart right_ear;
	private final ModelPart tail;
	private final ModelPart tail_base;
	private final ModelPart tail_middle;
	private final ModelPart tail_tip;

	public FroostModel(ModelPart root) {
		this.froost = root.getChild("froost");
		this.head = this.froost.getChild("head");
		this.ears = this.head.getChild("ears");
		this.left_ear = this.ears.getChild("left_ear");
		this.right_ear = this.ears.getChild("right_ear");
		this.tail = this.froost.getChild("tail");
		this.tail_base = this.tail.getChild("tail_base");
		this.tail_middle = this.tail.getChild("tail_middle");
		this.tail_tip = this.tail.getChild("tail_tip");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition froost = partdefinition.addOrReplaceChild("froost", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = froost.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -11.0F, -5.0F, 10.0F, 11.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(-5.0F, -10.0F, -6.0F, 10.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-6.0F, -10.0F, -5.0F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(22, 22).addBox(5.0F, -10.0F, -5.0F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_back_r1 = head.addOrReplaceChild("head_back_r1", CubeListBuilder.create().texOffs(40, 0).addBox(-5.0F, -5.0F, -1.5F, 10.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition ears = head.addOrReplaceChild("ears", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, 5.0F));

		PartDefinition left_ear = ears.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(-5.25F, -5.5F, -9.5F));

		PartDefinition left_ear_r1 = left_ear.addOrReplaceChild("left_ear_r1", CubeListBuilder.create().texOffs(44, 20).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.25F, -0.1309F, 0.0F, -0.6109F));

		PartDefinition right_ear = ears.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(5.25F, -5.5F, -9.5F));

		PartDefinition right_ear_r1 = right_ear.addOrReplaceChild("right_ear_r1", CubeListBuilder.create().texOffs(44, 25).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.25F, -0.1309F, 0.0F, 0.6109F));

		PartDefinition tail = froost.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_base = tail.addOrReplaceChild("tail_base", CubeListBuilder.create().texOffs(40, 12).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 8.0F));

		PartDefinition tail_middle = tail.addOrReplaceChild("tail_middle", CubeListBuilder.create(), PartPose.offset(-0.9027F, -1.0F, 12.6102F));

		PartDefinition tail_middle_r1 = tail_middle.addOrReplaceChild("tail_middle_r1", CubeListBuilder.create().texOffs(22, 43).addBox(-0.85F, -1.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3473F, 0.0F, 0.3898F, 0.0F, -0.4363F, 0.0F));

		PartDefinition tail_tip = tail.addOrReplaceChild("tail_tip", CubeListBuilder.create(), PartPose.offset(-0.924F, -1.0F, 16.2813F));

		PartDefinition tail_tip_r1 = tail_tip.addOrReplaceChild("tail_tip_r1", CubeListBuilder.create().texOffs(36, 43).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2113F, 0.0F, 0.4532F, 0.0F, 0.4363F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animate(((Froost) entity).idleAnimationState, PSAnimationsDefinitions.FROOST_IDLE, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		froost.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return froost;
	}
}