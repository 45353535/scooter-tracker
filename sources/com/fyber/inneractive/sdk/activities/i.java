package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f20148a;

    public i(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f20148a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f20148a.f20129e;
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        this.f20148a.f20129e.goBack();
    }
}
