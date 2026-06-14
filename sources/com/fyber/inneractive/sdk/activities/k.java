package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f20150a;

    public k(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f20150a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f20150a.f20129e;
        if (webView != null) {
            webView.reload();
            int i10 = IAlog.f23840a;
            this.f20150a.f20129e.getUrl();
        }
    }
}
