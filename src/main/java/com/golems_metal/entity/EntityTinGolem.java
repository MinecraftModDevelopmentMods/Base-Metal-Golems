package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;
import com.golems_metal.init.MetalGolems;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.material.MMDMaterial;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityTinGolem extends MetalGolemBase2
{
	public static final MMDMaterial MATERIAL = com.mcmoddev.lib.init.Materials.getMaterialByName(MaterialNames.TIN);

	public EntityTinGolem(World world) 
	{
		super(world, MetalConfig.TIN.getBaseAttack(), MATERIAL.getBlock(Names.BLOCK));
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
		return MATERIAL.getItem(Names.INGOT);
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return this.makeGolemTexture(MetalGolems.MODID, "tin");
	}
}