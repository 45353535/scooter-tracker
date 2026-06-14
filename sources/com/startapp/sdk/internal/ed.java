package com.startapp.sdk.internal;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;

/* JADX INFO: loaded from: classes11.dex */
public final class ed extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f64458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerStandard.a f64459b;

    public ed(w1 w1Var, BannerStandard.a aVar) {
        this.f64458a = w1Var;
        this.f64459b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        BannerStandard.a aVar;
        if (webView == null || str == null || (aVar = this.f64459b) == null) {
            return;
        }
        aVar.onPageFinished(str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!cd.a(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        BannerStandard.a aVar = this.f64459b;
        if (aVar != null) {
            aVar.onMraidDetected();
        }
        return ((cd) com.startapp.sdk.components.a.a(webView.getContext()).T.a()).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.ed.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
