package com.golems_metal.entity.basemetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityMithrilGolem extends MetalGolemTextured {
	
	public static final String DAMAGE_UNDEAD = "Allow Special: Damage Undead";

	public EntityMithrilGolem(World world) {
		super(world);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.MITHRIL_GOLEM);
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if(super.attackEntityAsMob(entity)) {
			if(getConfig(this).getBoolean(DAMAGE_UNDEAD) && entity instanceof EntityLivingBase 
					&& ((EntityLivingBase)entity).getCreatureAttribute() == EnumCreatureAttribute.UNDEAD) {
				float damage = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 1.85F;
				entity.attackEntityFrom(DamageSource.GENERIC, damage);
			}
			return true;
		}
		return false;
	}

	@Override
	protected ResourceLocation applyTexture() {
		return makeModdedTexture(InterModComm.MODID_BASE_METALS, MetalGolemNames.MITHRIL_GOLEM);
	}
	
	@Override
    public List<String> addSpecialDesc(final List<String> list) {
		if(getConfig(this).getBoolean(EntityMithrilGolem.DAMAGE_UNDEAD)) {
			String sDamage = TextFormatting.AQUA + trans("entitytip.extra_damage", trans("entitytip.undead"));
			list.add(sDamage);
		}
		return list;
	}
}