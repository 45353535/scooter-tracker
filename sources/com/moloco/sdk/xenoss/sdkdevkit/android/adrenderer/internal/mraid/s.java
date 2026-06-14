package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f56494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f56495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f56496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WebView f56497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n f56498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f f56499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MutableSharedFlow f56500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SharedFlow f56501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StateFlow f56502j;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56503r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ t f56505t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, Continuation continuation) {
            super(2, continuation);
            this.f56505t = tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return s.this.new a(this.f56505t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56503r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutableSharedFlow mutableSharedFlow = s.this.f56500h;
                t tVar = this.f56505t;
                this.f56503r = 1;
                if (mutableSharedFlow.emit(tVar, this) == objG) {
                    return objG;
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

    public static final class b implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f56506b;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f56507b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s$b$a$a, reason: collision with other inner class name */
            public static final class C0702a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f56508r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public int f56509s;

                public C0702a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f56508r = obj;
                    this.f56509s |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f56507b = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s.b.a.C0702a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s.b.a.C0702a) r0
                    int r1 = r0.f56509s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f56509s = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f56508r
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f56509s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.d.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.d.b(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f56507b
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w) r5
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.f
                    if (r2 == 0) goto L3f
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w$f r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.f) r5
                    goto L40
                L3f:
                    r5 = 0
                L40:
                    if (r5 == 0) goto L4b
                    r0.f56509s = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.Unit r5 = kotlin.Unit.f93236a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(Flow flow) {
            this.f56506b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f56506b.collect(new a(flowCollector), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    public /* synthetic */ s(boolean z10, Function0 function0, CoroutineScope coroutineScope, int i10, WebView webView, SharedFlow sharedFlow, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, function0, coroutineScope, i10, webView, sharedFlow, nVar);
    }

    public static final Unit C() {
        return Unit.f93236a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q
    public void B() {
        q(t.f56511b);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVarM = m();
        if (nVarM != null) {
            nVarM.c("");
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.f56494b;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q
    public WebView c() {
        return this.f56497e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        this.f56495c.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q
    public StateFlow e() {
        return this.f56502j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q
    public void g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVar) {
        this.f56498f = nVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void k(a.AbstractC0780a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        q(t.f56512c);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow l() {
        return this.f56499g.l();
    }

    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n m() {
        return this.f56498f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public SharedFlow a() {
        return this.f56501i;
    }

    public final Job q(t tVar) {
        return eg.i.d(this.f56496d, null, null, new a(tVar, null), 3, null);
    }

    public s(boolean z10, Function0 closeFullscreenAdRepresentation, CoroutineScope scope, int i10, WebView webView, SharedFlow mraidJsCommands, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVar) {
        Intrinsics.checkNotNullParameter(closeFullscreenAdRepresentation, "closeFullscreenAdRepresentation");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(mraidJsCommands, "mraidJsCommands");
        this.f56494b = z10;
        this.f56495c = closeFullscreenAdRepresentation;
        this.f56496d = scope;
        this.f56497e = webView;
        this.f56498f = nVar;
        this.f56499g = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h.a(i10, scope);
        MutableSharedFlow mutableSharedFlowB = hg.c0.b(0, 0, null, 7, null);
        this.f56500h = mutableSharedFlowB;
        this.f56501i = mutableSharedFlowB;
        this.f56502j = hg.i.T(new b(mraidJsCommands), scope, hg.g0.f73226a.c(), null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q
    public void c(String clickThroughUrl, a.AbstractC0780a.f position) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(position, "position");
        k(position);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVarM = m();
        if (nVarM != null) {
            nVarM.a(clickThroughUrl);
        }
    }

    public /* synthetic */ s(boolean z10, Function0 function0, CoroutineScope coroutineScope, int i10, WebView webView, SharedFlow sharedFlow, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i11 & 2) != 0 ? new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.C();
            }
        } : function0, coroutineScope, i10, webView, sharedFlow, (i11 & 64) != 0 ? null : nVar, null);
    }
}
