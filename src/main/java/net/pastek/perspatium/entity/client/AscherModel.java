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

public class AscherModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart ascher;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart body;
	private final ModelPart pelvis;
	private final ModelPart spine;
	private final ModelPart bottom_spine;
	private final ModelPart spine_one;
	private final ModelPart spine_two;
	private final ModelPart spine_three;
	private final ModelPart spine_four;
	private final ModelPart spine_five;
	private final ModelPart spine_six;
	private final ModelPart spine_seven;
	private final ModelPart ribs;
	private final ModelPart mains_ribs;
	private final ModelPart left_ribs_top;
	private final ModelPart right_ribs_top;
	private final ModelPart right_ribs_middle;
	private final ModelPart right_ribs_bottom;
	private final ModelPart left_ribs_bottom;
	private final ModelPart left_ribs_middle;
	private final ModelPart head;
	private final ModelPart lower_jaw;
	private final ModelPart upper_jaw;
	private final ModelPart back;
	private final ModelPart top;

	public AscherModel(ModelPart root) {
		this.ascher = root.getChild("ascher");
		this.left_leg = this.ascher.getChild("left_leg");
		this.right_leg = this.ascher.getChild("right_leg");
		this.body = this.ascher.getChild("body");
		this.pelvis = this.body.getChild("pelvis");
		this.spine = this.body.getChild("spine");
		this.bottom_spine = this.spine.getChild("bottom_spine");
		this.spine_one = this.spine.getChild("spine_one");
		this.spine_two = this.spine.getChild("spine_two");
		this.spine_three = this.spine.getChild("spine_three");
		this.spine_four = this.spine.getChild("spine_four");
		this.spine_five = this.spine.getChild("spine_five");
		this.spine_six = this.spine.getChild("spine_six");
		this.spine_seven = this.spine.getChild("spine_seven");
		this.ribs = this.body.getChild("ribs");
		this.mains_ribs = this.ribs.getChild("mains_ribs");
		this.left_ribs_top = this.ribs.getChild("left_ribs_top");
		this.right_ribs_top = this.ribs.getChild("right_ribs_top");
		this.right_ribs_middle = this.ribs.getChild("right_ribs_middle");
		this.right_ribs_bottom = this.ribs.getChild("right_ribs_bottom");
		this.left_ribs_bottom = this.ribs.getChild("left_ribs_bottom");
		this.left_ribs_middle = this.ribs.getChild("left_ribs_middle");
		this.head = this.ascher.getChild("head");
		this.lower_jaw = this.head.getChild("lower_jaw");
		this.upper_jaw = this.head.getChild("upper_jaw");
		this.back = this.head.getChild("back");
		this.top = this.head.getChild("top");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition ascher = partdefinition.addOrReplaceChild("ascher", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = ascher.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 6).addBox(-1.125F, 1.9466F, -3.5856F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.875F, -2.9466F, 0.5856F));

		PartDefinition left_foot_top_r1 = left_leg.addOrReplaceChild("left_foot_top_r1", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.125F, 1.9466F, 0.1644F, 0.48F, 0.0F, 0.0F));

		PartDefinition left_femur_r1 = left_leg.addOrReplaceChild("left_femur_r1", CubeListBuilder.create().texOffs(24, 27).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.625F, -3.5534F, -0.0856F, -0.3013F, 0.6278F, 0.3912F));

		PartDefinition left_ankle_r1 = left_leg.addOrReplaceChild("left_ankle_r1", CubeListBuilder.create().texOffs(4, 32).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.125F, -0.8414F, 0.973F, 0.7854F, 0.0F, 0.0F));

		PartDefinition left_ankle_r2 = left_leg.addOrReplaceChild("left_ankle_r2", CubeListBuilder.create().texOffs(28, 27).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.125F, -0.0534F, 0.9144F, -0.3927F, 0.0F, 0.0F));

		PartDefinition left_ankle_r3 = left_leg.addOrReplaceChild("left_ankle_r3", CubeListBuilder.create().texOffs(20, 27).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.125F, -0.0534F, -0.3356F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg = ascher.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 0).addBox(-0.875F, 1.9466F, -3.5856F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.875F, -2.9466F, 0.5856F));

		PartDefinition right_foot_top_r1 = right_leg.addOrReplaceChild("right_foot_top_r1", CubeListBuilder.create().texOffs(20, 24).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.125F, 1.9466F, 0.1644F, 0.48F, 0.0F, 0.0F));

		PartDefinition right_femur_r1 = right_leg.addOrReplaceChild("right_femur_r1", CubeListBuilder.create().texOffs(16, 27).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.625F, -3.5534F, -0.0856F, -0.3013F, -0.6278F, -0.3912F));

		PartDefinition right_ankle_r1 = right_leg.addOrReplaceChild("right_ankle_r1", CubeListBuilder.create().texOffs(28, 31).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.125F, -0.8414F, 0.973F, 0.7854F, 0.0F, 0.0F));

		PartDefinition right_ankle_r2 = right_leg.addOrReplaceChild("right_ankle_r2", CubeListBuilder.create().texOffs(4, 28).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.125F, -0.0534F, 0.9144F, -0.3927F, 0.0F, 0.0F));

		PartDefinition right_ankle_r3 = right_leg.addOrReplaceChild("right_ankle_r3", CubeListBuilder.create().texOffs(12, 27).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.125F, -0.0534F, -0.3356F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body = ascher.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition pelvis = body.addOrReplaceChild("pelvis", CubeListBuilder.create(), PartPose.offset(0.0F, -8.2105F, 0.2303F));

		PartDefinition left_pelvis_r1 = pelvis.addOrReplaceChild("left_pelvis_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-2.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.2105F, -0.2303F, 0.2026F, 0.4786F, 0.4942F));

		PartDefinition right_pelvis_r1 = pelvis.addOrReplaceChild("right_pelvis_r1", CubeListBuilder.create().texOffs(20, 22).addBox(-1.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.2105F, -0.2303F, 0.2026F, -0.4786F, -0.4942F));

		PartDefinition spine = body.addOrReplaceChild("spine", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_spine = spine.addOrReplaceChild("bottom_spine", CubeListBuilder.create(), PartPose.offset(0.0F, -7.25F, 1.5F));

		PartDefinition bottom_spine_r1 = bottom_spine.addOrReplaceChild("bottom_spine_r1", CubeListBuilder.create().texOffs(14, 2).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition spine_one = spine.addOrReplaceChild("spine_one", CubeListBuilder.create(), PartPose.offset(-0.5F, -9.25F, 2.0F));

		PartDefinition spine_one_r1 = spine_one.addOrReplaceChild("spine_one_r1", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition spine_two = spine.addOrReplaceChild("spine_two", CubeListBuilder.create(), PartPose.offset(-0.5F, -11.25F, 1.75F));

		PartDefinition spine_two_r1 = spine_two.addOrReplaceChild("spine_two_r1", CubeListBuilder.create().texOffs(12, 32).addBox(0.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition spine_three = spine.addOrReplaceChild("spine_three", CubeListBuilder.create(), PartPose.offset(-0.5F, -14.0F, 1.75F));

		PartDefinition spine_three_r1 = spine_three.addOrReplaceChild("spine_three_r1", CubeListBuilder.create().texOffs(16, 32).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition spine_four = spine.addOrReplaceChild("spine_four", CubeListBuilder.create(), PartPose.offset(-0.5F, -15.5F, 1.25F));

		PartDefinition spine_four_r1 = spine_four.addOrReplaceChild("spine_four_r1", CubeListBuilder.create().texOffs(8, 32).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition spine_five = spine.addOrReplaceChild("spine_five", CubeListBuilder.create(), PartPose.offset(-0.5F, -16.75F, 0.25F));

		PartDefinition spine_five_r1 = spine_five.addOrReplaceChild("spine_five_r1", CubeListBuilder.create().texOffs(20, 32).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9163F, 0.0F, 0.0F));

		PartDefinition spine_six = spine.addOrReplaceChild("spine_six", CubeListBuilder.create(), PartPose.offset(-0.5F, -18.25F, -1.0F));

		PartDefinition spine_six_r1 = spine_six.addOrReplaceChild("spine_six_r1", CubeListBuilder.create().texOffs(24, 32).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition spine_seven = spine.addOrReplaceChild("spine_seven", CubeListBuilder.create(), PartPose.offset(-0.5F, -20.0F, -1.5F));

		PartDefinition spine_seven_r1 = spine_seven.addOrReplaceChild("spine_seven_r1", CubeListBuilder.create().texOffs(8, 25).addBox(0.0F, -5.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition ribs = body.addOrReplaceChild("ribs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mains_ribs = ribs.addOrReplaceChild("mains_ribs", CubeListBuilder.create(), PartPose.offset(0.0F, -15.25F, 0.0F));

		PartDefinition mains_ribs_r1 = mains_ribs.addOrReplaceChild("mains_ribs_r1", CubeListBuilder.create().texOffs(28, 4).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition left_ribs_top = ribs.addOrReplaceChild("left_ribs_top", CubeListBuilder.create(), PartPose.offset(-1.75F, -15.814F, 0.0181F));

		PartDefinition left_ribs_top_r1 = left_ribs_top.addOrReplaceChild("left_ribs_top_r1", CubeListBuilder.create().texOffs(12, 25).addBox(-2.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1515F, 0.4872F, 0.0067F));

		PartDefinition right_ribs_top = ribs.addOrReplaceChild("right_ribs_top", CubeListBuilder.create(), PartPose.offset(1.75F, -15.814F, 0.0181F));

		PartDefinition right_ribs_top_r1 = right_ribs_top.addOrReplaceChild("right_ribs_top_r1", CubeListBuilder.create().texOffs(26, 2).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1515F, -0.4872F, -0.0067F));

		PartDefinition right_ribs_middle = ribs.addOrReplaceChild("right_ribs_middle", CubeListBuilder.create(), PartPose.offset(1.25F, -15.064F, 0.0181F));

		PartDefinition right_ribs_middle_r1 = right_ribs_middle.addOrReplaceChild("right_ribs_middle_r1", CubeListBuilder.create().texOffs(10, 23).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3948F, -0.3291F, 0.5892F));

		PartDefinition right_ribs_bottom = ribs.addOrReplaceChild("right_ribs_bottom", CubeListBuilder.create(), PartPose.offset(1.25F, -14.314F, 0.0181F));

		PartDefinition right_ribs_bottom_r1 = right_ribs_bottom.addOrReplaceChild("right_ribs_bottom_r1", CubeListBuilder.create().texOffs(24, 14).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4997F, -0.098F, 1.0714F));

		PartDefinition left_ribs_bottom = ribs.addOrReplaceChild("left_ribs_bottom", CubeListBuilder.create(), PartPose.offset(-1.25F, -14.314F, 0.0181F));

		PartDefinition left_ribs_bottom_r1 = left_ribs_bottom.addOrReplaceChild("left_ribs_bottom_r1", CubeListBuilder.create().texOffs(24, 16).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4997F, 0.098F, -1.0714F));

		PartDefinition left_ribs_middle = ribs.addOrReplaceChild("left_ribs_middle", CubeListBuilder.create(), PartPose.offset(-1.25F, -15.064F, 0.0181F));

		PartDefinition left_ribs_middle_r1 = left_ribs_middle.addOrReplaceChild("left_ribs_middle_r1", CubeListBuilder.create().texOffs(24, 12).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3948F, 0.3291F, -0.5892F));

		PartDefinition head = ascher.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -18.0F, -2.25F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create().texOffs(15, 6).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 10).addBox(-1.0F, -4.25F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 27).addBox(1.0F, -5.0F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 30).addBox(-2.0F, -5.0F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, 1.75F, 0.3491F, 0.0F, 0.0F));

		PartDefinition lower_jaw_left_r1 = lower_jaw.addOrReplaceChild("lower_jaw_left_r1", CubeListBuilder.create().texOffs(10, 18).addBox(-0.5F, -0.5F, -1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.75F, -1.5F, 0.2284F, -0.298F, -0.0681F));

		PartDefinition lower_jaw_back_r1 = lower_jaw.addOrReplaceChild("lower_jaw_back_r1", CubeListBuilder.create().texOffs(14, 8).addBox(-5.5F, -0.5F, -1.75F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -4.75F, 2.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition lower_jaw_right_r1 = lower_jaw.addOrReplaceChild("lower_jaw_right_r1", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.5F, -1.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -3.75F, -1.5F, 0.2256F, 0.2555F, 0.0579F));

		PartDefinition upper_jaw = head.addOrReplaceChild("upper_jaw", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, 3.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 18).addBox(-1.0F, 2.5F, -3.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.25F, 0.75F, -0.2618F, 0.0F, 0.0F));

		PartDefinition upper_jaw_back_r1 = upper_jaw.addOrReplaceChild("upper_jaw_back_r1", CubeListBuilder.create().texOffs(14, 10).addBox(-5.5F, -0.5F, -1.75F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.25F, 2.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition upper_jaw_left_r1 = upper_jaw.addOrReplaceChild("upper_jaw_left_r1", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, -0.5F, -2.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, 3.0F, -1.5F, 0.2591F, -0.403F, -0.1758F));

		PartDefinition upper_jaw_right_r1 = upper_jaw.addOrReplaceChild("upper_jaw_right_r1", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.5F, -2.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 3.0F, -1.5F, 0.2591F, 0.403F, 0.1758F));

		PartDefinition upper_tooth_left_r1 = upper_jaw.addOrReplaceChild("upper_tooth_left_r1", CubeListBuilder.create().texOffs(32, 33).addBox(-0.625F, -1.375F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.875F, 4.375F, -2.75F, 0.0F, 0.5236F, 0.0F));

		PartDefinition upper_tooth_right_r1 = upper_jaw.addOrReplaceChild("upper_tooth_right_r1", CubeListBuilder.create().texOffs(0, 33).addBox(-0.375F, -1.375F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.875F, 4.375F, -2.75F, 0.0F, -0.5236F, 0.0F));

		PartDefinition back = head.addOrReplaceChild("back", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top = head.addOrReplaceChild("top", CubeListBuilder.create().texOffs(14, 0).addBox(-3.5F, -8.75F, 1.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition eye_right_r1 = top.addOrReplaceChild("eye_right_r1", CubeListBuilder.create().texOffs(34, 4).addBox(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -7.75F, 0.0F, 0.2165F, 0.1228F, -0.1517F));

		PartDefinition eye_left_r1 = top.addOrReplaceChild("eye_left_r1", CubeListBuilder.create().texOffs(34, 2).addBox(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -7.75F, 0.0F, 0.2165F, -0.1228F, 0.1517F));

		PartDefinition left_r1 = top.addOrReplaceChild("left_r1", CubeListBuilder.create().texOffs(28, 24).addBox(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -8.25F, -1.0F, 0.2165F, -0.1228F, 0.1517F));

		PartDefinition right_r1 = top.addOrReplaceChild("right_r1", CubeListBuilder.create().texOffs(28, 7).addBox(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -8.25F, -1.0F, 0.2165F, 0.1228F, -0.1517F));

		PartDefinition middle_eye_bone_r1 = top.addOrReplaceChild("middle_eye_bone_r1", CubeListBuilder.create().texOffs(20, 18).addBox(-1.0F, -0.75F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, -1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition horn_right_r1 = top.addOrReplaceChild("horn_right_r1", CubeListBuilder.create().texOffs(30, 22).addBox(-2.25F, -1.0F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -8.5F, 2.25F, 0.0456F, -0.1685F, -0.2657F));

		PartDefinition horn_left_r1 = top.addOrReplaceChild("horn_left_r1", CubeListBuilder.create().texOffs(30, 20).addBox(0.0F, -1.0F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -8.5F, 2.25F, 0.0456F, 0.1685F, 0.2657F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(PSAnimationsDefinitions.ASCHER_WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((Ascher) entity).idleAnimationState, PSAnimationsDefinitions.ASCHER_IDLE, ageInTicks, 1f);
		this.animate(((Ascher) entity).attackAnimationState, PSAnimationsDefinitions.ASCHER_ATTACK, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		ascher.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return ascher;
	}
}