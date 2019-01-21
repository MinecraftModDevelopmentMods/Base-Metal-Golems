package com.golems_metal.init;

import com.golems.util.GolemConfigSet;
import com.golems.util.GolemLookup;
import com.golems_metal.entity.*;

import net.minecraftforge.common.config.Configuration;

public class MetalConfig 
{
//	public static GolemConfigSet ADAMANTINE;
//	public static GolemConfigSet ANTIMONY;
//	public static GolemConfigSet AQUARIUM;
//	public static GolemConfigSet BISMUTH;
//	public static GolemConfigSet BRASS;
//	public static GolemConfigSet BRONZE;
//	public static GolemConfigSet COLDIRON;
//	public static GolemConfigSet COPPER;
//	public static GolemConfigSet CUPRONICKEL;
//	public static GolemConfigSet ELECTRUM;
//	public static GolemConfigSet INVAR;
//	public static GolemConfigSet LEAD;
//	public static GolemConfigSet MITHRIL;
//	public static GolemConfigSet NICKEL;
//	public static GolemConfigSet PEWTER;
//	public static GolemConfigSet PLATINUM;
//	public static GolemConfigSet SILVER;
//	public static GolemConfigSet STARSTEEL;
//	public static GolemConfigSet STEEL;
//	public static GolemConfigSet TIN;
//	public static GolemConfigSet ZINC;
	
	public static void mainRegistry(Configuration config)
	{
		config.load();

		// initialize and register with GolemLookup
		GolemLookup.addConfig(EntityAdamantineGolem.class, 
				new GolemConfigSet(config, "Adamantine Golem", 240.0D, 21.0F)
				.addKey(EntityAdamantineGolem.DAMAGE_TOUGH, true, "Whether this golem deals extra damage to tough mobs")
				.addKey(EntityAdamantineGolem.ALLOW_RESIST, true, "Whether this golem reduces damage dealt to it"));
		//TODO: Change the stats of this golem.
		GolemLookup.addConfig(EntityAntimonyGolem.class,
				new GolemConfigSet(config, "Antimony Golem", 100D, 7.0F));
		GolemLookup.addConfig(EntityAquariumGolem.class,
				new GolemConfigSet(config, "Aquarium Golem", 120.0D, 8.0F)
				.addKey(EntityAquariumGolem.DAMAGE_WATER, true, "Whether this golem deals extra damage to water mobs"));
		//TODO: Change the stats of this golem.
		GolemLookup.addConfig(EntityBismuthGolem.class,
				new GolemConfigSet(config, "Bismuth Golem", 100D, 7.0F));
		GolemLookup.addConfig(EntityBrassGolem.class,
				new GolemConfigSet(config, "Brass Golem", 65.0D, 5.5F));
		GolemLookup.addConfig(EntityBronzeGolem.class,
				new GolemConfigSet(config, "Bronze Golem", 90.0D, 6.0F));
		GolemLookup.addConfig(EntityColdIronGolem.class,
				new GolemConfigSet(config, "Cold Iron Golem", 112.0D, 9.5F)
				.addKey(EntityColdIronGolem.DAMAGE_FIREPROOF, true, "Whether this golem deals extra damage to fireproof mobs"));
		GolemLookup.addConfig(EntityCopperGolem.class,
				new GolemConfigSet(config, "Copper Golem", 60.0D, 5.0F));
		GolemLookup.addConfig(EntityCupronickelGolem.class,
				new GolemConfigSet(config, "Cupronickel Golem", 68.0D, 5.0F));
		GolemLookup.addConfig(EntityElectrumGolem.class,
				new GolemConfigSet(config, "Electrum Golem", 90.0D, 7.5F)
				.addKey(EntityElectrumGolem.ALLOW_IMMUNE, false, "Whether this golem is immune to magic damage"));
		GolemLookup.addConfig(EntityInvarGolem.class, 
				new GolemConfigSet(config, "Invar Golem", 140.0D, 9.0F));
		GolemLookup.addConfig(EntityLeadGolem.class,
				new GolemConfigSet(config, "Lead Golem", 75.0D, 8.5F));
		GolemLookup.addConfig(EntityMithrilGolem.class,
				new GolemConfigSet(config, "Mithril Golem", 180.0D, 10.0F)
				.addKey(EntityMithrilGolem.DAMAGE_UNDEAD, true, "Whether this golem deals extra damage to undead mobs"));
		GolemLookup.addConfig(EntityNickelGolem.class,
				new GolemConfigSet(config, "Nickel Golem", 60.0D, 5.0F));
		//TODO: Change the stats of this golem.
		GolemLookup.addConfig(EntityPewterGolem.class,
				new GolemConfigSet(config, "Pewter Golem", 100D, 12.0F));
		GolemLookup.addConfig(EntityPlatinumGolem.class,
				new GolemConfigSet(config, "Platinum Golem", 70.0D, 5.0F));
		GolemLookup.addConfig(EntitySilverGolem.class,
				new GolemConfigSet(config, "Silver Golem", 70.0D, 5.5F)
				.addKey(EntitySilverGolem.ALLOW_IMMUNE, true, "Whether this golem is immune to magic damage"));
		GolemLookup.addConfig(EntityStarSteelGolem.class,
				new GolemConfigSet(config, "Star-Steel Golem", 155.0D, 10.0F)
				.addKey(EntityStarSteelGolem.ALLOW_HEALING, true, "Whether this golem can ocasionally heal itself")
				.addKey(EntityStarSteelGolem.ALLOW_LIGHT, true, "Whether this golem can light its area")
				.addKey(EntityStarSteelGolem.LIGHT_FREQ, 4, 1, 12000, "Frequency of lighting updates"));
		GolemLookup.addConfig(EntitySteelGolem.class,
				new GolemConfigSet(config, "Steel Golem", 175.0D, 10.0F));
		GolemLookup.addConfig(EntityTinGolem.class,
				new GolemConfigSet(config, "Tin Golem", 48.0D, 4.5F));
		GolemLookup.addConfig(EntityZincGolem.class,
				new GolemConfigSet(config, "Zinc Golem", 48.0D, 4.5F));

		config.save();
	}
}
