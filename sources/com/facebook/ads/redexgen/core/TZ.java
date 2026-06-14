package com.facebook.ads.redexgen.core;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TZ extends WebViewClient {
    public final /* synthetic */ CallableC2438Ta A00;

    public TZ(CallableC2438Ta callableC2438Ta) {
        this.A00 = callableC2438Ta;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC2594Ze.A0D(AbstractC2433Sv.A2j);
        return true;
    }
}
