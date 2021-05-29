package dev.rmly.changeversion.events;

import dev.rmly.changeversion.ConfigFile;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PingEvent implements Listener {

    @EventHandler
    public void onPing(ProxyPingEvent e) {
        e.getResponse().getVersion().setName((String) ConfigFile.get().get("Version"));
    }
}
