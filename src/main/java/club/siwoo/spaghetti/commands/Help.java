package club.siwoo.spaghetti.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;

        player.sendMessage(ChatColor.GOLD.toString() + ChatColor.BOLD + "Spaghetti " + ChatColor.WHITE + " - Help Page 1 Out Of 1");
        player.sendMessage("/fly" + ChatColor.WHITE + "Enables flight for the user. (Lobby Only)");
        player.sendMessage("/leave" + ChatColor.WHITE + "Leaves the current game." + ChatColor.GRAY + "(Subcommands: /l, /spawn");
        player.sendMessage(ChatColor.GRAY + "Help Page 1 Out Of 1");
        return true;
    }
}
