
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blackcloverreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.blackcloverreborn.item.YamikatanaItem;
import net.mcreator.blackcloverreborn.item.DemonslayerItem;
import net.mcreator.blackcloverreborn.item.DemondwellerItem;
import net.mcreator.blackcloverreborn.item.DemondestroyerItem;
import net.mcreator.blackcloverreborn.BlackCloverRebornMod;

public class BlackCloverRebornModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BlackCloverRebornMod.MODID);
	public static final RegistryObject<Item> DEMONDWELLER = REGISTRY.register("demondweller", () -> new DemondwellerItem());
	public static final RegistryObject<Item> DEMONSLAYER = REGISTRY.register("demonslayer", () -> new DemonslayerItem());
	public static final RegistryObject<Item> DEMONDESTROYER = REGISTRY.register("demondestroyer", () -> new DemondestroyerItem());
	public static final RegistryObject<Item> YAMIKATANA = REGISTRY.register("yamikatana", () -> new YamikatanaItem());
}
