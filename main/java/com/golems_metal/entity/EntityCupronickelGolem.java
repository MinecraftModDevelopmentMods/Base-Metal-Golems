package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityCupronickelGolem extends MetalGolemBase
{
	public EntityCupronickelGolem(World world) 
	{
		super(world, MetalConfig.CUPRONICKEL.getBaseAttack(), cyano.basemetals.init.Blocks.cupronickel_block, 0x98896C);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.CUPRONICKEL.getMaxHealth());
	}
	
	@Override
	public Item getIngot() 
	{
		return cyano.basemetals.init.Items.cupronickel_ingot;
	}
}