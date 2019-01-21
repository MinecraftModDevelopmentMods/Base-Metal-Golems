package com.golems_metal.entity;

import com.golems_metal.init.MetalGolems;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBronzeGolem extends MetalGolemBase2 {
	
	public EntityBronzeGolem(World world) {
		super(world);
	}
	
	@Override
	protected ResourceLocation applyTexture() {
		return makeGolemTexture(MetalGolems.MODID, "bronze");
	}
}