package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityPewterGolem extends MetalGolemColorized {

    public EntityPewterGolem(World world) {
        super(world, 0xFF92969F);
        this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.PEWTER_GOLEM);
    }
}
