package com.iab.omid.library.bigosg.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
