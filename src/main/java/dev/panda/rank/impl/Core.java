package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import cc.revenge.core.CoreAPI;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Core implements IRank {

    @Override
    public String getRankSystem() {
        return "Core";
    }

    @Override
    public String getRankName(UUID uuid) {
        CoreAPI coreAPI = new CoreAPI();
        return coreAPI.getRankName(uuid);
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        CoreAPI coreAPI = new CoreAPI();
        return coreAPI.getRankPrefix(uuid);
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        CoreAPI coreAPI = new CoreAPI();
        return coreAPI.getRankSuffix(uuid);
    }

    @Override
    public String getRankColor(UUID uuid) {
        CoreAPI coreAPI = new CoreAPI();
        return coreAPI.getRankColor(uuid);
    }

    @Override
    public int getRankWeight(UUID uuid) {
        CoreAPI coreAPI = new CoreAPI();
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
}
