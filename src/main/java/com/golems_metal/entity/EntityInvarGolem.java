package com.golems_metal.entity;

import net.minecraft.world.World;

public class EntityInvarGolem extends MetalGolemBase {

	public EntityInvarGolem(World world) {
		super(world, 0xC7C2AE);
		this.setLootTableLoc("golem_invar");
	}
}