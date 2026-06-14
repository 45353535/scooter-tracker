package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.i0;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f55215f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55216g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdLoad.Listener f55217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.i0 f55218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.f f55219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdFormatType f55220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f55221e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public s(AdLoad.Listener listener, com.moloco.sdk.internal.i0 sdkEventUrlTracker, com.moloco.sdk.acm.f acmLoadTimerEvent, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        Intrinsics.checkNotNullParameter(acmLoadTimerEvent, "acmLoadTimerEvent");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f55217a = listener;
        this.f55218b = sdkEventUrlTracker;
        this.f55219c = acmLoadTimerEvent;
        this.f55220d = adFormatType;
        this.f55221e = metricsRecorder;
    }

    @Override // com.moloco.sdk.internal.publisher.r0
    public void a(MolocoAd molocoAd, long j10, com.moloco.sdk.internal.ortb.model.z zVar) {
        String onAdLoadStart;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadStarted: " + molocoAd + ", " + j10, null, false, 12, null);
        if (zVar == null || (onAdLoadStart = zVar.getOnAdLoadStart()) == null) {
            return;
        }
        i0.a.a(this.f55218b, onAdLoadStart, j10, null, 4, null);
    }

    @Override // com.moloco.sdk.internal.publisher.r0
    public void b(MolocoAd molocoAd, com.moloco.sdk.internal.ortb.model.z zVar) {
        String onAdLoadSuccess;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadSuccess: " + molocoAd, null, false, 12, null);
        if (zVar != null && (onAdLoadSuccess = zVar.getOnAdLoadSuccess()) != null) {
            i0.a.a(this.f55218b, onAdLoadSuccess, System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.acm.recorder.a aVar = this.f55221e;
        com.moloco.sdk.acm.f fVarF = this.f55219c.f(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "success");
        com.moloco.sdk.internal.client_metrics_data.c cVar = com.moloco.sdk.internal.client_metrics_data.c.f54175d;
        String strG = cVar.g();
        String strName = this.f55220d.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        aVar.a(fVarF.f(strG, lowerCase));
        com.moloco.sdk.acm.recorder.a aVar2 = this.f55221e;
        com.moloco.sdk.acm.c cVar2 = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54160n.g());
        String strG2 = cVar.g();
        String lowerCase2 = this.f55220d.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        aVar2.b(cVar2.e(strG2, lowerCase2));
        AdLoad.Listener listener = this.f55217a;
        if (listener != null) {
            listener.onAdLoadSuccess(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.r0
    public void c(com.moloco.sdk.internal.d0 internalError, com.moloco.sdk.internal.ortb.model.z zVar) {
        String str;
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadFailed: " + internalError, null, false, 12, null);
        if (zVar != null && (str = zVar.getCom.ironsource.Df.b java.lang.String()) != null) {
            this.f55218b.a(str, System.currentTimeMillis(), internalError);
        }
        com.moloco.sdk.acm.recorder.a aVar = this.f55221e;
        com.moloco.sdk.acm.f fVarF = this.f55219c.f(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure");
        com.moloco.sdk.internal.client_metrics_data.c cVar = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
        com.moloco.sdk.acm.f fVarF2 = fVarF.f(cVar.g(), internalError.b().a());
        com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54175d;
        String strG = cVar2.g();
        String strName = this.f55220d.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        aVar.a(fVarF2.f(strG, lowerCase));
        com.moloco.sdk.acm.recorder.a aVar2 = this.f55221e;
        com.moloco.sdk.acm.c cVarE = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54161o.g()).e("network", internalError.a().getNetworkName()).e(cVar.g(), internalError.b().a());
        String strG2 = cVar2.g();
        String lowerCase2 = this.f55220d.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        aVar2.b(cVarE.e(strG2, lowerCase2));
        AdLoad.Listener listener = this.f55217a;
        if (listener != null) {
            listener.onAdLoadFailed(internalError.a());
        }
    }
}
