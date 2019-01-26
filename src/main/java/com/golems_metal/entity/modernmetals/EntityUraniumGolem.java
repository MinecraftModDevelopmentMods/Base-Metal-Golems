package com.golems_metal.entity.modernmetals;

import java.util.List;

import com.golems_metal.init.InterModComm;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityUraniumGolem extends EntityPlutoniumGolem {
	
	public EntityUraniumGolem(World world) {
		super(world);
		this.poisonAOEFactor = getConfig(this).getFloat(AOE);
		this.poisonLen = getConfig(this).getInt(DURATION);
		this.poisonAmp = getConfig(this).getInt(AMPLIFIER);
		this.allowPoison = getConfig(this).getBoolean(ALLOW_POISON);
		this.setLootTableLoc(InterModComm.URANIUM);
	}
	
	@Override
	protected ResourceLocation applyTexture() {
		return this.makeModdedTexture(InterModComm.MODID_MODERN_METALS, InterModComm.URANIUM);
	}
}