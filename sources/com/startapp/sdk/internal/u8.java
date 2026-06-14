package com.startapp.sdk.internal;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes11.dex */
public final class u8 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w8 f65339a;

    public u8(w8 w8Var) {
        this.f65339a = w8Var;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        this.f65339a.f65453y.setProgress(i10);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        if (str == null || str.equals("")) {
            return;
        }
        this.f65339a.f65451w.a().setText(str);
    }
}
