package com.github.xKenKOfficial.Heal.Commands;

import com.github.xKenKOfficial.Heal.Messages.MessageManager;
import com.github.xKenKOfficial.Heal.Utils.ChatUtil;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command c, String s, String[] args) {
        if(!Sender.hasPermission("xkenheal.admin.feed")) {
            Sender.sendMessage(ChatUtil.fixColor(MessageManager.getNoPermission()));
            return false;
        }
        if(Sender instanceof Player) {
            if(args.length < 1) {
                final Player player = (Player) Sender;
                player.setFoodLevel(20);
                Sender.sendMessage(ChatUtil.fixColor(MessageManager.getFeedPlayer()));
                return false;
            } else if (args.length == 1) {
                if(Sender.hasPermission("xkenheal.admin.feed.player")) {
                    final Player player = Bukkit.getPlayer(args[0]);
                    player.setFoodLevel(20);
                    player.sendMessage(ChatUtil.fixColor(MessageManager.getFeedByAdmin().replace("{ADMIN}", Sender.getName())));
                    Sender.sendMessage(ChatUtil.fixColor(MessageManager.getFeedThePlayer().replace("{PLAYER}", player.getName())));
                    return false;
                } else {
                    Sender.sendMessage(ChatUtil.fixColor(MessageManager.getNoPermission()));
                }
            } else {
                Sender.sendMessage(ChatUtil.fixColor(MessageManager.getFeedCommandUsage()));
            }
        } else {
            Sender.sendMessage(ChatColor.DARK_RED + "Tej komendy nie mozna uzywac w konsoli!");
        }
        return false;
    }
}
