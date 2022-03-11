package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;

import java.util.UUID;

public class PermissionsEx implements IRank {

    private Chat chat;

    public PermissionsEx() {
        RegisteredServiceProvider<Chat> rsp = Bukkit.getServer().getServicesManager().getRegistration(Chat.class);
        if (rsp != null) chat = rsp.getProvider();
    }

    @Override
    public String getRankSystem() {
        return "PermissionsEx";
    }

    @Override
    public String getRankName(UUID uuid) {
        return chat.getPrimaryGroup(getPlayer(uuid));
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return chat.getPlayerPrefix(getPlayer(uuid));
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return chat.getPlayerSuffix(getPlayer(uuid));
    }

    @Override
    public String getRankColor(UUID uuid) {
        return "";
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return 0;
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }

    private Player getPlayer(UUID uuid) {
        return Bukkit.getPlayer(uuid);
    }
}
