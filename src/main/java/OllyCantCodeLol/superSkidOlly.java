package OllyCantCodeLol;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class superSkidOlly extends JavaPlugin {
	public static Logger l = Bukkit.getLogger();

	public void onEnable () {
		l.info("Olly can't code lol skid");
		getCommand("makecoins").setExecutor(new gottaMakeThisListenerCauseOllyCantCode());
		new YouGottaPlaceThoseBlocksm8(this);
	}

	public void onDisable () {
		l.info("Olly is a super skid.");
	}
}
