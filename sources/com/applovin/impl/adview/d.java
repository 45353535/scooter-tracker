package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* JADX INFO: loaded from: classes6.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebViewRenderProcessClient f8323b = new a();

    class a extends WebViewRenderProcessClient {
        a() {
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.this.f8322a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    d.this.f8322a.O().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    d(com.applovin.impl.sdk.k kVar) {
        this.f8322a = kVar;
    }

    WebViewRenderProcessClient a() {
        return this.f8323b;
    }
}
