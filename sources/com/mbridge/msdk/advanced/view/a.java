package com.mbridge.msdk.advanced.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.mbridge.msdk.advanced.middle.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.taurusx.tax.o.g;
import com.vungle.ads.internal.model.AdPayload;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46444c = "NativeAdvancedWebViewClient";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f46445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f46446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f46447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.mbridge.msdk.advanced.middle.a f46448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f46449h;

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.view.a$a, reason: collision with other inner class name */
    class C0491a implements ValueCallback<String> {
        C0491a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public a(String str, com.mbridge.msdk.advanced.middle.a aVar, c cVar) {
        com.mbridge.msdk.foundation.same.directory.c cVar2 = com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC;
        this.f46445d = e.b(cVar2) != null ? e.b(cVar2) : k0.a("YkRXhr5AWBPfNgzuH7JQ+2Ha");
        this.f46446e = k0.a("Y+xgWkl2");
        this.f46447f = str;
        this.f46448g = aVar;
        this.f46449h = cVar;
    }

    private WebResourceResponse a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.f46449h != null) {
            try {
                String strA = "";
                if (str.startsWith(C4240b4.i.f42616b) && str.startsWith(this.f46445d)) {
                    strA = str.replace(AdPayload.FILE_SCHEME, "");
                }
                if (a(str)) {
                    strA = this.f46449h.a(URLDecoder.decode(Uri.parse(str).getQueryParameter(g.f66428y)));
                }
                if (!TextUtils.isEmpty(strA) && a(strA, this.f46445d)) {
                    q0.a("NativeAdvancedWebViewClient", "replace url : " + strA);
                    if (!strA.contains("127.0.0.1") && !strA.startsWith("http")) {
                        HashMap map = new HashMap();
                        map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
                        WebResourceResponse webResourceResponse = new WebResourceResponse("video/mp4", D5.N, new FileInputStream(strA));
                        webResourceResponse.setResponseHeaders(map);
                        return webResourceResponse;
                    }
                    return null;
                }
            } catch (Throwable th2) {
                q0.b("NativeAdvancedWebViewClient", th2.getMessage());
            }
        }
        return null;
    }

    public void b() {
        if (this.f46449h != null) {
            this.f46449h = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.setting.util.a.a().b(), new C0491a());
        } catch (Throwable th2) {
            q0.b("NativeAdvancedWebViewClient", "onPageStarted", th2);
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f46632d) {
                    if (com.mbridge.msdk.click.utils.a.a(((com.mbridge.msdk.advanced.signal.b) windVaneWebView.getObject()).a().get(0), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f46630b)) {
                        return false;
                    }
                }
            } catch (Exception e10) {
                q0.b("NativeAdvancedWebViewClient", e10.getMessage());
            }
            q0.b("NativeAdvancedWebViewClient", "Use html to open url.");
            com.mbridge.msdk.advanced.middle.a aVar = this.f46448g;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, str);
            return true;
        } catch (Throwable th2) {
            q0.b("NativeAdvancedWebViewClient", "shouldOverrideUrlLoading", th2);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webView, webResourceRequest.getUrl().toString());
    }

    private boolean a(String str) {
        Uri uri;
        String scheme;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (scheme = uri.getScheme()) == null || TextUtils.isEmpty(scheme)) {
            return false;
        }
        return scheme.equals(this.f46446e) || scheme.equals("mb-h5");
    }
}
