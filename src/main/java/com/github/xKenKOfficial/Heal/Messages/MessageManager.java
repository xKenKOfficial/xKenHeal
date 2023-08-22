package com.github.xKenKOfficial.Heal.Messages;

import com.github.xKenKOfficial.Heal.Basic.Main;

public class MessageManager
{
    private static String NO_PERMISSION = Main.getPlugin().getConfig().getString("no_permission");
    private static String FEED_COMMAND_USAGE = Main.getPlugin().getConfig().getString("feed_command_usage");
    private static String FEED_PLAYER = Main.getPlugin().getConfig().getString("feed_player");
    private static String FEED_BY_ADMIN = Main.getPlugin().getConfig().getString("player_fed_by_admin");
    private static String FEED_THE_PLAYER = Main.getPlugin().getConfig().getString("admin_fed_the_player");
    private static String HEAL_COMMAND_USAGE = Main.getPlugin().getConfig().getString("heal_command_usage");
    private static String HEAL_PLAYER = Main.getPlugin().getConfig().getString("heal_player");
    private static String HEAL_BY_ADMIN = Main.getPlugin().getConfig().getString("player_heal_by_admin");
    private static String HEAL_THE_PLAYER = Main.getPlugin().getConfig().getString("admin_heal_the_player");

    public static String getNoPermission()
    {
        return NO_PERMISSION;
    }

    public static String getFeedCommandUsage()
    {
        return FEED_COMMAND_USAGE;
    }

    public static String getFeedPlayer()
    {
        return FEED_PLAYER;
    }

    public static String getFeedByAdmin()
    {
        return FEED_BY_ADMIN;
    }

    public static String getFeedThePlayer()
    {
        return FEED_THE_PLAYER;
    }

    public static String getHealCommandUsage()
    {
        return HEAL_COMMAND_USAGE;
    }

    public static String getHealPlayer()
    {
        return HEAL_PLAYER;
    }

    public static String getHealByAdmin()
    {
        return HEAL_BY_ADMIN;
    }

    public static String getHealThePlayer()
    {
        return HEAL_THE_PLAYER;
    }
}
