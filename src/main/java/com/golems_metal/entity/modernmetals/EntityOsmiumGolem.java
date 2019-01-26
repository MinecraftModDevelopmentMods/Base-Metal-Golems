package com.golems_metal.entity.modernmetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.init.InterModComm;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityOsmiumGolem extends MetalGolemColorized {
	
	public EntityOsmiumGolem(World world) {
		super(world, 0xBDC3C8);
		this.setLootTableLoc(InterModComm.OSMIUM);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.9999D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.12D);
	}
	
	@Override
	public List<String> addSpecialDesc(final List<String> list) { 
		list.add(TextFormatting.BOLD.toString() + TextFormatting.DARK_GRAY + trans("entitytip.heavy"));
		return list;
	}
}