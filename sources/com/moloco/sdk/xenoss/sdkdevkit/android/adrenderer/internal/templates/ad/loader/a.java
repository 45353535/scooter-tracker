package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import eg.i;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0715a f56721g = new C0715a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f56722h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f56724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b f56725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableStateFlow f56726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateFlow f56727f;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a$a, reason: collision with other inner class name */
    public static final class C0715a {
        public /* synthetic */ C0715a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0715a() {
        }
    }

    public static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56728r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f56730t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l.a f56731u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, l.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f56730t = j10;
            this.f56731u = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new b(this.f56730t, this.f56731u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56728r;
            if (i10 == 0) {
                d.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVarA = a.this.a();
                String str = a.this.f56723b;
                long j10 = this.f56730t;
                this.f56728r = 1;
                obj = bVarA.b(str, j10, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            h0 h0Var = (h0) obj;
            if (h0Var instanceof h0.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewAdLoad", "WebViewAdLoad: load success", null, false, 12, null);
                a.this.f56726e.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                l.a aVar = this.f56731u;
                if (aVar != null) {
                    aVar.a();
                }
            } else {
                if (!(h0Var instanceof h0.a)) {
                    throw new m();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewAdLoad", "WebViewAdLoad: load failure", null, false, 12, null);
                a.this.f56726e.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                l.a aVar2 = this.f56731u;
                if (aVar2 != null) {
                    aVar2.a((c) ((h0.a) h0Var).a());
                }
            }
            return Unit.f93236a;
        }
    }

    public a(String adm, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b webView) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f56723b = adm;
        this.f56724c = scope;
        this.f56725d = webView;
        MutableStateFlow mutableStateFlowA = l0.a(Boolean.FALSE);
        this.f56726e = mutableStateFlowA;
        this.f56727f = mutableStateFlowA;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b a() {
        return this.f56725d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public StateFlow isLoaded() {
        return this.f56727f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void j(long j10, l.a aVar) {
        i.d(this.f56724c, null, null, new b(j10, aVar, null), 3, null);
    }
}
