package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f56425f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f56426g = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f56427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StateFlow f56428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StateFlow f56429e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56430r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f56431s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ f0 f56432t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f56433u;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56434r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ boolean f56435s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ f0 f56436t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f56437u;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f0$b$a$a, reason: collision with other inner class name */
            public static final class C0699a extends kotlin.coroutines.jvm.internal.k implements Function3 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56438r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public /* synthetic */ boolean f56439s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f56440t;

                public C0699a(Continuation continuation) {
                    super(3, continuation);
                }

                public final Object c(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar, Continuation continuation) {
                    C0699a c0699a = new C0699a(continuation);
                    c0699a.f56439s = z10;
                    c0699a.f56440t = dVar;
                    return c0699a.invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return c(((Boolean) obj).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj2, (Continuation) obj3);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.f56438r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    boolean z10 = this.f56439s;
                    return TuplesKt.to(kotlin.coroutines.jvm.internal.b.a(z10), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) this.f56440t);
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f0$b$a$b, reason: collision with other inner class name */
            public static final class C0700b extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56441r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public /* synthetic */ Object f56442s;

                public C0700b(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Pair pair, Continuation continuation) {
                    return ((C0700b) create(pair, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    C0700b c0700b = new C0700b(continuation);
                    c0700b.f56442s = obj;
                    return c0700b;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.f56441r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    Pair pair = (Pair) this.f56442s;
                    return kotlin.coroutines.jvm.internal.b.a(((Boolean) pair.component1()).booleanValue() || ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, f0 f0Var, String str, Continuation continuation) {
                super(2, continuation);
                this.f56435s = z10;
                this.f56436t = f0Var;
                this.f56437u = str;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f56435s, this.f56436t, this.f56437u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f56434r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    try {
                        if (this.f56435s) {
                            Context context = this.f56436t.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0.a(this.f56436t, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.w(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.r(context), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.t(), null, 4, null).a(this.f56437u));
                        } else {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0.a(this.f56436t, this.f56437u);
                        }
                        Flow flowC = hg.i.C(this.f56436t.f56427c.f(), this.f56436t.f56427c.c(), new C0699a(null));
                        C0700b c0700b = new C0700b(null);
                        this.f56434r = 1;
                        obj = hg.i.y(flowC, c0700b, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } catch (Exception e10) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebView", e10.toString(), null, false, 12, null);
                        return new h0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f56025d);
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                Pair pair = (Pair) obj;
                boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) pair.component2();
                return dVar != null ? new h0.a(dVar) : zBooleanValue ? new h0.b(new g(null, 1, null)) : new h0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f56026e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, f0 f0Var, String str, Continuation continuation) {
            super(2, continuation);
            this.f56431s = z10;
            this.f56432t = f0Var;
            this.f56433u = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f56431s, this.f56432t, this.f56433u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56430r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            CoroutineContext main = com.moloco.sdk.internal.scheduling.c.a().getMain();
            a aVar = new a(this.f56431s, this.f56432t, this.f56433u, null);
            this.f56430r = 1;
            Object objG2 = eg.g.g(main, aVar, this);
            return objG2 == objG ? objG : objG2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, x mraidJsCommandUrlSource) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidJsCommandUrlSource, "mraidJsCommandUrlSource");
        WebView.setWebContentsDebuggingEnabled(false);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setScrollContainer(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setMediaPlaybackRequiresUserGesture(true);
        setVisibility(8);
        g0 g0Var = new g0(context, mraidJsCommandUrlSource);
        setWebViewClient(g0Var);
        this.f56427c = g0Var;
        this.f56428d = g0Var.f();
        this.f56429e = g0Var.c();
    }

    public final Object b(String str, boolean z10, Continuation continuation) {
        return kotlinx.coroutines.i.g(new b(z10, this, str, null), continuation);
    }

    public final StateFlow c() {
        return this.f56428d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0, android.webkit.WebView
    public void destroy() {
        super.destroy();
        setWebViewClient(new WebViewClientCompat());
    }

    @NotNull
    public final StateFlow getUnrecoverableError() {
        return this.f56429e;
    }
}
