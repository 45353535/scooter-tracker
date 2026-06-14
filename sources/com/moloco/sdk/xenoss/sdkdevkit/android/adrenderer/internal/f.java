package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f56097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 f56098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f56099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f56100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CoroutineScope f56101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.s f56102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f56103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Lazy f56104o;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56105r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f56106s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ boolean f56107t;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        public final Object c(boolean z10, boolean z11, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f56106s = z10;
            aVar.f56107t = z11;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56105r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f56106s && this.f56107t);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56108r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56109s;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56111r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ f f56112s;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f$b$a$a, reason: collision with other inner class name */
            public static final class C0692a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56113r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public /* synthetic */ Object f56114s;

                public C0692a(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, Continuation continuation) {
                    return ((C0692a) create(gVar, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    C0692a c0692a = new C0692a(continuation);
                    c0692a.f56114s = obj;
                    return c0692a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.f56113r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.f56114s) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, Continuation continuation) {
                super(2, continuation);
                this.f56112s = fVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f56112s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n adShowListener;
                Object objG = pf.b.g();
                int i10 = this.f56111r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    StateFlow unrecoverableError = this.f56112s.f56099j.getUnrecoverableError();
                    C0692a c0692a = new C0692a(null);
                    this.f56111r = 1;
                    obj = hg.i.y(unrecoverableError, c0692a, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
                if (gVar != null && (adShowListener = this.f56112s.getAdShowListener()) != null) {
                    adShowListener.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.a(gVar));
                }
                return Unit.f93236a;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f$b$b, reason: collision with other inner class name */
        public static final class C0693b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56115r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ f f56116s;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f$b$b$a */
            public static final class a implements FlowCollector {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f56117b;

                public a(f fVar) {
                    this.f56117b = fVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n adShowListener = this.f56117b.getAdShowListener();
                    if (adShowListener != null) {
                        adShowListener.a();
                    }
                    return Unit.f93236a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0693b(f fVar, Continuation continuation) {
                super(2, continuation);
                this.f56116s = fVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0693b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0693b(this.f56116s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f56115r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    SharedFlow clickthroughEvent = this.f56116s.f56099j.getClickthroughEvent();
                    a aVar = new a(this.f56116s);
                    this.f56115r = 1;
                    if (clickthroughEvent.collect(aVar, this) == objG) {
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

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = f.this.new b(continuation);
            bVar.f56109s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56108r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f56109s;
            eg.i.d(coroutineScope, null, null, new a(f.this, null), 3, null);
            eg.i.d(coroutineScope, null, null, new C0693b(f.this, null), 3, null);
            f fVar = f.this;
            FrameLayout frameLayoutA = fVar.f56102m.a(f.this.f56097h, f.this.f56099j);
            f.this.getWatermark().a(frameLayoutA);
            fVar.setAdView(frameLayoutA);
            return Unit.f93236a;
        }
    }

    public /* synthetic */ f(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, d dVar, CoroutineScope coroutineScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.s sVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, g0Var, aVar, dVar, coroutineScope, (i10 & 32) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.s() : sVar);
    }

    public static final StateFlow t(f fVar) {
        return hg.i.T(hg.i.C(super.l(), fVar.f56099j.c(), new a(null)), fVar.f56101l, hg.g0.f73226a.c(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        super.destroy();
        this.f56099j.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r getCreativeType() {
        return this.f56103n;
    }

    @VisibleForTesting
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 getWatermark() {
        return this.f56098i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public StateFlow l() {
        return (StateFlow) this.f56104o.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public void p() {
        eg.g.c(this.f56101l, kotlin.coroutines.e.f93267b, eg.f0.f69146b, new b(null));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public d getAdLoader() {
        return this.f56100k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a staticWebView, d adLoader, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.s webViewWrapper) {
        super(context, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(staticWebView, "staticWebView");
        Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(webViewWrapper, "webViewWrapper");
        this.f56097h = context;
        this.f56098i = watermark;
        this.f56099j = staticWebView;
        this.f56100k = adLoader;
        this.f56101l = scope;
        this.f56102m = webViewWrapper;
        setTag("MolocoStaticBannerView");
        this.f56103n = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58896d;
        this.f56104o = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.t(this.f55990b);
            }
        });
    }
}
