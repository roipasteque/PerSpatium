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
import net.pastek.perspatium.entity.entities.Mars;

public class MarsModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart mars;
	private final ModelPart legs;
	private final ModelPart right_leg;
	private final ModelPart right_leg_cloth;
	private final ModelPart right_foot;
	private final ModelPart left_leg;
	private final ModelPart left_foot;
	private final ModelPart left_leg_cloth;
	private final ModelPart body;
	private final ModelPart bottom_cloth;
	private final ModelPart spine;
	private final ModelPart rib_cage;
	private final ModelPart right_rib_cage;
	private final ModelPart right_rib_first;
	private final ModelPart right_rib_second;
	private final ModelPart right_rib_third;
	private final ModelPart left_rib_cage;
	private final ModelPart left_rib_first;
	private final ModelPart left_rib_second;
	private final ModelPart left_rib_third;
	private final ModelPart clavicula;
	private final ModelPart arms;
	private final ModelPart right_arm;
	private final ModelPart right_humerus;
	private final ModelPart right_radius;
	private final ModelPart right_hand;
	private final ModelPart sword;
	private final ModelPart left_arm;
	private final ModelPart left_humerus;
	private final ModelPart left_radius;
	private final ModelPart left_hand;
	private final ModelPart head;
	private final ModelPart lower_jaw;
	private final ModelPart upper_jaw;
	private final ModelPart top;

	public MarsModel(ModelPart root) {
		this.mars = root.getChild("mars");
		this.legs = this.mars.getChild("legs");
		this.right_leg = this.legs.getChild("right_leg");
		this.right_leg_cloth = this.right_leg.getChild("right_leg_cloth");
		this.right_foot = this.right_leg.getChild("right_foot");
		this.left_leg = this.legs.getChild("left_leg");
		this.left_foot = this.left_leg.getChild("left_foot");
		this.left_leg_cloth = this.left_leg.getChild("left_leg_cloth");
		this.body = this.mars.getChild("body");
		this.bottom_cloth = this.body.getChild("bottom_cloth");
		this.spine = this.body.getChild("spine");
		this.rib_cage = this.body.getChild("rib_cage");
		this.right_rib_cage = this.rib_cage.getChild("right_rib_cage");
		this.right_rib_first = this.right_rib_cage.getChild("right_rib_first");
		this.right_rib_second = this.right_rib_cage.getChild("right_rib_second");
		this.right_rib_third = this.right_rib_cage.getChild("right_rib_third");
		this.left_rib_cage = this.rib_cage.getChild("left_rib_cage");
		this.left_rib_first = this.left_rib_cage.getChild("left_rib_first");
		this.left_rib_second = this.left_rib_cage.getChild("left_rib_second");
		this.left_rib_third = this.left_rib_cage.getChild("left_rib_third");
		this.clavicula = this.body.getChild("clavicula");
		this.arms = this.body.getChild("arms");
		this.right_arm = this.arms.getChild("right_arm");
		this.right_humerus = this.right_arm.getChild("right_humerus");
		this.right_radius = this.right_arm.getChild("right_radius");
		this.right_hand = this.right_arm.getChild("right_hand");
		this.sword = this.right_arm.getChild("sword");
		this.left_arm = this.arms.getChild("left_arm");
		this.left_humerus = this.left_arm.getChild("left_humerus");
		this.left_radius = this.left_arm.getChild("left_radius");
		this.left_hand = this.left_arm.getChild("left_hand");
		this.head = this.body.getChild("head");
		this.lower_jaw = this.head.getChild("lower_jaw");
		this.upper_jaw = this.head.getChild("upper_jaw");
		this.top = this.head.getChild("top");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mars = partdefinition.addOrReplaceChild("mars", CubeListBuilder.create(), PartPose.offset(4.0F, 24.0F, 0.0F));

		PartDefinition legs = mars.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_leg = legs.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(8.0F, -20.5913F, 2.9067F));

		PartDefinition right_femur_r1 = right_leg.addOrReplaceChild("right_femur_r1", CubeListBuilder.create().texOffs(0, 21).addBox(-3.0F, -2.0F, -18.0F, 6.0F, 4.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6587F, -2.1567F, -1.7453F, 0.0F, 0.0F));

		PartDefinition right_fibula_bottom_r1 = right_leg.addOrReplaceChild("right_fibula_bottom_r1", CubeListBuilder.create().texOffs(0, 117).addBox(-1.0F, -2.0F, -9.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8413F, 0.5933F, -1.2654F, 0.0F, 0.0F));

		PartDefinition right_fibula_bottom_r2 = right_leg.addOrReplaceChild("right_fibula_bottom_r2", CubeListBuilder.create().texOffs(116, 0).addBox(-1.0F, -2.0F, -9.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.5913F, 0.3433F, -1.7017F, 0.0F, 0.0F));

		PartDefinition right_tibia_r1 = right_leg.addOrReplaceChild("right_tibia_r1", CubeListBuilder.create().texOffs(54, 21).addBox(-3.0F, -2.0F, -17.0F, 6.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.5913F, -0.9067F, -1.4835F, 0.0F, 0.0F));

		PartDefinition right_leg_cloth = right_leg.addOrReplaceChild("right_leg_cloth", CubeListBuilder.create(), PartPose.offset(-4.0F, 20.5913F, -2.9067F));

		PartDefinition right_leg_cloth_r1 = right_leg_cloth.addOrReplaceChild("right_leg_cloth_r1", CubeListBuilder.create().texOffs(54, 69).addBox(-23.0F, -4.0F, -19.0F, 10.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.0F, -29.25F, 0.75F, -1.6577F, -0.0076F, -0.0869F));

		PartDefinition right_foot = right_leg.addOrReplaceChild("right_foot", CubeListBuilder.create().texOffs(0, 131).addBox(2.0F, -3.0F, -18.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(24, 134).addBox(4.25F, -3.0F, -18.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 20.5913F, -2.9067F));

		PartDefinition right_foot_heel_r1 = right_foot.addOrReplaceChild("right_foot_heel_r1", CubeListBuilder.create().texOffs(72, 126).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.0F, 2.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_foot_toe_fourth_r1 = right_foot.addOrReplaceChild("right_foot_toe_fourth_r1", CubeListBuilder.create().texOffs(132, 112).addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, -1.5F, -13.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition right_foot_toe_first_r1 = right_foot.addOrReplaceChild("right_foot_toe_first_r1", CubeListBuilder.create().texOffs(128, 126).addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -13.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition right_foot_main_r1 = right_foot.addOrReplaceChild("right_foot_main_r1", CubeListBuilder.create().texOffs(104, 69).addBox(-4.0F, -2.0F, -5.0F, 8.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.0F, -4.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition left_leg = legs.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(-16.0F, -20.5913F, 2.9067F));

		PartDefinition left_femur_r1 = left_leg.addOrReplaceChild("left_femur_r1", CubeListBuilder.create().texOffs(0, 46).addBox(-3.0F, -2.0F, -18.0F, 6.0F, 4.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6587F, -2.1567F, -1.7453F, 0.0F, 0.0F));

		PartDefinition left_fibula_bottom_r1 = left_leg.addOrReplaceChild("left_fibula_bottom_r1", CubeListBuilder.create().texOffs(122, 28).addBox(-1.0F, -2.0F, -9.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8413F, 0.5933F, -1.2654F, 0.0F, 0.0F));

		PartDefinition left_fibula_bottom_r2 = left_leg.addOrReplaceChild("left_fibula_bottom_r2", CubeListBuilder.create().texOffs(122, 14).addBox(-1.0F, -2.0F, -9.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.5913F, 0.3433F, -1.7017F, 0.0F, 0.0F));

		PartDefinition left_tibia_r1 = left_leg.addOrReplaceChild("left_tibia_r1", CubeListBuilder.create().texOffs(54, 45).addBox(-3.0F, -2.0F, -17.0F, 6.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.5913F, -0.9067F, -1.4835F, 0.0F, 0.0F));

		PartDefinition left_foot = left_leg.addOrReplaceChild("left_foot", CubeListBuilder.create().texOffs(136, 89).addBox(2.0F, -3.0F, -18.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(96, 137).addBox(4.25F, -3.0F, -18.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 20.5913F, -2.9067F));

		PartDefinition left_foot_heel_r1 = left_foot.addOrReplaceChild("left_foot_heel_r1", CubeListBuilder.create().texOffs(100, 126).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.0F, 2.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition left_foot_toe_fourth_r1 = left_foot.addOrReplaceChild("left_foot_toe_fourth_r1", CubeListBuilder.create().texOffs(72, 137).addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, -1.5F, -13.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition left_foot_toe_first_r1 = left_foot.addOrReplaceChild("left_foot_toe_first_r1", CubeListBuilder.create().texOffs(48, 134).addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -13.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition left_foot_main_r1 = left_foot.addOrReplaceChild("left_foot_main_r1", CubeListBuilder.create().texOffs(96, 112).addBox(-4.0F, -2.0F, -5.0F, 8.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.0F, -4.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition left_leg_cloth = left_leg.addOrReplaceChild("left_leg_cloth", CubeListBuilder.create(), PartPose.offset(-4.0F, 20.5913F, -2.9067F));

		PartDefinition left_leg_cloth_r1 = left_leg_cloth.addOrReplaceChild("left_leg_cloth_r1", CubeListBuilder.create().texOffs(0, 71).addBox(14.0F, -4.0F, -19.0F, 10.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0F, -29.25F, 0.75F, -1.6577F, 0.0076F, 0.0869F));

		PartDefinition body = mars.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition bottom_cloth = body.addOrReplaceChild("bottom_cloth", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, -53.0F, -3.0F, 28.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spine = body.addOrReplaceChild("spine", CubeListBuilder.create().texOffs(142, 139).addBox(-7.0F, -85.25F, -0.5F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spine_third_r1 = spine.addOrReplaceChild("spine_third_r1", CubeListBuilder.create().texOffs(140, 62).addBox(-7.0F, -4.0F, 0.0F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -73.25F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition spine_second_r1 = spine.addOrReplaceChild("spine_second_r1", CubeListBuilder.create().texOffs(120, 139).addBox(-7.0F, -4.0F, 0.0F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -65.25F, 0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition spine_first_r1 = spine.addOrReplaceChild("spine_first_r1", CubeListBuilder.create().texOffs(138, 48).addBox(-7.0F, -4.0F, 0.0F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -57.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rib_cage = body.addOrReplaceChild("rib_cage", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rib_main_r1 = rib_cage.addOrReplaceChild("rib_main_r1", CubeListBuilder.create().texOffs(0, 144).addBox(-3.5F, -4.5F, -2.0F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -78.4932F, -5.5824F, -0.1745F, 0.0F, 0.0F));

		PartDefinition right_rib_cage = rib_cage.addOrReplaceChild("right_rib_cage", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_rib_first = right_rib_cage.addOrReplaceChild("right_rib_first", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_rib_first_middle_r1 = right_rib_first.addOrReplaceChild("right_rib_first_middle_r1", CubeListBuilder.create().texOffs(130, 153).addBox(-2.5F, -4.5F, -2.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -77.2432F, -2.5824F, -0.562F, -1.4741F, 0.4614F));

		PartDefinition right_rib_first_front_r1 = right_rib_first.addOrReplaceChild("right_rib_first_front_r1", CubeListBuilder.create().texOffs(150, 35).addBox(-3.5F, -4.5F, -2.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, -77.4932F, 3.4176F, -0.0084F, 0.3538F, 0.0493F));

		PartDefinition right_rib_first_front_r2 = right_rib_first.addOrReplaceChild("right_rib_first_front_r2", CubeListBuilder.create().texOffs(14, 159).addBox(-2.5F, -4.5F, -2.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, -77.4932F, -4.5824F, -0.1828F, -0.3006F, 0.0547F));

		PartDefinition right_rib_second = right_rib_cage.addOrReplaceChild("right_rib_second", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6406F, -75.9217F, -1.0108F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_rib_second_middle_r1 = right_rib_second.addOrReplaceChild("right_rib_second_middle_r1", CubeListBuilder.create().texOffs(150, 153).addBox(-2.5F, -4.5F, -2.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3594F, 3.1785F, -1.5716F, -0.562F, -1.4741F, 0.4614F));

		PartDefinition right_rib_second_front_r1 = right_rib_second.addOrReplaceChild("right_rib_second_front_r1", CubeListBuilder.create().texOffs(20, 147).addBox(-4.5F, -4.5F, -2.0F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8906F, 2.9285F, 4.4284F, -0.0084F, 0.3538F, 0.0493F));

		PartDefinition right_rib_second_front_r2 = right_rib_second.addOrReplaceChild("right_rib_second_front_r2", CubeListBuilder.create().texOffs(64, 150).addBox(-4.5F, -4.5F, -2.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8906F, 2.9285F, -3.5716F, -0.1828F, -0.3006F, 0.0547F));

		PartDefinition right_rib_third = right_rib_cage.addOrReplaceChild("right_rib_third", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6406F, -71.9217F, -1.0108F, 0.0F, 0.0F, 0.4363F));

		PartDefinition right_rib_third_middle_r1 = right_rib_third.addOrReplaceChild("right_rib_third_middle_r1", CubeListBuilder.create().texOffs(156, 41).addBox(-2.5F, -4.5F, -2.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3594F, 3.1785F, -1.5716F, -0.562F, -1.4741F, 0.4614F));

		PartDefinition right_rib_third_front_r1 = right_rib_third.addOrReplaceChild("right_rib_third_front_r1", CubeListBuilder.create().texOffs(140, 76).addBox(-5.5F, -4.5F, -2.0F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8906F, 2.9285F, 4.4284F, -0.0084F, 0.3538F, 0.0493F));

		PartDefinition right_rib_third_front_r2 = right_rib_third.addOrReplaceChild("right_rib_third_front_r2", CubeListBuilder.create().texOffs(86, 150).addBox(-4.5F, -4.5F, -2.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8906F, 2.9285F, -3.5716F, -0.1828F, -0.3006F, 0.0547F));

		PartDefinition left_rib_cage = rib_cage.addOrReplaceChild("left_rib_cage", CubeListBuilder.create(), PartPose.offset(-8.0F, 0.0F, 0.0F));

		PartDefinition left_rib_first = left_rib_cage.addOrReplaceChild("left_rib_first", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_rib_first_middle_r1 = left_rib_first.addOrReplaceChild("left_rib_first_middle_r1", CubeListBuilder.create().texOffs(64, 156).addBox(-4.5F, -4.5F, -2.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -77.2432F, -2.5824F, -0.562F, 1.4741F, -0.4614F));

		PartDefinition left_rib_first_front_r1 = left_rib_first.addOrReplaceChild("left_rib_first_front_r1", CubeListBuilder.create().texOffs(152, 125).addBox(-4.5F, -4.5F, -2.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -77.4932F, 3.4176F, -0.0084F, -0.3538F, -0.0493F));

		PartDefinition left_rib_first_front_r2 = left_rib_first.addOrReplaceChild("left_rib_first_front_r2", CubeListBuilder.create().texOffs(104, 159).addBox(-3.5F, -4.5F, -2.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -77.4932F, -4.5824F, -0.1828F, 0.3006F, -0.0547F));

		PartDefinition left_rib_second = left_rib_cage.addOrReplaceChild("left_rib_second", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6406F, -75.9217F, -1.0108F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_rib_second_middle_r1 = left_rib_second.addOrReplaceChild("left_rib_second_middle_r1", CubeListBuilder.create().texOffs(122, 159).addBox(-4.5F, -4.5F, -2.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3594F, 3.1785F, -1.5716F, -0.562F, 1.4741F, -0.4614F));

		PartDefinition left_rib_second_front_r1 = left_rib_second.addOrReplaceChild("left_rib_second_front_r1", CubeListBuilder.create().texOffs(20, 153).addBox(-4.5F, -4.5F, -2.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8906F, 2.9285F, 4.4284F, -0.0084F, -0.3538F, -0.0493F));

		PartDefinition left_rib_second_front_r2 = left_rib_second.addOrReplaceChild("left_rib_second_front_r2", CubeListBuilder.create().texOffs(152, 131).addBox(-3.5F, -4.5F, -2.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8906F, 2.9285F, -3.5716F, -0.1828F, 0.3006F, -0.0547F));

		PartDefinition left_rib_third = left_rib_cage.addOrReplaceChild("left_rib_third", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6406F, -71.9217F, -1.0108F, 0.0F, 0.0F, -0.4363F));

		PartDefinition left_rib_third_middle_r1 = left_rib_third.addOrReplaceChild("left_rib_third_middle_r1", CubeListBuilder.create().texOffs(84, 156).addBox(-4.5F, -4.5F, -2.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3594F, 3.1785F, -1.5716F, -0.562F, 1.4741F, -0.4614F));

		PartDefinition left_rib_third_front_r1 = left_rib_third.addOrReplaceChild("left_rib_third_front_r1", CubeListBuilder.create().texOffs(144, 82).addBox(-4.5F, -4.5F, -2.0F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8906F, 2.9285F, 4.4284F, -0.0084F, -0.3538F, -0.0493F));

		PartDefinition left_rib_third_front_r2 = left_rib_third.addOrReplaceChild("left_rib_third_front_r2", CubeListBuilder.create().texOffs(108, 153).addBox(-3.5F, -4.5F, -2.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8906F, 2.9285F, -3.5716F, -0.1828F, 0.3006F, -0.0547F));

		PartDefinition clavicula = body.addOrReplaceChild("clavicula", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition clavicula_left_r1 = clavicula.addOrReplaceChild("clavicula_left_r1", CubeListBuilder.create().texOffs(136, 106).addBox(-12.0F, -2.0F, -1.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -81.0F, -3.0F, 0.0503F, 0.5214F, 0.1007F));

		PartDefinition clavicula_right_r1 = clavicula.addOrReplaceChild("clavicula_right_r1", CubeListBuilder.create().texOffs(136, 102).addBox(-2.0F, -2.0F, -1.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -81.0F, -3.0F, 0.0503F, -0.5214F, -0.1007F));

		PartDefinition arms = body.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = arms.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(12.0F, -82.0F, 2.0F, 1.1345F, 0.0F, 0.0F));

		PartDefinition right_humerus = right_arm.addOrReplaceChild("right_humerus", CubeListBuilder.create(), PartPose.offset(-0.5677F, -0.1736F, -0.1647F));

		PartDefinition right_humerus_r1 = right_humerus.addOrReplaceChild("right_humerus_r1", CubeListBuilder.create().texOffs(50, 92).addBox(-3.0F, -2.0F, -15.0F, 5.0F, 5.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3845F, -0.4396F, 0.0184F));

		PartDefinition right_radius = right_arm.addOrReplaceChild("right_radius", CubeListBuilder.create(), PartPose.offset(-0.5677F, 1.8264F, -12.1647F));

		PartDefinition right_humerus_r2 = right_radius.addOrReplaceChild("right_humerus_r2", CubeListBuilder.create().texOffs(96, 92).addBox(-3.0F, -1.0F, -15.0F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 3.0F, 0.0F, 0.4341F, 0.0509F, 0.2074F));

		PartDefinition right_hand = right_arm.addOrReplaceChild("right_hand", CubeListBuilder.create(), PartPose.offset(-12.0F, 82.0F, -2.0F));

		PartDefinition right_thinger_second_r1 = right_hand.addOrReplaceChild("right_thinger_second_r1", CubeListBuilder.create().texOffs(162, 65).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.8935F, -69.0549F, -26.7924F, 0.951F, 1.0286F, 1.06F));

		PartDefinition right_thinger_third_r1 = right_hand.addOrReplaceChild("right_thinger_third_r1", CubeListBuilder.create().texOffs(64, 162).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.8935F, -67.5549F, -26.0424F, 0.951F, 1.0286F, 1.06F));

		PartDefinition right_thinger_first_r1 = right_hand.addOrReplaceChild("right_thinger_first_r1", CubeListBuilder.create().texOffs(162, 61).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.3935F, -70.5549F, -27.2924F, 0.951F, 1.0286F, 1.06F));

		PartDefinition right_hand_main_r1 = right_hand.addOrReplaceChild("right_hand_main_r1", CubeListBuilder.create().texOffs(32, 159).addBox(0.0F, 1.0F, -15.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.1823F, -77.6736F, -14.1647F, 0.4341F, 0.0509F, 0.2074F));

		PartDefinition sword = right_arm.addOrReplaceChild("sword", CubeListBuilder.create(), PartPose.offset(-12.0F, 82.0F, -2.0F));

		PartDefinition sword_handle_top_r1 = sword.addOrReplaceChild("sword_handle_top_r1", CubeListBuilder.create().texOffs(106, 56).addBox(-3.0F, -3.0F, -5.0F, 7.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -72.5F, -25.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition sword_handle_bottom_r1 = sword.addOrReplaceChild("sword_handle_bottom_r1", CubeListBuilder.create().texOffs(150, 27).addBox(-2.0F, -3.0F, -3.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -65.0F, -23.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition sword_blade_top_back_r1 = sword.addOrReplaceChild("sword_blade_top_back_r1", CubeListBuilder.create().texOffs(28, 117).addBox(-1.5F, -5.5F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.5F, -104.4018F, -37.3135F, 0.3054F, 0.0F, 0.0F));

		PartDefinition sword_blade_top_front_r1 = sword.addOrReplaceChild("sword_blade_top_front_r1", CubeListBuilder.create().texOffs(42, 157).addBox(-1.5F, -4.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.5F, -104.4018F, -38.0635F, 0.1745F, 0.0F, 0.0F));

		PartDefinition sword_blade_r1 = sword.addOrReplaceChild("sword_blade_r1", CubeListBuilder.create().texOffs(106, 20).addBox(-1.0F, -28.0F, -3.0F, 3.0F, 31.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -77.0F, -27.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition sword_handle_r1 = sword.addOrReplaceChild("sword_handle_r1", CubeListBuilder.create().texOffs(0, 157).addBox(-1.0F, -4.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -70.0F, -25.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition left_arm = arms.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 10.0F, 20.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition left_humerus = left_arm.addOrReplaceChild("left_humerus", CubeListBuilder.create(), PartPose.offset(-15.4323F, -73.1737F, 59.0853F));

		PartDefinition left_humerus_r1 = left_humerus.addOrReplaceChild("left_humerus_r1", CubeListBuilder.create().texOffs(0, 94).addBox(-2.0F, -3.0F, -15.0F, 5.0F, 5.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3845F, 0.4396F, -0.0184F));

		PartDefinition left_radius = left_arm.addOrReplaceChild("left_radius", CubeListBuilder.create(), PartPose.offsetAndRotation(-20.4384F, -64.016F, 40.9781F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_humerus_r2 = left_radius.addOrReplaceChild("left_humerus_r2", CubeListBuilder.create().texOffs(76, 0).addBox(-1.0F, -2.0F, -15.0F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4939F, -3.1576F, 6.1072F, 0.4341F, -0.0509F, -0.2074F));

		PartDefinition left_hand = left_arm.addOrReplaceChild("left_hand", CubeListBuilder.create(), PartPose.offset(-4.0F, 10.75F, 57.5F));

		PartDefinition left_thinger_second_r1 = left_hand.addOrReplaceChild("left_thinger_second_r1", CubeListBuilder.create().texOffs(80, 162).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.8935F, -69.3049F, -26.7924F, 0.951F, -1.0286F, -1.06F));

		PartDefinition left_thinger_third_r1 = left_hand.addOrReplaceChild("left_thinger_third_r1", CubeListBuilder.create().texOffs(72, 162).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.8935F, -68.0549F, -26.0424F, 0.951F, -1.0286F, -1.06F));

		PartDefinition left_thinger_first_r1 = left_hand.addOrReplaceChild("left_thinger_first_r1", CubeListBuilder.create().texOffs(162, 69).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.3935F, -70.5549F, -27.0424F, 0.951F, -1.0286F, -1.06F));

		PartDefinition left_hand_main_r1 = left_hand.addOrReplaceChild("left_hand_main_r1", CubeListBuilder.create().texOffs(160, 88).addBox(-1.0F, 1.0F, -15.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.1823F, -77.6737F, -14.1647F, 0.4341F, -0.0509F, -0.2074F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-4.0F, -95.0F, -0.75F));

		PartDefinition spine_fifth_r1 = head.addOrReplaceChild("spine_fifth_r1", CubeListBuilder.create().texOffs(46, 115).addBox(-8.0F, -9.0F, 0.0F, 8.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 5.75F, 0.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create().texOffs(122, 42).addBox(-7.0F, 5.0F, -6.0F, 14.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(28, 129).addBox(-2.0F, 4.0F, -6.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(56, 157).addBox(2.0F, 2.25F, -4.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(160, 56).addBox(-4.0F, 2.25F, -4.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lower_jaw_left_r1 = lower_jaw.addOrReplaceChild("lower_jaw_left_r1", CubeListBuilder.create().texOffs(150, 11).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.25F, 5.3712F, 0.2085F, 0.219F, 0.0852F, 0.0189F));

		PartDefinition lower_jaw_right_r1 = lower_jaw.addOrReplaceChild("lower_jaw_right_r1", CubeListBuilder.create().texOffs(44, 147).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.25F, 5.3475F, 0.425F, 0.219F, -0.0852F, -0.0189F));

		PartDefinition upper_jaw = head.addOrReplaceChild("upper_jaw", CubeListBuilder.create().texOffs(140, 159).addBox(-3.0F, 7.0F, -6.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(160, 47).addBox(-2.0F, 6.0F, -5.25F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.25F, 0.0F));

		PartDefinition lower_jaw_left_r2 = upper_jaw.addOrReplaceChild("lower_jaw_left_r2", CubeListBuilder.create().texOffs(144, 0).addBox(-2.5F, -0.5F, -3.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, 7.0F, -1.5F, 0.2591F, -0.403F, -0.1758F));

		PartDefinition lower_jaw_right_r2 = upper_jaw.addOrReplaceChild("lower_jaw_right_r2", CubeListBuilder.create().texOffs(72, 115).addBox(-0.5F, -0.5F, -2.75F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 7.0F, -1.5F, 0.2591F, 0.403F, 0.1758F));

		PartDefinition lower_tooth_left_r1 = upper_jaw.addOrReplaceChild("lower_tooth_left_r1", CubeListBuilder.create().texOffs(56, 162).addBox(-0.375F, -0.625F, -1.75F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.875F, 9.375F, -3.25F, 0.0F, 0.5236F, 0.0F));

		PartDefinition lower_tooth_right_r1 = upper_jaw.addOrReplaceChild("lower_tooth_right_r1", CubeListBuilder.create().texOffs(160, 95).addBox(-0.375F, -0.625F, -1.75F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.875F, 9.375F, -3.25F, 0.0F, -0.5236F, 0.0F));

		PartDefinition top = head.addOrReplaceChild("top", CubeListBuilder.create().texOffs(150, 21).addBox(-4.75F, -6.5F, 0.25F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(104, 83).addBox(-8.5F, -5.0F, 2.25F, 17.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eye_right_r1 = top.addOrReplaceChild("eye_right_r1", CubeListBuilder.create().texOffs(96, 162).addBox(0.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.75F, 0.0F, 0.2165F, 0.1228F, -0.1517F));

		PartDefinition eye_left_r1 = top.addOrReplaceChild("eye_left_r1", CubeListBuilder.create().texOffs(88, 162).addBox(-2.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.75F, 0.0F, 0.2165F, -0.1228F, 0.1517F));

		PartDefinition left_r1 = top.addOrReplaceChild("left_r1", CubeListBuilder.create().texOffs(158, 159).addBox(-2.0F, -1.0F, -3.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -5.25F, -1.0F, 0.2165F, -0.1228F, 0.1517F));

		PartDefinition right_r1 = top.addOrReplaceChild("right_r1", CubeListBuilder.create().texOffs(122, 48).addBox(0.0F, -1.0F, -3.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -5.25F, -1.0F, 0.2165F, 0.1228F, -0.1517F));

		PartDefinition middle_eye_bone_r1 = top.addOrReplaceChild("middle_eye_bone_r1", CubeListBuilder.create().texOffs(160, 51).addBox(-1.0F, -1.0F, -2.25F, 2.0F, 1.25F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition horn_right_r1 = top.addOrReplaceChild("horn_right_r1", CubeListBuilder.create().texOffs(156, 116).addBox(-2.0F, -2.0F, -1.75F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -3.5F, 4.25F, 0.0456F, -0.1685F, -0.2657F));

		PartDefinition horn_left_r1 = top.addOrReplaceChild("horn_left_r1", CubeListBuilder.create().texOffs(156, 110).addBox(-5.0F, -1.0F, -0.75F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -4.5F, 3.25F, 0.0456F, 0.1685F, 0.2657F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(PSAnimationsDefinitions.MARS_WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((Mars) entity).idleAnimationState_1, PSAnimationsDefinitions.MARS_IDLE, ageInTicks, 1f);
		this.animate(((Mars) entity).idleAnimationState_2, PSAnimationsDefinitions.MARS_IDLE_2, ageInTicks, 1f);
		this.animate(((Mars) entity).attackAnimationState_1, PSAnimationsDefinitions.MARS_ATTACK, ageInTicks, 1f);
		this.animate(((Mars) entity).attackAnimationState_2, PSAnimationsDefinitions.MARS_ATTACK_2, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		mars.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return mars;
	}
}