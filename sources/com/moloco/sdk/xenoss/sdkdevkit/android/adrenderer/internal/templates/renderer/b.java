package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.moloco.sdk.acm.f;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import eg.o0;
import eg.x1;
import hg.l0;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import lf.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends WebView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f56778j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f56779k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f56780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f56781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f56782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f56783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CoroutineScope f56784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f56785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StateFlow f56786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final StateFlow f56787i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b, reason: collision with other inner class name */
    public static final class C0719b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f56788r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f56789s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f56790t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f56792v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f56793w;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a */
        public static final class a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56794r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ b f56795s;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$a, reason: collision with other inner class name */
            public static final class C0720a extends k implements Function3 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56796r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public /* synthetic */ boolean f56797s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f56798t;

                public C0720a(Continuation continuation) {
                    super(3, continuation);
                }

                public final Object c(boolean z10, m mVar, Continuation continuation) {
                    C0720a c0720a = new C0720a(continuation);
                    c0720a.f56797s = z10;
                    c0720a.f56798t = mVar;
                    return c0720a.invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return c(((Boolean) obj).booleanValue(), (m) obj2, (Continuation) obj3);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.f56796r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    boolean z10 = this.f56797s;
                    return TuplesKt.to(kotlin.coroutines.jvm.internal.b.a(z10), (m) this.f56798t);
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$b, reason: collision with other inner class name */
            public static final class C0721b extends k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56799r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public /* synthetic */ Object f56800s;

                public C0721b(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Pair pair, Continuation continuation) {
                    return ((C0721b) create(pair, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    C0721b c0721b = new C0721b(continuation);
                    c0721b.f56800s = obj;
                    return c0721b;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.f56799r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    Pair pair = (Pair) this.f56800s;
                    return kotlin.coroutines.jvm.internal.b.a(((Boolean) pair.component1()).booleanValue() || ((m) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Continuation continuation) {
                super(2, continuation);
                this.f56795s = bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f56795s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f56794r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    return obj;
                }
                kotlin.d.b(obj);
                Flow flowC = hg.i.C(this.f56795s.f56783e.s(), this.f56795s.f56783e.c(), new C0720a(null));
                C0721b c0721b = new C0721b(null);
                this.f56794r = 1;
                Object objY = hg.i.y(flowC, c0721b, this);
                return objY == objG ? objG : objY;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0719b(String str, long j10, Continuation continuation) {
            super(2, continuation);
            this.f56792v = str;
            this.f56793w = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0719b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new C0719b(this.f56792v, this.f56793w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            f fVarC;
            Object objF;
            String str;
            Object objG = pf.b.g();
            int i10 = this.f56790t;
            if (i10 == 0) {
                kotlin.d.b(obj);
                fVarC = b.this.f56782d.c(com.moloco.sdk.internal.client_metrics_data.d.f54199s.g());
                String strF = b.this.f();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Loading ad in webView, with webview version: " + strF, null, false, 12, null);
                try {
                    b.this.loadDataWithBaseURL(null, this.f56792v, "text/html", "UTF-8", null);
                    long j10 = this.f56793w;
                    a aVar = new a(b.this, null);
                    this.f56788r = fVarC;
                    this.f56789s = strF;
                    this.f56790t = 1;
                    objF = x1.f(j10, aVar, this);
                    if (objF == objG) {
                        return objG;
                    }
                    str = strF;
                } catch (Exception e10) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "loadHtml failed to load the provided html", e10, false, 8, null);
                    com.moloco.sdk.acm.recorder.a aVar2 = b.this.f56782d;
                    com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.I.g());
                    com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                    com.moloco.sdk.acm.c cVarE = cVar.e(cVar2.g(), "failure");
                    com.moloco.sdk.internal.client_metrics_data.c cVar3 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
                    aVar2.b(cVarE.e(cVar3.g(), "invalid_url").e("webview_version", strF));
                    b.this.f56782d.a(fVarC.f(cVar2.g(), "failure").f(cVar3.g(), "invalid_url").f("webview_version", strF));
                    return new h0.a(m.f56892c);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f56789s;
                fVarC = (f) this.f56788r;
                kotlin.d.b(obj);
                objF = obj;
            }
            if (objF == null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad failed to load due to timeout", null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar3 = b.this.f56782d;
                com.moloco.sdk.acm.c cVar4 = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.I.g());
                com.moloco.sdk.internal.client_metrics_data.c cVar5 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                com.moloco.sdk.acm.c cVarE2 = cVar4.e(cVar5.g(), "failure");
                com.moloco.sdk.internal.client_metrics_data.c cVar6 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
                aVar3.b(cVarE2.e(cVar6.g(), "timeout_error").e("webview_version", str));
                b.this.f56782d.a(fVarC.f(cVar5.g(), "failure").f(cVar6.g(), "timeout_error").f("webview_version", str));
                return new h0.a(m.f56896g);
            }
            boolean zBooleanValue = ((Boolean) b.this.f56783e.s().getValue()).booleanValue();
            m mVar = (m) b.this.f56783e.c().getValue();
            if (mVar != null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad failed to load due to unrecoverable error: " + mVar.name(), null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar4 = b.this.f56782d;
                com.moloco.sdk.acm.c cVar7 = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.I.g());
                com.moloco.sdk.internal.client_metrics_data.c cVar8 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                com.moloco.sdk.acm.c cVarE3 = cVar7.e(cVar8.g(), "failure");
                com.moloco.sdk.internal.client_metrics_data.c cVar9 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
                aVar4.b(cVarE3.e(cVar9.g(), mVar.name()).e("webview_version", str));
                b.this.f56782d.a(fVarC.f(cVar8.g(), "failure").f(cVar9.g(), mVar.name()).f("webview_version", str));
                return new h0.a(mVar);
            }
            if (zBooleanValue) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad loaded successfully in webView", null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar5 = b.this.f56782d;
                com.moloco.sdk.acm.c cVar10 = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.I.g());
                com.moloco.sdk.internal.client_metrics_data.c cVar11 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                aVar5.b(cVar10.e(cVar11.g(), "success").e("webview_version", str));
                b.this.f56782d.a(fVarC.f(cVar11.g(), "success").f("webview_version", str));
                return new h0.b(Unit.f93236a);
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad failed to load due to unknown error", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar6 = b.this.f56782d;
            com.moloco.sdk.acm.c cVar12 = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.I.g());
            com.moloco.sdk.internal.client_metrics_data.c cVar13 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
            com.moloco.sdk.acm.c cVarE4 = cVar12.e(cVar13.g(), "failure");
            com.moloco.sdk.internal.client_metrics_data.c cVar14 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
            aVar6.b(cVarE4.e(cVar14.g(), "unknown_error").e("webview_version", str));
            b.this.f56782d.a(fVarC.f(cVar13.g(), "failure").f(cVar14.g(), "unknown_error").f("webview_version", str));
            return new h0.a(m.f56891b);
        }
    }

    public static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56801r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f56803t;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f56804b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f56805c;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$a, reason: collision with other inner class name */
            public static final class C0722a extends k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56806r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ b f56807s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ h.a f56808t;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C0723a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f56809a;

                    static {
                        int[] iArr = new int[h.a.values().length];
                        try {
                            iArr[h.a.f56935e.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[h.a.f56934d.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        f56809a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0722a(b bVar, h.a aVar, Continuation continuation) {
                    super(2, continuation);
                    this.f56807s = bVar;
                    this.f56808t = aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0722a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0722a(this.f56807s, this.f56808t, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.f56806r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    WebSettings settings = this.f56807s.getSettings();
                    int i10 = C0723a.f56809a[this.f56808t.ordinal()];
                    settings.setMediaPlaybackRequiresUserGesture(i10 != 1 ? i10 != 2 ? this.f56807s.getSettings().getMediaPlaybackRequiresUserGesture() : false : true);
                    return Unit.f93236a;
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$b, reason: collision with other inner class name */
            public static final class C0724b extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public Object f56810r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public Object f56811s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f56812t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public int f56814v;

                public C0724b(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f56812t = obj;
                    this.f56814v |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
                this.f56804b = bVar;
                this.f56805c = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h.a r13, kotlin.coroutines.Continuation r14) {
                /*
                    Method dump skipped, instruction units count: 280
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h$a, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f56803t = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new c(this.f56803t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56801r;
            try {
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    MutableSharedFlow mutableSharedFlowC = b.this.f56781c.c();
                    a aVar = new a(b.this, this.f56803t);
                    this.f56801r = 1;
                    if (mutableSharedFlowC.collect(aVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                throw new g();
            } catch (Exception e10) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Error collecting playlist item displaying events", e10, false, 8, null);
                return Unit.f93236a;
            }
        }
    }

    public /* synthetic */ b(Context context, i iVar, h hVar, com.moloco.sdk.acm.recorder.a aVar, e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iVar, hVar, aVar, (i10 & 16) != 0 ? new e(iVar, aVar) : eVar);
    }

    public final Object b(String str, long j10, Continuation continuation) {
        return eg.g.g(o0.c(), new C0719b(str, j10, null), continuation);
    }

    public final StateFlow c() {
        return this.f56787i;
    }

    public final void d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a mraidCommunicationHub) {
        Intrinsics.checkNotNullParameter(mraidCommunicationHub, "mraidCommunicationHub");
        eg.i.d(this.f56784f, null, null, new c(mraidCommunicationHub, null), 3, null);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    public final String f() {
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                return (currentWebViewPackage == null || (str = currentWebViewPackage.versionName) == null) ? "unknown" : str;
            }
            PackageManager packageManager = getContext().getPackageManager();
            for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"com.google.android.webview", "com.android.webview", "com.android.chrome"})) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Pre-O, legacy webview version: " + str2 + " → " + packageInfo.versionName, null, false, 12, null);
                String versionName = packageInfo.versionName;
                Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
                if (versionName.length() > 0) {
                    String versionName2 = packageInfo.versionName;
                    Intrinsics.checkNotNullExpressionValue(versionName2, "versionName");
                    return versionName2;
                }
            }
            return "unknown";
        } catch (Exception e10) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "TemplateWebView", "WebView version retrieval exception", e10, false, 8, null);
            return "unknown";
        }
    }

    @NotNull
    public final StateFlow getOrientation$moloco_sdk_release() {
        return this.f56785g;
    }

    @NotNull
    public final StateFlow getUnrecoverableError() {
        return this.f56786h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "onDetachedFromWindow called, cancelling viewScope", null, false, 12, null);
        kotlinx.coroutines.i.f(this.f56784f, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, i contentLoadedEventHandler, h playListItemDisplayingEventHandler, com.moloco.sdk.acm.recorder.a metricsRecorder, e webViewClientImpl) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentLoadedEventHandler, "contentLoadedEventHandler");
        Intrinsics.checkNotNullParameter(playListItemDisplayingEventHandler, "playListItemDisplayingEventHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(webViewClientImpl, "webViewClientImpl");
        this.f56780b = contentLoadedEventHandler;
        this.f56781c = playListItemDisplayingEventHandler;
        this.f56782d = metricsRecorder;
        this.f56783e = webViewClientImpl;
        this.f56784f = kotlinx.coroutines.i.a(com.moloco.sdk.common_adapter_internal.a.f54115a.a().getMain());
        this.f56785g = l0.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f56735e, false, 2, null));
        setWebViewClient(webViewClientImpl);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        setSaveEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        setBackgroundColor(0);
        this.f56786h = webViewClientImpl.c();
        this.f56787i = webViewClientImpl.u();
    }
}
