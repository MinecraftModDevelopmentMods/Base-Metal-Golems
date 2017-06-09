package com.golems_metal.integration;

import java.util.LinkedList;
import java.util.List;

import com.golems.entity.GolemBase;
import com.golems.integration.GolemDescriptionManager;
import com.golems_metal.entity.EntityAdamantineGolem;
import com.golems_metal.entity.EntityAquariumGolem;
import com.golems_metal.entity.EntityColdIronGolem;
import com.golems_metal.entity.EntityElectrumGolem;
import com.golems_metal.entity.EntityMithrilGolem;
import com.golems_metal.entity.EntitySilverGolem;
import com.golems_metal.entity.EntityStarSteelGolem;
import com.golems_metal.init.MetalConfig;

import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextFormatting;

public class MetalGolemDescriptionManager extends GolemDescriptionManager
{
	@Override
	public List<String> getEntityDescription(GolemBase golem)
	{
		List<String> list = new LinkedList<String>();

		if(this.showSpecial)
		{
			if(golem.getClass() == EntityAdamantineGolem.class)
			{
				if(MetalConfig.ADAMANTINE.getBoolean(EntityAdamantineGolem.DAMAGE_TOUGH))
				{
					String sDamage = TextFormatting.AQUA + trans("entitytip.extra_damage", trans("entitytip.tough"));
					list.add(sDamage);
				}

				if(MetalConfig.ADAMANTINE.getBoolean(EntityAdamantineGolem.ALLOW_RESIST))
				{
					String sResist = TextFormatting.GRAY + trans("entitytip.damage_resist");
					list.add(sResist);
				}
			}

			if(golem.getClass() == EntityAquariumGolem.class)
			{
				if(MetalConfig.AQUARIUM.getBoolean(EntityAquariumGolem.DAMAGE_WATER))
				{
					String sDamage = TextFormatting.AQUA + trans("entitytip.extra_damage", trans("entitytip.aquatic"));
					list.add(sDamage);
				}
			}

			if(golem.getClass() == EntityColdIronGolem.class)
			{
				if(MetalConfig.COLDIRON.getBoolean(EntityColdIronGolem.DAMAGE_FIREPROOF))
				{
					String sDamage = TextFormatting.AQUA + trans("entitytip.extra_damage", trans("entitytip.fiery"));
					list.add(sDamage);
				}
			}

			if(golem.getClass() == EntityElectrumGolem.class)
			{
				if(MetalConfig.ELECTRUM.getBoolean(EntityElectrumGolem.ALLOW_IMMUNE))
				{
					String sImmune = TextFormatting.LIGHT_PURPLE + trans("entitytip.magic_immunity");
					list.add(sImmune);
				}

				String sFast = TextFormatting.GOLD + trans("entitytip.fast");
				list.add(sFast);
			}

			if(golem.getClass() == EntityMithrilGolem.class)
			{
				if(MetalConfig.MITHRIL.getBoolean(EntityMithrilGolem.DAMAGE_UNDEAD))
				{
					String sDamage = TextFormatting.AQUA + trans("entitytip.extra_damage", trans("entitytip.undead"));
					list.add(sDamage);
				}
			}

			if(golem.getClass() == EntitySilverGolem.class)
			{
				if(MetalConfig.SILVER.getBoolean(EntitySilverGolem.ALLOW_IMMUNE))
				{
					String sImmune = TextFormatting.LIGHT_PURPLE + trans("entitytip.magic_immunity");
					list.add(sImmune);
				}
			}

			if(golem.getClass() == EntityStarSteelGolem.class)
			{				
				if(MetalConfig.STARSTEEL.getBoolean(EntityStarSteelGolem.ALLOW_HEALING))
				{
					String sHeals = TextFormatting.RED + trans("entitytip.heals");
					list.add(sHeals);
				}
			}
		}

		return list;
	}
	
	@Override
	protected String trans(String s, Object... strings)
	{
		// the old one still uses "entitytip".concat(s)
		return I18n.format(s, strings);
	}
}
