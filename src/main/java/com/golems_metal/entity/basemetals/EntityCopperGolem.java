package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.MetalGolems;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityCopperGolem extends MetalGolemTextured {

	public EntityCopperGolem(World world) {
		super(world);
		this.setLootTableLoc("golem_copper");
	}
	
	@Override
	protected ResourceLocation applyTexture() {
		return makeGolemTexture(MetalGolems.MODID, "copper");
	}
}