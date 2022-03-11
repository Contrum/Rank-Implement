package dev.panda.rank.impl;

import club.frozed.core.ZoomAPI;
import dev.panda.rank.IRank;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Zoom implements IRank {

    @Override
    public String getRankSystem() {
        return "ZoomCore";
    }

    @Override
    public String getRankName(UUID uuid) {
        return ZoomAPI.getRankName(getPlayer(uuid));
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return ZoomAPI.getRankPrefix(getPlayer(uuid));
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return ZoomAPI.getRankSuffix(getPlayer(uuid));
    }

    @Override
    public String getRankColor(UUID uuid) {
        return ZoomAPI.getRankColor(getPlayer(uuid)) + ZoomAPI.getRankName(getPlayer(uuid));
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return 0;
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }

    public Player getPlayer(UUID uuid) {
        return Bukkit.getPlayer(uuid);
    }
}
