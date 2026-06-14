package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes11.dex */
public final class ri implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f65225a;

    public ri(WebView webView) {
        this.f65225a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f65225a.destroy();
        } catch (Throwable unused) {
        }
    }
}
