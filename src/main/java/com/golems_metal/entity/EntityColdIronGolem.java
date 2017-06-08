package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityColdIronGolem extends MetalGolemBase
{
	public static final String DAMAGE_FIREPROOF = "Allow Special: Damages Fireproof";
	
	public EntityColdIronGolem(World world) 
	{
		super(world, MetalConfig.COLDIRON.getBaseAttack(), cyano.basemetals.init.Blocks.coldiron_block, 0xBDC4E5);
		this.isImmuneToFire = true;
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.COLDIRON.getMaxHealth());
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity)
	{
		if(super.attackEntityAsMob(entity))
		{
			if(MetalConfig.COLDIRON.getBoolean(DAMAGE_FIREPROOF) && (entity.isBurning() || entity.isImmuneToFire()))
			{
				float damage = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.5F;
				entity.attackEntityFrom(DamageSource.generic, damage);
			}
			return true;
		}
		return false;
	}

	@Override
	public Item getIngot() 
	{
		return cyano.basemetals.init.Items.coldiron_ingot;
	}
}