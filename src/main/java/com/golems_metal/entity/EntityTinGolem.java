package com.golems_metal.entity;

import com.golems_metal.init.MetalGolems;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityTinGolem extends MetalGolemBase2 {

	public EntityTinGolem(World world) {
		super(world);
	}

	@Override
	protected ResourceLocation applyTexture() {
		return makeGolemTexture(MetalGolems.MODID, "tin");
	}
}