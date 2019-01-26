package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.init.InterModComm;

import net.minecraft.world.World;

public class EntityCadmiumGolem extends MetalGolemColorized {
	
	public EntityCadmiumGolem(World world) {
		super(world, 0xDADEE0);
		this.setLootTableLoc(InterModComm.CADMIUM);
	}
}