package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface M0 {
    void a();

    void a(@Nullable IronSourceError ironSourceError);

    void b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
