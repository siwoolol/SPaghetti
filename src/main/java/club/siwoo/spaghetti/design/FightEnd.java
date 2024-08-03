package club.siwoo.spaghetti.design;

import ga.strikepractice.events.DuelEndEvent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class FightEnd extends JavaPlugin implements Listener {

    @EventHandler
    public void onFightEnd(DuelEndEvent event) {
        Player w = event.getWinner();
        Player l = event.getLoser();

        w.playSound((w.getLocation()), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 1, 1);
        l.sendTitle(ChatColor.GREEN + "VICTORY", ChatColor.GREEN + w.getName() + ChatColor.WHITE + " has Won The Match", 0, 20, 0);
        w.sendMessage(ChatColor.GREEN + "You Won the Match!");
        l.playSound((l.getLocation()), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 1, 1);
        l.sendTitle(ChatColor.RED + "DEFEAT", ChatColor.RED + w.getName() + ChatColor.WHITE + " has Won The Match", 0, 20, 0);
        l.sendMessage(ChatColor.RED + "You Lost the Match");
    }
}