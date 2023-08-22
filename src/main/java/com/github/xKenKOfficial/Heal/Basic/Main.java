package com.github.xKenKOfficial.Heal.Basic;

import com.github.xKenKOfficial.Heal.Commands.FeedCommand;
import com.github.xKenKOfficial.Heal.Commands.HealCommand;
import com.github.xKenKOfficial.Heal.Listeners.PlayerJoin;
import com.github.xKenKOfficial.Heal.Utils.Updaters.UpdateChecker;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class Main extends JavaPlugin
{
    private static Main plugin;

    public void onEnable()
    {
        (plugin) = this;
        this.saveDefaultConfig();
        this.registerCommands();
        this.registerListeners();
        this.getUpdate();
        System.out.println("###########################################################");
        System.out.println(this.getName());
        System.out.println("Wersja: " + this.getDescription().getVersion());
        System.out.println("Wykryta wersja Bukkit: " + Bukkit.getBukkitVersion());
        System.out.println(this.isEnabled() ? "Aktywowany" : "Dezaktywowany");
        System.out.println("Jakiekolwiek edycje i naruszenie praw autorskich - ZABRONIONE!");
        System.out.println("###########################################################");
    }

    private void registerCommands()
    {
        this.getLogger().info("Ladowanie komend z pluginu: " + this.getName());
        this.getCommand("heal").setExecutor(new HealCommand());
        this.getCommand("feed").setExecutor(new FeedCommand());
    }

    private void registerListeners()
    {
        this.getLogger().info("Ladowanie eventow z pluginu: " + this.getName());
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }

    public void onDisable()
    {
        this.saveDefaultConfig();
        System.out.println("###########################################################");
        System.out.println(this.getName());
        System.out.println("Wersja: " + this.getDescription().getVersion());
        System.out.println("Wykryta wersja Bukkit: " + Bukkit.getBukkitVersion());
        System.out.println(this.isEnabled() ? "Aktywowany" : "Dezaktywowany");
        System.out.println("Jakiekolwiek edycje i naruszenie praw autorskich - ZABRONIONE!");
        System.out.println("###########################################################");
    }

    private void getUpdate()
    {
        new UpdateChecker(this, this.getDescription().getVersion()).checkUpdate(version -> {
            if(this.getDescription().getVersion().equalsIgnoreCase(version)) {
                this.getLogger().log(Level.WARNING, "Wykryto nowa aktualizacje pluginu!");
            } else {
                this.getLogger().log(Level.INFO, "Posiadasz aktualna wersje pluginu.");
            }
        });
    }

    public static Main getPlugin()
    {
        return plugin;
    }
}
