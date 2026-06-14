package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4565u6 {
    void a();

    void a(@Nullable IronSourceError ironSourceError);

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void c(@Nullable IronSourceError ironSourceError);

    void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
