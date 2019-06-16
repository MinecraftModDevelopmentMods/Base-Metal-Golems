package com.golems_metal.entity.baseminerals;

import java.util.List;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MineralGolemColorized;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityLithiumGolem extends MineralGolemColorized {
	
	public static final String ALLOW_WATER_DAMAGE = "Water Damage Multiplier";

	private static final AttributeModifier WET_MODIFIER = new AttributeModifier("Lithium-Water reaction", 1.5D, 0);
	
	private boolean waterMult;

	public EntityLithiumGolem(World world) {
		super(world, 0x866E60);
		this.setCanSwim(true);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.LITHIUM_GOLEM);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemColorized.METAL_GOLEM_SPEED + 0.02D);
		waterMult = getConfig(this).getBoolean(ALLOW_WATER_DAMAGE);
	}
	
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		// lithium reacts with water
		if(waterMult && this.isWet()) {
			// damage golem a little bit
			this.damageEntity(DamageSource.WITHER, 0.02F);
			// increase attack power a little bit
			if(!this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).hasModifier(WET_MODIFIER)) {
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).applyModifier(WET_MODIFIER);
			}
		} else if(this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).hasModifier(WET_MODIFIER)) {
			// remove attack modifier when dry
			this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).removeModifier(WET_MODIFIER);	
		}
	}
	
	@Override
	public SoundEvent getGolemSound() {
		return SoundEvents.BLOCK_METAL_STEP;
	}
	
	@Override
	public List<String> addSpecialDesc(final List<String> list) { 
		if(waterMult) {
			list.add(TextFormatting.BLUE + trans("entitytip.lithium_wet"));
		}
		return list;
	}
}