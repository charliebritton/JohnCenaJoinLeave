package uk.co.loftlads.johncenajoinleave;
import org.bukkit.plugin.java.JavaPlugin;

import uk.co.loftlads.MyEpicListener;

public class JohnCenaJoinLeaveEventAPI {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new CenaListener(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
}
