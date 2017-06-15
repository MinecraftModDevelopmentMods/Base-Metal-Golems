package com.golems_metal.entity;

import com.golems.entity.GolemBase;
import com.golems_metal.init.MetalConfig;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityElectrumGolem extends MetalGolemBase2
{
	public static final String ALLOW_IMMUNE = "Allow Special: Immune to Magic";
	
	public EntityElectrumGolem(World world) 
	{
		super(world, MetalConfig.ELECTRUM.getBaseAttack(), MetalGolemBase.getBlockForMat("ELECTRUM"));
	}
	
	@Override
	public boolean isEntityInvulnerable(DamageSource source)
	{
		return super.isEntityInvulnerable(source) || (source.isMagicDamage() && MetalConfig.ELECTRUM.getBoolean(ALLOW_IMMUNE));
	}
	
	@Override
	protected void applyAttributes() 
	{
		super.applyAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.ELECTRUM.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemBase.METAL_GOLEM_SPEED + 0.11D);
	}

	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("ELECTRUM");
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return GolemBase.makeGolemTexture(MetalGolems.MODID, "electrum");
	}
}