package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.C4551t9;
import com.ironsource.InterfaceC4568u9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class InterstitialAd implements InterfaceC4568u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4551t9 f67829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private InterstitialAdListener f67830b;

    public InterstitialAd(@NotNull C4551t9 interstitialAdInternal) {
        Intrinsics.checkNotNullParameter(interstitialAdInternal, "interstitialAdInternal");
        this.f67829a = interstitialAdInternal;
        interstitialAdInternal.a(this);
    }

    @NotNull
    public final InterstitialAdInfo getAdInfo() {
        return this.f67829a.b();
    }

    @Nullable
    public final InterstitialAdListener getListener() {
        return this.f67830b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f67829a.d();
    }

    @Override // com.ironsource.InterfaceC4568u9
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f67830b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC4568u9
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f67830b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC4568u9
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f67830b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC4568u9
    public void onAdInstanceDidFailedToShow(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + error + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f67830b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC4568u9
    public void onAdInstanceDidReward(@Nullable String str, int i10) {
    }

    @Override // com.ironsource.InterfaceC4568u9
    public void onAdInstanceDidShow() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f67830b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(@Nullable InterstitialAdListener interstitialAdListener) {
        this.f67830b = interstitialAdListener;
    }

    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info();
        this.f67829a.a(activity);
    }
}
