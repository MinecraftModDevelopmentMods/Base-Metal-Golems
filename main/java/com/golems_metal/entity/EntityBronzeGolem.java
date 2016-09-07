package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBronzeGolem extends MetalGolemBase2
{
	public EntityBronzeGolem(World world) 
	{
		super(world, MetalConfig.BRONZE.getBaseAttack(), cyano.basemetals.init.Blocks.bronze_block);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.BRONZE.getMaxHealth());
	}

	@Override
	public Item getIngot() 
	{
		return cyano.basemetals.init.Items.bronze_ingot;
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return this.makeGolemTexture(MetalGolems.MODID, "bronze");
	}
}