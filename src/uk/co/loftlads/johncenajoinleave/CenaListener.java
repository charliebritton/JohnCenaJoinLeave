package uk.co.loftlads.johncenajoinleave;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class CenaListener implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Bukkit.broadcastMessage(ChatColor.YELLOW + "John Cena Has Entered The Ring.");
	}
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Bukkit.broadcastMessage(ChatColor.YELLOW + "John Cena Has Left The Ring.");
	}
}
