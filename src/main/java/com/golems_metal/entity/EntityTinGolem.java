package com.golems_metal.entity;

import com.golems.entity.GolemBase;
import com.golems_metal.init.MetalConfig;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityTinGolem extends MetalGolemBase2
{
	public EntityTinGolem(World world) 
	{
		super(world, MetalConfig.TIN.getBaseAttack(), cyano.basemetals.init.Blocks.tin_block);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.TIN.getMaxHealth());
	}

	@Override
	public Item getIngot() 
	{
		return cyano.basemetals.init.Items.tin_ingot;
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return GolemBase.makeGolemTexture(MetalGolems.MODID, "tin");
	}
}