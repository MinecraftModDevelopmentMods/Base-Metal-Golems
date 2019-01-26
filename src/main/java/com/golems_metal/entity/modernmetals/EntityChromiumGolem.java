package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.init.InterModComm;

import net.minecraft.world.World;

public class EntityChromiumGolem extends MetalGolemColorized {
	
	public EntityChromiumGolem(World world) {
		super(world, 0xDCDCDD);
		this.setLootTableLoc(InterModComm.CHROMIUM);
	}
}