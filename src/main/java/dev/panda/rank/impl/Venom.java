package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import dev.panda.rank.RankObject;
import cc.fyre.venom.rank.data.Rank;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Venom implements IRank, RankObject<Rank> {
    @Override
    public String getRankSystem() {
        return "Venom";
    }

    @Override
    public String getRankName(UUID uuid) {
        return this.getRank(uuid).getId();
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return this.getRank(uuid).getPrefix();
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return "";
    }

    @Override
    public String getRankColor(UUID uuid) {
        return this.getRank(uuid).getColor();
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return this.getRank(uuid).getPriority();
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }

    @Override
    public Rank getRank(UUID uuid) {
        return VenomAPI.instance.getGrantHandler().findBestRank(uuid);
    }
}
