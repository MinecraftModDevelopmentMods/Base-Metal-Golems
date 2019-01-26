package com.golems_metal.init;

import com.golems.util.GolemConfigSet;
import com.golems.util.GolemLookup;
import com.golems_metal.entity.basemetals.*;
import com.golems_metal.entity.modernmetals.*;

import net.minecraftforge.common.config.Configuration;

public class MetalConfig {
	
	public static void mainRegistry(Configuration config) {
		config.load();
		
		// BASE METAL GOLEMS:  initialize and register with GolemLookup
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
		
		// MODERN METAL GOLEMS:  initialize and register with GolemLookup
		if(MetalGolems.modernMetalsLoaded) {
			GolemLookup.addConfig(EntityAluminumGolem.class, 
					new GolemConfigSet(config, "Aluminum Golem", 40.0D, 2.6F));
			GolemLookup.addConfig(EntityAluminumBrassGolem.class, 
					new GolemConfigSet(config, "Aluminum Brass Golem", 49.0D, 3.3F));
			GolemLookup.addConfig(EntityCadmiumGolem.class,
					new GolemConfigSet(config, "Cadmium Golem", 26.0D, 4.5F));
			GolemLookup.addConfig(EntityBerylliumGolem.class, 
					new GolemConfigSet(config, "Beryllium Golem", 44.0D, 5.5F));
			GolemLookup.addConfig(EntityBoronGolem.class, 
					new GolemConfigSet(config, "Boron Golem", 126.0D, 8.0F));
			GolemLookup.addConfig(EntityChromiumGolem.class,
					new GolemConfigSet(config, "Chromium Golem", 96.0D, 6.3F));
			GolemLookup.addConfig(EntityGalvSteelGolem.class,
					new GolemConfigSet(config, "Galvanized Steel Golem", 116.0D, 10.4F));
			GolemLookup.addConfig(EntityIridiumGolem.class,
					new GolemConfigSet(config, "Iridium Golem", 38.0D, 4.6F));
			GolemLookup.addConfig(EntityMagnesiumGolem.class,
					new GolemConfigSet(config, "Magnesium Golem", 38.0D, 4.6F)
					.addKey(EntityMagnesiumGolem.ALLOW_PLACE_FIRE, true, "Whether this golem can light fires randomly")
					.addKey(EntityMagnesiumGolem.ALLOW_BURN_MOBS, true, "Whether this golem can ignite mobs")
					.addKey(EntityMagnesiumGolem.FIRE_FREQ, 245, 1, 24000, "Ticks between lighting fires"));
			GolemLookup.addConfig(EntityManganeseGolem.class,
					new GolemConfigSet(config, "Manganese Golem", 33.0D, 5.3F));
			GolemLookup.addConfig(EntityNichromeGolem.class,
					new GolemConfigSet(config, "Nichrome Golem", 120.0D, 8.5F));
			GolemLookup.addConfig(EntityOsmiumGolem.class,
					new GolemConfigSet(config, "Osmium Golem", 132.0D, 4.8F));
			GolemLookup.addConfig(EntityPlutoniumGolem.class,
					new GolemConfigSet(config, "Plutonium Golem", 100.0D, 5.0F)
					.addKey(EntityPlutoniumGolem.ALLOW_POISON, true, "Whether this golem can poison nearby creatures")
					.addKey(EntityPlutoniumGolem.AOE, 1.9F, 0.1F, 8.0F, "Poison effect radius")
					.addKey(EntityPlutoniumGolem.DURATION, 46, 1, 1000, "Poison effect length (in ticks)")
					.addKey(EntityPlutoniumGolem.AMPLIFIER, 1, 1, 3, "Poison effect amplifier"));
			GolemLookup.addConfig(EntityRutileGolem.class,
					new GolemConfigSet(config, "Rutile Golem", 16.0D, 14.0F));	
			GolemLookup.addConfig(EntityStainSteelGolem.class,
					new GolemConfigSet(config, "Stainless Steel Golem", 165.0D, 12.5F));
			GolemLookup.addConfig(EntityTantalumGolem.class,
					new GolemConfigSet(config, "Tantalum Golem", 160.0D, 9.6F));
			GolemLookup.addConfig(EntityThoriumGolem.class, 
					new GolemConfigSet(config, "Thorium Golem", 44.0D, 4.5F)
					.addKey(EntityThoriumGolem.ALLOW_POISON, true, "Whether this golem can poison creatures it attacks"));
			GolemLookup.addConfig(EntityTitaniumGolem.class,
					new GolemConfigSet(config, "Titanium Golem", 168.0D, 10.6F));
			GolemLookup.addConfig(EntityTungstenGolem.class,
					new GolemConfigSet(config, "Tungsten Golem", 106.0D, 6.9F));
			GolemLookup.addConfig(EntityUraniumGolem.class,
					new GolemConfigSet(config, "Uranium Golem", 110.0D, 5.5F)
					.addKey(EntityPlutoniumGolem.ALLOW_POISON, true, "Whether this golem can poison nearby creatures")
					.addKey(EntityPlutoniumGolem.AOE, 2.75F, 0.1F, 8.0F, "Poison effect radius")
					.addKey(EntityPlutoniumGolem.DURATION, 22, 1, 1000, "Poison effect length (in ticks)")
					.addKey(EntityPlutoniumGolem.AMPLIFIER, 2, 1, 3, "Poison effect amplifier"));
			GolemLookup.addConfig(EntityZirconiumGolem.class,
					new GolemConfigSet(config, "Zirconium Golem", 44.0D, 5.3F));
		}

		config.save();
	}
}
