package com.facebook.ads.redexgen.core;

import android.webkit.WebView;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class CallableC2438Ta implements Callable<String> {
    public final /* synthetic */ SQ A00;

    public CallableC2438Ta(SQ sq) {
        this.A00 = sq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String call() {
        String browserUserAgent = (String) AbstractC2439Tb.A04.get();
        if (browserUserAgent != null) {
            return browserUserAgent;
        }
        WebView webView = new WebView(this.A00.getApplicationContext());
        webView.setWebViewClient(new TZ(this));
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.destroy();
        if (userAgentString != null) {
            AbstractC2439Tb.A04.set(userAgentString);
        }
        return userAgentString;
    }
}
