package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;
import com.golems_metal.init.MetalGolems;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.material.MMDMaterial;
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
	public static final MMDMaterial MATERIAL = com.mcmoddev.lib.init.Materials.getMaterialByName(MaterialNames.MITHRIL);

	public EntityMithrilGolem(World world) 
	{
		super(world, MetalConfig.MITHRIL.getBaseAttack(), MATERIAL.getBlock(Names.BLOCK));
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
					entity.attackEntityFrom(DamageSource.GENERIC, damage);
				}
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

	@Override
	protected ResourceLocation applyTexture() 
	{
		return this.makeGolemTexture(MetalGolems.MODID, "mithril");
	}
}