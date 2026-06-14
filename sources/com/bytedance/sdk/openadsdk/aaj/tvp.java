package com.bytedance.sdk.openadsdk.aaj;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public class tvp {
    private static void qdl(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th2) {
            wd.qdl("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th2);
        }
    }

    private static void ud(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            wd.qdl("WebViewSettings", "removeJavascriptInterfacesSafe error", th2);
        }
    }

    public static void qdl(WebView webView) {
        if (webView == null) {
            return;
        }
        ud(webView);
        WebSettings settings = webView.getSettings();
        qdl(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th2) {
            wd.qdl("WebViewSettings", "setJavaScriptEnabled error", th2);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th3) {
            wd.qdl("WebViewSettings", "setSupportZoom error", th3);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        int i10 = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z10 = i10 >= 28;
        try {
        } catch (Throwable th4) {
            wd.qdl("WebViewSettings", "setLayerType error", th4);
        }
        if (!z10) {
            webView.setLayerType(0, null);
        } else {
            if (z10) {
                webView.setLayerType(2, null);
            }
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}
