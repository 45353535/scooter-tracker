package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.D8;
import com.ironsource.F8;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class IronSourceNativeAdListener implements F8.a {

    @NotNull
    private final IronSourceNativeAdViewBinder binder;

    @NotNull
    private final NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(@NotNull IronSourceNativeAdViewBinder binder, @NotNull NativeAdSmashListener smashListener) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(smashListener, "smashListener");
        this.binder = binder;
        this.smashListener = smashListener;
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdLoadFailed(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.smashListener.onNativeAdLoadFailed(new IronSourceError(510, "Load failed - " + reason));
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdLoadSuccess(@NotNull D8 adData) {
        Intrinsics.checkNotNullParameter(adData, "adData");
        this.smashListener.onNativeAdLoaded(new IronSourceNativeAdData(adData), this.binder);
    }

    @Override // com.ironsource.F8.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}
