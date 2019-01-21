package com.golems_metal.init;

import com.golems.util.GolemConfigSet;
import com.golems.util.GolemLookup;
import com.golems_metal.entity.*;

import net.minecraftforge.common.config.Configuration;

public class MetalConfig {
	
	public static void mainRegistry(Configuration config) {
		config.load();

		// initialize and register with GolemLookup
		GolemLookup.addConfig(EntityAdamantineGolem.class, 
				new GolemConfigSet(config, "Adamantine Golem", 240.0D, 21.0F)
				.addKey(EntityAdamantineGolem.DAMAGE_TOUGH, true, "Whether this golem deals extra damage to tough mobs")
				.addKey(EntityAdamantineGolem.ALLOW_RESIST, true, "Whether this golem reduces damage dealt to it"));
		GolemLookup.addConfig(EntityAntimonyGolem.class,
				new GolemConfigSet(config, "Antimony Golem", 50.0D, 4.5F));
		GolemLookup.addConfig(EntityAquariumGolem.class,
				new GolemConfigSet(config, "Aquarium Golem", 120.0D, 8.0F)
				.addKey(EntityAquariumGolem.DAMAGE_WATER, true, "Whether this golem deals extra damage to water mobs"));
		GolemLookup.addConfig(EntityBismuthGolem.class,
				new GolemConfigSet(config, "Bismuth Golem", 45.0D, 4.5F));
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
				new GolemConfigSet(config, "Cupronickel Golem", 88.0D, 7.0F));
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
		GolemLookup.addConfig(EntityPewterGolem.class,
				new GolemConfigSet(config, "Pewter Golem", 54.0, 4.0F));
		GolemLookup.addConfig(EntityPlatinumGolem.class,
				new GolemConfigSet(config, "Platinum Golem", 70.0D, 5.0F));
		GolemLookup.addConfig(EntitySilverGolem.class,
				new GolemConfigSet(config, "Silver Golem", 70.0D, 5.5F)
				.addKey(EntitySilverGolem.ALLOW_IMMUNE, true, "Whether this golem is immune to magic damage"));
		GolemLookup.addConfig(EntityStarSteelGolem.class,
				new GolemConfigSet(config, "Star-Steel Golem", 155.0D, 10.0F)
				.addKey(EntityStarSteelGolem.ALLOW_HEALING, true, "Whether this golem can ocasionally heal itself"));
		GolemLookup.addConfig(EntitySteelGolem.class,
				new GolemConfigSet(config, "Steel Golem", 175.0D, 10.0F));
		GolemLookup.addConfig(EntityTinGolem.class,
				new GolemConfigSet(config, "Tin Golem", 48.0D, 4.5F));
		GolemLookup.addConfig(EntityZincGolem.class,
				new GolemConfigSet(config, "Zinc Golem", 48.0D, 4.5F));

		config.save();
	}
}
