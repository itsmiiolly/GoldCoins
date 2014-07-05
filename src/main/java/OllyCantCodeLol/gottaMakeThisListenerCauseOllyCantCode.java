package OllyCantCodeLol;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gottaMakeThisListenerCauseOllyCantCode implements CommandExecutor {
	@Override
	public boolean onCommand (CommandSender commandSender, Command cmd, String s, String[] strings) {
		if (cmd.getName().equals("makecoins")) {
			if (commandSender instanceof Player) {
				Bukkit.broadcastMessage("Making the coins. Gotta go fast.");
				GottaGetRichQuickm8.placeCoins();
				Bukkit.broadcastMessage("Made all your coins d00d.");
			} else {
				commandSender.sendMessage("You must be a player to use this command!");
				return false;
			}
			return true;
		}
		return false;
	}
}
