package club.siwoo.spaghetti.design;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import ga.strikepractice.events.KitSelectEvent;

public class WarningMessage extends JavaPlugin implements Listener {

    @EventHandler
    public void onKitSelect(KitSelectEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("");
        player.sendMessage(ChatColor.RED.toString() + ChatColor.BOLD + "WARNING! " + ChatColor.YELLOW + "Butterfly/Drag Clicking Is Not Recommended And is false-punishable.");
        player.sendMessage("");
    }
}