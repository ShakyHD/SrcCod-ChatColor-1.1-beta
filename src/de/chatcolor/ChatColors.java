package de.chatcolor;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.shaky_hd.main.Main;

public class ChatColors implements Listener {
	
	@SuppressWarnings("static-access")
	@EventHandler
	public void onChat2(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		
		if(p.hasPermission("chatcolor.*")) {
			e.setMessage(ChatColor.translateAlternateColorCodes('&', e.getMessage()));
			
		}else {
			p.sendMessage(Main.NoPerms);
			p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
			
		}
		
		e.setFormat("§7%s§8 | §7%s");
		
	}
	
	
	
	

}
