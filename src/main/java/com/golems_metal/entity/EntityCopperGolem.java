package com.golems_metal.entity;

import com.golems.entity.GolemBase;
import com.golems_metal.init.MetalConfig;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityCopperGolem extends MetalGolemBase2
{
	public EntityCopperGolem(World world) 
	{
		super(world, MetalConfig.COPPER.getBaseAttack(), MetalGolemBase.getBlockForMat("COPPER"));
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.COPPER.getMaxHealth());
	}
	
	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("COPPER");
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return GolemBase.makeGolemTexture(MetalGolems.MODID, "copper");
	}
}