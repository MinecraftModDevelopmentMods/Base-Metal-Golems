package com.golems_metal.entity.basemetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityAquariumGolem extends MetalGolemTextured {
	
	public static final String DAMAGE_WATER = "Allow Special: Damage Water Mobs";

	public EntityAquariumGolem(World world) {
		super(world);
		this.setLootTableLoc("golem_aquarium");
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if(super.attackEntityAsMob(entity)) {
			if(getConfig(this).getBoolean(DAMAGE_WATER) && entity instanceof EntityWaterMob) {
				float damage = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.5F;
				entity.attackEntityFrom(DamageSource.GENERIC, damage);
			}
			return true;
		}
		return false;
	}

	@Override
	protected ResourceLocation applyTexture() {
		return this.makeModdedTexture(InterModComm.MODID_BASE_METALS, "aquarium");
	}

	@Override
    public List<String> addSpecialDesc(final List<String> list) {
    	if(getConfig(this).getBoolean(EntityAquariumGolem.DAMAGE_WATER)) {
			String sDamage = TextFormatting.AQUA + trans("entitytip.extra_damage", trans("entitytip.aquatic"));
			list.add(sDamage);
		}
    	return list;
    }
}