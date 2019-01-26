package com.golems_metal.entity.basemetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemColorized;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityColdIronGolem extends MetalGolemColorized {
	
	public static final String DAMAGE_FIREPROOF = "Allow Special: Damages Fireproof";

	public EntityColdIronGolem(World world) {
		super(world, 0xBDC4E5);
		this.isImmuneToFire = true;
		this.setLootTableLoc("golem_coldiron");
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if(super.attackEntityAsMob(entity)) {
			if(getConfig(this).getBoolean(DAMAGE_FIREPROOF) && (entity.isBurning() || entity.isImmuneToFire())) {
				float damage = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.5F;
				entity.attackEntityFrom(DamageSource.GENERIC, damage);
			}
			return true;
		}
		return false;
	}

	@Override
	public List<String> addSpecialDesc(final List<String> list) {
		if(getConfig(this).getBoolean(EntityColdIronGolem.DAMAGE_FIREPROOF)) {
			String sDamage = TextFormatting.AQUA + trans("entitytip.extra_damage", trans("entitytip.fiery"));
			list.add(sDamage);
		}
		return list;
	 }
}