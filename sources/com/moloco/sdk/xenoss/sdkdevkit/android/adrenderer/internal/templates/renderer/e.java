package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.acm.f;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.k0;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import lf.g;
import ve.c0;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends WebViewClientCompat {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f56821s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f56822t = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f56823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f56824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f56825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableStateFlow f56826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateFlow f56827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f56828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StateFlow f56829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f56830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StateFlow f56831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f56832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Job f56833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Job f56834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MutableStateFlow f56835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Job f56836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f56837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f56838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f56839r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56840r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ WebView f56842t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WebView webView, Continuation continuation) {
            super(2, continuation);
            this.f56842t = webView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new b(this.f56842t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56840r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                long j10 = (((long) e.this.f56832k) * 1000) + 1000;
                this.f56840r = 1;
                if (k0.a(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            if (((Boolean) e.this.f56826e.getValue()).booleanValue()) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Skip reload; content already loaded after backoff", null, false, 12, null);
                return Unit.f93236a;
            }
            Job job = e.this.f56836o;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            Job job2 = e.this.f56834m;
            if (job2 != null) {
                Job.a.a(job2, null, 1, null);
            }
            this.f56842t.reload();
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Reload attempt: " + e.this.f56832k, null, false, 12, null);
            return Unit.f93236a;
        }
    }

    public static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56843r;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f56845b;

            public a(e eVar) {
                this.f56845b = eVar;
            }

            public final Object a(boolean z10, Continuation continuation) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Webview page pending error resolution: " + z10, null, false, 12, null);
                if (!z10) {
                    this.f56845b.d();
                }
                return Unit.f93236a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56843r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutableStateFlow mutableStateFlow = e.this.f56835n;
                a aVar = new a(e.this);
                this.f56843r = 1;
                if (mutableStateFlow.collect(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            throw new g();
        }
    }

    public static final class d extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56846r;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f56848b;

            public a(e eVar) {
                this.f56848b = eVar;
            }

            public final Object a(boolean z10, Continuation continuation) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Content loaded event received, isSuccess: " + z10, null, false, 12, null);
                this.f56848b.f56826e.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                Job job = this.f56848b.f56836o;
                if (job != null) {
                    Job.a.a(job, null, 1, null);
                }
                com.moloco.sdk.acm.recorder.a aVar = this.f56848b.f56824c;
                com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.R.g());
                com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                aVar.b(cVar.e(cVar2.g(), z10 ? "success" : "failure"));
                f fVar = this.f56848b.f56838q;
                if (fVar != null) {
                    this.f56848b.f56824c.a(fVar.f(cVar2.g(), z10 ? "success" : "failure"));
                }
                if (z10) {
                    Job job2 = this.f56848b.f56833l;
                    if (job2 != null) {
                        Job.a.a(job2, null, 1, null);
                    }
                    this.f56848b.f56833l = null;
                    this.f56848b.f56832k = 0;
                }
                return Unit.f93236a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56846r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                SharedFlow sharedFlowC = e.this.f56823b.c();
                a aVar = new a(e.this);
                this.f56846r = 1;
                if (sharedFlowC.collect(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            throw new g();
        }
    }

    public e(i contentLoadedEventHandler, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(contentLoadedEventHandler, "contentLoadedEventHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f56823b = contentLoadedEventHandler;
        this.f56824c = metricsRecorder;
        this.f56825d = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        Boolean bool = Boolean.FALSE;
        MutableStateFlow mutableStateFlowA = l0.a(bool);
        this.f56826e = mutableStateFlowA;
        this.f56827f = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = l0.a(bool);
        this.f56828g = mutableStateFlowA2;
        this.f56829h = hg.i.c(mutableStateFlowA2);
        MutableStateFlow mutableStateFlowA3 = l0.a(null);
        this.f56830i = mutableStateFlowA3;
        this.f56831j = hg.i.c(mutableStateFlowA3);
        this.f56835n = l0.a(bool);
    }

    public static final void f(e eVar, WebResourceResponse webResourceResponse, WebView webView, String str) {
        boolean z10 = Boolean.parseBoolean(str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", '[' + Thread.currentThread().getName() + "] Content isRequired with http error: " + z10, null, false, 12, null);
        if (!z10) {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Content is not required, not setting unrecoverable error", null, false, 12, null);
            eVar.f56824c.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.J.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure").e(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD, "false").e(com.moloco.sdk.internal.client_metrics_data.c.f54174c.g(), String.valueOf(webResourceResponse.getStatusCode())).e("is_loaded", String.valueOf(((Boolean) eVar.f56827f.getValue()).booleanValue())));
        } else if (((Boolean) eVar.f56827f.getValue()).booleanValue()) {
            eVar.f56824c.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.L.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure").e(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD, "true").e(com.moloco.sdk.internal.client_metrics_data.c.f54174c.g(), String.valueOf(webResourceResponse.getStatusCode())).e("is_loaded", String.valueOf(((Boolean) eVar.f56827f.getValue()).booleanValue())));
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Webview is already showing but received HTTP " + webResourceResponse.getStatusCode() + ", not setting unrecoverable error", null, false, 12, null);
        } else if (eVar.o(webResourceResponse.getStatusCode()) && eVar.B()) {
            eVar.k(String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), webView);
        } else {
            eVar.l(String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), m.f56894e);
            MolocoLogger.warn$default(molocoLogger, "TemplateWebViewClientImpl", "Setting unrecoverable error: " + eVar.f56831j.getValue(), null, false, 12, null);
        }
        eVar.f56835n.setValue(Boolean.FALSE);
    }

    public static final void g(e eVar, WebResourceErrorCompat webResourceErrorCompat, WebView webView, String str) {
        boolean z10 = Boolean.parseBoolean(str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", '[' + Thread.currentThread().getName() + "] Content type with webview error is required: " + z10, null, false, 12, null);
        if (!z10) {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Content is not required, not setting unrecoverable error", null, false, 12, null);
            eVar.f56824c.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.J.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure").e(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD, "false").e(com.moloco.sdk.internal.client_metrics_data.c.f54174c.g(), String.valueOf(webResourceErrorCompat.getDescription())).e("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).e("is_loaded", String.valueOf(((Boolean) eVar.f56827f.getValue()).booleanValue())));
        } else if (((Boolean) eVar.f56827f.getValue()).booleanValue()) {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Webview is already showing and received error: " + ((Object) webResourceErrorCompat.getDescription()), null, false, 12, null);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.a(webResourceErrorCompat.getDescription().toString()).f()) {
                eVar.l(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), m.f56893d);
            } else {
                eVar.f56824c.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.L.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure").e(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD, "true").e(com.moloco.sdk.internal.client_metrics_data.c.f54174c.g(), String.valueOf(webResourceErrorCompat.getDescription())).e("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).e("is_loaded", String.valueOf(((Boolean) eVar.f56827f.getValue()).booleanValue())));
                MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Webview is already showing but received " + ((Object) webResourceErrorCompat.getDescription()) + ", not setting unrecoverable error", null, false, 12, null);
            }
        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.a(webResourceErrorCompat.getDescription().toString()).d()) {
            eVar.f56824c.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.L.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure").e(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD, "true").e(com.moloco.sdk.internal.client_metrics_data.c.f54174c.g(), String.valueOf(webResourceErrorCompat.getDescription())).e("status_code", String.valueOf(webResourceErrorCompat.getErrorCode())).e("is_loaded", String.valueOf(((Boolean) eVar.f56827f.getValue()).booleanValue())));
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Ignoring error: " + ((Object) webResourceErrorCompat.getDescription()) + " with code: " + webResourceErrorCompat.getErrorCode() + " since it's marked to be ignored pre load", null, false, 12, null);
        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.a(webResourceErrorCompat.getDescription().toString()).e() && eVar.B()) {
            eVar.k(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), webView);
        } else {
            eVar.l(webResourceErrorCompat.getDescription().toString(), webResourceErrorCompat.getErrorCode(), m.f56893d);
        }
        eVar.f56835n.setValue(Boolean.FALSE);
    }

    public final boolean B() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("retryCount: ");
        sb2.append(this.f56832k);
        sb2.append(", MAX_RETRY_LIMIT: 5, retryCount < MAX_RETRY_LIMIT: ");
        sb2.append(this.f56832k < 5);
        MolocoLogger.debug$default(molocoLogger, "TemplateWebViewClientImpl", sb2.toString(), false, 4, null);
        return this.f56832k < 5;
    }

    public final StateFlow c() {
        return this.f56831j;
    }

    public final void k(String str, int i10, WebView webView) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Retrying error... Attempt: " + (this.f56832k + 1), null, false, 12, null);
        this.f56832k = this.f56832k + 1;
        this.f56824c.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.K.g()).e(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD, "true").e(com.moloco.sdk.internal.client_metrics_data.c.f54178g.g(), String.valueOf(this.f56832k)).e(com.moloco.sdk.internal.client_metrics_data.c.f54174c.g(), String.valueOf(str)).e("status_code", String.valueOf(i10)));
        Job job = this.f56833l;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f56833l = eg.i.d(this.f56825d, null, null, new b(webView, null), 3, null);
    }

    public final void l(String str, int i10, m mVar) {
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Setting unrecoverable error with description: " + str + ", code: " + i10 + ", errorType: " + mVar, null, false, 12, null);
        this.f56824c.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.J.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure").e(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD, "true").e(com.moloco.sdk.internal.client_metrics_data.c.f54174c.g(), String.valueOf(str)).e("status_code", String.valueOf(i10)).e("is_loaded", String.valueOf(((Boolean) this.f56827f.getValue()).booleanValue())));
        this.f56839r = str;
        this.f56830i.setValue(mVar);
    }

    public final boolean o(int i10) {
        c0.a aVar = c0.f106561d;
        return i10 == aVar.U().e0() || i10 == aVar.K().e0() || i10 < 400 || i10 >= 500;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Webview page finished loading has pending error: " + ((Boolean) this.f56835n.getValue()).booleanValue(), null, false, 12, null);
        this.f56824c.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.Q.g()).e("pending_error", String.valueOf(((Boolean) this.f56835n.getValue()).booleanValue())));
        if (((Boolean) this.f56835n.getValue()).booleanValue()) {
            this.f56834m = eg.i.d(this.f56825d, null, null, new c(null), 3, null);
        } else {
            d();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "HTML Page started loading", null, false, 12, null);
        this.f56824c.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.O.g()));
        this.f56837p = this.f56824c.c(com.moloco.sdk.internal.client_metrics_data.d.f54202v.g());
        this.f56838q = this.f56824c.c(com.moloco.sdk.internal.client_metrics_data.d.f54203w.g());
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(final WebView view, WebResourceRequest request, final WebResourceErrorCompat error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f56835n.setValue(Boolean.TRUE);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Received error: " + error.getErrorCode() + ", with description: " + ((Object) error.getDescription()) + " for url: " + request.getUrl() + " ad isLoaded: " + ((Boolean) this.f56827f.getValue()).booleanValue() + ", isPageFinished: " + ((Boolean) this.f56829h.getValue()).booleanValue(), null, false, 12, null);
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ContentChecker.isRequiredContent('");
        sb2.append(string);
        sb2.append("');");
        view.evaluateJavascript(sb2.toString(), new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                e.g(this.f56815a, error, view, (String) obj);
            }
        });
        super.onReceivedError(view, request, error);
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(final WebView view, WebResourceRequest request, final WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.f56835n.setValue(Boolean.TRUE);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", '[' + Thread.currentThread().getName() + "] Received HTTP error: " + Integer.valueOf(errorResponse.getStatusCode()) + ", with description: " + errorResponse.getReasonPhrase() + " for url: " + request.getUrl(), null, false, 12, null);
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ContentChecker.isRequiredContent('");
        sb2.append(string);
        sb2.append("');");
        view.evaluateJavascript(sb2.toString(), new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                e.f(this.f56818a, errorResponse, view, (String) obj);
            }
        });
        super.onReceivedHttpError(view, request, errorResponse);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail renderProcessGoneDetail) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f56824c.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.J.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure").e(com.moloco.sdk.internal.client_metrics_data.c.f54174c.g(), "render_process_gone_error").e("is_loaded", String.valueOf(((Boolean) this.f56827f.getValue()).booleanValue())));
        this.f56830i.setValue(m.f56895f);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "onRenderProcessGone", null, false, 12, null);
        this.f56835n.setValue(Boolean.FALSE);
        return true;
    }

    public final StateFlow s() {
        return this.f56827f;
    }

    public final StateFlow u() {
        return this.f56829h;
    }

    public final void d() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HTML Page finished loading is success: ");
        sb2.append(this.f56831j.getValue() == null);
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", sb2.toString(), null, false, 12, null);
        this.f56828g.setValue(Boolean.TRUE);
        if (this.f56831j.getValue() == null) {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Waiting for content HTML assets to load or error out", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar = this.f56824c;
            com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.P.g());
            com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
            aVar.b(cVar.e(cVar2.g(), "success"));
            f fVar = this.f56837p;
            if (fVar != null) {
                this.f56824c.a(fVar.f(cVar2.g(), "success"));
            }
            this.f56836o = eg.i.d(this.f56825d, null, null, new d(null), 3, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Unrecoverable error occurred, not setting isLoaded to true", null, false, 12, null);
        this.f56826e.setValue(Boolean.FALSE);
        Job job = this.f56836o;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        Job job2 = this.f56833l;
        if (job2 != null) {
            Job.a.a(job2, null, 1, null);
        }
        this.f56833l = null;
        com.moloco.sdk.acm.recorder.a aVar2 = this.f56824c;
        com.moloco.sdk.acm.c cVar3 = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.P.g());
        com.moloco.sdk.internal.client_metrics_data.c cVar4 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
        com.moloco.sdk.acm.c cVarE = cVar3.e(cVar4.g(), "failure");
        com.moloco.sdk.internal.client_metrics_data.c cVar5 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
        String strG = cVar5.g();
        String str = this.f56839r;
        if (str == null) {
            str = "unknown";
        }
        aVar2.b(cVarE.e(strG, str));
        f fVar2 = this.f56837p;
        if (fVar2 != null) {
            com.moloco.sdk.acm.recorder.a aVar3 = this.f56824c;
            f fVarF = fVar2.f(cVar4.g(), "failure");
            String strG2 = cVar5.g();
            String str2 = this.f56839r;
            aVar3.a(fVarF.f(strG2, str2 != null ? str2 : "unknown"));
        }
    }
}
