package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.init.InterModComm;

import net.minecraft.world.World;

public class EntityTantalumGolem extends MetalGolemColorized {
	
	public EntityTantalumGolem(World world) {
		super(world, 0xD8D6D7);
		this.setLootTableLoc(InterModComm.TANTALUM);
	}
}