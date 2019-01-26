package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.MetalGolems;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBronzeGolem extends MetalGolemTextured {
	
	public EntityBronzeGolem(World world) {
		super(world);
		this.setLootTableLoc("golem_bronze");
	}
	
	@Override
	protected ResourceLocation applyTexture() {
		return makeGolemTexture(MetalGolems.MODID, "bronze");
	}
}