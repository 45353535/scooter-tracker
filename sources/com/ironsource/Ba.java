package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface Ba {
    void b(@Nullable IronSourceError ironSourceError);

    void d(@Nullable IronSourceError ironSourceError);

    void i();

    void k();

    void onAdClicked();

    void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdLeftApplication();

    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
