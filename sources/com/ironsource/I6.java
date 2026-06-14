package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface I6 {
    void a();

    void a(@NotNull Activity activity);

    void a(@Nullable IronSourceError ironSourceError);

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void c(@Nullable IronSourceError ironSourceError);

    void c(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
