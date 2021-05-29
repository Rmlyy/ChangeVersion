package dev.rmly.changeversion;

import dev.rmly.changeversion.events.PingEvent;
import dev.rmly.changeversion.utils.ChatUtil;
import net.md_5.bungee.api.plugin.Plugin;

public final class ChangeVersion extends Plugin {
    private static ChangeVersion instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info(ChatUtil.color("&3ChangeVersion &f1.0 &7| &fenabled."));
        ConfigFile.setup();
        getProxy().getPluginManager().registerListener(this, new PingEvent());
    }

    public static ChangeVersion getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatUtil.color("&3ChangeVersion &fv1.0 &7| &fdisabled."));
    }
}
