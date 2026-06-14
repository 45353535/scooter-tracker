package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfty extends zzftx {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfty(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzc(webView);
    }
}
