package com.mbridge.msdk.config.component.wei.monitor;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSession;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AdSession f47342a;

    public b(AdSession adSession) {
        this.f47342a = adSession;
    }

    public void a(WebView webView) {
        this.f47342a.registerAdView(webView);
    }
}
