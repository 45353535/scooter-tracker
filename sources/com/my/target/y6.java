package com.my.target;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y6 extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        he.a aVarA = v1.a();
        if (aVarA == null) {
            gb.a("MyTargetWebViewClient: can't verify ssl Error – certData is null");
            sslErrorHandler.cancel();
        } else if (he.d.a(sslError, aVarA.f73162c)) {
            sslErrorHandler.proceed();
        } else {
            gb.a("MyTargetWebViewClient: ssl error not verified");
            sslErrorHandler.cancel();
        }
    }
}
