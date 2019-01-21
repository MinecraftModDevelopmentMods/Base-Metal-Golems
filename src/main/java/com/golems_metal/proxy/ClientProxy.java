package com.golems_metal.proxy;

import com.golems.entity.GolemBase;
import com.golems.entity.GolemColorized;
import com.golems_metal.entity.*;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.init.Materials;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInitRenders() {
		if(Materials.hasMaterial(MaterialNames.ADAMANTINE)) {
			registerRender(EntityAdamantineGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.ANTIMONY)) {
			registerRender(EntityAntimonyGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.BISMUTH)) {
			registerRender(EntityBismuthGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.AQUARIUM)) {
			registerRender(EntityAquariumGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.BRASS)) {
			registerRender(EntityBrassGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.BRONZE)) {
			registerRender(EntityBronzeGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.COLDIRON)) {
			registerRender(EntityColdIronGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.COPPER)) {
			registerRender(EntityCopperGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.CUPRONICKEL)) {
			registerRender(EntityCupronickelGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.ELECTRUM)) {
			registerRender(EntityElectrumGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.INVAR)) {
			registerRender(EntityInvarGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.LEAD)) {
			registerRender(EntityLeadGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.MITHRIL)) {
			registerRender(EntityMithrilGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.NICKEL)) {
			registerRender(EntityNickelGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.PEWTER)) {
			registerRender(EntityPewterGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.PLATINUM)) {
			registerRender(EntityPlatinumGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.SILVER)) {
			registerRender(EntitySilverGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.STARSTEEL)) {
			registerRender(EntityStarSteelGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.STEEL)) {
			registerRender(EntitySteelGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.TIN)) {
			registerRender(EntityTinGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.ZINC)) {
			registerRender(EntityZincGolem.class);
		}
	}
	
	private static void registerRender(Class<? extends GolemBase> clazz) {
		if(GolemColorized.class.isAssignableFrom(clazz)) {
			com.golems.proxies.ClientProxy.registerColorized((Class<? extends GolemColorized>)clazz);
		} else {
			com.golems.proxies.ClientProxy.registerTextured(clazz);
		}
	}
}
