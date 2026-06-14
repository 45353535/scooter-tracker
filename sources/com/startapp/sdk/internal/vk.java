package com.startapp.sdk.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class vk extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xk f65414a;

    public vk(xk xkVar) {
        this.f65414a = xkVar;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        this.f65414a.a(webView, webResourceRequest);
        return new WebResourceResponse(null, null, new ByteArrayInputStream(new byte[0]));
    }
}
