package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import hg.g0;
import hg.l0;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements l, k, t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f56695p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f56696q = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f56697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b f56698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f56699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f56700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f56701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineScope f56702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f56703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f56704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b f56705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a f56706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f56707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MutableStateFlow f56708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f56709n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a f56710o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56711r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f56712s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ boolean f56713t;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        public final Object c(boolean z10, boolean z11, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f56712s = z10;
            bVar.f56713t = z11;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56711r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f56712s && this.f56713t);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56716r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c0 f56718t;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56719r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f56720s;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(m mVar, Continuation continuation) {
                return ((a) create(mVar, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(continuation);
                aVar.f56720s = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f56719r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(((m) this.f56720s) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c0 c0Var, Continuation continuation) {
            super(2, continuation);
            this.f56718t = c0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new d(this.f56718t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56716r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                c.this.f56708m.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad show called, isAdDisplaying: " + ((Boolean) c.this.f56708m.getValue()).booleanValue(), null, false, 12, null);
                StateFlow unrecoverableError = c.this.y().getUnrecoverableError();
                a aVar = new a(null);
                this.f56716r = 1;
                obj = hg.i.y(unrecoverableError, aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            m mVar = (m) obj;
            if (mVar != null) {
                c0 c0Var = this.f56718t;
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad show error: " + mVar, null, false, 12, null);
                c0Var.a(mVar);
            }
            return Unit.f93236a;
        }
    }

    public c(Context context, final String adm, Set eventHandlers, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b clickthroughEventHandler, i contentLoadedHandler, h playListItemDisplayingEventHandler, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        Intrinsics.checkNotNullParameter(clickthroughEventHandler, "clickthroughEventHandler");
        Intrinsics.checkNotNullParameter(contentLoadedHandler, "contentLoadedHandler");
        Intrinsics.checkNotNullParameter(playListItemDisplayingEventHandler, "playListItemDisplayingEventHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f56697b = eventHandlers;
        this.f56698c = clickthroughEventHandler;
        this.f56699d = contentLoadedHandler;
        this.f56700e = playListItemDisplayingEventHandler;
        this.f56701f = metricsRecorder;
        this.f56702g = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        e eVar = new e(eventHandlers, metricsRecorder);
        this.f56703h = eVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b(context, contentLoadedHandler, playListItemDisplayingEventHandler, metricsRecorder, null, 16, null);
        bVar.addJavascriptInterface(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a(eVar), "AndroidTemplateBridge");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b bVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b(context, bVar, clickthroughEventHandler);
        this.f56704i = bVar2;
        bVar2.b();
        this.f56705j = bVar;
        this.f56706k = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.d(bVar, metricsRecorder);
        this.f56707l = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.k(adm, this);
            }
        });
        this.f56708m = l0.a(Boolean.FALSE);
        this.f56709n = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.q(this.f56694b);
            }
        });
        this.f56710o = s();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a k(String str, c cVar) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a(str, cVar.f56702g, cVar.f56705j);
    }

    public static final StateFlow q(c cVar) {
        return hg.i.T(hg.i.C(cVar.f56708m, cVar.f56705j.c(), new b(null)), cVar.f56702g, g0.f73226a.c(), Boolean.FALSE);
    }

    public final StateFlow A() {
        return this.f56705j.getOrientation$moloco_sdk_release();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad destroy called", null, false, 12, null);
        this.f56708m.setValue(Boolean.FALSE);
        this.f56704i.remove();
        this.f56705j.destroy();
        kotlinx.coroutines.i.f(this.f56702g, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public StateFlow isLoaded() {
        return this.f56710o.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void j(long j10, l.a aVar) {
        s().j(j10, new C0714c(aVar));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public StateFlow l() {
        return (StateFlow) this.f56709n.getValue();
    }

    public void p(c0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        eg.i.d(this.f56702g, null, null, new d(listener, null), 3, null);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a s() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a) this.f56707l.getValue();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a x() {
        return this.f56704i;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b y() {
        return this.f56705j;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a z() {
        return this.f56706k;
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c$c, reason: collision with other inner class name */
    public static final class C0714c implements l.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l.a f56715b;

        public C0714c(l.a aVar) {
            this.f56715b = aVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad load successful, start collecting playlist item displaying events", null, false, 12, null);
            c.this.y().d(c.this.x());
            l.a aVar = this.f56715b;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
        public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
            Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
            l.a aVar = this.f56715b;
            if (aVar != null) {
                aVar.b(timeoutError);
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
            Intrinsics.checkNotNullParameter(internalError, "internalError");
            l.a aVar = this.f56715b;
            if (aVar != null) {
                aVar.a(internalError);
            }
        }
    }
}
