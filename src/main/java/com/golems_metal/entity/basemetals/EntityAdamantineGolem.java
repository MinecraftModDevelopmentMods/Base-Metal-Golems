package com.golems_metal.entity.basemetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityAdamantineGolem extends MetalGolemColorized {
	
	public static final String DAMAGE_TOUGH = "Allow Special: Damage Tough";
	public static final String ALLOW_RESIST = "Allow Special: Resistance";
	
	public EntityAdamantineGolem(World world) {
		super(world, 0x452F34, true);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.ADAMANTINE_GOLEM);
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if(super.attackEntityAsMob(entity)) {
			if(entity instanceof EntityLivingBase) {
				double maxHealth = ((EntityLivingBase)entity).getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue();
				if(getConfig(this).getBoolean(DAMAGE_TOUGH) && maxHealth >= 10) {
					entity.attackEntityFrom(DamageSource.GENERIC, 4.0F);
				}
			}
			return true;
		}
		return false;
	}
	
	@Override
	protected void damageEntity(DamageSource source, float amount) {
		if(getConfig(this).getBoolean(ALLOW_RESIST)) {
			amount *= 3.0F / 5.0F;
		}
		super.damageEntity(source, amount);
	}
	
	@Override
	public List<String> addSpecialDesc(final List<String> list) { 
		
		if(getConfig(this).getBoolean(EntityAdamantineGolem.DAMAGE_TOUGH)) {
			String sDamage = TextFormatting.AQUA + trans("entitytip.extra_damage", trans("entitytip.tough"));
			list.add(sDamage);
		}

		if(getConfig(this).getBoolean(EntityAdamantineGolem.ALLOW_RESIST)) {
			String sResist = TextFormatting.GRAY + trans("entitytip.damage_resist");
			list.add(sResist);
		}
		return list;
	}
}