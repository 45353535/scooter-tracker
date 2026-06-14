package com.taurusx.tax.t;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.w.s.a;

/* JADX INFO: loaded from: classes11.dex */
public class z extends WebView {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f66597z;
    public boolean mDestroyed;
    public InterfaceC0815z mWebViewListener;

    /* JADX INFO: renamed from: com.taurusx.tax.t.z$z, reason: collision with other inner class name */
    public interface InterfaceC0815z {
        void w();

        void w(WebView webView, String str);

        void w(com.taurusx.tax.w.s.z zVar, a aVar);

        WebResourceResponse z(WebView webView, String str);

        void z();

        void z(com.taurusx.tax.w.s.z zVar, a aVar);

        boolean z(String str);
    }

    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        y();
        com.taurusx.tax.g.s0.w.y(this);
        if (f66597z) {
            return;
        }
        z(getContext());
        f66597z = true;
    }

    private void y() {
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        getSettings().setSavePassword(false);
        getSettings().setCacheMode(1);
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
    }

    private void z(Context context) {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.mDestroyed) {
            return;
        }
        this.mDestroyed = true;
        j0.z(this);
        removeAllViews();
        super.destroy();
    }

    public void loadHtmlResponse(String str) {
    }

    public void loadHtmlResponseWithBaseUrl(String str, String str2) {
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.taurusx.tax.g.s0.w.z(this);
    }

    public void setWebViewListener(InterfaceC0815z interfaceC0815z) {
        this.mWebViewListener = interfaceC0815z;
    }

    public void setWebViewScaleJS() {
        loadUrl("javascript:var meta = document.querySelector('meta[name=viewport]');if (!meta){meta = document.createElement('meta');meta.name = 'viewport'; meta.content = 'width=device-width,user-scalable=no,initial-scale=1,maximum-scale=1';document.getElementsByTagName('head')[0].appendChild(meta);}");
    }

    public z(Context context) {
        super(context.getApplicationContext());
        y();
        com.taurusx.tax.g.s0.w.y(this);
        if (f66597z) {
            return;
        }
        z(getContext());
        f66597z = true;
    }
}
