package de.simonsator.partyandfriends.clans.chatinspector;

import de.simonsator.partyandfriends.api.PAFExtension;
import de.simonsator.partyandfriends.clan.api.events.ClanMessageEvent;
import de.simonsator.partyandfriends.utilities.ConfigurationCreator;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

import java.util.List;

public class ChatListenerBungee extends ChatListener implements Listener {

	public ChatListenerBungee(List<String> pList, ConfigurationCreator pConfig, PAFExtension pPlugin) {
		super(pList, pConfig);
		ProxyServer.getInstance().getPluginManager().registerListener(pPlugin, this);
	}

	@EventHandler
	public void onChat(ClanMessageEvent pEvent) {
		onChatGlobal(pEvent);
	}

}
