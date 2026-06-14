package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import hg.i;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends WebViewClientCompat implements q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f56668n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f56669o = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f56670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f56671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f56672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableStateFlow f56673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateFlow f56674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f56675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StateFlow f56676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f56677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StateFlow f56678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final MutableSharedFlow f56679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SharedFlow f56680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a f56681m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b$b, reason: collision with other inner class name */
    public static final class C0713b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56682r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f56684t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a f56685u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0713b(String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f56684t = str;
            this.f56685u = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0713b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new C0713b(this.f56684t, this.f56685u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56682r;
            if (i10 == 0) {
                d.b(obj);
                c0 c0Var = b.this.f56671c;
                String str = this.f56684t;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar = this.f56685u;
                r rVarL = b.this.l();
                MutableSharedFlow mutableSharedFlow = b.this.f56679k;
                this.f56682r = 1;
                if (c0Var.a(str, aVar, rVarL, mutableSharedFlow, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public b(CoroutineScope scope, c0 clickthroughService, r buttonTracker) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.f56670b = scope;
        this.f56671c = clickthroughService;
        this.f56672d = buttonTracker;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow mutableStateFlowA = l0.a(bool);
        this.f56673e = mutableStateFlowA;
        this.f56674f = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = l0.a(bool);
        this.f56675g = mutableStateFlowA2;
        this.f56676h = i.c(mutableStateFlowA2);
        MutableStateFlow mutableStateFlowA3 = l0.a(null);
        this.f56677i = mutableStateFlowA3;
        this.f56678j = i.c(mutableStateFlowA3);
        MutableSharedFlow mutableSharedFlowB = hg.c0.b(0, 0, null, 7, null);
        this.f56679k = mutableSharedFlowB;
        this.f56680l = mutableSharedFlowB;
    }

    public final void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a adTouch) {
        Intrinsics.checkNotNullParameter(adTouch, "adTouch");
        this.f56681m = adTouch;
    }

    public final void f() {
        this.f56673e.setValue(Boolean.TRUE);
    }

    public final r l() {
        return this.f56672d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void m(a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f56672d.m(button);
    }

    public final SharedFlow o() {
        return this.f56680l;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        MutableStateFlow mutableStateFlow = this.f56673e;
        Boolean bool = Boolean.TRUE;
        mutableStateFlow.setValue(bool);
        this.f56675g.setValue(bool);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f56677i.setValue(g.f56049d);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebViewClientImpl", "onReceivedError " + str, null, false, 12, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f56677i.setValue(g.f56050e);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebViewClientImpl", "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void p(a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f56672d.p(buttonType);
    }

    public final StateFlow s() {
        return this.f56678j;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar;
        if (str == null || (aVar = this.f56681m) == null) {
            return true;
        }
        eg.i.d(this.f56670b, null, null, new C0713b(str, aVar, null), 3, null);
        return true;
    }

    public final StateFlow u() {
        return this.f56674f;
    }

    public final StateFlow v() {
        return this.f56676h;
    }
}
