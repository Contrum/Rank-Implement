package dev.panda.rank.impl;

import com.broustudio.MizuAPI.MizuAPI;
import dev.panda.rank.IRank;
import dev.panda.rank.RankObject;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Mizu implements IRank, RankObject<String> {

    @Override
    public String getRankSystem() {
        return "MizuCore";
    }

    @Override
    public String getRankName(UUID uuid) {
        return getRank(uuid);
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return MizuAPI.getAPI().getRankPrefix(getRank(uuid));
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return MizuAPI.getAPI().getRankSuffix(getRank(uuid));
    }

    @Override
    public String getRankColor(UUID uuid) {
        return MizuAPI.getAPI().getRankColor(getRank(uuid));
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return 0;
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }

    @Override
    public String getRank(UUID uuid) {
        return MizuAPI.getAPI().getRank(uuid);
    }
}
