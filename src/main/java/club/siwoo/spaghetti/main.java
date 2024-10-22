package club.siwoo.spaghetti;

import club.siwoo.spaghetti.design.FightEnd;
import club.siwoo.spaghetti.design.WarningMessage;
import club.siwoo.spaghetti.essentials.Lobby;
import club.siwoo.spaghetti.perms.Flight;
import ga.strikepractice.StrikePractice;
import ga.strikepractice.api.StrikePracticeAPI;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		registerEvents();
		registerCommands();
		getLogger().info("SPaghetti Plugin Info: spaghetti.siwoo.club");
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.sendMessage(ChatColor.BLUE + "This server is running SPaghetti. Check " + ChatColor.AQUA + "spaghetti.siwoo.club" + ChatColor.BLUE + " for more info");
	}

	private void registerEvents() {
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginManager().registerEvents(new WarningMessage(), this);
		getServer().getPluginManager().registerEvents(new FightEnd(), this);
	}

	private void registerCommands() {
		getCommand("fly").setExecutor(new Flight(this));
		getCommand("lobby").setExecutor(new Lobby());
		getCommand("spawn").setExecutor(new Lobby());
		getCommand("l").setExecutor(new Lobby());
	}
}