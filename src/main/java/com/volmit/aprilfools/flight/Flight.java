package com.volmit.aprilfools.flight;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class Flight extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void clickEvent(PlayerInteractEntityEvent e) {
        e.getRightClicked().setCustomName("Dinnerbone");
        e.getRightClicked().setGravity(false);
        if (e.getRightClicked() instanceof LivingEntity) {
            LivingEntity entity = (LivingEntity) e.getRightClicked();
            entity.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 10000000, 100));
        }
    }
}
