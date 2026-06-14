package com.iab.omid.library.taurusx.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.taurusx.adsession.ErrorType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f36127a = new g();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f36128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36129b;

        a(WebView webView, String str) {
            this.f36128a = webView;
            this.f36129b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.c(this.f36128a, this.f36129b);
        }
    }

    private g() {
    }

    public static final g a() {
        return f36127a;
    }

    public void b(WebView webView) {
        a(webView, "publishImpressionEvent", new Object[0]);
    }

    public void c(WebView webView) {
        a(webView, "publishLoadedEvent", new Object[0]);
    }

    public void a(WebView webView) {
        a(webView, "finishSession", new Object[0]);
    }

    public void b(WebView webView, String str) {
        a(webView, "setState", str);
    }

    public void c(WebView webView, @NonNull JSONObject jSONObject) {
        a(webView, "setLastActivity", jSONObject);
    }

    public void a(WebView webView, float f10) {
        a(webView, "setDeviceVolume", Float.valueOf(f10));
    }

    public void b(WebView webView, @NonNull JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject);
    }

    public boolean c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
            return true;
        }
    }

    public void a(WebView webView, ErrorType errorType, String str) {
        a(webView, "error", errorType.toString(), str);
    }

    public void a(WebView webView, String str) {
        a(webView, "setNativeViewHierarchy", str);
    }

    public void a(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    public void a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            a(webView, "publishMediaEvent", str);
        }
    }

    public void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    void a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            com.iab.omid.library.taurusx.utils.d.a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        a(sb2, objArr);
        sb2.append(")}");
        a(webView, sb2);
    }

    @VisibleForTesting
    void a(WebView webView, StringBuilder sb2) {
        String string = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            c(webView, string);
        } else {
            handler.post(new a(webView, string));
        }
    }

    public void a(WebView webView, JSONObject jSONObject) {
        a(webView, "init", jSONObject);
    }

    @VisibleForTesting
    void a(StringBuilder sb2, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                sb2.append('\"');
            } else {
                if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb2.append(string);
                    } else {
                        sb2.append('\"');
                        sb2.append(string);
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(StringUtils.COMMA);
            }
            sb2.append('\"');
            sb2.append(StringUtils.COMMA);
        }
        sb2.setLength(sb2.length() - 1);
    }
}
