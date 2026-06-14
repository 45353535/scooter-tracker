package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Vb extends K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InternalNativeAdListener f41904a;

    public Vb(@NotNull InternalNativeAdListener mNativeAdListener) {
        Intrinsics.checkNotNullParameter(mNativeAdListener, "mNativeAdListener");
        this.f41904a = mNativeAdListener;
    }

    @Override // com.ironsource.K0
    public void a(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder nativeAdViewBinder, @Nullable AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.f41904a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.K0
    public void d(@Nullable AdInfo adInfo) {
        this.f41904a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.K0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f41904a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.K0
    public void a(@NotNull C4283dd placement, @Nullable AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f41904a.onNativeAdClicked(adInfo);
    }
}
