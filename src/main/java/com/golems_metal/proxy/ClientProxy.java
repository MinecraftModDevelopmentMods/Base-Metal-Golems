package com.golems_metal.proxy;

import com.golems.entity.GolemBase;
import com.golems.entity.GolemColorized;
import com.golems_metal.entity.basemetals.*;
import com.golems_metal.entity.modernmetals.*;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.init.Materials;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInitRenders() {
		// BASE METALS - register golem rendering classes
		registerRenderOptionally(EntityAdamantineGolem.class, MaterialNames.ADAMANTINE);
		registerRenderOptionally(EntityAntimonyGolem.class, MaterialNames.ANTIMONY);
		registerRenderOptionally(EntityBismuthGolem.class, MaterialNames.BISMUTH);
		registerRenderOptionally(EntityAquariumGolem.class, MaterialNames.AQUARIUM);
		registerRenderOptionally(EntityBrassGolem.class, MaterialNames.BRASS);
		registerRenderOptionally(EntityBronzeGolem.class, MaterialNames.BRONZE);
		registerRenderOptionally(EntityColdIronGolem.class, MaterialNames.COLDIRON);
		registerRenderOptionally(EntityCopperGolem.class, MaterialNames.COPPER);
		registerRenderOptionally(EntityCupronickelGolem.class, MaterialNames.CUPRONICKEL);
		registerRenderOptionally(EntityElectrumGolem.class, MaterialNames.ELECTRUM);
		registerRenderOptionally(EntityInvarGolem.class, MaterialNames.INVAR);
		registerRenderOptionally(EntityLeadGolem.class, MaterialNames.LEAD);
		registerRenderOptionally(EntityMithrilGolem.class, MaterialNames.MITHRIL);
		registerRenderOptionally(EntityNickelGolem.class, MaterialNames.NICKEL);
		registerRenderOptionally(EntityPewterGolem.class, MaterialNames.PEWTER);
		registerRenderOptionally(EntityPlatinumGolem.class, MaterialNames.PLATINUM);
		registerRenderOptionally(EntitySilverGolem.class, MaterialNames.SILVER);
		registerRenderOptionally(EntityStarSteelGolem.class, MaterialNames.STARSTEEL);
		registerRenderOptionally(EntitySteelGolem.class, MaterialNames.STEEL);
		registerRenderOptionally(EntityTinGolem.class, MaterialNames.TIN);
		registerRenderOptionally(EntityZincGolem.class, MaterialNames.ZINC);
		
		// MODERN METALS - register golem render classes
		if(MetalGolems.modernMetalsLoaded) {
			registerRenderOptionally(EntityAluminumGolem.class, InterModComm.ALUMINUM);
			registerRenderOptionally(EntityAluminumBrassGolem.class, InterModComm.ALUMINUM_BRASS);
			registerRenderOptionally(EntityBerylliumGolem.class, InterModComm.BERYLLIUM);
			registerRenderOptionally(EntityBoronGolem.class, InterModComm.BORON);
			registerRenderOptionally(EntityCadmiumGolem.class, InterModComm.CADMIUM);
			registerRenderOptionally(EntityChromiumGolem.class, InterModComm.CHROMIUM);
			registerRenderOptionally(EntityGalvSteelGolem.class, InterModComm.GALVANIZED_STEEL);
			registerRenderOptionally(EntityIridiumGolem.class, InterModComm.IRIDIUM);
			registerRenderOptionally(EntityMagnesiumGolem.class, InterModComm.MAGNESIUM);
			registerRenderOptionally(EntityManganeseGolem.class, InterModComm.MANGANESE);
			registerRenderOptionally(EntityNichromeGolem.class, InterModComm.NICHROME);
			registerRenderOptionally(EntityOsmiumGolem.class, InterModComm.OSMIUM);
			registerRenderOptionally(EntityPlutoniumGolem.class, InterModComm.PLUTONIUM);
			registerRenderOptionally(EntityRutileGolem.class, InterModComm.RUTILE);
			registerRenderOptionally(EntityStainSteelGolem.class, InterModComm.STAINLESS_STEEL);
			registerRenderOptionally(EntityTantalumGolem.class, InterModComm.TANTALUM);
			registerRenderOptionally(EntityThoriumGolem.class, InterModComm.THORIUM);
			registerRenderOptionally(EntityTitaniumGolem.class, InterModComm.TITANIUM);
			registerRenderOptionally(EntityTungstenGolem.class, InterModComm.TUNGSTEN);
			registerRenderOptionally(EntityUraniumGolem.class, InterModComm.URANIUM);
			registerRenderOptionally(EntityZirconiumGolem.class, InterModComm.ZIRCONIUM);
		}
		
	}
	
	private static void registerRenderOptionally(Class<? extends GolemBase> clazz, final String material) {
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
