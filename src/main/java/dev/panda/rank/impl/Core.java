package dev.panda.rank.impl;

import cc.revenge.core.CoreAPI;
import dev.panda.rank.IRank;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Core implements IRank {

    private final CoreAPI coreAPI;

    public Core() {
        this.coreAPI = new CoreAPI();
    }

    @Override
    public String getRankSystem() {
        return "Core";
    }

    @Override
    public String getRankName(UUID uuid) {
        return coreAPI.getRankName(uuid);
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return coreAPI.getRankPrefix(uuid);
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return coreAPI.getRankSuffix(uuid);
    }

    @Override
    public String getRankColor(UUID uuid) {
        return coreAPI.getRankColor(uuid);
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return coreAPI.getRankWeight(uuid);
    }

    @Override
    public boolean hasRankTemporary(UUID uuid) {
        return false;
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }

    @Override
    public String getTag(Player player) {
        return "";
    }
}
