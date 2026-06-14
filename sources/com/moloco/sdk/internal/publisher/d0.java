package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.moloco.sdk.internal.ortb.model.C4727d;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends Banner implements i0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f54705x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f54706y = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f54707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.q f54708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f54709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f54711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 f54712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function8 f54713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 f54714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f54715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.internal.a f54716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.moloco.sdk.internal.n f54717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.c0 f54718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f54719n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.moloco.sdk.acm.f f54720o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.moloco.sdk.acm.f f54721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CoroutineScope f54722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f54723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r f54724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.moloco.sdk.internal.publisher.b f54725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public BannerAdShowListener f54726u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AdLoad f54727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f54728w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.y implements Function1 {
        public b(Object obj) {
            super(1, obj, n.class, "calculateTimeout", "calculateTimeout-5sfh64U(J)J", 0);
        }

        public final long a(long j10) {
            return ((n) this.receiver).a(j10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return kotlin.time.b.g(a(((Number) obj).longValue()));
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.y implements Function1 {
        public c(Object obj) {
            super(1, obj, d0.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l invoke(com.moloco.sdk.internal.ortb.model.e p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return ((d0) this.receiver).c(p02);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54729r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f54730s;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        public final Object c(boolean z10, Continuation continuation) {
            return ((d) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.f54730s = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54729r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(!this.f54730s);
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54731r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f54732s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ x f54734u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(x xVar, Continuation continuation) {
            super(2, continuation);
            this.f54734u = xVar;
        }

        public final Object c(boolean z10, Continuation continuation) {
            return ((e) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = d0.this.new e(this.f54734u, continuation);
            eVar.f54732s = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54731r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            if (this.f54732s) {
                com.moloco.sdk.acm.f fVar = d0.this.f54721p;
                if (fVar != null) {
                    com.moloco.sdk.acm.recorder.a aVar = d0.this.f54719n;
                    String strG = com.moloco.sdk.internal.client_metrics_data.c.f54175d.g();
                    String lowerCase = "BANNER".toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    aVar.a(fVar.f(strG, lowerCase));
                }
                com.moloco.sdk.internal.publisher.b bVar = d0.this.f54725t;
                if (bVar != null) {
                    bVar.onAdShowSuccess(MolocoAdKt.createAdInfo$default(d0.this.f54710e, null, null, 6, null));
                }
            } else {
                com.moloco.sdk.internal.publisher.b bVar2 = d0.this.f54725t;
                if (bVar2 != null) {
                    bVar2.onAdHidden(MolocoAdKt.createAdInfo$default(d0.this.f54710e, null, null, 6, null));
                }
                Job jobA = this.f54734u.a();
                if (jobA != null) {
                    Job.a.a(jobA, null, 1, null);
                }
            }
            return Unit.f93236a;
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54735r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f54737t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f54738u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, AdLoad.Listener listener, Continuation continuation) {
            super(2, continuation);
            this.f54737t = str;
            this.f54738u = listener;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return d0.this.new f(this.f54737t, this.f54738u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54735r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            d0.this.f54727v.load(this.f54737t, this.f54738u);
            return Unit.f93236a;
        }
    }

    public static final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54739r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SharedFlow f54740s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d0 f54741t;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f54742b;

            public a(d0 d0Var) {
                this.f54742b = d0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Unit unit, Continuation continuation) {
                this.f54742b.f54728w.a();
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SharedFlow sharedFlow, d0 d0Var, Continuation continuation) {
            super(2, continuation);
            this.f54740s = sharedFlow;
            this.f54741t = d0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f54740s, this.f54741t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f54739r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                SharedFlow sharedFlow = this.f54740s;
                a aVar = new a(this.f54741t);
                this.f54739r = 1;
                if (sharedFlow.collect(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            throw new lf.g();
        }
    }

    public static final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54743r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MotionEvent f54744s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m0 f54745t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ d0 f54746u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ MutableSharedFlow f54747v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MotionEvent motionEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m0 m0Var, d0 d0Var, MutableSharedFlow mutableSharedFlow, Continuation continuation) {
            super(2, continuation);
            this.f54744s = motionEvent;
            this.f54745t = m0Var;
            this.f54746u = d0Var;
            this.f54747v = mutableSharedFlow;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f54744s, this.f54745t, this.f54746u, this.f54747v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f54743r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MotionEvent motionEvent = this.f54744s;
                if (motionEvent != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m0 m0Var = this.f54745t;
                    d0 d0Var = this.f54746u;
                    MutableSharedFlow mutableSharedFlow = this.f54747v;
                    com.moloco.sdk.internal.services.c0 c0Var = d0Var.f54718m;
                    String strJ = d0Var.f54723r.j();
                    String strK = d0Var.f54723r.k();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r rVar = d0Var.f54724s;
                    this.f54743r = 1;
                    if (m0Var.a(motionEvent, c0Var, strJ, strK, rVar, mutableSharedFlow, (64 & 64) != 0 ? com.moloco.sdk.internal.l0.b() : null, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public static final class i implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 {
        public i() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0
        public void a(boolean z10) {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            d0 d0Var = d0.this;
            d0Var.i(com.moloco.sdk.internal.e0.a(d0Var.f54710e, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
        public void a() {
            com.moloco.sdk.internal.publisher.b bVar = d0.this.f54725t;
            if (bVar != null) {
                bVar.onAdClicked(MolocoAdKt.createAdInfo$default(d0.this.f54710e, null, null, 6, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, com.moloco.sdk.internal.services.q appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adUnitId, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 externalLinkHandler, Function8 createXenossBannerView, Function1 createXenossBannerAdShowListener, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, n adCreateLoadTimeoutManager, com.moloco.sdk.internal.a viewLifecycleOwner, com.moloco.sdk.internal.n bannerSize, com.moloco.sdk.internal.services.c0 clickthroughService, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(createXenossBannerView, "createXenossBannerView");
        Intrinsics.checkNotNullParameter(createXenossBannerAdShowListener, "createXenossBannerAdShowListener");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f54707b = context;
        this.f54708c = appLifecycleTrackerService;
        this.f54709d = customUserEventBuilderService;
        this.f54710e = adUnitId;
        this.f54711f = z10;
        this.f54712g = externalLinkHandler;
        this.f54713h = createXenossBannerView;
        this.f54714i = watermark;
        this.f54715j = adCreateLoadTimeoutManager;
        this.f54716k = viewLifecycleOwner;
        this.f54717l = bannerSize;
        this.f54718m = clickthroughService;
        this.f54719n = metricsRecorder;
        com.moloco.sdk.acm.f fVarC = metricsRecorder.c(com.moloco.sdk.internal.client_metrics_data.d.f54198r.g());
        String strG = com.moloco.sdk.internal.client_metrics_data.c.f54175d.g();
        String lowerCase = "BANNER".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f54720o = fVarC.f(strG, lowerCase);
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f54722q = coroutineScopeA;
        this.f54723r = new x(null, null, null, null, null, null, false, 127, null);
        this.f54724s = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a();
        this.f54727v = r.a(coroutineScopeA, new b(adCreateLoadTimeoutManager), adUnitId, new c(this), AdFormatType.BANNER, b.a.f55792a.b(), metricsRecorder);
        this.f54728w = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0) createXenossBannerAdShowListener.invoke(new i());
    }

    public static final Unit e(d0 d0Var, a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        d0Var.f54724s.m(button);
        return Unit.f93236a;
    }

    public static /* synthetic */ void h(d0 d0Var, com.moloco.sdk.internal.d0 d0Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d0Var2 = null;
        }
        d0Var.i(d0Var2);
    }

    public static final boolean k(d0 d0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m0 m0Var, MutableSharedFlow mutableSharedFlow, View view, MotionEvent motionEvent) {
        eg.i.d(d0Var.f54722q, null, null, new h(motionEvent, m0Var, d0Var, mutableSharedFlow, null), 3, null);
        return false;
    }

    public static final com.moloco.sdk.internal.ortb.model.z t(d0 d0Var) {
        return d0Var.f54723r.l();
    }

    public static final w u(d0 d0Var) {
        return d0Var.f54723r.h();
    }

    public final com.moloco.sdk.internal.publisher.b a(BannerAdShowListener bannerAdShowListener) {
        return new com.moloco.sdk.internal.publisher.b(bannerAdShowListener, this.f54708c, this.f54709d, new Function0() { // from class: com.moloco.sdk.internal.publisher.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.t(this.f55251b);
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.publisher.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.u(this.f54691b);
            }
        }, AdFormatType.BANNER, this.f54719n);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l c(com.moloco.sdk.internal.ortb.model.e eVar) {
        C4727d bannerClickMetaData;
        C4727d bannerClickMetaData2;
        h(this, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j) this.f54713h.invoke(this.f54707b, this.f54709d, eVar, this.f54712g, this.f54714i, this.f54716k, this.f54718m, this.f54724s);
        x xVar = this.f54723r;
        xVar.d(jVar);
        xVar.b(eVar.getExt().getSdkEvents());
        xVar.c(eVar.getBurl() != null ? new w(eVar.getBurl(), Float.valueOf(eVar.getPrice())) : null);
        com.moloco.sdk.internal.ortb.model.u molocoSdkClickMetaData = eVar.getExt().getMolocoSdkClickMetaData();
        xVar.i((molocoSdkClickMetaData == null || (bannerClickMetaData2 = molocoSdkClickMetaData.getBannerClickMetaData()) == null) ? null : bannerClickMetaData2.getClickThrough());
        com.moloco.sdk.internal.ortb.model.u molocoSdkClickMetaData2 = eVar.getExt().getMolocoSdkClickMetaData();
        xVar.e((molocoSdkClickMetaData2 == null || (bannerClickMetaData = molocoSdkClickMetaData2.getBannerClickMetaData()) == null) ? null : bannerClickMetaData.getClickTracking());
        com.moloco.sdk.internal.ortb.model.u molocoSdkClickMetaData3 = eVar.getExt().getMolocoSdkClickMetaData();
        xVar.g((molocoSdkClickMetaData3 != null ? molocoSdkClickMetaData3.getBannerClickMetaData() : null) != null);
        jVar.setAdShowListener(this.f54728w);
        j(jVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.moloco.sdk.internal.o.a(this.f54717l.b()), com.moloco.sdk.internal.o.a(this.f54717l.a()));
        layoutParams.gravity = 1;
        addView(jVar, layoutParams);
        if (this.f54723r.n()) {
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m0 m0Var = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m0(this.f54707b);
            final MutableSharedFlow mutableSharedFlowB = hg.c0.b(0, 0, null, 7, null);
            eg.i.d(this.f54722q, null, null, new g(mutableSharedFlowB, this, null), 3, null);
            m0Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.moloco.sdk.internal.publisher.b0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return d0.k(this.f54694b, m0Var, mutableSharedFlowB, view, motionEvent);
                }
            });
            addView(m0Var, new FrameLayout.LayoutParams(-1, com.moloco.sdk.internal.o.a(this.f54717l.a())));
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i(this.f54712g, this.f54707b, null, 0, 12, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388691;
        iVar.setPadding(12, 0, 0, 12);
        iVar.setPrivacyUrl("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
        iVar.setOnButtonRenderedListener(new Function1() { // from class: com.moloco.sdk.internal.publisher.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d0.e(this.f54703b, (a.AbstractC0780a.c) obj);
            }
        });
        iVar.setLayoutParams(layoutParams2);
        addView(iVar);
        return jVar;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        kotlinx.coroutines.i.f(this.f54722q, null, 1, null);
        h(this, null, 1, null);
        setAdShowListener(null);
        this.f54725t = null;
    }

    public final StateFlow f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar) {
        return (this.f54711f || jVar == null) ? getIsViewShown() : jVar.l();
    }

    @Override // com.moloco.sdk.publisher.Banner
    @Nullable
    public BannerAdShowListener getAdShowListener() {
        return this.f54726u;
    }

    public long getCreateAdObjectStartTime() {
        return this.f54715j.b();
    }

    public final void i(com.moloco.sdk.internal.d0 d0Var) {
        com.moloco.sdk.internal.publisher.b bVar;
        com.moloco.sdk.internal.publisher.b bVar2;
        x xVar = this.f54723r;
        Job jobA = xVar.a();
        if (jobA != null) {
            Job.a.a(jobA, null, 1, null);
        }
        xVar.f(null);
        boolean zBooleanValue = ((Boolean) f(this.f54723r.m()).getValue()).booleanValue();
        x xVar2 = this.f54723r;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVarM = xVar2.m();
        if (jVarM != null) {
            jVarM.destroy();
        }
        xVar2.d(null);
        if (d0Var != null && (bVar2 = this.f54725t) != null) {
            bVar2.a(d0Var);
        }
        if (zBooleanValue && (bVar = this.f54725t) != null) {
            bVar.onAdHidden(MolocoAdKt.createAdInfo$default(this.f54710e, null, null, 6, null));
        }
        this.f54723r.b(null);
        this.f54723r.c(null);
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f54727v.isLoaded();
    }

    public final void j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar) {
        x xVar = this.f54723r;
        Job jobA = xVar.a();
        if (jobA != null) {
            Job.a.a(jobA, null, 1, null);
        }
        xVar.f(hg.i.F(hg.i.K(hg.i.r(f(this.f54723r.m()), new d(null)), new e(xVar, null)), this.f54722q));
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.f54719n.a(this.f54720o);
        this.f54721p = this.f54719n.c(com.moloco.sdk.internal.client_metrics_data.d.f54197q.g());
        eg.i.d(this.f54722q, null, null, new f(bidResponseJson, listener, null), 3, null);
    }

    @Override // com.moloco.sdk.publisher.Banner
    public void setAdShowListener(@Nullable BannerAdShowListener bannerAdShowListener) {
        com.moloco.sdk.internal.publisher.b bVarA = a(bannerAdShowListener);
        this.f54725t = bVarA;
        this.f54726u = bVarA.b();
    }

    @Override // com.moloco.sdk.internal.publisher.i0
    public void setCreateAdObjectStartTime(long j10) {
        this.f54715j.setCreateAdObjectStartTime(j10);
    }
}
