package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import org.bukkit.entity.Player;
import xyz.refinedev.phoenix.SharedAPI;
import xyz.refinedev.phoenix.profile.grant.Grant;

import java.util.UUID;

public class Phoenix implements IRank {

    @Override
    public String getRankSystem() {
        return "Phoenix";
    }

    @Override
    public String getRankName(UUID uuid) {
        return SharedAPI.getInstance().getProfileHandler().getProfile(uuid).getHighestRank().getName();
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return SharedAPI.getInstance().getProfileHandler().getProfile(uuid).getHighestRank().getPrefix();
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return SharedAPI.getInstance().getProfileHandler().getProfile(uuid).getHighestRank().getSuffix();
    }

    @Override
    public String getRankColor(UUID uuid) {
        return SharedAPI.getInstance().getProfileHandler().getProfile(uuid).getHighestRank().getColor();
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return SharedAPI.getInstance().getProfileHandler().getProfile(uuid).getHighestRank().getPriority();
    }

    @Override
    public boolean hasRankTemporary(UUID uuid) {
        Grant grant = SharedAPI.getInstance().getProfileHandler().getProfile(uuid).getBestGrant();
        if (grant == null) return false;

        return grant.isPermanent();
    }

    @Override
    public String getRealName(Player player) {
        return SharedAPI.getInstance().getProfileHandler().getProfile(player.getUniqueId()).getHighestRank().getName();
    }

    @Override
    public String getTag(Player player) {
        return PhoenixAPI.INSTANCE.getTag(player.getUniqueId()).getFormat();
    }
}
