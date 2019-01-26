package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;

import net.minecraft.world.World;

public class EntityCupronickelGolem extends MetalGolemColorized {
	
	public EntityCupronickelGolem(World world) {
		super(world, 0x98896C);
		this.setLootTableLoc("golem_cupronickel");
	}
}