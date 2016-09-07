package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityMithrilGolem extends MetalGolemBase2
{
	public static final String DAMAGE_UNDEAD = "Allow Special: Damage Undead";
	
	public EntityMithrilGolem(World world) 
	{
		super(world, MetalConfig.MITHRIL.getBaseAttack(), cyano.basemetals.init.Blocks.mithril_block);
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.MITHRIL.getMaxHealth());
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity)
	{
		if(super.attackEntityAsMob(entity))
		{
			if(MetalConfig.MITHRIL.getBoolean(DAMAGE_UNDEAD))
			{
				if(entity instanceof EntityLivingBase && ((EntityLivingBase)entity).getCreatureAttribute() == EnumCreatureAttribute.UNDEAD)
				{
					float damage = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.5F;
					entity.attackEntityFrom(DamageSource.generic, damage);
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public Item getIngot() 
	{
		return cyano.basemetals.init.Items.mithril_ingot;
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return this.makeGolemTexture(MetalGolems.MODID, "mithril");
	}
}