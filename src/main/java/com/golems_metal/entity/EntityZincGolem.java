package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityZincGolem extends MetalGolemBase
{
	public EntityZincGolem(World world) 
	{
		super(world, MetalConfig.ZINC.getBaseAttack(), MetalGolemBase.getBlockForMat("ZINC"), 0xB1B1B1, false);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.ZINC.getMaxHealth());
	}
	
	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("ZINC");
	}
}