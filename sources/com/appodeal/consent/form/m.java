package com.appodeal.consent.form;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f15448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f15449b;

    public m(r rVar, WebView webView) {
        this.f15448a = rVar;
        this.f15449b = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        r rVar = this.f15448a;
        Context context = this.f15449b.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rVar.getClass();
        return r.h(context, webResourceRequest);
    }
}
