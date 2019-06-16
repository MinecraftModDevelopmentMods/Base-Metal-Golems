package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityUraniumGolem extends EntityPlutoniumGolem {
	
	public EntityUraniumGolem(World world) {
		super(world);
		this.poisonAOEFactor = getConfig(this).getFloat(AOE);
		this.poisonLen = getConfig(this).getInt(DURATION);
		this.poisonAmp = getConfig(this).getInt(AMPLIFIER);
		this.allowPoison = getConfig(this).getBoolean(ALLOW_POISON);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.URANIUM_GOLEM);
	}
	
	@Override
	protected ResourceLocation applyTexture() {
		return this.makeModdedTexture(InterModComm.MODID_MODERN_METALS, MetalGolemNames.URANIUM_GOLEM);
	}
}