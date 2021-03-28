package net.nonswag.tnl.api;

import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;

import javax.annotation.Nonnull;
import javax.inject.Inject;

public class Discord {

    public static class Bukkit extends JavaPlugin {

        @Override
        public void onEnable() {
        }
    }

    @Plugin(authors = "NonSwag", id = "tnldiscordapi", name = "TNLDiscordAPI", url = "https://www.thenextlvl.net/", version = "4.2.0_227")
    public static class Velocity {

        @Inject
        public Velocity(@Nonnull ProxyServer server, @Nonnull Logger logger) {
        }
    }
}

