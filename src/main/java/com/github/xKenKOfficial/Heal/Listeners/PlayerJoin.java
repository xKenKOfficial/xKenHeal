package com.github.xKenKOfficial.Heal.Listeners;

import com.github.xKenKOfficial.Heal.Basic.Main;
import com.github.xKenKOfficial.Heal.Utils.ChatUtil;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener
{
    @EventHandler
    public void onJoin(final PlayerJoinEvent e) {
        final Player p = e.getPlayer();
        if(Main.getPlugin().getConfig().getBoolean("plugin_info")) {
            if(p.hasPermission("xkenheal.admin.plugin")) {
                p.sendMessage(ChatUtil.fixColor("&8&l===============[&3&l" + Main.getPlugin().getName() + "&8&l]==============="));
                p.sendMessage(ChatUtil.fixColor(" "));
                p.sendMessage(ChatUtil.fixColor(" &7Plugin&8: &b" + Main.getPlugin().getName()));
                p.sendMessage(ChatUtil.fixColor(" "));
                p.sendMessage(ChatUtil.fixColor(" &7Wersja&8: &b" + Main.getPlugin().getDescription().getVersion()));
                p.sendMessage(ChatUtil.fixColor(" "));
                p.sendMessage(ChatUtil.fixColor(" &7Wykryta wersja Bukkit&8: &b" + Bukkit.getBukkitVersion()));
                p.sendMessage(ChatUtil.fixColor(" "));
                p.sendMessage(ChatUtil.fixColor(" &7Ostatnia Aktualizacja&8: &b20.08.2023r. godz. 21:58"));
                p.sendMessage(ChatUtil.fixColor(" "));
                p.sendMessage(ChatUtil.fixColor("&8&l===============[&3&l" + Main.getPlugin().getName() + "&8&l]==============="));
            }
        }
    }
}
