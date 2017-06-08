package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntitySteelGolem extends MetalGolemBase
{
	public EntitySteelGolem(World world) 
	{
		super(world, MetalConfig.STEEL.getBaseAttack(), cyano.basemetals.init.Blocks.steel_block, 0xC8D4D6, false);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.STEEL.getMaxHealth());
	}

	@Override
	public Item getIngot() 
	{
		return cyano.basemetals.init.Items.steel_ingot;
	}
}