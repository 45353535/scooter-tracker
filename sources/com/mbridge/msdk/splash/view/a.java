package com.mbridge.msdk.splash.view;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes10.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51000c = "SplashWebViewClient";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.splash.middle.a f51001d;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.a$a, reason: collision with other inner class name */
    class C0574a implements ValueCallback<String> {
        C0574a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public void a(com.mbridge.msdk.splash.middle.a aVar) {
        if (aVar != null) {
            this.f51001d = aVar;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.setting.util.a.a().b(), new C0574a());
        } catch (Throwable th2) {
            q0.b("SplashWebViewClient", "onPageStarted", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
            if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f46632d && com.mbridge.msdk.click.utils.a.a(((com.mbridge.msdk.splash.signal.b) windVaneWebView.getObject()).b().get(0), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f46630b)) {
                return false;
            }
            com.mbridge.msdk.splash.middle.a aVar = this.f51001d;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, str);
            return true;
        } catch (Throwable th2) {
            q0.b("SplashWebViewClient", "shouldOverrideUrlLoading", th2);
            return false;
        }
    }
}
