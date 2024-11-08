package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import me.abhi.core.CorePlugin;
import me.abhi.core.grant.Grant;
import me.abhi.core.profile.CoreProfile;
import me.abhi.core.rank.Rank;
import org.bukkit.entity.Player;

import java.util.UUID;

public class mCore implements IRank{

    @Override
    public String getRankSystem() {
        return "mCore";
    }

    @Override
    public String getRankName(UUID uuid) {
        return getRank(uuid) == null ? "None" : getRank(uuid).getName();
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return getRank(uuid) == null ? "None" : getRank(uuid).getPrefix();
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return getRank(uuid) == null ? "None" : getRank(uuid).getSuffix();
    }

    @Override
    public String getRankColor(UUID uuid) {
        return "";
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return getRank(uuid) == null ? 0 : getRank(uuid).getWeight();
    }

    @Override
    public boolean hasRankTemporary(UUID uuid) {
        CoreProfile coreProfile = CorePlugin.getInstance().getProfileHandler().getCoreProfile(uuid);

        if (coreProfile == null) return false;

        for (Grant grant : coreProfile.getGrants()) {
            if (coreProfile.getRank().equals(grant.getRank())) {
                return grant.getDuration() > 0;
            }
        }
        return false;
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }

    public Rank getRank(UUID uuid) {
        CoreProfile coreProfile = CorePlugin.getInstance().getProfileHandler().getCoreProfile(uuid);
        return coreProfile == null ? null : coreProfile.getRank();
    }

    @Override
    public String getTag(Player player) {
        CoreProfile coreProfile = CorePlugin.getInstance().getProfileHandler().getCoreProfile(player.getUniqueId());
        return coreProfile == null || coreProfile.getTag() == null ? "" : coreProfile.getTag().getPrefix();
    }
}
