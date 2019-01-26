package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.init.InterModComm;

import net.minecraft.world.World;

public class EntityTitaniumGolem extends MetalGolemColorized {
	
	public EntityTitaniumGolem(World world) {
		super(world, 0xB9BABC);
		this.setLootTableLoc(InterModComm.TITANIUM);
	}
}