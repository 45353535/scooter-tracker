package com.ironsource;

import android.annotation.TargetApi;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.H8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4413l8 extends WebViewClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43551b = "l8";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H8.a f43552a;

    public C4413l8(H8.a aVar) {
        this.f43552a = aVar;
    }

    private String a(String str, String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        try {
            this.f43552a.a(a("onReceivedError", String.valueOf(i10)));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f43552a.a(a("onReceivedHttpError", String.valueOf(webResourceResponse.getStatusCode())));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            Logger.e(f43551b, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            this.f43552a.b(renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system");
            return true;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return true;
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f43552a.a(a("onReceivedErrorM", String.valueOf(webResourceError.getErrorCode())));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }
}
