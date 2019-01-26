package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.init.InterModComm;

import net.minecraft.world.World;

public class EntityGalvSteelGolem extends MetalGolemColorized {
	
	public EntityGalvSteelGolem(World world) {
		super(world, 0xC8CDCB);
		this.setLootTableLoc(InterModComm.GALVANIZED_STEEL);
	}
}