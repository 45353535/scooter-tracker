package com.unity3d.ironsourceads.rewarded;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class RewardedAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f67845b;

    public RewardedAdInfo(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f67844a = instanceId;
        this.f67845b = adId;
    }

    @NotNull
    public final String getAdId() {
        return this.f67845b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f67844a;
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f67844a + "', adId: '" + this.f67845b + "']";
    }
}
