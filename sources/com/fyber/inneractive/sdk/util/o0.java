package com.fyber.inneractive.sdk.util;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f23889a;

    public o0(WebView webView) {
        this.f23889a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23889a.getSettings().setDisplayZoomControls(false);
    }
}
