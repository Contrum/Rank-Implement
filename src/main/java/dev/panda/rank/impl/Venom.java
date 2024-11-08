package dev.panda.rank.impl;

import cc.fyre.venom.VenomAPI;
import cc.fyre.venom.profile.data.Profile;
import dev.panda.rank.IRank;
import cc.fyre.venom.rank.data.Rank;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Venom implements IRank {

    @Override
    public String getRankSystem() {
        return "Venom";
    }

    @Override
    public String getRankName(UUID uuid) {
        return getRank(uuid).getId();
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return getRank(uuid).getPrefix();
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return "";
    }

    @Override
    public String getRankColor(UUID uuid) {
        return getRank(uuid).getColor();
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return getRank(uuid).getPriority();
    }

    @Override
    public boolean hasRankTemporary(UUID uuid) {
        return false;
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }

    public Rank getRank(UUID uuid) {
        return VenomAPI.instance.getGrantHandler().findBestRank(uuid);
    }

    @Override
    public String getTag(Player player) {
        Profile profile = VenomAPI.instance.getProfileHandler().findById(player.getUniqueId());
        return profile != null ? profile.getTag() : "";
    }
}
