
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theponkeruniverse.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.theponkeruniverse.TheponkeruniverseMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheponkeruniverseModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheponkeruniverseMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TheponkeruniverseModItems.PONKERIUM_SWORD.get());
			tabData.accept(TheponkeruniverseModItems.PONKERIUM_ARMOR_HELMET.get());
			tabData.accept(TheponkeruniverseModItems.PONKERIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(TheponkeruniverseModItems.PONKERIUM_ARMOR_LEGGINGS.get());
			tabData.accept(TheponkeruniverseModItems.PONKERIUM_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TheponkeruniverseModItems.PONKERIUM_AXE.get());
			tabData.accept(TheponkeruniverseModItems.PONKERIUM_PICKAXE.get());
			tabData.accept(TheponkeruniverseModItems.PONKERIUM_SHOVEL.get());
			tabData.accept(TheponkeruniverseModItems.PONKERIUM_HOE.get());
		}
	}
}
