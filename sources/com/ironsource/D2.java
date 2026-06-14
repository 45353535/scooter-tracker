package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class D2 implements C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4476p1 f40534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f40535b;

    public D2(@NotNull InterfaceC4476p1 analytics, @NotNull Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f40534a = analytics;
        this.f40535b = callbackExecutor;
    }

    @Override // com.ironsource.C2
    @NotNull
    public BannerAdView a(@NotNull L9 adInstance, @NotNull C4346h8 adContainer, @NotNull V1 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new BannerAdView(new O2(adInstance, adContainer, auctionDataReporter, this.f40534a, null, null, null, null, 240, null));
    }
}
