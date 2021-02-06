package net.nonswag.tnl.api;

import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.PluginContainer;
import com.velocitypowered.api.proxy.ProxyServer;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import java.util.Optional;

public class Discord {

    public static class Bukkit extends JavaPlugin {

        @Override
        public void onEnable() {
            org.bukkit.Bukkit.getConsoleSender().sendMessage("§8[§f§lAPI§8] §aInitialized §6JDA v" + this.getDescription().getVersion());
        }
    }

    @Plugin(
            authors = "NonSwag",
            id = "tnldiscordapi",
            name = "TNLDiscordAPI",
            url = "https://www.thenextlvl.net/",
            version = "4.2.0_277"
    )
    public static class Velocity {

        @Inject
        public Velocity(@Nonnull ProxyServer server, @Nonnull Logger logger) {
            Optional<PluginContainer> plugin = server.getPluginManager().getPlugin("tnldiscordapi");
            plugin.ifPresent(pluginContainer -> logger.info("§8[§f§lAPI§8] §aInitialized §6JDA v" + pluginContainer.getDescription().getVersion()));
        }
    }
}

