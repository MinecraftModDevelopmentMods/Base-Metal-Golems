package com.golems_metal.entity.basemetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityAquariumGolem extends MetalGolemTextured {
	
	public static final String DAMAGE_WATER = "Allow Special: Damage Water Mobs";

	public EntityAquariumGolem(World world) {
		super(world);
		this.canDrown = false;
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.AQUARIUM_GOLEM);
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
	
	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons use
	 * this to react to sunlight and start to burn.
	 */
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		// speed boost in water
		if (this.isInWater()) {
			this.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 2, false, false));
		}
	}

	@Override
	protected ResourceLocation applyTexture() {
		return makeModdedTexture(InterModComm.MODID_BASE_METALS, MetalGolemNames.AQUARIUM_GOLEM);
	}

	@Override
    public List<String> addSpecialDesc(final List<String> list) {
    	if(getConfig(this).getBoolean(EntityAquariumGolem.DAMAGE_WATER)) {
			String sDamage = TextFormatting.AQUA + trans("entitytip.extra_damage", trans("entitytip.aquatic"));
			list.add(sDamage);
		}
    	list.add(TextFormatting.BLUE + trans("entitytip.breathes_underwater"));
    	return list;
    }
}