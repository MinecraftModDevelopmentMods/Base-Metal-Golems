package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.material.MMDMaterial;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityLeadGolem extends MetalGolemBase
{
	public static final MMDMaterial MATERIAL = com.mcmoddev.lib.init.Materials.getMaterialByName(MaterialNames.LEAD);

	public EntityLeadGolem(World world) 
	{
		super(world, MetalConfig.LEAD.getBaseAttack(), MATERIAL.getBlock(Names.BLOCK), 0x6E6E6E, true);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.LEAD.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.9999D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.12D);
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity)
	{
		if(super.attackEntityAsMob(entity))
		{
			if(this.rand.nextInt(100) < 5 && entity instanceof EntityLivingBase)
			{
				((EntityLivingBase)entity).addPotionEffect(new PotionEffect(MobEffects.POISON, 20, 1));
			}
			return true;
		}
		return false;
	}

	@Override
	public Item getIngot() 
	{
		return MATERIAL.getItem(Names.INGOT);
	}
}