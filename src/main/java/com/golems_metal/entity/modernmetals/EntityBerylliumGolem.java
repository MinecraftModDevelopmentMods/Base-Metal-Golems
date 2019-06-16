package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBerylliumGolem extends MetalGolemTextured {
	
	public EntityBerylliumGolem(World world) {
		super(world);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.BERYLLIUM_GOLEM);
	}

	@Override
	protected ResourceLocation applyTexture() {
		return makeModdedTexture(InterModComm.MODID_MODERN_METALS, MetalGolemNames.BERYLLIUM_GOLEM);
	}
}