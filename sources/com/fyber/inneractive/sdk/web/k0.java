package com.fyber.inneractive.sdk.web;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f24016e;

    public k0(j jVar, boolean z10, int i10, int i11, int i12) {
        this.f24016e = jVar;
        this.f24012a = z10;
        this.f24013b = i10;
        this.f24014c = i11;
        this.f24015d = i12;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.e("Resources to load: %s", str);
        j jVar = this.f24016e;
        if (jVar != null) {
            i iVar = (i) jVar;
            if (TextUtils.isEmpty(str) || !str.startsWith("http://") || com.fyber.inneractive.sdk.util.s.a()) {
                return;
            }
            IAlog.a("%s Found a portential unsecure resource url: %s", IAlog.a(iVar), str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.e("onPageFinished - url: %s", str);
        j jVar = this.f24016e;
        if (jVar != null) {
            jVar.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.e("onPageStarted - url: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        IAlog.e("%sError: code = %d text = %s WebView = %s", IAlog.a(this), Integer.valueOf(i10), str, webView);
        super.onReceivedError(webView, i10, str, str2);
        j jVar = this.f24016e;
        if (jVar != null) {
            jVar.d();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (webView != null) {
            com.fyber.inneractive.sdk.util.v.a(webView);
            webView.destroy();
        }
        j jVar = this.f24016e;
        if (jVar != null) {
            jVar.a();
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.f24012a && webResourceRequest != null) {
            IAlog.e("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            b1 b1Var = b1.f23931c;
            int i10 = this.f24013b;
            int i11 = this.f24014c;
            int i12 = this.f24015d;
            b1Var.getClass();
            WebResourceResponse webResourceResponse = null;
            if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith("http") && TextUtils.equals(webResourceRequest.getMethod(), "GET")) {
                c1 c1Var = (c1) b1Var.f23932a.get(new d1(webResourceRequest));
                if (c1Var != null) {
                    webResourceResponse = new WebResourceResponse(c1Var.f23938c, c1Var.f23939d, c1Var.f23940e, c1Var.f23941f, c1Var.f23937b, new ByteArrayInputStream(c1Var.f23936a));
                } else {
                    try {
                        url = new URL(webResourceRequest.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer byteBufferAllocateDirect = (ByteBuffer) com.fyber.inneractive.sdk.util.f.f23866b.f23867a.poll();
                        if (byteBufferAllocateDirect == null) {
                            byteBufferAllocateDirect = ByteBuffer.allocateDirect(16384);
                        }
                        try {
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                b1.a(webResourceRequest, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i10);
                            httpURLConnection.setReadTimeout(i11);
                            c1 c1VarA = null;
                            while (i12 > 0) {
                                try {
                                    c1VarA = b1.a(httpURLConnection, byteBufferAllocateDirect);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i12 = 0;
                                }
                                if (c1VarA != null) {
                                    break;
                                }
                                i12--;
                            }
                            if (c1VarA != null) {
                                try {
                                    if (c1VarA.a()) {
                                        b1Var.f23932a.put(new d1(webResourceRequest), c1VarA);
                                    }
                                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(c1VarA.f23938c, c1VarA.f23939d, c1VarA.f23940e, c1VarA.f23941f, c1VarA.f23937b, new ByteArrayInputStream(c1VarA.f23936a));
                                    httpURLConnection.disconnect();
                                    com.fyber.inneractive.sdk.util.f.f23866b.f23867a.offer(byteBufferAllocateDirect);
                                    webResourceResponse = webResourceResponse2;
                                } catch (Throwable unused6) {
                                    httpURLConnection.disconnect();
                                    com.fyber.inneractive.sdk.util.f.f23866b.f23867a.offer(byteBufferAllocateDirect);
                                }
                            } else {
                                httpURLConnection.disconnect();
                            }
                            com.fyber.inneractive.sdk.util.f.f23866b.f23867a.offer(byteBufferAllocateDirect);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.e("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        j jVar = this.f24016e;
        return jVar != null && jVar.a(webView, str);
    }
}
