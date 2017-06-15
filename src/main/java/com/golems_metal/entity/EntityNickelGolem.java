package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityNickelGolem extends MetalGolemBase
{
	public EntityNickelGolem(World world) 
	{
		super(world, MetalConfig.NICKEL.getBaseAttack(), MetalGolemBase.getBlockForMat("NICKEL"), 0xDFF7DB, false);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.NICKEL.getMaxHealth());
	}
	
	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("NICKEL");
	}
}