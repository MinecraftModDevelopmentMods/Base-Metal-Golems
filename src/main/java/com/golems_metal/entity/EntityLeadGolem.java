package com.golems_metal.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityLeadGolem extends MetalGolemBase {

	public EntityLeadGolem(World world) {
		super(world, 0x6E6E6E, true);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.9999D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.12D);
		this.setLootTableLoc("golem_lead");
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if(super.attackEntityAsMob(entity)) {
			if(this.rand.nextInt(100) < 5 && entity instanceof EntityLivingBase) {
				((EntityLivingBase)entity).addPotionEffect(new PotionEffect(MobEffects.POISON, 20, 1));
			}
			return true;
		}
		return false;
	}
}