package com.golems_metal.proxy;

import com.golems.entity.GolemBase;
import com.golems.entity.GolemColorized;
import com.golems_metal.entity.basemetals.*;
import com.golems_metal.entity.modernmetals.*;
import com.golems_metal.entity.baseminerals.*;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.init.Materials;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInitRenders() {
		// BASE METALS - register golem rendering classes
		if (MetalGolems.hasBaseMetals()) {
			registerRenderOptionally(EntityAdamantineGolem.class, InterModComm.ADAMANTINE);
			registerRenderOptionally(EntityAntimonyGolem.class, InterModComm.ANTIMONY);
			registerRenderOptionally(EntityBismuthGolem.class, InterModComm.BISMUTH);
			registerRenderOptionally(EntityAquariumGolem.class, InterModComm.AQUARIUM);
			registerRenderOptionally(EntityBrassGolem.class, InterModComm.BRASS);
			registerRenderOptionally(EntityBronzeGolem.class, InterModComm.BRONZE);
			registerRenderOptionally(EntityColdIronGolem.class, InterModComm.COLDIRON);
			registerRenderOptionally(EntityCopperGolem.class, InterModComm.COPPER);
			registerRenderOptionally(EntityCupronickelGolem.class, InterModComm.CUPRONICKEL);
			registerRenderOptionally(EntityElectrumGolem.class, InterModComm.ELECTRUM);
			registerRenderOptionally(EntityInvarGolem.class, InterModComm.INVAR);
			registerRenderOptionally(EntityLeadGolem.class, InterModComm.LEAD);
			registerRenderOptionally(EntityMithrilGolem.class, InterModComm.MITHRIL);
			registerRenderOptionally(EntityNickelGolem.class, InterModComm.NICKEL);
			registerRenderOptionally(EntityPewterGolem.class, InterModComm.PEWTER);
			registerRenderOptionally(EntityPlatinumGolem.class, InterModComm.PLATINUM);
			registerRenderOptionally(EntitySilverGolem.class, InterModComm.SILVER);
			registerRenderOptionally(EntityStarSteelGolem.class, InterModComm.STARSTEEL);
			registerRenderOptionally(EntitySteelGolem.class, InterModComm.STEEL);
			registerRenderOptionally(EntityTinGolem.class, InterModComm.TIN);
			registerRenderOptionally(EntityZincGolem.class, InterModComm.ZINC);
		}
		
		// MODERN METALS - register golem render classes
		if(MetalGolems.hasModernMetals()) {
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
		
		// BASE MINERALS - register golem render classes
		if(MetalGolems.hasBaseMinerals()) {
			registerRenderOptionally(EntityLithiumGolem.class, InterModComm.LITHIUM);
			registerRenderOptionally(EntityNiterGolem.class, InterModComm.NITER);
			registerRenderOptionally(EntityPhosphorusGolem.class, InterModComm.PHOSPHORUS);
			registerRenderOptionally(EntityPotashGolem.class, InterModComm.POTASH);
			registerRenderOptionally(EntitySaltGolem.class, InterModComm.SALT);
			registerRenderOptionally(EntitySaltpeterGolem.class, InterModComm.SALTPETER);
			registerRenderOptionally(EntitySiliconGolem.class, InterModComm.SILICON);
			registerRenderOptionally(EntitySulfurGolem.class, InterModComm.SULFUR);
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
