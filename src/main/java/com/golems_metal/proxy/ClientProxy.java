package com.golems_metal.proxy;

import com.golems_metal.entity.*;
import com.golems_metal.events.InfoEventHandler;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.init.Materials;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerEntities()
	{
		super.registerEntities();
		if(Materials.hasMaterial(MaterialNames.ADAMANTINE)) {
			com.golems.proxies.ClientProxy.registerColorized(EntityAdamantineGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.ANTIMONY)) {
			com.golems.proxies.ClientProxy.registerColorized(EntityAntimonyGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.BISMUTH)) {
			com.golems.proxies.ClientProxy.registerColorized(EntityBismuthGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.AQUARIUM)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityAquariumGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.BRASS)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityBrassGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.BRONZE)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityBronzeGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.COLDIRON)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityColdIronGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.COPPER)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityCopperGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.CUPRONICKEL)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityCupronickelGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.ELECTRUM)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityElectrumGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.INVAR)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityInvarGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.LEAD)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityLeadGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.MITHRIL)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityMithrilGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.NICKEL)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityNickelGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.PEWTER)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityPewterGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.PLATINUM)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityPlatinumGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.SILVER)) {
			com.golems.proxies.ClientProxy.registerTextured(EntitySilverGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.STARSTEEL)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityStarSteelGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.STEEL)) {
			com.golems.proxies.ClientProxy.registerTextured(EntitySteelGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.TIN)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityTinGolem.class);
		}
		if(Materials.hasMaterial(MaterialNames.ZINC)) {
			com.golems.proxies.ClientProxy.registerTextured(EntityZincGolem.class);
		}

	}
	
	@Override
	public void registerEvents()
	{
		super.registerEvents();
		MinecraftForge.EVENT_BUS.register(new InfoEventHandler());
	}
}
