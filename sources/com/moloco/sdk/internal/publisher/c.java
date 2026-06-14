package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f54697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdShowListener f54698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.q f54699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f54700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AdFormatType f54701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f54702f;

    public c(AdShowListener adShowListener, com.moloco.sdk.internal.services.q appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, Function0 provideSdkEvents, Function0 provideBUrlData, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(adShowListener, "adShowListener");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f54697a = a.b(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, null, null, adFormatType, metricsRecorder, null, 608, null);
        this.f54698b = adShowListener;
        this.f54699c = appLifecycleTrackerService;
        this.f54700d = customUserEventBuilderService;
        this.f54701e = adFormatType;
        this.f54702f = metricsRecorder;
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void a(com.moloco.sdk.internal.d0 internalError) {
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.f54697a.a(internalError);
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void onAdClicked(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f54697a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void onAdHidden(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f54697a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void onAdShowSuccess(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f54697a.onAdShowSuccess(molocoAd);
    }
}
