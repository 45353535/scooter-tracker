package com.pubmatic.sdk.webrendering.ui;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;

/* JADX INFO: loaded from: classes11.dex */
public class POBHTMLViewClient extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HTMLViewClientListener f63450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final OnRenderProcessGoneListener f63453d;

    public interface HTMLViewClientListener {
        void onPageFinished(@NonNull WebView webView);

        void onReceivedError(@NonNull POBError pOBError);

        boolean shouldOverrideUrlLoading(@Nullable String str);
    }

    public interface OnRenderProcessGoneListener {
        void onRenderProcessGone();
    }

    public POBHTMLViewClient(@NonNull OnRenderProcessGoneListener onRenderProcessGoneListener) {
        this.f63453d = onRenderProcessGoneListener;
    }

    private void a(String str) {
        POBLog.error("POBHTMLViewClient", str, new Object[0]);
        HTMLViewClientListener hTMLViewClientListener = this.f63450a;
        if (hTMLViewClientListener != null) {
            hTMLViewClientListener.onReceivedError(new POBError(1009, str));
        }
    }

    public void disableMultipleOnPageFinished(boolean z10) {
        this.f63451b = z10;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        HTMLViewClientListener hTMLViewClientListener;
        super.onPageFinished(webView, str);
        POBLog.debug("POBHTMLViewClient", "WebView creative loading finished.", new Object[0]);
        if (!this.f63452c && (hTMLViewClientListener = this.f63450a) != null) {
            hTMLViewClientListener.onPageFinished(webView);
            this.f63452c = this.f63451b;
        }
        webView.setFocusableInTouchMode(true);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (renderProcessGoneDetail != null) {
            POBLog.error("POBHTMLViewClient", "WebView Render process gone, did it crash? :-> %s, reason: %s", Boolean.valueOf(renderProcessGoneDetail.didCrash()), Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
        }
        this.f63453d.onRenderProcessGone();
        return true;
    }

    public void setHTMLClientListener(@Nullable HTMLViewClientListener hTMLViewClientListener) {
        this.f63450a = hTMLViewClientListener;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        HTMLViewClientListener hTMLViewClientListener;
        boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
        if (Build.VERSION.SDK_INT >= 24 || (hTMLViewClientListener = this.f63450a) == null) {
            return zShouldOverrideUrlLoading;
        }
        boolean zShouldOverrideUrlLoading2 = hTMLViewClientListener.shouldOverrideUrlLoading(str);
        POBLog.debug("POBHTMLViewClient", "WebView should override url loading : url", new Object[0]);
        return zShouldOverrideUrlLoading2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            a(String.format("WebView received error on page loading. Error : %s", webResourceError != null ? webResourceError.toString() : " Not defined"));
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, webResourceRequest);
        POBLog.debug("POBHTMLViewClient", "WebView shouldOverrideUrlLoading.. Request redirect = " + webResourceRequest.isRedirect(), new Object[0]);
        if (webResourceRequest.isRedirect() || webResourceRequest.getUrl() == null) {
            return zShouldOverrideUrlLoading;
        }
        String string = webResourceRequest.getUrl().toString();
        HTMLViewClientListener hTMLViewClientListener = this.f63450a;
        return hTMLViewClientListener != null ? hTMLViewClientListener.shouldOverrideUrlLoading(string) : zShouldOverrideUrlLoading;
    }
}
