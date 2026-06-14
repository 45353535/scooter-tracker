package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.amazon.device.ads.DtbDeviceData;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.taurusx.tax.f.y;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.OneShotSingleValueMetric;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.Logger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u0002:\u0004\u008e\u0001\u008f\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ \u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020 2\u0006\u0010_\u001a\u00020 2\u0006\u0010`\u001a\u00020\u0011H\u0002J\u0010\u0010a\u001a\u00020\u00112\u0006\u0010_\u001a\u00020 H\u0002J\u0016\u0010b\u001a\u00020]2\u0006\u0010c\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020\u000eJ\u0010\u0010e\u001a\u00020]2\u0006\u0010f\u001a\u00020\u0011H\u0016J\u000e\u0010g\u001a\u00020]2\u0006\u0010h\u001a\u00020\u0011J\u001c\u0010i\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010_\u001a\u0004\u0018\u00010 H\u0016J&\u0010k\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010l\u001a\u0004\u0018\u00010m2\b\u0010n\u001a\u0004\u0018\u00010oH\u0016J*\u0010k\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010?2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020 2\u0006\u0010s\u001a\u00020 H\u0017J&\u0010t\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010l\u001a\u0004\u0018\u00010m2\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\u001c\u0010w\u001a\u00020\u00112\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010x\u001a\u0004\u0018\u00010yH\u0016J-\u0010z\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0{2\b\u0010|\u001a\u0004\u0018\u00010 2\u0006\u0010}\u001a\u00020\u000eH\u0000¢\u0006\u0002\b~J\u001c\u0010\u007f\u001a\u00020]2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010?2\u0007\u0010\u0081\u0001\u001a\u00020 H\u0002J\u0011\u0010\u0082\u0001\u001a\u00020]2\u0006\u00106\u001a\u00020\u0011H\u0016J>\u0010\u0083\u0001\u001a\u00020]2\u0007\u0010\u0084\u0001\u001a\u00020\u00112\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010 2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010 2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010 2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010 H\u0016J\u0011\u0010\u0089\u0001\u001a\u00020]2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0013\u0010\u008a\u0001\u001a\u00020]2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\u0013\u0010\u008b\u0001\u001a\u00020]2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010v2\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010l\u001a\u0004\u0018\u00010mH\u0016J\u001d\u0010\u008d\u0001\u001a\u00020\u00112\b\u0010j\u001a\u0004\u0018\u00010?2\b\u0010_\u001a\u0004\u0018\u00010 H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010\u001f\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R&\u0010&\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R&\u0010*\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R&\u0010.\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b/\u0010\u0013\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u0014\u00102\u001a\u000203X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R(\u00106\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010<\u0012\u0004\b7\u0010\u0013\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010=R&\u0010>\u001a\u0004\u0018\u00010?8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b@\u0010\u0013\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR&\u0010E\u001a\u0004\u0018\u00010F8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bG\u0010\u0013\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020MX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010O\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bP\u0010\u0013\u001a\u0004\bQ\u0010\u0015\"\u0004\bR\u0010\u0017R\u000e\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010U\u001a\u0004\u0018\u00010V8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bW\u0010\u0013\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006\u0090\u0001"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient;", "Landroid/webkit/WebViewClient;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "offloadExecutor", "Ljava/util/concurrent/ExecutorService;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "delegate", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "loadDuration", "", "(Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", "collectConsent", "", "getCollectConsent$vungle_ads_release$annotations", "()V", "getCollectConsent$vungle_ads_release", "()Z", "setCollectConsent$vungle_ads_release", "(Z)V", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "getErrorHandler$vungle_ads_release$annotations", "getErrorHandler$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "setErrorHandler$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "gdprAccept", "", "getGdprAccept$vungle_ads_release$annotations", "getGdprAccept$vungle_ads_release", "()Ljava/lang/String;", "setGdprAccept$vungle_ads_release", "(Ljava/lang/String;)V", "gdprBody", "getGdprBody$vungle_ads_release$annotations", "getGdprBody$vungle_ads_release", "setGdprBody$vungle_ads_release", "gdprDeny", "getGdprDeny$vungle_ads_release$annotations", "getGdprDeny$vungle_ads_release", "setGdprDeny$vungle_ads_release", "gdprTitle", "getGdprTitle$vungle_ads_release$annotations", "getGdprTitle$vungle_ads_release", "setGdprTitle$vungle_ads_release", "handler", "Landroid/os/Handler;", "getHandler$vungle_ads_release", "()Landroid/os/Handler;", C4240b4.i.f42642o, "isViewable$vungle_ads_release$annotations", "isViewable$vungle_ads_release", "()Ljava/lang/Boolean;", "setViewable$vungle_ads_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "loadedWebView", "Landroid/webkit/WebView;", "getLoadedWebView$vungle_ads_release$annotations", "getLoadedWebView$vungle_ads_release", "()Landroid/webkit/WebView;", "setLoadedWebView$vungle_ads_release", "(Landroid/webkit/WebView;)V", "mraidDelegate", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "getMraidDelegate$vungle_ads_release$annotations", "getMraidDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "setMraidDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;)V", "partialDownloadErrorMetric", "Lcom/vungle/ads/OneShotSingleValueMetric;", "partialDownloadMetric", C4240b4.i.f42650s, "getReady$vungle_ads_release$annotations", "getReady$vungle_ads_release", "setReady$vungle_ads_release", "skippedUrlMetric", "Lcom/vungle/ads/SingleValueMetric;", "webViewObserver", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "getWebViewObserver$vungle_ads_release$annotations", "getWebViewObserver$vungle_ads_release", "()Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "setWebViewObserver$vungle_ads_release", "(Lcom/vungle/ads/internal/omsdk/WebViewObserver;)V", "handleWebViewError", "", "errorMsg", "url", "didCrash", "isCriticalAsset", "notifyDiskAvailableSize", "availableDiskSize", "appFolderSize", "notifyPropertiesChange", "skipCmdQueue", "notifySilentModeChange", "silentModeEnabled", "onPageFinished", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "parseRange", "Lkotlin/Pair;", "rangeHeader", "contentLength", "parseRange$vungle_ads_release", "runJavascriptOnWebView", "webView", "injectJs", "setAdVisibility", "setConsentStatus", "collectedConsent", "title", PglCryptUtils.KEY_MESSAGE, "accept", "deny", "setErrorHandler", "setMraidDelegate", "setWebViewObserver", "shouldInterceptRequest", "shouldOverrideUrlLoading", y.f66058y, "VungleWebViewRenderProcessClient", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleWebClient extends WebViewClient implements WebViewAPI {

    @NotNull
    private static final String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";

    @NotNull
    private static final String TAG = "VungleWebClient";

    @NotNull
    private final AdPayload advertisement;
    private boolean collectConsent;

    @Nullable
    private final PreloadDelegate delegate;

    @Nullable
    private WebViewAPI.WebClientErrorHandler errorHandler;

    @Nullable
    private String gdprAccept;

    @Nullable
    private String gdprBody;

    @Nullable
    private String gdprDeny;

    @Nullable
    private String gdprTitle;

    @NotNull
    private final Handler handler;

    @Nullable
    private Boolean isViewable;

    @Nullable
    private final Long loadDuration;

    @Nullable
    private WebView loadedWebView;

    @Nullable
    private WebViewAPI.MraidDelegate mraidDelegate;

    @NotNull
    private final ExecutorService offloadExecutor;

    @NotNull
    private final OneShotSingleValueMetric partialDownloadErrorMetric;

    @NotNull
    private final OneShotSingleValueMetric partialDownloadMetric;

    @NotNull
    private final Placement placement;

    @Nullable
    private final Platform platform;
    private boolean ready;

    @NotNull
    private final SingleValueMetric skippedUrlMetric;

    @Nullable
    private WebViewObserver webViewObserver;

    @RequiresApi(29)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient$VungleWebViewRenderProcessClient;", "Landroid/webkit/WebViewRenderProcessClient;", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "onRenderProcessResponsive", "", "webView", "Landroid/webkit/WebView;", "webViewRenderProcess", "Landroid/webkit/WebViewRenderProcess;", "onRenderProcessUnresponsive", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {

        @Nullable
        private WebViewAPI.WebClientErrorHandler errorHandler;

        public VungleWebViewRenderProcessClient(@Nullable WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        public void onRenderProcessResponsive(@NotNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.checkNotNullParameter(webView, "webView");
        }

        public void onRenderProcessUnresponsive(@NotNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Logger.Companion companion = Logger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRenderProcessUnresponsive(Title = ");
            sb2.append(webView.getTitle());
            sb2.append(", URL = ");
            sb2.append(webView.getOriginalUrl());
            sb2.append(", (webViewRenderProcess != null) = ");
            sb2.append(webViewRenderProcess != null);
            companion.w(VungleWebClient.TAG, sb2.toString());
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }

    public /* synthetic */ VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService, Platform platform, PreloadDelegate preloadDelegate, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(adPayload, placement, executorService, (i10 & 8) != 0 ? null : platform, (i10 & 16) != 0 ? null : preloadDelegate, (i10 & 32) != 0 ? null : l10);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    private final void handleWebViewError(String errorMsg, String url, boolean didCrash) {
        String str = url + ' ' + errorMsg;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str, didCrash);
        }
    }

    private final boolean isCriticalAsset(String url) {
        if (url.length() > 0) {
            return this.advertisement.isCriticalAsset(url);
        }
        return false;
    }

    @VisibleForTesting
    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-25, reason: not valid java name */
    public static final void m7568notifyPropertiesChange$lambda25(boolean z10, final VungleWebClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        c0 c0Var = new c0();
        kotlinx.serialization.json.i.d(c0Var, "placementType", this$0.advertisement.templateType());
        Boolean bool = this$0.isViewable;
        if (bool != null) {
            kotlinx.serialization.json.i.b(c0Var, C4240b4.i.f42642o, bool);
        }
        kotlinx.serialization.json.i.d(c0Var, "os", "android");
        kotlinx.serialization.json.i.d(c0Var, DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, String.valueOf(Build.VERSION.SDK_INT));
        kotlinx.serialization.json.i.b(c0Var, "incentivized", Boolean.valueOf(this$0.placement.isRewardedVideo()));
        Platform platform = this$0.platform;
        if (platform != null) {
            kotlinx.serialization.json.i.b(c0Var, "isSilent", Boolean.valueOf(platform.isSilentModeEnabled()));
        }
        if (this$0.loadDuration != null) {
            kotlinx.serialization.json.i.c(c0Var, "timeLoaded", this$0.loadDuration);
        }
        if (this$0.collectConsent) {
            kotlinx.serialization.json.i.b(c0Var, "consentRequired", Boolean.TRUE);
            kotlinx.serialization.json.i.d(c0Var, "consentTitleText", this$0.gdprTitle);
            kotlinx.serialization.json.i.d(c0Var, "consentBodyText", this$0.gdprBody);
            kotlinx.serialization.json.i.d(c0Var, "consentAcceptButtonText", this$0.gdprAccept);
            kotlinx.serialization.json.i.d(c0Var, "consentDenyButtonText", this$0.gdprDeny);
        } else {
            kotlinx.serialization.json.i.b(c0Var, "consentRequired", Boolean.FALSE);
        }
        kotlinx.serialization.json.i.d(c0Var, "sdkVersion", BuildConfig.VERSION_NAME);
        final String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + c0Var.a() + ',' + z10 + ')';
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.g
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m7569notifyPropertiesChange$lambda25$lambda24(this.f68079b, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-25$lambda-24, reason: not valid java name */
    public static final void m7569notifyPropertiesChange$lambda25$lambda24(VungleWebClient this$0, String injectJs) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(injectJs, "$injectJs");
        WebView webView = this$0.loadedWebView;
        if (webView != null) {
            this$0.runJavascriptOnWebView(webView, injectJs);
        }
    }

    private final void runJavascriptOnWebView(WebView webView, String injectJs) {
        try {
            Logger.INSTANCE.w(TAG, "mraid Injecting JS " + injectJs);
            if (webView != null) {
                webView.evaluateJavascript(injectJs, null);
            }
        } catch (Throwable th2) {
            new EvaluateJsError("Evaluate js failed " + th2.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10, reason: not valid java name */
    public static final void m7570shouldOverrideUrlLoading$lambda16$lambda10(final VungleWebClient this$0, final WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdFailedToPlay();
        }
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.f
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m7571shouldOverrideUrlLoading$lambda16$lambda10$lambda9(this.f68077b, webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10$lambda-9, reason: not valid java name */
    public static final void m7571shouldOverrideUrlLoading$lambda16$lambda10$lambda9(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-11, reason: not valid java name */
    public static final void m7572shouldOverrideUrlLoading$lambda16$lambda11(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14, reason: not valid java name */
    public static final void m7573shouldOverrideUrlLoading$lambda16$lambda15$lambda14(WebViewAPI.MraidDelegate it, String command, JsonObject args, final VungleWebClient this$0, final WebView webView) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(args, "$args");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (it.processCommand(command, args)) {
            this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.j
                @Override // java.lang.Runnable
                public final void run() {
                    VungleWebClient.m7574shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(this.f68086b, webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    public static final void m7574shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6, reason: not valid java name */
    public static final void m7575shouldOverrideUrlLoading$lambda16$lambda6(final VungleWebClient this$0, final WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final String str = "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.advertisement.createMRAIDArgs() + ')';
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.h
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m7576shouldOverrideUrlLoading$lambda16$lambda6$lambda5(this.f68081b, webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6$lambda-5, reason: not valid java name */
    public static final void m7576shouldOverrideUrlLoading$lambda16$lambda6$lambda5(VungleWebClient this$0, WebView webView, String injectJs) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(injectJs, "$injectJs");
        this$0.runJavascriptOnWebView(webView, injectJs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8, reason: not valid java name */
    public static final void m7577shouldOverrideUrlLoading$lambda16$lambda8(final VungleWebClient this$0, final WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdReadyToPlay();
        }
        this$0.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.e
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m7578shouldOverrideUrlLoading$lambda16$lambda8$lambda7(this.f68075b, webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8$lambda-7, reason: not valid java name */
    public static final void m7578shouldOverrideUrlLoading$lambda16$lambda8$lambda7(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: renamed from: getCollectConsent$vungle_ads_release, reason: from getter */
    public final boolean getCollectConsent() {
        return this.collectConsent;
    }

    @Nullable
    /* JADX INFO: renamed from: getErrorHandler$vungle_ads_release, reason: from getter */
    public final WebViewAPI.WebClientErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    @Nullable
    /* JADX INFO: renamed from: getGdprAccept$vungle_ads_release, reason: from getter */
    public final String getGdprAccept() {
        return this.gdprAccept;
    }

    @Nullable
    /* JADX INFO: renamed from: getGdprBody$vungle_ads_release, reason: from getter */
    public final String getGdprBody() {
        return this.gdprBody;
    }

    @Nullable
    /* JADX INFO: renamed from: getGdprDeny$vungle_ads_release, reason: from getter */
    public final String getGdprDeny() {
        return this.gdprDeny;
    }

    @Nullable
    /* JADX INFO: renamed from: getGdprTitle$vungle_ads_release, reason: from getter */
    public final String getGdprTitle() {
        return this.gdprTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: getHandler$vungle_ads_release, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    @Nullable
    /* JADX INFO: renamed from: getLoadedWebView$vungle_ads_release, reason: from getter */
    public final WebView getLoadedWebView() {
        return this.loadedWebView;
    }

    @Nullable
    /* JADX INFO: renamed from: getMraidDelegate$vungle_ads_release, reason: from getter */
    public final WebViewAPI.MraidDelegate getMraidDelegate() {
        return this.mraidDelegate;
    }

    /* JADX INFO: renamed from: getReady$vungle_ads_release, reason: from getter */
    public final boolean getReady() {
        return this.ready;
    }

    @Nullable
    /* JADX INFO: renamed from: getWebViewObserver$vungle_ads_release, reason: from getter */
    public final WebViewObserver getWebViewObserver() {
        return this.webViewObserver;
    }

    @Nullable
    /* JADX INFO: renamed from: isViewable$vungle_ads_release, reason: from getter */
    public final Boolean getIsViewable() {
        return this.isViewable;
    }

    public final void notifyDiskAvailableSize(long availableDiskSize, long appFolderSize) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + availableDiskSize + '-' + appFolderSize + ')');
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void notifyPropertiesChange(final boolean skipCmdQueue) {
        this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.i
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m7568notifyPropertiesChange$lambda25(skipCmdQueue, this);
            }
        });
    }

    public final void notifySilentModeChange(boolean silentModeEnabled) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            c0 c0Var = new c0();
            kotlinx.serialization.json.i.b(c0Var, "isSilent", Boolean.valueOf(silentModeEnabled));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + c0Var.a() + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView view, @Nullable String url) {
        super.onPageFinished(view, url);
        Logger.INSTANCE.w(TAG, "onPageFinished.");
        if (view == null) {
            return;
        }
        this.loadedWebView = view;
        view.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            view.setWebViewRenderProcessClient(b.a(new VungleWebViewRenderProcessClient(this.errorHandler)));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(view);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView view, int errorCode, @NotNull String description, @NotNull String failingUrl) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceResponse errorResponse) {
        super.onReceivedHttpError(view, request, errorResponse);
        String strValueOf = String.valueOf(errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null);
        String strValueOf2 = String.valueOf(request != null ? request.getUrl() : null);
        boolean z10 = false;
        boolean z11 = request != null && request.isForMainFrame();
        Logger.INSTANCE.e(TAG, "Http Error desc " + strValueOf + ' ' + z11 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z11) {
            z10 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            Logger.Companion companion = Logger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRenderProcessGone url: ");
            sb2.append(view != null ? view.getUrl() : null);
            companion.w(TAG, sb2.toString());
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                return webClientErrorHandler.onWebRenderingProcessGone(view, Boolean.TRUE);
            }
            return true;
        }
        Logger.Companion companion2 = Logger.INSTANCE;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("onRenderProcessGone url: ");
        sb3.append(view != null ? view.getUrl() : null);
        sb3.append(", did crash: ");
        sb3.append(detail != null ? Boolean.valueOf(detail.didCrash()) : null);
        companion2.w(TAG, sb3.toString());
        WebViewAPI.WebClientErrorHandler webClientErrorHandler2 = this.errorHandler;
        if (webClientErrorHandler2 != null) {
            return webClientErrorHandler2.onWebRenderingProcessGone(view, detail != null ? Boolean.valueOf(detail.didCrash()) : null);
        }
        return super.onRenderProcessGone(view, detail);
    }

    @NotNull
    public final Pair<Long, Long> parseRange$vungle_ads_release(@Nullable String rangeHeader, long contentLength) {
        Object objB;
        Pair pair;
        try {
            Result.Companion companion = Result.f93230c;
            if (rangeHeader == null || !StringsKt.a0(rangeHeader, "bytes=", false, 2, null)) {
                pair = new Pair(0L, null);
            } else {
                List listSplit$default = StringsKt.split$default(StringsKt.P0(rangeHeader, "bytes="), new String[]{TokenBuilder.TOKEN_DELIMITER}, false, 0, 6, null);
                String str = (String) CollectionsKt.getOrNull(listSplit$default, 0);
                Long lX = str != null ? StringsKt.x(str) : null;
                String str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
                Long lX2 = str2 != null ? StringsKt.x(str2) : null;
                if (lX == null) {
                    if (lX2 == null) {
                        lX = 0L;
                    } else {
                        lX = Long.valueOf(contentLength - lX2.longValue());
                        lX2 = null;
                    }
                }
                pair = new Pair(lX, lX2);
            }
            objB = Result.b(pair);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            objB = new Pair(0L, null);
        }
        return (Pair) objB;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setAdVisibility(boolean isViewable) {
        this.isViewable = Boolean.valueOf(isViewable);
        notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z10) {
        this.collectConsent = z10;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setConsentStatus(boolean collectedConsent, @Nullable String title, @Nullable String message, @Nullable String accept, @Nullable String deny) {
        this.collectConsent = collectedConsent;
        this.gdprTitle = title;
        this.gdprBody = message;
        this.gdprAccept = accept;
        this.gdprDeny = deny;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setErrorHandler(@NotNull WebViewAPI.WebClientErrorHandler errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(@Nullable WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    public final void setGdprAccept$vungle_ads_release(@Nullable String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(@Nullable String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(@Nullable String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(@Nullable String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(@Nullable WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setMraidDelegate(@Nullable WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(@Nullable WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setReady$vungle_ads_release(boolean z10) {
        this.ready = z10;
    }

    public final void setViewable$vungle_ads_release(@Nullable Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setWebViewObserver(@Nullable WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(@Nullable WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request) {
        Uri url = request != null ? request.getUrl() : null;
        if (url == null) {
            return null;
        }
        String scheme = url.getScheme();
        if (scheme != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = scheme.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase != null) {
                if (!Intrinsics.areEqual(lowerCase, "http") && !Intrinsics.areEqual(lowerCase, "https")) {
                    return null;
                }
                if (!this.advertisement.isPartialDownloadEnabled()) {
                    Logger.INSTANCE.w(TAG, "shouldInterceptRequest called but partial download is disabled.");
                    return null;
                }
                String string = url.toString();
                Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
                AdAsset localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(string);
                String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
                if (localPath == null || localPath.length() == 0) {
                    return null;
                }
                File file = new File(localPath);
                if (!file.exists()) {
                    return null;
                }
                long contentLength = localPartialDownloadAssets.getContentLength();
                if (contentLength <= 0) {
                    return null;
                }
                long length = file.length();
                String str = request.getRequestHeaders().get("Range");
                this.partialDownloadMetric.setMeta(str + " cached:" + length + ' ' + string);
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                Pair<Long, Long> range$vungle_ads_release = parseRange$vungle_ads_release(str, contentLength);
                localPartialDownloadAssets.setRangeStart(range$vungle_ads_release.getFirst().longValue());
                localPartialDownloadAssets.setRangeEnd(range$vungle_ads_release.getSecond());
                long jLongValue = range$vungle_ads_release.component1().longValue();
                Long lComponent2 = range$vungle_ads_release.component2();
                long j10 = length - jLongValue;
                Logger.Companion companion = Logger.INSTANCE;
                companion.i(TAG, ">>request: " + str + " rangeStart=" + jLongValue + " rangeEnd=" + lComponent2 + " cachedFileLength=" + length + " availableBytes=" + j10 + " contentLength=" + contentLength + ' ');
                if (j10 <= 0) {
                    companion.w(TAG, "Requested range exceeds cached file: " + str);
                    localPartialDownloadAssets.waitForDownload();
                    length = file.length();
                }
                long jLongValue2 = lComponent2 != null ? lComponent2.longValue() : length - 1;
                long j11 = (jLongValue2 - jLongValue) + 1;
                try {
                    Result.Companion companion2 = Result.f93230c;
                    FileInputStream fileInputStream = new FileInputStream(file);
                    WebResourceResponse webResourceResponse = new WebResourceResponse("video/mp4", "UTF-8", 206, "Partial Content", MapsKt.mapOf(TuplesKt.to("Content-Type", "video/mp4"), TuplesKt.to(HttpHeaders.ACCEPT_RANGES, "bytes"), TuplesKt.to("Content-Length", String.valueOf(j11)), TuplesKt.to(HttpHeaders.CONTENT_RANGE, "bytes " + jLongValue + '-' + jLongValue2 + IOUtils.DIR_SEPARATOR_UNIX + contentLength)), new BufferedInputStream(fileInputStream, 1024));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("<<Return:");
                    sb2.append(webResourceResponse.getResponseHeaders());
                    companion.i(TAG, sb2.toString());
                    return webResourceResponse;
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.f93230c;
                    Throwable thG = Result.g(Result.b(kotlin.d.a(th2)));
                    if (thG == null) {
                        return null;
                    }
                    Logger.INSTANCE.e(TAG, "Error serving local range video: " + thG.getMessage(), thG);
                    this.partialDownloadErrorMetric.setMeta(string + ' ' + thG.getMessage());
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadErrorMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[Catch: all -> 0x00f7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f7, blocks: (B:3:0x0003, B:5:0x001b, B:8:0x0024, B:10:0x0033, B:13:0x003c, B:15:0x0049, B:17:0x004f, B:43:0x00ab, B:48:0x00bc, B:49:0x00c9, B:53:0x00e2, B:37:0x0092), top: B:81:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af A[Catch: all -> 0x0079, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0079, blocks: (B:25:0x0063, B:28:0x006c, B:45:0x00af, B:51:0x00cf, B:32:0x007e, B:35:0x0087, B:39:0x009a, B:41:0x009e), top: B:83:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.Nullable final android.webkit.WebView r14, @org.jetbrains.annotations.Nullable java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.ui.VungleWebClient.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public VungleWebClient(@NotNull AdPayload advertisement, @NotNull Placement placement, @NotNull ExecutorService offloadExecutor, @Nullable Platform platform, @Nullable PreloadDelegate preloadDelegate, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.platform = platform;
        this.delegate = preloadDelegate;
        this.loadDuration = l10;
        this.handler = new Handler(Looper.getMainLooper());
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.partialDownloadMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.partialDownloadErrorMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.skippedUrlMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceError error) {
        super.onReceivedError(view, request, error);
        String strValueOf = String.valueOf(error != null ? error.getDescription() : null);
        String strValueOf2 = String.valueOf(request != null ? request.getUrl() : null);
        boolean z10 = false;
        boolean z11 = request != null && request.isForMainFrame();
        Logger.INSTANCE.e(TAG, "Error desc " + strValueOf + ' ' + z11 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z11) {
            z10 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z10);
    }
}
