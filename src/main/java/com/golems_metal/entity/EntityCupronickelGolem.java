package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.material.MMDMaterial;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityCupronickelGolem extends MetalGolemBase
{
    public static final MMDMaterial MATERIAL = com.mcmoddev.lib.init.Materials.getMaterialByName(MaterialNames.CUPRONICKEL);
	public EntityCupronickelGolem(World world) 
	{
		super(world, MetalConfig.CUPRONICKEL.getBaseAttack(), MATERIAL.getBlock(Names.BLOCK), 0x98896C);
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
		return MATERIAL.getItem(Names.INGOT);
	}
}