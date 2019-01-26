package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.mcmoddev.basemetals.data.MaterialNames;

import net.minecraft.world.World;

public class EntityInvarGolem extends MetalGolemColorized {

	public EntityInvarGolem(World world) {
		super(world, 0xC7C2AE);
		this.setLootTableLoc(MaterialNames.INVAR);
	}
}