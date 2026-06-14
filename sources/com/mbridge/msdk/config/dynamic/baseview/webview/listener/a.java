package com.mbridge.msdk.config.dynamic.baseview.webview.listener;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    void onPageFinished(WebView webView, String str);

    void onPageStarted(WebView webView, String str, Bitmap bitmap);

    void onProgressChanged(WebView webView, int i10);

    void onReceivedError(WebView webView, int i10, String str, String str2);

    void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    void onRenderProcessGone(WebView webView);

    boolean shouldOverrideUrlLoading(WebView webView, String str);
}
