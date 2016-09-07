package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityPlatinumGolem extends MetalGolemBase
{
	public EntityPlatinumGolem(World world) 
	{
		super(world, MetalConfig.PLATINUM.getBaseAttack(), cyano.basemetals.init.Blocks.platinum_block, 0xFAFAFA, true);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.PLATINUM.getMaxHealth());
	}
	
	@Override
	public Item getIngot() 
	{
		return cyano.basemetals.init.Items.platinum_ingot;
	}
}