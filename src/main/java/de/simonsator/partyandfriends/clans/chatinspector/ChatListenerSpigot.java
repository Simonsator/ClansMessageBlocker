package de.simonsator.partyandfriends.clans.chatinspector;

import de.simonsator.partyandfriends.api.PAFExtension;
import de.simonsator.partyandfriends.api.adapter.BukkitBungeeAdapter;
import de.simonsator.partyandfriends.clan.api.events.ClanMessageEvent;
import de.simonsator.partyandfriends.utilities.ConfigurationCreator;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.List;

public class ChatListenerSpigot extends ChatListener implements Listener {

	public ChatListenerSpigot(List<String> pList, ConfigurationCreator pConfig, PAFExtension pPlugin) {
		super(pList, pConfig);
		BukkitBungeeAdapter.getInstance().registerListener(this, pPlugin);
	}

	@EventHandler
	public void onChat(ClanMessageEvent pEvent) {
		onChatGlobal(pEvent);
	}
}
