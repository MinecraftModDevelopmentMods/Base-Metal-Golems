package com.golems_metal.entity.basemetals;

import java.util.List;

import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.MetalGolems;

import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntitySilverGolem extends MetalGolemTextured {
	
	public static final String ALLOW_IMMUNE = "Allow Special: Immune to Magic";
	
	public EntitySilverGolem(World world) {
		super(world);
		this.setLootTableLoc("golem_silver");
	}

	@Override
	public boolean isEntityInvulnerable(DamageSource source) {
		return super.isEntityInvulnerable(source) || (source.isMagicDamage() && getConfig(this).getBoolean(ALLOW_IMMUNE));
	}

	
	@Override
	protected ResourceLocation applyTexture() {
		return makeGolemTexture(MetalGolems.MODID, "silver");
	}
	
	@Override
    public List<String> addSpecialDesc(final List<String> list) {
		if(getConfig(this).getBoolean(EntitySilverGolem.ALLOW_IMMUNE)) {
			String sImmune = TextFormatting.LIGHT_PURPLE + trans("entitytip.magic_immunity");
			list.add(sImmune);
		}
		return list;
	}
}