package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityZincGolem extends MetalGolemBase
{
	public EntityZincGolem(World world) 
	{
		super(world, MetalConfig.ZINC.getBaseAttack(), cyano.basemetals.init.Blocks.zinc_block, 0xB1B1B1, false);
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
		return cyano.basemetals.init.Items.zinc_ingot;
	}
}