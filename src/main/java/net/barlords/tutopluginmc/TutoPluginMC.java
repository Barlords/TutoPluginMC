package net.barlords.tutopluginmc;

import org.bukkit.plugin.java.JavaPlugin;

public final class TutoPluginMC extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        EventsManager.registerEvents(this);
        getServer().getConsoleSender().sendMessage("§6TutoMC §7> §aEnable");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage("§6TutoMC §7> §cDisable");
    }
}
