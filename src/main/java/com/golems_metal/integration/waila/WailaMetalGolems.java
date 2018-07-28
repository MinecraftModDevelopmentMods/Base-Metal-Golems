package com.golems_metal.integration.waila;

import com.golems.entity.GolemBase;
import com.golems.integration.ModIds;
import com.golems_metal.integration.MetalGolemDescriptionManager;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaEntityAccessor;
import mcp.mobius.waila.api.IWailaEntityProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Optional;

import java.util.List;

import static com.golems.integration.waila.WailaExtraGolems.*;

@Optional.Interface(iface = "mcp.mobius.waila.api.IWailaEntityProvider", modid = ModIds.WAILA)
public class WailaMetalGolems extends MetalGolemDescriptionManager implements IWailaEntityProvider
{	
	public WailaMetalGolems()
	{
		super();
	}
		
	@Optional.Method(modid = ModIds.WAILA)
	public static void callbackRegister(IWailaRegistrar register) 
	{
		WailaMetalGolems instance = new WailaMetalGolems();

		register.registerBodyProvider(instance, GolemBase.class);
	}

	@Override
	@Optional.Method(modid = ModIds.WAILA)
	public NBTTagCompound getNBTData(EntityPlayerMP player, Entity entity, NBTTagCompound tag, World world) 
	{
		NBTTagCompound tag2 = new NBTTagCompound();
		entity.writeToNBT(tag2);
		return tag2;
	}

	@Override
	@Optional.Method(modid = ModIds.WAILA)
	public List<String> getWailaBody(Entity entity, List<String> tip, IWailaEntityAccessor accessor, IWailaConfigHandler config) 
	{
		if(entity instanceof GolemBase)
		{
			GolemBase golem = (GolemBase)entity;
			
			this.showAttack = config.getConfig(CONFIG_SHOW_ATTACK_DAMAGE) && accessor.getPlayer().isSneaking();
			this.showMultiTexture = config.getConfig(CONFIG_SHOW_MULTI_TEXTURE);
			this.showSpecial = config.getConfig(CONFIG_SHOW_SPECIAL_ABILITIES);
			this.showFireproof = config.getConfig(CONFIG_SHOW_FIREPROOF) && accessor.getPlayer().isSneaking();
			this.showKnockbackResist = config.getConfig(CONFIG_SHOW_KNOCKBACK_RESIST);
			
			tip.addAll(this.getEntityDescription(golem));
		}
		return tip;
	}

	@Override
	@Optional.Method(modid = ModIds.WAILA)
	public List<String> getWailaHead(Entity entity, List<String> currenttip, IWailaEntityAccessor accessor,	IWailaConfigHandler config) 
	{
		return currenttip;
	}

	@Override
	@Optional.Method(modid = ModIds.WAILA)
	public Entity getWailaOverride(IWailaEntityAccessor accessor, IWailaConfigHandler config) 
	{
		return accessor.getEntity();
	}

	@Override
	@Optional.Method(modid = ModIds.WAILA)
	public List<String> getWailaTail(Entity entity, List<String> currenttip, IWailaEntityAccessor accessor,	IWailaConfigHandler config) 
	{
		return currenttip;
	}
}
