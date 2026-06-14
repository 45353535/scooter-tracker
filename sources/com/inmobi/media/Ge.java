package com.inmobi.media;

import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ge implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f36941a;

    public Ge(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f36941a = new WeakReference(webView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebSettings settings;
        WebView webView = (WebView) this.f36941a.get();
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.setBlockNetworkLoads(true);
    }
}
