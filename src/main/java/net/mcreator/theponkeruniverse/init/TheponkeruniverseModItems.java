
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theponkeruniverse.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.theponkeruniverse.item.PonkeriumSwordItem;
import net.mcreator.theponkeruniverse.item.PonkeriumShovelItem;
import net.mcreator.theponkeruniverse.item.PonkeriumPickaxeItem;
import net.mcreator.theponkeruniverse.item.PonkeriumIngotItem;
import net.mcreator.theponkeruniverse.item.PonkeriumHoeItem;
import net.mcreator.theponkeruniverse.item.PonkeriumAxeItem;
import net.mcreator.theponkeruniverse.item.PonkeriumArmorItem;
import net.mcreator.theponkeruniverse.TheponkeruniverseMod;

public class TheponkeruniverseModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheponkeruniverseMod.MODID);
	public static final RegistryObject<Item> PONKERIUM_BLOCK = block(TheponkeruniverseModBlocks.PONKERIUM_BLOCK);
	public static final RegistryObject<Item> PONKERIUM_ORE = block(TheponkeruniverseModBlocks.PONKERIUM_ORE);
	public static final RegistryObject<Item> PONKERIUM_AXE = REGISTRY.register("ponkerium_axe", () -> new PonkeriumAxeItem());
	public static final RegistryObject<Item> PONKERIUM_PICKAXE = REGISTRY.register("ponkerium_pickaxe", () -> new PonkeriumPickaxeItem());
	public static final RegistryObject<Item> PONKERIUM_SWORD = REGISTRY.register("ponkerium_sword", () -> new PonkeriumSwordItem());
	public static final RegistryObject<Item> PONKERIUM_SHOVEL = REGISTRY.register("ponkerium_shovel", () -> new PonkeriumShovelItem());
	public static final RegistryObject<Item> PONKERIUM_HOE = REGISTRY.register("ponkerium_hoe", () -> new PonkeriumHoeItem());
	public static final RegistryObject<Item> PONKERIUM_INGOT = REGISTRY.register("ponkerium_ingot", () -> new PonkeriumIngotItem());
	public static final RegistryObject<Item> PONKERIUM_ARMOR_HELMET = REGISTRY.register("ponkerium_armor_helmet", () -> new PonkeriumArmorItem.Helmet());
	public static final RegistryObject<Item> PONKERIUM_ARMOR_CHESTPLATE = REGISTRY.register("ponkerium_armor_chestplate", () -> new PonkeriumArmorItem.Chestplate());
	public static final RegistryObject<Item> PONKERIUM_ARMOR_LEGGINGS = REGISTRY.register("ponkerium_armor_leggings", () -> new PonkeriumArmorItem.Leggings());
	public static final RegistryObject<Item> PONKERIUM_ARMOR_BOOTS = REGISTRY.register("ponkerium_armor_boots", () -> new PonkeriumArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
