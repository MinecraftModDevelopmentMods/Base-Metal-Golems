package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityNickelGolem extends MetalGolemColorized {
	
	public EntityNickelGolem(World world) {
		super(world, 0xDFF7DB);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.NICKEL_GOLEM);
	}
}