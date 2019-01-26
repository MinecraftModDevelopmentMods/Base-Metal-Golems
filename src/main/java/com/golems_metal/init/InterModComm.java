package com.golems_metal.init;

import com.mcmoddev.basemetals.BaseMetals;
import com.mcmoddev.basemetals.data.MaterialNames;

public class InterModComm {
	
	public static final String MODID_BASE_METALS = BaseMetals.MODID;
	public static final String MODID_MODERN_METALS = "modernmetals";
	
	public static final String ALUMINUM = "aluminum";
	public static final String ALUMINUM_BRASS = "aluminumbrass";
	public static final String CADMIUM = "cadmium";
	public static final String CHROMIUM = "chromium";
	public static final String GALVANIZED_STEEL = "galvanizedsteel";
	public static final String IRIDIUM = "iridium";
	public static final String MAGNESIUM = "magnesium";
	public static final String MANGANESE = "manganese";
	public static final String NICHROME = "nichrome";
	public static final String OSMIUM = "osmium";
	public static final String PLUTONIUM = "plutonium";
	public static final String RUTILE = "rutile";
	public static final String STAINLESS_STEEL = "stainlesssteel";
	public static final String TANTALUM = "tantalum";
	public static final String TITANIUM = "titanium";
	public static final String TUNGSTEN = "tungsten";
	public static final String URANIUM = "uranium";
	public static final String ZIRCONIUM = "zirconium";
	// TODO these next 3 need golems
	public static final String BORON = "boron";
	public static final String BERYLLIUM = "beryllium";
	public static final String THORIUM = "thorium";
	
	public static final String[] BASE_METALS_ALL = new String[] {
		MaterialNames.ADAMANTINE, MaterialNames.ANTIMONY, MaterialNames.AQUARIUM,
		MaterialNames.BISMUTH, MaterialNames.BRASS, MaterialNames.BRONZE,
		MaterialNames.COLDIRON, MaterialNames.COPPER, MaterialNames.CUPRONICKEL,
		MaterialNames.ELECTRUM, MaterialNames.INVAR, MaterialNames.LEAD,
		MaterialNames.MITHRIL, MaterialNames.NICKEL, MaterialNames.PEWTER,
		MaterialNames.PLATINUM, MaterialNames.SILVER, MaterialNames.STARSTEEL,
		MaterialNames.STEEL, MaterialNames.TIN, MaterialNames.ZINC
	};
	
	public static final String[] MODERN_METALS_ALL = new String[] {
		ALUMINUM, ALUMINUM_BRASS, CADMIUM, CHROMIUM, GALVANIZED_STEEL, IRIDIUM, MAGNESIUM,
		MANGANESE, NICHROME, OSMIUM, PLUTONIUM, RUTILE, STAINLESS_STEEL, TANTALUM, TITANIUM,
		TUNGSTEN, URANIUM, ZIRCONIUM/*, BORON, BERYLLIUM, THORIUM*/ // TODO
	};
}
