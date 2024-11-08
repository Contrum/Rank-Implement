package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import me.quartz.hestia.HestiaAPI;
import org.bukkit.entity.Player;

import java.util.UUID;

public class HestiaCore implements IRank {

    @Override
    public String getRankSystem() {
        return "HestiaCore";
    }

    @Override
    public String getRankName(UUID uuid) {
        return HestiaAPI.instance.getRank(uuid);
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return HestiaAPI.instance.getRankPrefix(uuid);
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return HestiaAPI.instance.getRankSuffix(uuid);
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
    public boolean hasRankTemporary(UUID uuid) {
        return false;
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }

    @Override
    public String getTag(Player player) {
        return HestiaAPI.instance.getTagPrefix(player.getUniqueId());
    }
}
