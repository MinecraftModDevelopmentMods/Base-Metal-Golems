package com.golems_metal.entity;

import com.golems_metal.init.MetalConfig;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.material.MMDMaterial;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityColdIronGolem extends MetalGolemBase
{
	public static final String DAMAGE_FIREPROOF = "Allow Special: Damages Fireproof";
	public static final MMDMaterial MATERIAL = com.mcmoddev.lib.init.Materials.getMaterialByName(MaterialNames.COLDIRON);

	public EntityColdIronGolem(World world) 
	{
		super(world, MetalConfig.COLDIRON.getBaseAttack(), MATERIAL.getBlock(Names.BLOCK), 0xBDC4E5);
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
				entity.attackEntityFrom(DamageSource.GENERIC, damage);
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