package com.golems_metal.entity;

import net.minecraft.world.World;

public class EntityBrassGolem extends MetalGolemBase {
	
	public EntityBrassGolem(World world) {
		super(world, 0xF5D865);
		this.setLootTableLoc("golem_brass");
	}
}