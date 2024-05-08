package net.mcreator.blackcloverreborn.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.blackcloverreborn.init.BlackCloverRebornModItems;

public class DemonslayerToolInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(BlackCloverRebornModItems.DEMONSLAYER.get())) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 5, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 10, 5, (false), (false)));
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel ? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("black_clover_reborn:fifthleaf"))).isDone() : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
		}
	}
}
