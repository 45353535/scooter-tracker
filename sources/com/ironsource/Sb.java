package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface Sb {
    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError);
}
