package com.ironsource;

import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Cd implements InterfaceC4253c0<RewardedAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4476p1 f40500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f40501b;

    public Cd(@NotNull InterfaceC4476p1 analytics, @NotNull Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f40500a = analytics;
        this.f40501b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC4253c0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd a(@NotNull L9 adInstance, @NotNull V1 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new RewardedAd(new Fd(adInstance, new C4236b0(new C4639yc()), auctionDataReporter, this.f40500a, null, null, null, null, Dd.f40639a, 240, null));
    }
}
