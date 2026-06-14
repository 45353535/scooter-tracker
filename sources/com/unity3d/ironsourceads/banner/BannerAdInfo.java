package com.unity3d.ironsourceads.banner;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class BannerAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f67798b;

    public BannerAdInfo(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f67797a = instanceId;
        this.f67798b = adId;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bannerAdInfo.f67797a;
        }
        if ((i10 & 2) != 0) {
            str2 = bannerAdInfo.f67798b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f67797a;
    }

    @NotNull
    public final String component2() {
        return this.f67798b;
    }

    @NotNull
    public final BannerAdInfo copy(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return new BannerAdInfo(instanceId, adId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return Intrinsics.areEqual(this.f67797a, bannerAdInfo.f67797a) && Intrinsics.areEqual(this.f67798b, bannerAdInfo.f67798b);
    }

    @NotNull
    public final String getAdId() {
        return this.f67798b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f67797a;
    }

    public int hashCode() {
        return (this.f67797a.hashCode() * 31) + this.f67798b.hashCode();
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f67797a + "', adId: '" + this.f67798b + "']";
    }
}
