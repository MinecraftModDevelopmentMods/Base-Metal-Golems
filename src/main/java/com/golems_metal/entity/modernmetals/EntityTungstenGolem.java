package com.golems_metal.entity.modernmetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.init.InterModComm;

import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityTungstenGolem extends MetalGolemColorized {
	
	public EntityTungstenGolem(World world) {
		super(world, 0xBABBBD);
		this.setLootTableLoc(InterModComm.TUNGSTEN);
	}

	@Override
	protected void damageEntity(DamageSource source, float amount) {
		if(source.isFireDamage()) {
			amount /= 5.0F;
		}
		super.damageEntity(source, amount);
	}
	
	@Override
	public List<String> addSpecialDesc(final List<String> list) { 
		list.add(TextFormatting.RED + trans("effect.fireResistance"));
		return list;
	}
	
}