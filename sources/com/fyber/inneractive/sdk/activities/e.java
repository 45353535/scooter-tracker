package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f20144a;

    public e(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f20144a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        this.f20144a.setTitle("Page is Loading...");
        this.f20144a.setProgress(i10 * 100);
        if (i10 == 100) {
            this.f20144a.setTitle(webView.getUrl());
        }
    }
}
