package club.siwoo.spaghetti.design;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import ga.strikepractice.*;
import org.bukkit.plugin.java.JavaPlugin;

public class WarningMessage extends JavaPlugin implements Listener {

    @EventHandler
    public void OnKitSelect(KitSelect event) {
        Player player = event.getPlayer();
    }
}