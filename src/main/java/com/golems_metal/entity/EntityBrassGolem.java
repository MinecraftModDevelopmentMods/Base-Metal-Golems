package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityBrassGolem extends MetalGolemBase
{
	public EntityBrassGolem(World world) 
	{
		super(world, MetalConfig.BRASS.getBaseAttack(), MetalGolemBase.getBlockForMat("BRASS"), 0xF5D865, false);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.BRASS.getMaxHealth());
	}

	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("BRASS");
	}
}