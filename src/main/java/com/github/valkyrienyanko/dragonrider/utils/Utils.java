package com.github.valkyrienyanko.dragonrider.utils;

import org.bukkit.ChatColor;

public abstract class Utils {
    public static String color(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
