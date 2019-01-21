package com.golems_metal.entity;

import net.minecraft.world.World;

public class EntityPewterGolem extends MetalGolemBase {

    public EntityPewterGolem(World world) {
        super(world, 0xFF92969F);
        this.setLootTableLoc("golem_pewter");
    }
}
