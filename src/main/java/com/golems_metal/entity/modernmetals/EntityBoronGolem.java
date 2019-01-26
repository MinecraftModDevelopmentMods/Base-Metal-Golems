package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBoronGolem extends MetalGolemTextured {
	
	public EntityBoronGolem(World world) {
		super(world);
		this.setLootTableLoc(InterModComm.BORON);
	}

	@Override
	protected ResourceLocation applyTexture() {
		return this.makeModdedTexture(InterModComm.MODID_MODERN_METALS, InterModComm.BORON);
	}
}