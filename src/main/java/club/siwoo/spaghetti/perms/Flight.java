package club.siwoo.spaghetti.perms;

import club.siwoo.spaghetti.SPaghetti;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Flight implements CommandExecutor {

    private final SPaghetti plugin;

    public Flight(SPaghetti plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (!sender.hasPermission("spaghetti.fly")) {
            player.sendMessage(ChatColor.RED + "You don't have permissions to use this command.");
            return true;
        }

        if (args.length != 0) {
            player.playSound((player.getLocation()), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.RED + "Usage: /fly"));
            return true;
        }

        if (!player.getAllowFlight()) {
            player.sendMessage(ChatColor.GREEN + "Flight Enabled!");
            player.setAllowFlight(true);
        } else if (player.getAllowFlight()) {
            player.sendMessage(ChatColor.RED + "Flight Disabled!");
            player.setAllowFlight(false);
        }
        return true;
    }
}
