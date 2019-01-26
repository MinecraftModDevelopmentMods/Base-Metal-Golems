package com.golems_metal.proxy;

import com.golems.entity.GolemBase;
import com.golems.entity.GolemColorized;
import com.golems_metal.entity.basemetals.*;
import com.golems_metal.entity.modernmetals.*;
import com.golems_metal.init.InterModComm;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.init.Materials;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInitRenders() {
		// BASE METALS - register golem rendering classes
		registerOptionally(EntityAdamantineGolem.class, MaterialNames.ADAMANTINE);
		registerOptionally(EntityAntimonyGolem.class, MaterialNames.ANTIMONY);
		registerOptionally(EntityBismuthGolem.class, MaterialNames.BISMUTH);
		registerOptionally(EntityAquariumGolem.class, MaterialNames.AQUARIUM);
		registerOptionally(EntityBrassGolem.class, MaterialNames.BRASS);
		registerOptionally(EntityBronzeGolem.class, MaterialNames.BRONZE);
		registerOptionally(EntityColdIronGolem.class, MaterialNames.COLDIRON);
		registerOptionally(EntityCopperGolem.class, MaterialNames.COPPER);
		registerOptionally(EntityCupronickelGolem.class, MaterialNames.CUPRONICKEL);
		registerOptionally(EntityElectrumGolem.class, MaterialNames.ELECTRUM);
		registerOptionally(EntityInvarGolem.class, MaterialNames.INVAR);
		registerOptionally(EntityLeadGolem.class, MaterialNames.LEAD);
		registerOptionally(EntityMithrilGolem.class, MaterialNames.MITHRIL);
		registerOptionally(EntityNickelGolem.class, MaterialNames.NICKEL);
		registerOptionally(EntityPewterGolem.class, MaterialNames.PEWTER);
		registerOptionally(EntityPlatinumGolem.class, MaterialNames.PLATINUM);
		registerOptionally(EntitySilverGolem.class, MaterialNames.SILVER);
		registerOptionally(EntityStarSteelGolem.class, MaterialNames.STARSTEEL);
		registerOptionally(EntitySteelGolem.class, MaterialNames.STEEL);
		registerOptionally(EntityTinGolem.class, MaterialNames.TIN);
		registerOptionally(EntityZincGolem.class, MaterialNames.ZINC);
		
		// MODERN METALS - register golem render classes
		registerOptionally(EntityAluminumGolem.class, InterModComm.ALUMINUM);
		registerOptionally(EntityAluminumBrassGolem.class, InterModComm.ALUMINUM_BRASS);
		registerOptionally(EntityCadmiumGolem.class, InterModComm.CADMIUM);
		registerOptionally(EntityChromiumGolem.class, InterModComm.CHROMIUM);
		registerOptionally(EntityGalvSteelGolem.class, InterModComm.GALVANIZED_STEEL);
		registerOptionally(EntityIridiumGolem.class, InterModComm.IRIDIUM);
		registerOptionally(EntityMagnesiumGolem.class, InterModComm.MAGNESIUM);
		registerOptionally(EntityManganeseGolem.class, InterModComm.MANGANESE);
		registerOptionally(EntityNichromeGolem.class, InterModComm.NICHROME);
		registerOptionally(EntityOsmiumGolem.class, InterModComm.OSMIUM);
		registerOptionally(EntityPlutoniumGolem.class, InterModComm.PLUTONIUM);
		registerOptionally(EntityRutileGolem.class, InterModComm.RUTILE);
		registerOptionally(EntityStainSteelGolem.class, InterModComm.STAINLESS_STEEL);
		registerOptionally(EntityTantalumGolem.class, InterModComm.TANTALUM);
		registerOptionally(EntityTitaniumGolem.class, InterModComm.TITANIUM);
		registerOptionally(EntityTungstenGolem.class, InterModComm.TUNGSTEN);
		registerOptionally(EntityUraniumGolem.class, InterModComm.URANIUM);
		registerOptionally(EntityZirconiumGolem.class, InterModComm.ZIRCONIUM);
		
	}
	
	private static void registerOptionally(Class<? extends GolemBase> clazz, final String material) {
		if(Materials.hasMaterial(material) && Materials.getMaterialByName(material).hasBlock(Names.BLOCK)) {
			// register differently based on inheritance
			if(GolemColorized.class.isAssignableFrom(clazz)) {
				com.golems.proxies.ClientProxy.registerColorized((Class<? extends GolemColorized>)clazz);
			} else {
				com.golems.proxies.ClientProxy.registerTextured(clazz);
			}
		}		
	}
}
