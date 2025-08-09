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
import net.pastek.perspatium.entity.entities.Burner;

public class BurnerModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart burner;
	private final ModelPart bottom;
	private final ModelPart head;
	private final ModelPart lower_jaw;
	private final ModelPart upper_jaw;
	private final ModelPart back;
	private final ModelPart top;
	private final ModelPart neck;

	public BurnerModel(ModelPart root) {
		this.burner = root.getChild("burner");
		this.bottom = this.burner.getChild("bottom");
		this.head = this.burner.getChild("head");
		this.lower_jaw = this.head.getChild("lower_jaw");
		this.upper_jaw = this.head.getChild("upper_jaw");
		this.back = this.head.getChild("back");
		this.top = this.head.getChild("top");
		this.neck = this.head.getChild("neck");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition burner = partdefinition.addOrReplaceChild("burner", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom = burner.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -2.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = burner.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -0.25F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create().texOffs(24, 25).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 12).addBox(-1.0F, -4.25F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 19).addBox(1.0F, -5.0F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 30).addBox(-2.0F, -5.0F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lower_jaw_left_r1 = lower_jaw.addOrReplaceChild("lower_jaw_left_r1", CubeListBuilder.create().texOffs(24, 27).addBox(-0.5F, -0.5F, -1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(5.0F, -0.5F, -1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -3.75F, -1.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition upper_jaw = head.addOrReplaceChild("upper_jaw", CubeListBuilder.create().texOffs(32, 14).addBox(-1.0F, 3.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 32).addBox(-1.0F, 2.5F, -3.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.25F, 0.0F));

		PartDefinition upper_jaw_left_r1 = upper_jaw.addOrReplaceChild("upper_jaw_left_r1", CubeListBuilder.create().texOffs(12, 23).addBox(-0.5F, -0.5F, -2.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, 3.0F, -1.5F, 0.2591F, -0.403F, -0.1758F));

		PartDefinition upper_jaw_right_r1 = upper_jaw.addOrReplaceChild("upper_jaw_right_r1", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, -2.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 3.0F, -1.5F, 0.2591F, 0.403F, 0.1758F));

		PartDefinition upper_tooth_left_r1 = upper_jaw.addOrReplaceChild("upper_tooth_left_r1", CubeListBuilder.create().texOffs(34, 20).addBox(-0.625F, -1.375F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.875F, 4.375F, -2.75F, 0.0F, 0.5236F, 0.0F));

		PartDefinition upper_tooth_right_r1 = upper_jaw.addOrReplaceChild("upper_tooth_right_r1", CubeListBuilder.create().texOffs(6, 33).addBox(-0.375F, -1.375F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.875F, 4.375F, -2.75F, 0.0F, -0.5236F, 0.0F));

		PartDefinition back = head.addOrReplaceChild("back", CubeListBuilder.create().texOffs(16, 16).addBox(-2.0F, -7.75F, 1.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_r1 = back.addOrReplaceChild("left_r1", CubeListBuilder.create().texOffs(16, 29).addBox(-0.5F, -2.75F, -0.875F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -5.25F, 0.875F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_r1 = back.addOrReplaceChild("right_r1", CubeListBuilder.create().texOffs(10, 29).addBox(-0.5F, -2.75F, -0.875F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, -5.25F, 0.875F, 0.0F, 0.0F, -0.0873F));

		PartDefinition top = head.addOrReplaceChild("top", CubeListBuilder.create().texOffs(16, 12).addBox(-3.25F, -9.5F, -0.5F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 23).addBox(-3.5F, -8.75F, 1.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eye_right_r1 = top.addOrReplaceChild("eye_right_r1", CubeListBuilder.create().texOffs(26, 34).addBox(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -7.75F, 0.0F, 0.2165F, 0.1228F, -0.1517F));

		PartDefinition eye_left_r1 = top.addOrReplaceChild("eye_left_r1", CubeListBuilder.create().texOffs(22, 34).addBox(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -7.75F, 0.0F, 0.2165F, -0.1228F, 0.1517F));

		PartDefinition left_r2 = top.addOrReplaceChild("left_r2", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -8.25F, -1.0F, 0.2165F, -0.1228F, 0.1517F));

		PartDefinition right_r2 = top.addOrReplaceChild("right_r2", CubeListBuilder.create().texOffs(28, 20).addBox(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -8.25F, -1.0F, 0.2165F, 0.1228F, -0.1517F));

		PartDefinition middle_eye_bone_r1 = top.addOrReplaceChild("middle_eye_bone_r1", CubeListBuilder.create().texOffs(28, 16).addBox(-1.0F, -0.75F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, -1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition horn_right_r1 = top.addOrReplaceChild("horn_right_r1", CubeListBuilder.create().texOffs(0, 33).addBox(-2.25F, -1.0F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -8.5F, 2.25F, 0.0456F, -0.1685F, -0.2657F));

		PartDefinition horn_left_r1 = top.addOrReplaceChild("horn_left_r1", CubeListBuilder.create().texOffs(28, 32).addBox(0.0F, -1.0F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -8.5F, 2.25F, 0.0456F, 0.1685F, 0.2657F));

		PartDefinition neck = head.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -3.0F, -1.75F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);
		this.animate(((Burner) entity).idleAnimationState, PSAnimationsDefinitions.SF_BURNER_IDLE, ageInTicks, 1f);
		this.animate(((Burner) entity).idle2AnimationState, PSAnimationsDefinitions.SF_BURNER_IDLE2, ageInTicks, 1f);
		this.animate(((Burner) entity).attackAnimationState, PSAnimationsDefinitions.SF_BURNER_ATTACK, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		burner.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return burner;
	}
}