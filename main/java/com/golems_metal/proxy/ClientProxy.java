package com.golems_metal.proxy;

import com.golems_metal.entity.EntityAdamantineGolem;
import com.golems_metal.entity.EntityAquariumGolem;
import com.golems_metal.entity.EntityBrassGolem;
import com.golems_metal.entity.EntityBronzeGolem;
import com.golems_metal.entity.EntityColdIronGolem;
import com.golems_metal.entity.EntityCopperGolem;
import com.golems_metal.entity.EntityCupronickelGolem;
import com.golems_metal.entity.EntityElectrumGolem;
import com.golems_metal.entity.EntityInvarGolem;
import com.golems_metal.entity.EntityLeadGolem;
import com.golems_metal.entity.EntityMithrilGolem;
import com.golems_metal.entity.EntityNickelGolem;
import com.golems_metal.entity.EntityPlatinumGolem;
import com.golems_metal.entity.EntitySilverGolem;
import com.golems_metal.entity.EntityStarSteelGolem;
import com.golems_metal.entity.EntitySteelGolem;
import com.golems_metal.entity.EntityTinGolem;
import com.golems_metal.entity.EntityZincGolem;
import com.golems_metal.events.InfoEventHandler;

import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerEntities()
	{
		super.registerEntities();
		com.golems.proxies.ClientProxy.registerColorized(EntityAdamantineGolem.class);
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
