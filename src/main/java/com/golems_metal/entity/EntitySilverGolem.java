package com.golems_metal.entity;

import com.golems.entity.GolemBase;
import com.golems_metal.init.MetalConfig;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntitySilverGolem extends MetalGolemBase2
{
	public static final String ALLOW_IMMUNE = "Allow Special: Immune to Magic";
	
	public EntitySilverGolem(World world) 
	{
		super(world, MetalConfig.SILVER.getBaseAttack(), MetalGolemBase.getBlockForMat("SILVER"));
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.SILVER.getMaxHealth());
	}
	
	@Override
	public boolean isEntityInvulnerable(DamageSource source)
	{
		return super.isEntityInvulnerable(source) || (source.isMagicDamage() && MetalConfig.SILVER.getBoolean(ALLOW_IMMUNE));
	}

	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("SILVER");
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return GolemBase.makeGolemTexture(MetalGolems.MODID, "silver");
	}
}