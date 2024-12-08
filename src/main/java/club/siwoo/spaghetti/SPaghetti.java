package club.siwoo.spaghetti;

import club.siwoo.spaghetti.commands.ForceWin;
import club.siwoo.spaghetti.commands.Help;
import club.siwoo.spaghetti.design.FightEnd;
import club.siwoo.spaghetti.design.WarningMessage;
import club.siwoo.spaghetti.essentials.Lobby;
import club.siwoo.spaghetti.perms.Flight;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SPaghetti extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		registerEvents();
		registerCommands();
	}

	private void registerEvents() {
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginManager().registerEvents(new WarningMessage(), this);
		getServer().getPluginManager().registerEvents(new FightEnd(), this);
	}

	private void registerCommands() {
		getCommand("spaghetti").setExecutor(new Help());
		getCommand("fly").setExecutor(new Flight(this));
		getCommand("lobby").setExecutor(new Lobby());
		getCommand("forcewin").setExecutor(new ForceWin());
	}
}