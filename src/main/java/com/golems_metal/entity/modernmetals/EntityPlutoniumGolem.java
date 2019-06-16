package com.golems_metal.entity.modernmetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityPlutoniumGolem extends MetalGolemTextured {
	
	public static final String ALLOW_POISON = "Allow Special: Poison Creatures";
	public static final String AOE = "Poison Area of Effect";
	public static final String DURATION = "Poison Duration";
	public static final String AMPLIFIER = "Poison Amplifier";
	
	protected double poisonAOEFactor;
	protected int poisonLen;
	protected int poisonAmp;
	protected boolean allowPoison;

	public EntityPlutoniumGolem(World world) {
		super(world);
		this.poisonAOEFactor = getConfig(this).getFloat(AOE);
		this.poisonLen = getConfig(this).getInt(DURATION);
		this.poisonAmp = getConfig(this).getInt(AMPLIFIER);
		this.allowPoison = getConfig(this).getBoolean(ALLOW_POISON);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.PLUTONIUM_GOLEM);
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if(allowPoison) {
			PotionEffect POISON_EFFECT = new PotionEffect(MobEffects.POISON, poisonLen, poisonAmp);
			List<Entity> entityList = world.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().grow(poisonAOEFactor, poisonAOEFactor * 0.75D, poisonAOEFactor));
			for(Entity entity : entityList) {
				if(entity instanceof EntityLivingBase && !(entity instanceof EntityPlutoniumGolem)) {
					EntityLivingBase entityLiving = (EntityLivingBase)entity;
					if(null == entityLiving.getActivePotionEffect(MobEffects.POISON)) {
						entityLiving.addPotionEffect(POISON_EFFECT);
					}
				}
			}
		}
		
		if(this.getActivePotionEffect(MobEffects.POISON) != null)
		{
			this.removeActivePotionEffect(MobEffects.POISON);
		}
	}

	@Override
	protected ResourceLocation applyTexture() {
		return this.makeModdedTexture(InterModComm.MODID_MODERN_METALS, MetalGolemNames.PLUTONIUM_GOLEM);
	}
	
	@Override
	public List<String> addSpecialDesc(final List<String> list) { 
		if(getConfig(this).getBoolean(EntityUraniumGolem.ALLOW_POISON)) {
			String sPoison = TextFormatting.GREEN + trans("entitytip.poisons_mobs");
			list.add(sPoison);
		}
		return list;
	}
}