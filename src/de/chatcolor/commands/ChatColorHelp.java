package de.chatcolor.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.shaky_hd.main.Main;

public class ChatColorHelp implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String string, String[] args) {

		Player p = (Player) s;
		
		if(p.hasPermission("chatcolor.colorcodes")) {
			
			p.sendMessage(" ");
			p.sendMessage("§7   >> §cChat§6Color §7<<");
			p.sendMessage(" ");
			p.sendMessage("&0 = §0Schwarz");
			p.sendMessage("&1 = §1Dunkel Blau");
			p.sendMessage("&2 = §2Dunkel Grün");
			p.sendMessage("&3 = §3Dunkel Aqua");
			p.sendMessage("&4 = §4Dunkel Rot");
			p.sendMessage("&5 = §5Dunkel Lila");
			p.sendMessage("&6 = §6Gold");
			p.sendMessage("&7 = §7Grau");
			p.sendMessage("&8 = §8Dunkel Grau");
			p.sendMessage("&9 = §9Blau");
			p.sendMessage("&a = §aGrün");
			p.sendMessage("&b = §bAqua");
			p.sendMessage("&c = §cRot");
			p.sendMessage("&d = §dHell Lila");
			p.sendMessage("&e = §eGelb");
			p.sendMessage("&f = §fWeiß");
			p.sendMessage(" ");
			p.sendMessage("&k = §kHallo");
			p.sendMessage("&l = §lDick");
			p.sendMessage("&m = §mDurchgestrichen");
			p.sendMessage("&n = Unterstrichen");
			p.sendMessage("&o = §oKurvig");
			p.sendMessage("&r = Reset");
			p.sendMessage(" ");

			
			                         
			
			
			
			
			
			
			
		}else {	
			p.sendMessage(" ");
			p.sendMessage(Main.NoPerms);
			p.sendMessage(" ");
			p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);

		}

		return true;
	}

			
	
	
			
			
		}
		
		


