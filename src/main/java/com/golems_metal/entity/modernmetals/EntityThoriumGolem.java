package com.golems_metal.entity.modernmetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityThoriumGolem extends MetalGolemColorized {
	
	public static final String ALLOW_POISON = "Allow Special: Poison Creatures";
	
	public EntityThoriumGolem(World world) {
		super(world, 0x9ea2a2);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.THORIUM_GOLEM);
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if(super.attackEntityAsMob(entity)) {
			if(entity instanceof EntityLivingBase && getConfig(this).getBoolean(ALLOW_POISON)) {
				EntityLivingBase entityLiving = (EntityLivingBase)entity;
				if(null == entityLiving.getActivePotionEffect(MobEffects.POISON)) {
					entityLiving.addPotionEffect(new PotionEffect(MobEffects.POISON, 30, 1));
				}
			}
			return true;
		}
		return false;
	}
	
	@Override
	public List<String> addSpecialDesc(final List<String> list) { 
		if(getConfig(this).getBoolean(ALLOW_POISON)) {
			String sPoison = TextFormatting.GREEN + trans("entitytip.poisons_mobs");
			list.add(sPoison);
		}
		return list;
	}
}