package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.mcmoddev.basemetals.data.MaterialNames;

import net.minecraft.world.World;

public class EntityBrassGolem extends MetalGolemColorized {
	
	public EntityBrassGolem(World world) {
		super(world, 0xF5D865);
		this.setLootTableLoc(MaterialNames.BRASS);
	}
}