package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4512r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f44819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f44820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f44821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f44822d;

    public C4512r4() {
        this(null, null, null, null, 15, null);
    }

    @NotNull
    public final String a() {
        return this.f44819a;
    }

    @NotNull
    public final String b() {
        return this.f44820b;
    }

    @NotNull
    public final String c() {
        return this.f44821c;
    }

    @NotNull
    public final String d() {
        return this.f44822d;
    }

    @NotNull
    public final String e() {
        return this.f44822d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4512r4)) {
            return false;
        }
        C4512r4 c4512r4 = (C4512r4) obj;
        return Intrinsics.areEqual(this.f44819a, c4512r4.f44819a) && Intrinsics.areEqual(this.f44820b, c4512r4.f44820b) && Intrinsics.areEqual(this.f44821c, c4512r4.f44821c) && Intrinsics.areEqual(this.f44822d, c4512r4.f44822d);
    }

    @NotNull
    public final String f() {
        return this.f44821c;
    }

    @NotNull
    public final String g() {
        return this.f44819a;
    }

    @NotNull
    public final String h() {
        return this.f44820b;
    }

    public int hashCode() {
        return (((((this.f44819a.hashCode() * 31) + this.f44820b.hashCode()) * 31) + this.f44821c.hashCode()) * 31) + this.f44822d.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.f44819a + ", customRewardedVideoAdapterName=" + this.f44820b + ", customInterstitialAdapterName=" + this.f44821c + ", customBannerAdapterName=" + this.f44822d + ")";
    }

    public C4512r4(@NotNull String customNetworkAdapterName, @NotNull String customRewardedVideoAdapterName, @NotNull String customInterstitialAdapterName, @NotNull String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.f44819a = customNetworkAdapterName;
        this.f44820b = customRewardedVideoAdapterName;
        this.f44821c = customInterstitialAdapterName;
        this.f44822d = customBannerAdapterName;
    }

    @NotNull
    public final C4512r4 a(@NotNull String customNetworkAdapterName, @NotNull String customRewardedVideoAdapterName, @NotNull String customInterstitialAdapterName, @NotNull String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new C4512r4(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public static /* synthetic */ C4512r4 a(C4512r4 c4512r4, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4512r4.f44819a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4512r4.f44820b;
        }
        if ((i10 & 4) != 0) {
            str3 = c4512r4.f44821c;
        }
        if ((i10 & 8) != 0) {
            str4 = c4512r4.f44822d;
        }
        return c4512r4.a(str, str2, str3, str4);
    }

    public /* synthetic */ C4512r4(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
