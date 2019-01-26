package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.mcmoddev.basemetals.data.MaterialNames;

import net.minecraft.world.World;

public class EntityPlatinumGolem extends MetalGolemColorized {

	public EntityPlatinumGolem(World world) {
		super(world, 0xFAFAFA, true);
		this.setLootTableLoc(MaterialNames.PLATINUM);
	}
}