package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4619x9 implements T<InterstitialAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Kf f45823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterstitialAdLoaderListener f45824b;

    public C4619x9(@NotNull Kf threadManager, @NotNull InterstitialAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f45823a = threadManager;
        this.f45824b = publisherListener;
    }

    @Override // com.ironsource.T
    public void a(@NotNull final InterstitialAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f45823a.a(new Runnable() { // from class: com.ironsource.on
            @Override // java.lang.Runnable
            public final void run() {
                C4619x9.a(adObject, this);
            }
        });
    }

    @Override // com.ironsource.T
    public void b(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f45823a.a(new Runnable() { // from class: com.ironsource.nn
            @Override // java.lang.Runnable
            public final void run() {
                C4619x9.a(error, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd adObject, C4619x9 this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f45824b.onInterstitialAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, C4619x9 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + error);
        this$0.f45824b.onInterstitialAdLoadFailed(error);
    }
}
