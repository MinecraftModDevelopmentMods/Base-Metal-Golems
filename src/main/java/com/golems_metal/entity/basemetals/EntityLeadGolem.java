package com.golems_metal.entity.basemetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityLeadGolem extends MetalGolemColorized {

	public EntityLeadGolem(World world) {
		super(world, 0x6E6E6E, true);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.9999D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.14D);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.LEAD_GOLEM);
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if(super.attackEntityAsMob(entity)) {
			// golem has a 5% chance to inflict poison effect
			if(this.rand.nextInt(100) < 5 && entity instanceof EntityLivingBase) {
				((EntityLivingBase)entity).addPotionEffect(new PotionEffect(MobEffects.POISON, 20, 1));
			}
			return true;
		}
		return false;
	}
	
	@Override
	public List<String> addSpecialDesc(final List<String> list) { 
		list.add(TextFormatting.BOLD.toString() + TextFormatting.DARK_GRAY + trans("entitytip.heavy"));
		return list;
	}
}