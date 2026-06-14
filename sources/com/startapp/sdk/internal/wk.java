package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes11.dex */
public final class wk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f65488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xk f65489c;

    public wk(xk xkVar, String str, WebView webView) {
        this.f65489c = xkVar;
        this.f65487a = str;
        this.f65488b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f65489c.f65584g = this.f65487a;
        this.f65488b.setWebViewClient(new sk());
        xk xkVar = this.f65489c;
        WebView webView = this.f65488b;
        xkVar.getClass();
        try {
            xkVar.f65583f.addLast(webView);
        } catch (Throwable th2) {
            if (xkVar.a(4)) {
                g9.a(th2);
            }
        }
    }
}
