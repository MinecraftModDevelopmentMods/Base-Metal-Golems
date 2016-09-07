package com.golems_metal.init;

import com.golems.util.GolemConfigSet;
import com.golems_metal.entity.EntityAdamantineGolem;
import com.golems_metal.entity.EntityAquariumGolem;
import com.golems_metal.entity.EntityColdIronGolem;
import com.golems_metal.entity.EntityElectrumGolem;
import com.golems_metal.entity.EntityMithrilGolem;
import com.golems_metal.entity.EntitySilverGolem;
import com.golems_metal.entity.EntityStarSteelGolem;

import net.minecraftforge.common.config.Configuration;

public class MetalConfig 
{
	public static GolemConfigSet ADAMANTINE;
	public static GolemConfigSet AQUARIUM;
	public static GolemConfigSet BRASS;
	public static GolemConfigSet BRONZE;
	public static GolemConfigSet COLDIRON;
	public static GolemConfigSet COPPER;
	public static GolemConfigSet CUPRONICKEL;
	public static GolemConfigSet ELECTRUM;
	public static GolemConfigSet INVAR;
	public static GolemConfigSet LEAD;
	public static GolemConfigSet MITHRIL;
	public static GolemConfigSet NICKEL;
	public static GolemConfigSet PLATINUM;
	public static GolemConfigSet SILVER;
	public static GolemConfigSet STARSTEEL;
	public static GolemConfigSet STEEL;
	public static GolemConfigSet TIN;
	public static GolemConfigSet ZINC;
	
	public static void mainRegistry(Configuration config)
	{
		config.load();

		// initialize
		ADAMANTINE = new GolemConfigSet(config, "Adamantine Golem", 240.0D, 21.0F);
		AQUARIUM = new GolemConfigSet(config, "Aquarium Golem", 120.0D, 8.0F);
		BRASS = new GolemConfigSet(config, "Brass Golem", 65.0D, 5.5F);
		BRONZE = new GolemConfigSet(config, "Bronze Golem", 90.0D, 6.0F);
		COLDIRON = new GolemConfigSet(config, "Cold Iron Golem", 112.0D, 9.5F);
		COPPER = new GolemConfigSet(config, "Copper Golem", 60.0D, 5.0F);
		CUPRONICKEL = new GolemConfigSet(config, "Cupronickel Golem", 68.0D, 5.0F);
		ELECTRUM = new GolemConfigSet(config, "Electrum Golem", 90.0D, 7.5F);
		INVAR = new GolemConfigSet(config, "Invar Golem", 140.0D, 9.0F);
		LEAD = new GolemConfigSet(config, "Lead Golem", 75.0D, 8.5F);
		MITHRIL = new GolemConfigSet(config, "Mithril Golem", 180.0D, 10.0F);
		NICKEL = new GolemConfigSet(config, "Nickel Golem", 60.0D, 5.0F);
		PLATINUM = new GolemConfigSet(config, "Platinum Golem", 70.0D, 5.0F);
		SILVER = new GolemConfigSet(config, "Silver Golem", 70.0D, 5.5F);
		STARSTEEL = new GolemConfigSet(config, "Star-Steel Golem", 155.0D, 10.0F);
		STEEL = new GolemConfigSet(config, "Steel Golem", 175.0D, 10.0F);
		TIN = new GolemConfigSet(config, "Tin Golem", 48.0D, 4.5F);
		ZINC = new GolemConfigSet(config, "Zinc Golem", 48.0D, 4.5F);
		
		// load specials
		ADAMANTINE.addKey(EntityAdamantineGolem.DAMAGE_TOUGH, true, "Whether this golem deals extra damage to tough mobs");
		ADAMANTINE.addKey(EntityAdamantineGolem.ALLOW_RESIST, true, "Whether this golem reduces damage dealt to it");
		AQUARIUM.addKey(EntityAquariumGolem.DAMAGE_WATER, true, "Whether this golem deals extra damage to water mobs");
		COLDIRON.addKey(EntityColdIronGolem.DAMAGE_FIREPROOF, true, "Whether this golem deals extra damage to fireproof mobs");
		ELECTRUM.addKey(EntityElectrumGolem.ALLOW_IMMUNE, false, "Whether this golem is immune to magic damage");
		MITHRIL.addKey(EntityMithrilGolem.DAMAGE_UNDEAD, true, "Whether this golem deals extra damage to undead mobs");
		STARSTEEL.addKey(EntityStarSteelGolem.ALLOW_HEALING, true, "Whether this golem can ocasionally heal itself");
		SILVER.addKey(EntitySilverGolem.ALLOW_IMMUNE, true, "Whether this golem is immune to magic damage");

		config.save();
	}
}
