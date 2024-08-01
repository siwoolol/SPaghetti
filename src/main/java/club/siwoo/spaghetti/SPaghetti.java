package club.siwoo.spaghetti;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SPaghetti extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Spaghetti Info: spaghetti.siwoo.club");
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.sendMessage(ChatColor.BLUE + "This server is running SPaghetti. Check " + "spaghetti.siwoo.club" + " for more info");
	}
}