package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3748h3 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f38681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f38682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3773i3 f38683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S2 f38684d;

    public C3748h3(AtomicBoolean atomicBoolean, Ref$ObjectRef ref$ObjectRef, C3773i3 c3773i3, S2 s22) {
        this.f38681a = atomicBoolean;
        this.f38682b = ref$ObjectRef;
        this.f38683c = c3773i3;
        this.f38684d = s22;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C3773i3.a(this.f38681a, this.f38682b, this.f38683c, this.f38684d, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        C3773i3.a(this.f38681a, this.f38682b, this.f38683c, this.f38684d, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        C3773i3.a(this.f38681a, this.f38682b, this.f38683c, this.f38684d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        C3773i3.a(this.f38681a, this.f38682b, this.f38683c, this.f38684d, false);
        return oo.a(view, detail, "click_mgr");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        return (this.f38684d.f37687d || Intrinsics.areEqual(request.getUrl().toString(), this.f38684d.f37685b)) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        C3773i3.a(this.f38681a, this.f38682b, this.f38683c, this.f38684d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        S2 s22 = this.f38684d;
        return (s22.f37687d || Intrinsics.areEqual(url, s22.f37685b)) ? false : true;
    }
}
