package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.widget.FrameLayout;
import com.moloco.sdk.service_locator.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b1 extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f55919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 f55920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.s f55921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f55922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v f55923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f55924m;

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function1 {
        public a(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v) this.receiver).e0(continuation);
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.y implements Function0 {
        public b(Object obj) {
            super(0, obj, b1.class, "detachMraidViewFromAdViewWrapper", "detachMraidViewFromAdViewWrapper()V", 0);
        }

        public final void a() {
            ((b1) this.receiver).y();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.y implements Function0 {
        public c(Object obj) {
            super(0, obj, b1.class, "attachMraidViewToAdViewWrapper", "attachMraidViewToAdViewWrapper()V", 0);
        }

        public final void a() {
            ((b1) this.receiver).x();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public /* synthetic */ b1(Context context, String str, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.s sVar, CoroutineScope coroutineScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, t0Var, g0Var, (i10 & 16) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.s() : sVar, coroutineScope);
    }

    public static final Unit q(b1 b1Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n adShowListener = b1Var.getAdShowListener();
        if (adShowListener != null) {
            adShowListener.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.a(it));
        }
        return Unit.f93236a;
    }

    public static final Unit t(b1 b1Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n adShowListener = b1Var.getAdShowListener();
        if (adShowListener != null) {
            adShowListener.a();
        }
        return Unit.f93236a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        super.destroy();
        this.f55923l.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r getCreativeType() {
        return this.f55922k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public void p() {
        FrameLayout frameLayoutA = this.f55921j.a(this.f55919h, this.f55923l.c());
        this.f55920i.a(frameLayoutA);
        setAdView(frameLayoutA);
    }

    public final void x() {
        p();
    }

    public final void y() {
        setAdView(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public y0 getAdLoader() {
        return this.f55924m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Context context, String adm, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.s webViewWrapper, CoroutineScope scope) {
        super(context, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(webViewWrapper, "webViewWrapper");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f55919h = context;
        this.f55920i = watermark;
        this.f55921j = webViewWrapper;
        setTag("MolocoMraidBannerView");
        this.f55922k = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58895c;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v vVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v(context, adm, new b(this), new c(this), new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b1.t(this.f58869b);
            }
        }, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b1.q(this.f55873b, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj);
            }
        }, true, externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o.a(context, scope, false), null, null, 1536, null);
        this.f55923l = vVar;
        this.f55924m = new y0(scope, null, b.a.f55792a.a(), new a(vVar));
    }
}
