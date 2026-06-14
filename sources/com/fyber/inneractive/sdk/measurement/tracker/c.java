package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f21119a;

    public c(e eVar) {
        this.f21119a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("clearing webview", new Object[0]);
        WebView webView = this.f21119a.f21124e;
        if (webView != null) {
            webView.destroy();
            this.f21119a.f21124e = null;
        }
    }
}
