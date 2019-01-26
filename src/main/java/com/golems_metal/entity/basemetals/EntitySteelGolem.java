package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.mcmoddev.basemetals.data.MaterialNames;

import net.minecraft.world.World;

public class EntitySteelGolem extends MetalGolemColorized {
	
	public EntitySteelGolem(World world) {
		super(world, 0xC8D4D6);
		this.setLootTableLoc(MaterialNames.STEEL);
	}
}