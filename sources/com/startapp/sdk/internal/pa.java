package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes11.dex */
public final class pa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f65096a;

    public pa(za zaVar) {
        this.f65096a = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        za zaVar = this.f65096a;
        zaVar.A = true;
        WebView webView = zaVar.f65681v;
        if (webView != null) {
            webView.setOnTouchListener(null);
        }
    }
}
