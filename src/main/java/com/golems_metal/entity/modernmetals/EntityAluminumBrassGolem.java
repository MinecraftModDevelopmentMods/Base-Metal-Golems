package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityAluminumBrassGolem extends MetalGolemTextured {
	
	public EntityAluminumBrassGolem(World world) {
		super(world);
		this.setLootTableLoc(InterModComm.ALUMINUM_BRASS);
	}

	@Override
	protected ResourceLocation applyTexture() {
		return this.makeModdedTexture(InterModComm.MODID_MODERN_METALS, InterModComm.ALUMINUM_BRASS);
	}
}