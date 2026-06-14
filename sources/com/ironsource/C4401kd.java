package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4401kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f43471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final LevelPlay.AdFormat f43472b;

    public C4401kd(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f43471a = placementName;
        this.f43472b = adFormat;
    }

    @NotNull
    public final String a() {
        return this.f43471a + "_" + this.f43472b;
    }
}
