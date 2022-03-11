package dev.panda.rank;

import java.util.UUID;

public interface RankObject<T> {
    T getRank(UUID uuid);
}
