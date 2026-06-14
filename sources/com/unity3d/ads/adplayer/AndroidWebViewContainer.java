package com.unity3d.ads.adplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.vungle.ads.internal.protos.Sdk;
import eg.e0;
import hg.l0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001fH\u0002J\u0011\u0010&\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'J\u0019\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0019\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0011\u0010-\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010'R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webView", "Landroid/webkit/WebView;", "webViewClient", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "sendWebViewClientErrorDiagnostics", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/webkit/WebView;Lcom/unity3d/ads/adplayer/AndroidWebViewClient;Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "_lastInputEvent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroid/view/InputEvent;", "get_lastInputEvent", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "lastInputEvent", "Lkotlinx/coroutines/flow/StateFlow;", "getLastInputEvent", "()Lkotlinx/coroutines/flow/StateFlow;", "scope", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getWebView", "()Landroid/webkit/WebView;", "addJavascriptInterface", "", "webViewBridgeInterface", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "name", "", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applySafeAreaInsets", "destroy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evaluateJavascript", "script", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUrl", "url", "onRenderProcessGone", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
public final class AndroidWebViewContainer implements WebViewContainer {

    @NotNull
    private final MutableStateFlow _lastInputEvent;

    @NotNull
    private final Context context;

    @NotNull
    private final StateFlow lastInputEvent;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    @NotNull
    private final WebView webView;

    @NotNull
    private final AndroidWebViewClient webViewClient;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {42}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<Boolean, Continuation, Object> {
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidWebViewContainer.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                if (androidWebViewContainer.onRenderProcessGone(this) == objG) {
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

        @Nullable
        public final Object invoke(boolean z10, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {98}, m = "addJavascriptInterface")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.addJavascriptInterface(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    static final class C47362 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ WebViewBridge $webViewBridgeInterface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47362(String str, WebViewBridge webViewBridge, Continuation continuation) {
            super(2, continuation);
            this.$name = str;
            this.$webViewBridgeInterface = webViewBridge;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidWebViewContainer.this.new C47362(this.$name, this.$webViewBridgeInterface, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            final WebViewBridge webViewBridge = this.$webViewBridgeInterface;
            AndroidWebViewContainer.this.getWebView().addJavascriptInterface(new WebViewBridgeInterface() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1
                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleCallback(@NotNull String callbackId, @NotNull String callbackStatus, @NotNull String rawParameters) {
                    Intrinsics.checkNotNullParameter(callbackId, "callbackId");
                    Intrinsics.checkNotNullParameter(callbackStatus, "callbackStatus");
                    Intrinsics.checkNotNullParameter(rawParameters, "rawParameters");
                    webViewBridge.handleCallback(callbackId, callbackStatus, rawParameters);
                }

                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleInvocation(@NotNull String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    webViewBridge.handleInvocation(message);
                }
            }, this.$name);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C47362) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {116}, m = "destroy")
    static final class C47371 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C47371(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    static final class C47382 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C47382(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidWebViewContainer.this.new C47382(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            ViewParent parent = AndroidWebViewContainer.this.getWebView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(AndroidWebViewContainer.this.getWebView());
            }
            AndroidWebViewContainer.this.getWebView().destroy();
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C47382) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {88}, m = "evaluateJavascript")
    static final class C47391 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C47391(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.evaluateJavascript(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    static final class C47402 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $script;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47402(String str, Continuation continuation) {
            super(2, continuation);
            this.$script = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidWebViewContainer.this.new C47402(this.$script, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            AndroidWebViewContainer.this.getWebView().evaluateJavascript("javascript:" + this.$script, null);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C47402) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {74, 78, 80}, m = "loadUrl")
    static final class C47411 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C47411(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.loadUrl(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    static final class C47422 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47422(String str, Continuation continuation) {
            super(2, continuation);
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidWebViewContainer.this.new C47422(this.$url, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            AndroidWebViewContainer.this.getWebView().loadUrl(this.$url);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C47422) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {62}, m = "onRenderProcessGone")
    static final class C47431 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C47431(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.onRenderProcessGone(this);
        }
    }

    public AndroidWebViewContainer(@NotNull WebView webView, @NotNull AndroidWebViewClient webViewClient, @NotNull SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, @NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher defaultDispatcher, @NotNull CoroutineScope adPlayerScope, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        Intrinsics.checkNotNullParameter(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        Intrinsics.checkNotNullParameter(context, "context");
        this.webView = webView;
        this.webViewClient = webViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        CoroutineScope coroutineScopeJ = i.j(i.j(adPlayerScope, mainDispatcher), new e0("AndroidWebViewContainer"));
        this.scope = coroutineScopeJ;
        MutableStateFlow mutableStateFlowA = l0.a(null);
        this._lastInputEvent = mutableStateFlowA;
        this.lastInputEvent = hg.i.c(mutableStateFlowA);
        final StateFlow isRenderProcessGone = webViewClient.getIsRenderProcessGone();
        hg.i.F(hg.i.K(new Flow() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.d.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.Unit r5 = kotlin.Unit.f93236a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = isRenderProcessGone.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        }, new AnonymousClass2(null)), i.j(coroutineScopeJ, defaultDispatcher));
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.unity3d.ads.adplayer.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AndroidWebViewContainer._init_$lambda$1(this.f67763b, view, motionEvent);
            }
        });
        applySafeAreaInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(AndroidWebViewContainer this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 5 && actionMasked != 6) {
            return false;
        }
        this$0._lastInputEvent.setValue(motionEvent);
        return false;
    }

    private final void applySafeAreaInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(this.webView, new OnApplyWindowInsetsListener() { // from class: com.unity3d.ads.adplayer.b
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return AndroidWebViewContainer.applySafeAreaInsets$lambda$3(this.f67764b, view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat applySafeAreaInsets$lambda$3(AndroidWebViewContainer this$0, View v10, WindowInsetsCompat insets) {
        Object objB;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insets3, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(Float.valueOf(this$0.context.getResources().getDisplayMetrics().density));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        Float fValueOf = Float.valueOf(1.0f);
        if (Result.i(objB)) {
            objB = fValueOf;
        }
        float fFloatValue = ((Number) objB).floatValue();
        int iApplySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.left, insets3.left), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.top, insets3.top), fFloatValue);
        eg.i.d(this$0.scope, null, null, new AndroidWebViewContainer$applySafeAreaInsets$1$1(this$0, StringsKt.n("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '" + iApplySafeAreaInsets$lambda$3$toPx + "px');\n                    root.style.setProperty('--safe-area-inset-right', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.right, insets3.right), fFloatValue) + "px');\n                    root.style.setProperty('--safe-area-inset-top', '" + iApplySafeAreaInsets$lambda$3$toPx2 + "px');\n                    root.style.setProperty('--safe-area-inset-bottom', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.bottom, insets3.bottom), fFloatValue) + "px');\n                })();\n            "), null), 3, null);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i10, float f10) {
        return (int) (i10 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onRenderProcessGone(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C47431
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C47431) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            kotlin.d.b(r7)
            goto L44
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.d.b(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r6.destroy(r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            r0 = r6
        L44:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r7 = r0.sendWebViewClientErrorDiagnostics
            com.unity3d.ads.adplayer.model.WebViewClientError r0 = new com.unity3d.ads.adplayer.model.WebViewClientError
            com.unity3d.ads.adplayer.model.ErrorReason r2 = com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE
            r4 = 4
            r5 = 0
            java.lang.String r1 = "Render process gone"
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            r7.invoke(r0)
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.onRenderProcessGone(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object addJavascriptInterface(@org.jetbrains.annotations.NotNull com.unity3d.ads.adplayer.WebViewBridge r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r8)     // Catch: java.util.concurrent.CancellationException -> L49
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r8)
            kotlinx.coroutines.CoroutineScope r8 = r5.scope     // Catch: java.util.concurrent.CancellationException -> L49
            kotlin.coroutines.CoroutineContext r8 = r8.getCoroutineContext()     // Catch: java.util.concurrent.CancellationException -> L49
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2     // Catch: java.util.concurrent.CancellationException -> L49
            r4 = 0
            r2.<init>(r7, r6, r4)     // Catch: java.util.concurrent.CancellationException -> L49
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L49
            java.lang.Object r6 = eg.g.g(r8, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L49
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C47371
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C47371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            kotlin.d.b(r6)
            goto L56
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.d.b(r6)
            kotlinx.coroutines.CoroutineScope r6 = r5.scope
            kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
            kotlinx.coroutines.d0 r2 = kotlinx.coroutines.d0.f93604b
            kotlin.coroutines.CoroutineContext r6 = r6.plus(r2)
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2
            r2.<init>(r3)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = eg.g.g(r6, r2, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            r0 = r5
        L56:
            kotlinx.coroutines.CoroutineScope r6 = r0.scope
            kotlinx.coroutines.i.f(r6, r3, r4, r3)
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evaluateJavascript(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C47391
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C47391) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)     // Catch: java.util.concurrent.CancellationException -> L49
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r7)
            kotlinx.coroutines.CoroutineScope r7 = r5.scope     // Catch: java.util.concurrent.CancellationException -> L49
            kotlin.coroutines.CoroutineContext r7 = r7.getCoroutineContext()     // Catch: java.util.concurrent.CancellationException -> L49
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2     // Catch: java.util.concurrent.CancellationException -> L49
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.util.concurrent.CancellationException -> L49
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L49
            java.lang.Object r6 = eg.g.g(r7, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L49
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @NotNull
    public StateFlow getLastInputEvent() {
        return this.lastInputEvent;
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.scope;
    }

    @NotNull
    public final WebView getWebView() {
        return this.webView;
    }

    @NotNull
    public final MutableStateFlow get_lastInputEvent() {
        return this._lastInputEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadUrl(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) throws com.unity3d.ads.adplayer.LoadWebViewError {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.C47411
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.C47411) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3f
            if (r2 == r3) goto L33
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            kotlin.d.b(r9)
            goto L95
        L3f:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r8
            kotlin.d.b(r9)
            goto L7b
        L47:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r8
            kotlin.d.b(r9)
            goto L6a
        L4f:
            kotlin.d.b(r9)
            kotlinx.coroutines.CoroutineScope r9 = r7.scope
            kotlin.coroutines.CoroutineContext r9 = r9.getCoroutineContext()
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2 r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2
            r6 = 0
            r2.<init>(r8, r6)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = eg.g.g(r9, r2, r0)
            if (r8 != r1) goto L69
            goto L92
        L69:
            r8 = r7
        L6a:
            com.unity3d.ads.adplayer.AndroidWebViewClient r9 = r8.webViewClient
            kotlinx.coroutines.Deferred r9 = r9.getOnLoadFinished()
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r9.await(r0)
            if (r9 != r1) goto L7b
            goto L92
        L7b:
            java.util.List r9 = (java.util.List) r9
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto La0
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r0 = r8.destroy(r0)
            if (r0 != r1) goto L93
        L92:
            return r1
        L93:
            r0 = r8
            r8 = r9
        L95:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r9 = r0.sendWebViewClientErrorDiagnostics
            r9.invoke(r8)
            com.unity3d.ads.adplayer.LoadWebViewError r9 = new com.unity3d.ads.adplayer.LoadWebViewError
            r9.<init>(r8)
            throw r9
        La0:
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
