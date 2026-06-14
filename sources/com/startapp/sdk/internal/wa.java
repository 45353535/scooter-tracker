package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes11.dex */
public final class wa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f65469a;

    public wa(za zaVar) {
        this.f65469a = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.f65469a.f65681v;
        if (webView != null) {
            webView.onPause();
        }
    }
}
