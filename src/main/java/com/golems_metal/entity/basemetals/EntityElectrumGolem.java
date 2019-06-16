package com.golems_metal.entity.basemetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityElectrumGolem extends MetalGolemTextured {
	
	public static final String ALLOW_IMMUNE = "Allow Special: Immune to Magic";

	public EntityElectrumGolem(World world) {
		super(world);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemColorized.METAL_GOLEM_SPEED + 0.11D);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.ELECTRUM_GOLEM);
	}
	
	@Override
	public boolean isEntityInvulnerable(DamageSource source) {
		return super.isEntityInvulnerable(source) || (source.isMagicDamage() && getConfig(this).getBoolean(ALLOW_IMMUNE));
	}

	@Override
	protected ResourceLocation applyTexture() {
		return makeModdedTexture(InterModComm.MODID_BASE_METALS, MetalGolemNames.ELECTRUM_GOLEM);
	}
	
	@Override
    public List<String> addSpecialDesc(final List<String> list) {
		// add 2 tips:  magic immunity and speed boost
		if(getConfig(this).getBoolean(EntityElectrumGolem.ALLOW_IMMUNE)) {
			String sImmune = TextFormatting.LIGHT_PURPLE + trans("entitytip.magic_immunity");
			list.add(sImmune);
		}
		String sFast = TextFormatting.GOLD + trans("entitytip.fast");
		list.add(sFast);
		return list;
	}
}