package com.startapp.sdk.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class ok extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f65047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f65048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f65049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ti f65050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f65051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f65052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rk f65053g;

    public ok(rk rkVar, Handler handler, AtomicBoolean atomicBoolean, WebView webView, ti tiVar, AtomicLong atomicLong, int i10) {
        this.f65053g = rkVar;
        this.f65047a = handler;
        this.f65048b = atomicBoolean;
        this.f65049c = webView;
        this.f65050d = tiVar;
        this.f65051e = atomicLong;
        this.f65052f = i10;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        long jB = vi.b();
        this.f65047a.removeCallbacksAndMessages(null);
        this.f65047a.postDelayed(new mk(this, jB), this.f65052f);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f65047a.removeCallbacksAndMessages(null);
        this.f65047a.post(new nk(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null || vi.c(webView.getContext(), str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
