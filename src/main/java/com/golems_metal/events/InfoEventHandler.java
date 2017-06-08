package com.golems_metal.events;

import com.golems.events.GolemPaperAddInfoEvent;

import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class InfoEventHandler 
{
	@SubscribeEvent
	public void onAddInfo(GolemPaperAddInfoEvent event)
	{
		String intro = TextFormatting.WHITE + I18n.format("tooltip.basemetals") + ":";
		event.infoList.add(intro);
		event.infoList.add(I18n.format("tooltip.all_base_metals"));
	}
}
