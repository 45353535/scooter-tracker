package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4578v2 {
    void a(@Nullable LevelPlayAdError levelPlayAdError);

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo, @Nullable LevelPlayAdError levelPlayAdError);

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo, boolean z10);

    void b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void c(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void d(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void e(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
