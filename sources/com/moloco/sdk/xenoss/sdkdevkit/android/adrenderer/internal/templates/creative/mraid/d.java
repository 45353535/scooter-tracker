package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import android.graphics.Rect;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c0;
import eg.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f56771a;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56772r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f56774t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.f56774t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new a(this.f56774t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56772r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            d.this.f56771a.loadUrl("javascript:" + this.f56774t);
            return Unit.f93236a;
        }
    }

    public d(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f56771a = webView;
    }

    public final String b(Rect rect) {
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

    public void c(a0 placementType) {
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        k("mraidbridge.setPlacementType(" + JSONObject.quote(placementType.g()) + ')');
    }

    public void d(b0 screenMetrics) {
        Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
        k("\n                mraidbridge.setScreenSize(" + j(screenMetrics.i()) + ");\n                mraidbridge.setMaxSize(" + j(screenMetrics.h()) + ");\n                mraidbridge.setCurrentPosition(" + b(screenMetrics.d()) + ");\n                mraidbridge.setDefaultPosition(" + b(screenMetrics.g()) + ");\n                mraidbridge.notifySizeChangeEvent(" + j(screenMetrics.d()) + ");\n            ");
    }

    public void e(c0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        k("mraidbridge.setState(" + JSONObject.quote(state.g()) + ')');
    }

    public void f(String commandString) {
        Intrinsics.checkNotNullParameter(commandString, "commandString");
        k("mraidbridge.nativeCallComplete(" + JSONObject.quote(commandString) + ')');
    }

    public void g(String commandString, String msg) {
        Intrinsics.checkNotNullParameter(commandString, "commandString");
        Intrinsics.checkNotNullParameter(msg, "msg");
        k("mraidbridge.notifyErrorEvent(" + JSONObject.quote(commandString) + ", " + JSONObject.quote(msg) + ')');
    }

    public void h(boolean z10) {
        k("mraidbridge.setIsViewable(" + z10 + ')');
    }

    public void i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        k("mraidbridge.setSupports(" + z10 + ',' + z11 + ',' + z12 + ',' + z13 + ',' + z14 + ')');
    }

    public final String j(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.width());
        sb2.append(',');
        sb2.append(rect.height());
        return sb2.toString();
    }

    public final void k(String str) {
        i.d(kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain()), null, null, new a(str, null), 3, null);
    }
}
