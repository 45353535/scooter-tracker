package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewAssetLoader;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import hg.l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 extends WebViewClientCompat {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f56444h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f56445i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f56446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebViewAssetLoader f56447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableStateFlow f56448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StateFlow f56449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f56450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateFlow f56451g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(WebResourceRequest webResourceRequest) {
            String string;
            Uri url = webResourceRequest.getUrl();
            if (url == null || (string = url.toString()) == null) {
                string = "";
            }
            Uri uri = Uri.parse(StringsKt.U(string, "mraid.js", "com.moloco.sdk.xenoss.sdkdevkit.mraid.js", true));
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            return uri;
        }

        public a() {
        }
    }

    public g0(Context context, x mraidJsCommandsSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidJsCommandsSource, "mraidJsCommandsSource");
        this.f56446b = mraidJsCommandsSource;
        WebViewAssetLoader webViewAssetLoaderBuild = new WebViewAssetLoader.Builder().addPathHandler("/", new WebViewAssetLoader.AssetsPathHandler(context.getApplicationContext())).build();
        Intrinsics.checkNotNullExpressionValue(webViewAssetLoaderBuild, "build(...)");
        this.f56447c = webViewAssetLoaderBuild;
        MutableStateFlow mutableStateFlowA = l0.a(Boolean.FALSE);
        this.f56448d = mutableStateFlowA;
        this.f56449e = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = l0.a(null);
        this.f56450f = mutableStateFlowA2;
        this.f56451g = hg.i.c(mutableStateFlowA2);
    }

    public final StateFlow c() {
        return this.f56451g;
    }

    public final StateFlow f() {
        return this.f56449e;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f56448d.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f56448d.setValue(Boolean.FALSE);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f56450f.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f56023b);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebViewClient", "onReceivedError " + str, null, false, 12, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f56450f.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f56024c);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebViewClient", "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f56447c.shouldInterceptRequest(f56444h.a(request));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return this.f56446b.a(str);
    }
}
