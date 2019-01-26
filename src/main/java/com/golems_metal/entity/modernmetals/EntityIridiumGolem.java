package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityIridiumGolem extends MetalGolemTextured {
	
	public EntityIridiumGolem(World world) {
		super(world);
		this.setLootTableLoc(InterModComm.IRIDIUM);
	}

	@Override
	protected ResourceLocation applyTexture() {
		return this.makeModdedTexture(InterModComm.MODID_MODERN_METALS, InterModComm.IRIDIUM);
	}
}