package net.barlords.tutopluginmc.players;

import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        e.joinMessage(Component.text("Bonjour ").append(Component.text(e.getPlayer().getName())));

    }

}
