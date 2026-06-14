package com.applovin.impl;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import j$.util.Objects;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView) {
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    public static String c(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.external_redirect_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.external_redirect_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return a("al_onExternalRedirectEvent", str2, map);
    }

    public static void b(final WebView webView) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.gd
            @Override // java.lang.Runnable
            public final void run() {
                o8.a(webView);
            }
        });
    }

    public static String d(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.preload_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.preload_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return a("al_onPreloadEvent", str2, map);
    }

    public static String b(String str, Map map) {
        String str2;
        str.getClass();
        switch (str) {
            case "com.applovin.custom_tabs_failure":
                str2 = "failure";
                break;
            case "com.applovin.custom_tabs_hidden":
                str2 = "hidden";
                break;
            case "com.applovin.custom_tabs_shown":
                str2 = "shown";
                break;
            default:
                return null;
        }
        return a("al_onInAppBrowserEvent", str2, map);
    }

    public static String a(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.custom_intent_launch_failure")) {
            str2 = "failure";
        } else {
            if (!str.equals("com.applovin.custom_intent_launch_success")) {
                return null;
            }
            str2 = "success";
        }
        return a("al_onCustomIntentLaunchEvent", str2, map);
    }

    public static String a(Map map) {
        return a("al_onWindowInsetsInfoCollectedEvent", "success", map);
    }

    private static String a(String str, String str2, Map map) {
        JSONObject jSONObject;
        try {
            jSONObject = CollectionUtils.toJson(map);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return "javascript:" + str + "('" + str2 + "'," + jSONObject + ");";
    }

    public static void a(final WebView webView, final String str, String str2, com.applovin.impl.sdk.k kVar) {
        if (webView == null) {
            return;
        }
        try {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.hd
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(str);
                }
            });
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a(str2, "Unable to forward to WebView", th2);
            }
            kVar.D().a(str2, th2, CollectionUtils.hashMap("operation", str));
        }
    }

    public static void a(final WebView webView, final String str) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.jd
            @Override // java.lang.Runnable
            public final void run() {
                webView.evaluateJavascript(str, null);
            }
        });
    }

    public static s4 a(final WebView webView, final String str, com.applovin.impl.sdk.k kVar) {
        final s4 s4Var = new s4("evaluateJavascript");
        if (webView == null) {
            return s4Var.a("null_webview");
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.fd
            @Override // java.lang.Runnable
            public final void run() {
                o8.a(webView, str, s4Var);
            }
        });
        Long l10 = (Long) kVar.a(x4.R2);
        if (l10.longValue() > 0) {
            i6.a(l10.longValue(), s4Var, "timed_out", "evaluateJavascriptTimeout", kVar);
            return s4Var;
        }
        s4Var.b(null);
        return s4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView, String str, final s4 s4Var) {
        Objects.requireNonNull(s4Var);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: com.applovin.impl.id
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                s4Var.b((String) obj);
            }
        });
    }
}
