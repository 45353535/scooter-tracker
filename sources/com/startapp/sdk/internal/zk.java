package com.startapp.sdk.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class zk extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al f65699a;

    public zk(al alVar) {
        this.f65699a = alVar;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f65699a.a(webView, webResourceRequest);
        return new WebResourceResponse(null, null, new ByteArrayInputStream(new byte[0]));
    }
}
