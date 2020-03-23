package de.shaky_hd.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.chatcolor.ChatColors;
import de.chatcolor.commands.ChatColorHelp;
import de.shaky_hd.listener.JoinMessage;

public class Main extends JavaPlugin{
	
	public static String PREFIX;
	public static String VERSION;
	public static String NoPerms;
	public void onEnable() {
		PREFIX = "§cChat§6Color §8| ";
		NoPerms = Main.PREFIX + "§cDazu hast du keine Rechte";
		VERSION = "1.1 beta";
		
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "------------------------------------------------");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Author = Shaky_HD");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Plugin Version " + Main.VERSION);
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Plugin Name = ChatColor");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Dieses Plugin wurde von");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Shaky_HD gecodet!");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Du darfst das Plugin umprogrammieren");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7nur nicht als dein Plugin verkaufen!");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§aChatColor wurde erfolgreich geladen");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "------------------------------------------------");
		register();
		
	}
	
	
	public void onDisable() {
		
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "------------------------------------------------");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Author = Shaky_HD");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Plugin Version " + Main.VERSION);
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Plugin Name = ChatColor");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Dieses Plugin wurde von");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Shaky_HD gecodet!");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7Du darfst das Plugin umprogrammieren");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§7nur nicht als dein Plugin verkaufen!");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "§cChatColor wurde erfolgreich entladen");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + " ");
		Bukkit.getConsoleSender().sendMessage(Main.PREFIX + "------------------------------------------------");
		
		
		
		
		
		
	}
	
	public void register() {
		
		Bukkit.getPluginManager().registerEvents(new ChatColors(), this);
		Bukkit.getPluginManager().registerEvents(new JoinMessage(), this);
		
		
		
		
		Bukkit.getPluginCommand("colorcodes").setExecutor(new ChatColorHelp());
		
		
		
		
	}
	
	
	
	

}
