package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.i0;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class t0 implements s0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f55222k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f55223l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdShowListener f55224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.q f55225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f55226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f55227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f55228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.internal.i0 f55229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.j f55230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AdFormatType f55231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f55232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.internal.client_metrics_data.a f55233j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55234r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f55236t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ w f55237u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, w wVar, Continuation continuation) {
            super(2, continuation);
            this.f55236t = j10;
            this.f55237u = wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return t0.this.new b(this.f55236t, this.f55237u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Object objG = pf.b.g();
            int i10 = this.f55234r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = t0.this.f55226c;
                long j10 = this.f55236t;
                a.AbstractC0780a.e eVar = a.AbstractC0780a.e.f58925a;
                String strA = this.f55237u.a();
                this.f55234r = 1;
                bVar = this;
                obj = aVar.a(j10, eVar, strA, bVar);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                bVar = this;
            }
            t0.this.f55230g.a((String) obj);
            return Unit.f93236a;
        }
    }

    public t0(AdShowListener adShowListener, com.moloco.sdk.internal.services.q appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, Function0 provideSdkEvents, Function0 provideBUrlData, com.moloco.sdk.internal.i0 sdkEventUrlTracker, com.moloco.sdk.internal.j bUrlTracker, AdFormatType adType, com.moloco.sdk.acm.recorder.a metricsRecorder, com.moloco.sdk.internal.client_metrics_data.a acmClickDeduper) {
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        Intrinsics.checkNotNullParameter(bUrlTracker, "bUrlTracker");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(acmClickDeduper, "acmClickDeduper");
        this.f55224a = adShowListener;
        this.f55225b = appLifecycleTrackerService;
        this.f55226c = customUserEventBuilderService;
        this.f55227d = provideSdkEvents;
        this.f55228e = provideBUrlData;
        this.f55229f = sdkEventUrlTracker;
        this.f55230g = bUrlTracker;
        this.f55231h = adType;
        this.f55232i = metricsRecorder;
        this.f55233j = acmClickDeduper;
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void a(com.moloco.sdk.internal.d0 internalError) {
        String str;
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdShowFailed: " + internalError, false, 4, null);
        com.moloco.sdk.internal.ortb.model.z zVar = (com.moloco.sdk.internal.ortb.model.z) this.f55227d.invoke();
        if (zVar != null && (str = zVar.getCom.ironsource.Df.e java.lang.String()) != null) {
            this.f55229f.a(str, System.currentTimeMillis(), internalError);
        }
        com.moloco.sdk.acm.recorder.a aVar = this.f55232i;
        com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.E.g());
        String strG = com.moloco.sdk.internal.client_metrics_data.c.f54175d.g();
        String lowerCase = this.f55231h.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        aVar.b(cVar.e(strG, lowerCase).e(com.moloco.sdk.internal.client_metrics_data.c.f54174c.g(), String.valueOf(internalError.a().getErrorType())));
        AdShowListener adShowListener = this.f55224a;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(internalError.a());
        }
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void onAdClicked(MolocoAd molocoAd) {
        String onAdClicked;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdClicked: " + molocoAd, false, 4, null);
        this.f55225b.b();
        com.moloco.sdk.internal.ortb.model.z zVar = (com.moloco.sdk.internal.ortb.model.z) this.f55227d.invoke();
        if (zVar != null && (onAdClicked = zVar.getOnAdClicked()) != null) {
            i0.a.a(this.f55229f, onAdClicked, System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.acm.recorder.a aVar = this.f55232i;
        com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.F.g());
        String strG = com.moloco.sdk.internal.client_metrics_data.c.f54175d.g();
        String lowerCase = this.f55231h.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        aVar.b(cVar.e(strG, lowerCase));
        this.f55233j.b(this.f55231h);
        AdShowListener adShowListener = this.f55224a;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void onAdHidden(MolocoAd molocoAd) {
        String onAdHidden;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdHidden: " + molocoAd, false, 4, null);
        com.moloco.sdk.internal.ortb.model.z zVar = (com.moloco.sdk.internal.ortb.model.z) this.f55227d.invoke();
        if (zVar != null && (onAdHidden = zVar.getOnAdHidden()) != null) {
            i0.a.a(this.f55229f, onAdHidden, System.currentTimeMillis(), null, 4, null);
        }
        AdShowListener adShowListener = this.f55224a;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.s0
    public void onAdShowSuccess(MolocoAd molocoAd) {
        t0 t0Var;
        String onAdShowSuccess;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdShowSuccess: " + molocoAd, false, 4, null);
        com.moloco.sdk.internal.ortb.model.z zVar = (com.moloco.sdk.internal.ortb.model.z) this.f55227d.invoke();
        if (zVar != null && (onAdShowSuccess = zVar.getOnAdShowSuccess()) != null) {
            i0.a.a(this.f55229f, onAdShowSuccess, System.currentTimeMillis(), null, 4, null);
        }
        this.f55233j.a();
        w wVar = (w) this.f55228e.invoke();
        if (wVar != null) {
            t0Var = this;
            eg.i.d(com.moloco.sdk.internal.scheduling.d.f55261a.a(), null, null, t0Var.new b(System.currentTimeMillis(), wVar, null), 3, null);
        } else {
            t0Var = this;
        }
        com.moloco.sdk.acm.recorder.a aVar = t0Var.f55232i;
        com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.D.g());
        String strG = com.moloco.sdk.internal.client_metrics_data.c.f54175d.g();
        String lowerCase = t0Var.f55231h.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        aVar.b(cVar.e(strG, lowerCase));
        AdShowListener adShowListener = t0Var.f55224a;
        if (adShowListener != null) {
            adShowListener.onAdShowSuccess(molocoAd);
        }
    }
}
