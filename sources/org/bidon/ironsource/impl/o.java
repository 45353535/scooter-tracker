package org.bidon.ironsource.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import hg.c0;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bidon.ironsource.impl.g;
import org.bidon.sdk.logs.logging.impl.LogExtKt;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f97379a = lf.i.a(new Function0() { // from class: org.bidon.ironsource.impl.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return o.c();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableSharedFlow c() {
        return c0.a(0, 10, gg.a.f72766c);
    }

    @Override // org.bidon.ironsource.impl.m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow b() {
        return (MutableSharedFlow) this.f97379a.getValue();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onInterstitialAdClicked: " + str);
        b().g(new g.a(str));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onInterstitialAdClosed: " + str);
        b().g(new g.b(str));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onInterstitialAdLoadFailed: " + str + ", " + ironSourceError);
        b().g(new g.c(str, a.a(ironSourceError)));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onInterstitialAdOpened: " + str);
        b().g(new g.e(str));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onInterstitialAdReady: " + str);
        b().g(new g.d(str));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onInterstitialAdShowFailed: " + str + ", " + ironSourceError);
        b().g(new g.C1127g(str, a.a(ironSourceError)));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onRewardedVideoAdClicked: " + str);
        b().g(new g.a(str));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onRewardedVideoAdClosed: " + str);
        b().g(new g.b(str));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onRewardedVideoAdLoadFailed: " + str + ", " + ironSourceError);
        b().g(new g.c(str, a.a(ironSourceError)));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onRewardedVideoAdLoadSuccess: " + str);
        b().g(new g.d(str));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onRewardedVideoAdOpened: " + str);
        b().g(new g.e(str));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onRewardedVideoAdRewarded: " + str);
        b().g(new g.f(str));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        LogExtKt.logInfo("IronSourceRouterImpl", "onRewardedVideoAdShowFailed: " + str + ", " + ironSourceError);
        b().g(new g.C1127g(str, a.a(ironSourceError)));
    }
}
