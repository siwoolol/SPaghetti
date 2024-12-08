package club.siwoo.spaghetti.commands;

import ga.strikepractice.api.StrikePracticeAPI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ForceWin implements CommandExecutor {

    private StrikePracticeAPI api;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;

        p.sendMessage("test");

        if(p.hasPermission("strikecommands.admin")) {
            if(args.length == 0) {
                api.forceWinFight(p);
                p.sendMessage("Force Won The Fight!");
            } else if(args.length == 1) {
                // detect args type
                if(args[1].equalsIgnoreCase("fight")) {
                    api.forceWinFight(p);
                    p.sendMessage("Force Won The Fight!");
                } else if(args[1].equalsIgnoreCase("round")) {
                    api.forceWinRound(p);
                    p.sendMessage("Force Won The Round!");
                } else {
                    p.sendMessage("Invalid Option! Only Use (fight/round)");
                }
            } else {
                p.sendMessage("Usage: /forcewin (fight/round)");
            }
            return true;
        } else {
            p.sendMessage("You don't have permission to use this command!");
            return true;
        }
    }
}
