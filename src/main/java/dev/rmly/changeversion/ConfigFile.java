package dev.rmly.changeversion;

import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigFile {
    private static File file;
    private static Configuration configuration;

    public static void setup() {
        File dataFolder = ChangeVersion.getInstance().getDataFolder();

        if (!dataFolder.exists()) {
            dataFolder.mkdir();
        }

        file = new File(dataFolder, "config.yml");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            configuration = ConfigurationProvider.getProvider(YamlConfiguration.class).load(file);
            if (configuration.get("Version") == null) {
                configuration.set("Version", "Custom Version");
                ConfigurationProvider.getProvider(YamlConfiguration.class).save(configuration, file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Configuration get() {
        return configuration;
    }
}
