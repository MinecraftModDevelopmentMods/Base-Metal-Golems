package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityAdamantineGolem extends MetalGolemBase
{	
	public static final String DAMAGE_TOUGH = "Allow Special: Damage Tough";
	public static final String ALLOW_RESIST = "Allow Special: Resistance";
	
	public EntityAdamantineGolem(World world) 
	{
		super(world, MetalConfig.ADAMANTINE.getBaseAttack(), MetalGolemBase.getBlockForMat("ADAMANTINE"), 0x452F34, true);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.ADAMANTINE.getMaxHealth());
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity)
	{
		if(super.attackEntityAsMob(entity))
		{
			if(entity instanceof EntityLivingBase)
			{
				double maxHealth = ((EntityLivingBase)entity).getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue();
				if(MetalConfig.ADAMANTINE.getBoolean(DAMAGE_TOUGH) && maxHealth >= 10)
				{
					entity.attackEntityFrom(DamageSource.GENERIC, 4.0F);
				}
			}
			return true;
		}
		return false;
	}
	
	@Override
	protected void damageEntity(DamageSource source, float amount) 
	{
		if(MetalConfig.ADAMANTINE.getBoolean(ALLOW_RESIST))
		{
			amount *= 3.0F / 5.0F;
		}
		super.damageEntity(source, amount);
	}

	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("ADAMANITE");
	}
}