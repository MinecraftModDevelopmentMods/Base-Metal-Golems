package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;

import net.minecraft.world.World;

public class EntityNickelGolem extends MetalGolemColorized {
	
	public EntityNickelGolem(World world) {
		super(world, 0xDFF7DB);
		this.setLootTableLoc("golem_nickel");
	}
}