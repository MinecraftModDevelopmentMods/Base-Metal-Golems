package com.golems_metal.entity;

import com.golems.entity.GolemBase;
import com.golems_metal.init.MetalConfig;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityAquariumGolem extends MetalGolemBase2
{
	public static final String DAMAGE_WATER = "Allow Special: Damage Water Mobs";
	
	public EntityAquariumGolem(World world) 
	{
		super(world, MetalConfig.AQUARIUM.getBaseAttack(), MetalGolemBase.getBlockForMat("AQUARIUM"));
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.AQUARIUM.getMaxHealth());
	}

	@Override
	public boolean attackEntityAsMob(Entity entity)
	{
		if(super.attackEntityAsMob(entity))
		{
			if(MetalConfig.AQUARIUM.getBoolean(DAMAGE_WATER) && entity instanceof EntityWaterMob)
			{
				float damage = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.5F;
				entity.attackEntityFrom(DamageSource.GENERIC, damage);
			}
			return true;
		}
		return false;
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return GolemBase.makeGolemTexture(MetalGolems.MODID, "aquarium");
	}

	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("AQUARIUM");
	}
}