package com.golems_metal.entity.basemetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;
import com.mcmoddev.basemetals.data.MaterialNames;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityStarSteelGolem extends MetalGolemTextured {
	
	public static final String ALLOW_HEALING = "Allow Special: Random Healing";	
	
	public EntityStarSteelGolem(World world) {
		super(world);
		this.stepHeight = 1.0F;
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemColorized.METAL_GOLEM_SPEED + 0.06D);
		this.setLootTableLoc(MaterialNames.STARSTEEL);
	}

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if(rand.nextInt(400) == 0 && getConfig(this).getBoolean(ALLOW_HEALING)) {
			this.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 2));
		}

		// slow falling for this entity
		if(this.motionY < -0.1D) {
			this.motionY *= 4.0D / 5.0D;
		}
	}

	@Override
	protected float getJumpUpwardsMotion() {
		return 0.62F;
	}

	@Override
	protected ResourceLocation applyTexture() {
		return makeModdedTexture(InterModComm.MODID_BASE_METALS, MaterialNames.STARSTEEL);
	}

	@Override
	public SoundEvent getGolemSound() {
		return SoundEvents.BLOCK_METAL_STEP;
	}
	
	@Override
    public List<String> addSpecialDesc(final List<String> list) {
		if(getConfig(this).getBoolean(EntityStarSteelGolem.ALLOW_HEALING)) {
			String sHeals = TextFormatting.RED + trans("entitytip.heals");
			list.add(sHeals);
		}
		return list;
	}
}