package com.ironsource;

import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4517r9 implements InterfaceC4253c0<InterstitialAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4476p1 f44826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f44827b;

    public C4517r9(@NotNull InterfaceC4476p1 analytics, @NotNull Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f44826a = analytics;
        this.f44827b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC4253c0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(@NotNull L9 adInstance, @NotNull V1 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new InterstitialAd(new C4551t9(adInstance, new C4236b0(new C4639yc()), auctionDataReporter, this.f44826a, null, null, null, null, C4534s9.f44907a, 240, null));
    }
}
