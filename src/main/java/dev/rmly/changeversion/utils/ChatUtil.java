package dev.rmly.changeversion.utils;

import net.md_5.bungee.api.ChatColor;

public class ChatUtil {
    public static String color(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
