package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.D5;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f20350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20351b;

    public f0(String str, String str2) {
        this.f20350a = str;
        this.f20351b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (iAConfigManager.L == null && (context = iAConfigManager.f20300f) != null) {
            try {
                webView = new WebView(context);
                webView.setWebViewClient(new y());
            } catch (Throwable unused) {
                IAlog.a("failed to create a new webview", new Object[0]);
                webView = null;
            }
            iAConfigManager.L = webView;
        }
        WebView webView2 = iAConfigManager.L;
        String str = this.f20350a;
        String str2 = this.f20351b;
        if (webView2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            webView2.loadDataWithBaseURL(str, str2, "text/html", D5.N, null);
        }
        com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(IAConfigManager.Q, TimeUnit.SECONDS.toMillis(10L));
    }
}
