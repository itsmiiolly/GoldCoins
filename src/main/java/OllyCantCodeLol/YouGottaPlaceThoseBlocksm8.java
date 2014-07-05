package OllyCantCodeLol;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;


/**
 * Created by hdt80 on 7/4/14.
 */
public class YouGottaPlaceThoseBlocksm8 implements Listener {
	private final superSkidOlly plugin;

	public YouGottaPlaceThoseBlocksm8 (superSkidOlly plugin) {
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void BlockPlacedEvent(BlockPlaceEvent e) {
		Bukkit.broadcastMessage("BlockPlaceEvent has been fired: " + e.getBlock().toString());
		if (e.getBlock().getType().equals(Material.GOLD_BLOCK)) {
			Bukkit.broadcastMessage("A block at " + e.getBlock().getLocation().toString() + " has been placed.");
			GottaGetRichQuickm8.blocks.add(e.getBlock());
		}
	}
}
