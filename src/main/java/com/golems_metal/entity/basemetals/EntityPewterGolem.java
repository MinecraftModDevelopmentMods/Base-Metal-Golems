package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;

import net.minecraft.world.World;

public class EntityPewterGolem extends MetalGolemColorized {

    public EntityPewterGolem(World world) {
        super(world, 0xFF92969F);
        this.setLootTableLoc("golem_pewter");
    }
}
