package com.golems_metal.proxy;

import com.golems_metal.entity.*;
import com.golems_metal.events.InfoEventHandler;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerEntities()
	{
		super.registerEntities();
		com.golems.proxies.ClientProxy.registerColorized(EntityAdamantineGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityAntimonyGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityBismuthGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityAquariumGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityBrassGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityBronzeGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityColdIronGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityCopperGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityCupronickelGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityElectrumGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityInvarGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityLeadGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityMithrilGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityNickelGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityPewterGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityPlatinumGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntitySilverGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityStarSteelGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntitySteelGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityTinGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityZincGolem.class);
	}
	
	@Override
	public void registerEvents()
	{
		super.registerEvents();
		MinecraftForge.EVENT_BUS.register(new InfoEventHandler());
	}
}
