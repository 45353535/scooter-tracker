package com.bytedance.sdk.component.tvp;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.tvp.qdl;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class wd extends WebViewClient {
    private final List<String> lnr;
    private final WebViewClient qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final qdl.InterfaceC0236qdl f16687ud;

    public wd(qdl.InterfaceC0236qdl interfaceC0236qdl, WebViewClient webViewClient, List<String> list) {
        this.f16687ud = interfaceC0236qdl;
        this.qdl = webViewClient;
        this.lnr = list;
    }

    private int qdl(WebView webView) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                return webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.qdl.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        qdl.InterfaceC0236qdl interfaceC0236qdl = this.f16687ud;
        if (interfaceC0236qdl != null) {
            interfaceC0236qdl.qdl(qdl(webView));
        }
        this.qdl.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.qdl.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.qdl.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.qdl.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return Build.VERSION.SDK_INT >= 26 ? this.qdl.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.qdl.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        qdl.InterfaceC0236qdl interfaceC0236qdl = this.f16687ud;
        if (interfaceC0236qdl != null) {
            interfaceC0236qdl.qdl();
        }
        return this.qdl.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.qdl.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        qdl.InterfaceC0236qdl interfaceC0236qdl;
        if (ud.qdl(this.lnr, webResourceRequest.getUrl().toString()) && (interfaceC0236qdl = this.f16687ud) != null) {
            interfaceC0236qdl.qdl();
        }
        return this.qdl.shouldInterceptRequest(webView, webResourceRequest);
    }
}
