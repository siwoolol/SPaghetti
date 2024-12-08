package club.siwoo.spaghetti.design;

import ga.strikepractice.events.DuelEndEvent;
import ga.strikepractice.events.DuelStartEvent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FightEnd extends JavaPlugin implements Listener {
    private final List<String> defeatMessages = new ArrayList<>();

    public void randomDefeatMessage() {
        defeatMessages.add(" Has Obliterated ");
        defeatMessages.add(" Has Touched Up Against ");
        defeatMessages.add(" Has Defeated ");
        defeatMessages.add(" Destroyed ");
        defeatMessages.add(" Has Won Against ");
    }

    @EventHandler
    public void onFightEnd(DuelEndEvent event) {
        randomDefeatMessage();
        Player w = event.getWinner();
        Player l = event.getLoser();

        // Shuffle Random Messages
        List<String> shuffled = new ArrayList<>(defeatMessages);
        Collections.shuffle(shuffled);
        String selectedMessage = shuffled.get(0);

        // Winner Prompt
        w.playSound((w.getLocation()), Sound.EXPLODE, 1, 1);
        l.sendTitle(ChatColor.GREEN + "VICTORY", ChatColor.GREEN + w.getName() + ChatColor.WHITE + selectedMessage + ChatColor.GREEN + l.getName());
        w.sendMessage(ChatColor.GREEN + "You Won the Match");

        // Loser Prompt
        l.playSound((l.getLocation()), Sound.EXPLODE, 1, 1);
        l.sendTitle(ChatColor.RED + "DEFEAT", ChatColor.RED + w.getName() + ChatColor.WHITE + selectedMessage + ChatColor.GREEN + l.getName());
        l.sendMessage(ChatColor.RED + "You Lost the Match");
    }

    @EventHandler
    public void onFightStart(DuelStartEvent event) {
        Player p = event.getPlayer1();
        Player o = event.getPlayer2();

        p.sendMessage(ChatColor.GREEN + "The Fight Has Started");
        o.sendMessage(ChatColor.GREEN + "The Fight Has Started");
    }
}