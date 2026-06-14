package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface B6 {
    void a(@NotNull Activity activity);

    void a(@NotNull C4498q6 c4498q6);

    void a(@NotNull C4498q6 c4498q6, @Nullable IronSourceError ironSourceError);

    void a(@NotNull C4498q6 c4498q6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void b(@NotNull C4498q6 c4498q6, @Nullable IronSourceError ironSourceError);

    void b(@NotNull C4498q6 c4498q6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void c(@NotNull C4498q6 c4498q6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
