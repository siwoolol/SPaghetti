package club.siwoo.spaghetti.design;

import ga.strikepractice.StrikePractice;
import ga.strikepractice.api.StrikePracticeAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class FightEnd extends JavaPlugin implements Listener {

    @EventHandler
    public void onFightEnd(DuelEnd event) {
        Player winner = event.getWinner();
    }
}
