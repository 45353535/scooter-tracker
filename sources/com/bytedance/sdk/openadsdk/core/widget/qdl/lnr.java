package com.bytedance.sdk.openadsdk.core.widget.qdl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.aaj;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private final WeakReference<Context> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private boolean f17566ud = true;
    private final boolean lnr = true;
    private final boolean mml = true;
    private final boolean mzz = false;
    private final boolean mo = true;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f17567wd = true;

    private lnr(Context context) {
        this.qdl = new WeakReference<>(context);
    }

    public static lnr qdl(Context context) {
        return new lnr(context);
    }

    public lnr ud(boolean z10) {
        this.f17566ud = z10;
        return this;
    }

    public static void ud(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            aaj.lnr(th2.toString(), new Object[0]);
        }
    }

    public lnr qdl(boolean z10) {
        this.f17567wd = z10;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void qdl(WebView webView) {
        if (webView == null || this.qdl.get() == null) {
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
        } catch (Exception e10) {
            aaj.lnr("SSWebSettings", e10.getMessage());
        }
        try {
            if (this.f17566ud) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th2) {
            aaj.lnr("SSWebSettings", th2.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.f17567wd) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th3) {
            aaj.lnr("SSWebSettings", th3.getMessage());
        }
    }

    private void qdl(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th2) {
            aaj.lnr(th2.toString(), new Object[0]);
        }
    }

    public static void qdl(com.bytedance.sdk.component.tvp.mo moVar) {
        if (moVar == null) {
            return;
        }
        int iQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("clear_web_cache_new", 0);
        if (iQdl == 0) {
            moVar.qdl(true);
        } else if (iQdl == 1) {
            moVar.qdl(false);
        }
    }
}
