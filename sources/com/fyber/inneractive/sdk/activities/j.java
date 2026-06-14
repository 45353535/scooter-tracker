package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f20149a;

    public j(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f20149a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f20149a.f20129e;
        if (webView == null || !webView.canGoForward()) {
            return;
        }
        this.f20149a.f20129e.goForward();
    }
}
