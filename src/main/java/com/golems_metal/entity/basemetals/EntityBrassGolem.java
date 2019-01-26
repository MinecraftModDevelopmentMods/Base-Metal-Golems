package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;

import net.minecraft.world.World;

public class EntityBrassGolem extends MetalGolemColorized {
	
	public EntityBrassGolem(World world) {
		super(world, 0xF5D865);
		this.setLootTableLoc("golem_brass");
	}
}