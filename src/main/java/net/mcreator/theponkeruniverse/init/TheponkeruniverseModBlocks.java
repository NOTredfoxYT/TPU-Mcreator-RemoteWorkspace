
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theponkeruniverse.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.theponkeruniverse.block.PonkeriumOreBlock;
import net.mcreator.theponkeruniverse.block.PonkeriumBlockBlock;
import net.mcreator.theponkeruniverse.TheponkeruniverseMod;

public class TheponkeruniverseModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheponkeruniverseMod.MODID);
	public static final RegistryObject<Block> PONKERIUM_BLOCK = REGISTRY.register("ponkerium_block", () -> new PonkeriumBlockBlock());
	public static final RegistryObject<Block> PONKERIUM_ORE = REGISTRY.register("ponkerium_ore", () -> new PonkeriumOreBlock());
}
