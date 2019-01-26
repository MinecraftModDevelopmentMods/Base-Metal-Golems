package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.mcmoddev.basemetals.data.MaterialNames;

import net.minecraft.world.World;

public class EntityCupronickelGolem extends MetalGolemColorized {
	
	public EntityCupronickelGolem(World world) {
		super(world, 0x98896C);
		this.setLootTableLoc(MaterialNames.CUPRONICKEL);
	}
}