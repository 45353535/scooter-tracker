package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f54692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerAdShowListener f54693b;

    public b(BannerAdShowListener bannerAdShowListener, com.moloco.sdk.internal.services.q appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, Function0 provideSdkEvents, Function0 provideBUrlData, AdFormatType adType, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f54692a = a.b(bannerAdShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, null, null, adType, metricsRecorder, null, 608, null);
        this.f54693b = bannerAdShowListener;
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void a(com.moloco.sdk.internal.d0 internalError) {
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.f54692a.a(internalError);
    }

    public final BannerAdShowListener b() {
        return this.f54693b;
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void onAdClicked(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f54692a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void onAdHidden(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f54692a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void onAdShowSuccess(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f54692a.onAdShowSuccess(molocoAd);
    }
}
