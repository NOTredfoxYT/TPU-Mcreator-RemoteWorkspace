
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theponkeruniverse.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.theponkeruniverse.world.features.ores.PonkeriumOreFeature;
import net.mcreator.theponkeruniverse.TheponkeruniverseMod;

@Mod.EventBusSubscriber
public class TheponkeruniverseModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TheponkeruniverseMod.MODID);
	public static final RegistryObject<Feature<?>> PONKERIUM_ORE = REGISTRY.register("ponkerium_ore", PonkeriumOreFeature::new);
}
