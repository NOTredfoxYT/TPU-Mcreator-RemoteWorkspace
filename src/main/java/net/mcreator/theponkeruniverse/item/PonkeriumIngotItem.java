
package net.mcreator.theponkeruniverse.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PonkeriumIngotItem extends Item {
	public PonkeriumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
