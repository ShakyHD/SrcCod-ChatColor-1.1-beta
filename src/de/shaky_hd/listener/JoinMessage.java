package de.shaky_hd.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinMessage implements Listener{
	
	@EventHandler
		public void onJoin(PlayerJoinEvent e) {
		e.setJoinMessage("§7[§a+§7] " + e.getPlayer().getName());
	}
	
	@EventHandler
		public void onQuit(PlayerQuitEvent e) {
		e.setQuitMessage("§7[§c-§7] " + e.getPlayer().getName());	
	}

}
