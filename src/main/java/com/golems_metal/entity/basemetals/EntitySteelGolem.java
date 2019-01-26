package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;

import net.minecraft.world.World;

public class EntitySteelGolem extends MetalGolemColorized {
	
	public EntitySteelGolem(World world) {
		super(world, 0xC8D4D6);
		this.setLootTableLoc("golem_steel");
	}
}