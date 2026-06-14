package com.ironsource;

import com.ironsource.P7;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ad implements P7, P7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, LevelPlayReward> f40407a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, LevelPlayReward> f40408b = new LinkedHashMap();

    @Override // com.ironsource.P7.a
    public void a(@NotNull String placement, @NotNull String rewardName, int i10) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f40407a.put(placement, new LevelPlayReward(rewardName, i10));
    }

    @Override // com.ironsource.P7.a
    public void b(@NotNull String adUnitId, @NotNull String rewardName, int i10) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f40408b.put(adUnitId, new LevelPlayReward(rewardName, i10));
    }

    private final LevelPlayReward b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f40407a.get(str);
    }

    @Override // com.ironsource.P7
    @Nullable
    public LevelPlayReward a(@Nullable String str, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        LevelPlayReward levelPlayRewardB = b(str);
        return levelPlayRewardB == null ? a(adUnitId) : levelPlayRewardB;
    }

    private final LevelPlayReward a(String str) {
        return this.f40408b.get(str);
    }
}
