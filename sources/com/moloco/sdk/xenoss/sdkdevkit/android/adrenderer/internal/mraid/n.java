package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.webkit.WebView;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f56481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f56482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableSharedFlow f56483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SharedFlow f56484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f56485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WebView f56486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StateFlow f56487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final StateFlow f56488i;

    public static final class a implements x {
        public a() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.x
        public boolean a(String fromUrl) {
            Intrinsics.checkNotNullParameter(fromUrl, "fromUrl");
            return n.this.s(fromUrl);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f56490r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f56491s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ h0 f56492t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ n f56493u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h0 h0Var, n nVar, Continuation continuation) {
            super(2, continuation);
            this.f56492t = h0Var;
            this.f56493u = nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f56492t, this.f56493u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            w wVar;
            Object objG = pf.b.g();
            int i10 = this.f56491s;
            if (i10 == 0) {
                kotlin.d.b(obj);
                w wVar2 = (w) ((h0.b) this.f56492t).a();
                MutableSharedFlow mutableSharedFlow = this.f56493u.f56483d;
                this.f56490r = wVar2;
                this.f56491s = 1;
                if (mutableSharedFlow.emit(wVar2, this) == objG) {
                    return objG;
                }
                wVar = wVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = (w) this.f56490r;
                kotlin.d.b(obj);
            }
            this.f56493u.p(wVar);
            return Unit.f93236a;
        }
    }

    public n(Context context, CoroutineScope scope, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f56481b = z10;
        this.f56482c = kotlinx.coroutines.i.j(scope, com.moloco.sdk.internal.scheduling.c.a().getMain());
        MutableSharedFlow mutableSharedFlowB = hg.c0.b(0, 0, null, 7, null);
        this.f56483d = mutableSharedFlowB;
        this.f56484e = mutableSharedFlowB;
        f0 f0Var = new f0(context, new a());
        this.f56485f = f0Var;
        this.f56486g = f0Var;
        this.f56487h = f0Var.c();
        this.f56488i = f0Var.getUnrecoverableError();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m
    public void a(boolean z10) {
        t("mraidbridge.setIsViewable(" + z10 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m
    public WebView c() {
        return this.f56486g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m
    public void d(a0 placementType) {
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        t("mraidbridge.setPlacementType(" + JSONObject.quote(placementType.g()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        this.f56485f.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m
    public void f(b0 screenMetrics) {
        Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
        t("\n                mraidbridge.setScreenSize(" + r(screenMetrics.i()) + ");\n                mraidbridge.setMaxSize(" + r(screenMetrics.h()) + ");\n                mraidbridge.setCurrentPosition(" + j(screenMetrics.d()) + ");\n                mraidbridge.setDefaultPosition(" + j(screenMetrics.g()) + ")\n            ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mraidbridge.notifySizeChangeEvent(");
        sb2.append(r(screenMetrics.d()));
        sb2.append(')');
        t(sb2.toString());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m
    public void h(c0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        t("mraidbridge.setState(" + JSONObject.quote(state.g()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m
    public void j() {
        t("mraidbridge.notifyReadyEvent()");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m
    public void l(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        t("mraidbridge.setSupports(" + z10 + ',' + z11 + ',' + z12 + ',' + z13 + ',' + z14 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m
    public void o(w command, String msg) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(msg, "msg");
        t("mraidbridge.notifyErrorEvent(" + JSONObject.quote(command.b()) + ", " + JSONObject.quote(msg) + ')');
    }

    public final void p(w wVar) {
        t("mraidbridge.nativeCallComplete(" + JSONObject.quote(wVar.b()) + ')');
    }

    public final String r(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.width());
        sb2.append(',');
        sb2.append(rect.height());
        return sb2.toString();
    }

    public final boolean s(String str) {
        h0 h0VarA = w.f56525b.a(str);
        if (h0VarA instanceof h0.b) {
            eg.i.d(this.f56482c, null, null, new b(h0VarA, this, null), 3, null);
            return true;
        }
        if (h0VarA instanceof h0.a) {
            return ((w.b.a) ((h0.a) h0VarA).a()).a();
        }
        throw new lf.m();
    }

    public final void t(String str) {
        this.f56485f.loadUrl("javascript:" + str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m
    public SharedFlow v() {
        return this.f56484e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m
    public StateFlow w() {
        return this.f56488i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m
    public Object a(String str, Continuation continuation) {
        return this.f56485f.b(str, this.f56481b, continuation);
    }

    public final String j(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.left);
        sb2.append(',');
        sb2.append(rect.top);
        sb2.append(',');
        sb2.append(rect.width());
        sb2.append(',');
        sb2.append(rect.height());
        return sb2.toString();
    }
}
