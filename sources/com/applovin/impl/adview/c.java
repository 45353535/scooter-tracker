package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a8;
import com.applovin.impl.d2;
import com.applovin.impl.f2;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAdSize;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class c extends t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f8321c;

    public c(a aVar, com.applovin.impl.sdk.k kVar) {
        this.f8319a = kVar;
        this.f8320b = kVar.O();
        this.f8321c = aVar;
    }

    private void b() {
        this.f8321c.z();
    }

    private void c() {
        this.f8321c.a();
    }

    @Override // com.applovin.impl.t4
    protected Map a() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", "AdWebViewClient");
        mapHashMap.putAll(f2.a((AppLovinAdImpl) this.f8321c.g()));
        return mapHashMap;
    }

    protected a d() {
        return this.f8321c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.f8320b.d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.f8320b.d("AdWebView", "Loaded URL: " + str);
        }
        this.f8321c.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.ad.b bVarG = this.f8321c.g();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8320b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + bVarG);
        }
        if (n7.a(webResourceRequest.getUrl().toString(), this.f8319a)) {
            this.f8319a.D().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.ad.b bVarG = this.f8321c.g();
        String str = "Received SSL error: " + sslError;
        if (com.applovin.impl.sdk.o.a()) {
            this.f8320b.b("AdWebView", str + " for ad: " + bVarG);
        }
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        com.applovin.impl.sdk.ad.b bVarG = this.f8321c.g();
        com.applovin.impl.sdk.o.h("AdWebView", "Render process gone for ad: " + bVarG + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.f8319a.a(x4.R5)).booleanValue()) {
            a(webView, renderProcessGoneDetail, bVarG);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!com.applovin.impl.sdk.o.a()) {
            return false;
        }
        this.f8320b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        com.applovin.impl.sdk.ad.b bVarG = this.f8321c.g();
        String str3 = "Received error with error code: " + i10 + " with description \\'" + str + "\\' for URL: " + str2;
        if (com.applovin.impl.sdk.o.a()) {
            this.f8320b.b("AdWebView", str3 + " for ad: " + bVarG);
        }
        if (n7.a(str2, this.f8319a)) {
            this.f8319a.D().a("adWebViewReceivedError", str2, i10, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean a(android.webkit.WebView r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.c.a(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    private void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, com.applovin.impl.sdk.ad.b bVar) {
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f8319a.a(x4.Y5)).booleanValue()) {
            throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null"));
        }
        if (webView == null || !webView.equals(this.f8321c.f())) {
            return;
        }
        this.f8321c.b();
        AppLovinAdSize appLovinAdSizeK = this.f8321c.k();
        if (n7.a(appLovinAdSizeK)) {
            this.f8321c.a(appLovinAdSizeK);
            this.f8321c.F();
        }
    }

    private boolean a(boolean z10, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z10) {
            return false;
        }
        boolean zY0 = bVar.Y0();
        a(uri, zY0, bVar, this.f8319a);
        return zY0;
    }

    private static void a(Uri uri, boolean z10, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        if (kVar.c(x4.R6).contains(uri.getScheme())) {
            return;
        }
        kVar.D().d(d2.J0, a(bVar, uri, z10));
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri, boolean z10) {
        Map mapA = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapA);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z10), mapA);
        return mapA;
    }

    private void a(MotionEvent motionEvent) {
        this.f8321c.a(motionEvent);
    }

    private void a(o7 o7Var, b bVar) {
        r7 r7VarG1 = o7Var.g1();
        if (r7VarG1 != null) {
            a8.a(r7VarG1.b(), this.f8321c.j());
            a(bVar, r7VarG1.c());
        }
    }

    private void a(b bVar, Uri uri) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView appLovinAdViewI = this.f8321c.i();
        if (appLovinAdViewI != null && currentAd != null) {
            if (currentAd instanceof o7) {
                ((o7) currentAd).getAdEventTracker().v();
            }
            this.f8321c.a(currentAd, appLovinAdViewI, uri, bVar.getAndClearLastClickEvent());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f8320b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        n7.a(str, com.applovin.impl.sdk.k.o());
    }
}
