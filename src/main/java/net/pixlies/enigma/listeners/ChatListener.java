package net.pixlies.enigma.listeners;

import net.pixlies.enigma.Computer;
import net.pixlies.enigma.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import net.pixlies.enigma.holyc.Compiler;

public class ChatListener implements Listener {

    private static final Main instance = Main.getInstance();

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (!instance.getUtilLists().getOpenComputers().containsKey(player.getUniqueId())) return;
        event.setCancelled(true);
        Computer computer = instance.getUtilLists().getOpenComputers().get(player.getUniqueId());
        Compiler.process(event.getMessage(), computer);
    }

}
