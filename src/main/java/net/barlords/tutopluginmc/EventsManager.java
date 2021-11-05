package net.barlords.tutopluginmc;

import net.barlords.tutopluginmc.players.PlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class EventsManager {

    public static void registerEvents(TutoPluginMC pl) {

        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new PlayerJoinListener(), pl);

    }

}
