package com.unity3d.ironsourceads.interstitial;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class InterstitialAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f67832b;

    public InterstitialAdInfo(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f67831a = instanceId;
        this.f67832b = adId;
    }

    @NotNull
    public final String getAdId() {
        return this.f67832b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f67831a;
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f67831a + "', adId: '" + this.f67832b + "']";
    }
}
