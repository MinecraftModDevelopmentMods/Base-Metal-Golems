package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityInvarGolem extends MetalGolemBase
{
	public EntityInvarGolem(World world) 
	{
		super(world, MetalConfig.INVAR.getBaseAttack(), MetalGolemBase.getBlockForMat("INVAR"), 0xC7C2AE, false);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.INVAR.getMaxHealth());
	}

	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("INVAR");
	}
}