package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class v8 extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OverlayActivity f65385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w8 f65386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavigationBarLayout f65387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AnimatingProgressBar f65388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f65389e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f65390f = false;

    public v8(OverlayActivity overlayActivity, NavigationBarLayout navigationBarLayout, AnimatingProgressBar animatingProgressBar, w8 w8Var) {
        this.f65385a = overlayActivity;
        this.f65388d = animatingProgressBar;
        this.f65387c = navigationBarLayout;
        this.f65386b = w8Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (w8.B) {
            return;
        }
        this.f65387c.a(webView);
        int i10 = this.f65389e - 1;
        this.f65389e = i10;
        if (i10 == 0) {
            this.f65390f = false;
            this.f65388d.a();
            if (this.f65388d.isShown()) {
                this.f65388d.setVisibility(8);
            }
            this.f65387c.a(webView);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (w8.B) {
            return;
        }
        if (this.f65390f) {
            this.f65389e = 1;
            this.f65388d.a();
            this.f65387c.a(webView);
        } else {
            this.f65389e = Math.max(this.f65389e, 1);
        }
        this.f65388d.setVisibility(0);
        this.f65387c.b().setText(str);
        this.f65387c.a(webView);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.f65388d.a();
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null && !vi.c(webView.getContext(), str) && !w8.B) {
            if (!this.f65390f) {
                this.f65390f = true;
                this.f65388d.a();
                this.f65389e = 0;
            }
            this.f65389e++;
            if (h0.b(str) && !h0.a(str)) {
                return false;
            }
            this.f65389e = 1;
            h0.b(this.f65385a, str);
            w8 w8Var = this.f65386b;
            if (w8Var != null) {
                w8Var.i();
            }
        }
        return true;
    }
}
