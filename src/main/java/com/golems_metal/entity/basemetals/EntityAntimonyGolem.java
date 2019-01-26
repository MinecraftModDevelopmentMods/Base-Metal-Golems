package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.mcmoddev.basemetals.data.MaterialNames;

import net.minecraft.world.World;

public class EntityAntimonyGolem extends MetalGolemColorized {
    public EntityAntimonyGolem(World world) {
        super(world, 0xFFD8E3DE, false);
        this.setLootTableLoc(MaterialNames.ANTIMONY);
    }
}
