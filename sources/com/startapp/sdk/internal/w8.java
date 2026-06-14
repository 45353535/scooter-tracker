package com.startapp.sdk.internal;

import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;
import com.startapp.startappsdk.R;

/* JADX INFO: loaded from: classes11.dex */
public final class w8 extends w7 implements View.OnClickListener {
    public static boolean B;
    public static final int C = R.id.io_start_navigation_bar;
    public static final int D = R.id.io_start_navigation_bar_close;
    public static final int E = R.id.io_start_navigation_bar_external;
    public static final int F = R.id.io_start_navigation_bar_back;
    public static final int G = R.id.io_start_navigation_bar_forward;
    public static final int H = R.id.io_start_navigation_bar_progress;
    public final String A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RelativeLayout f65450v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NavigationBarLayout f65451w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WebView f65452x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AnimatingProgressBar f65453y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public FrameLayout f65454z;

    public w8(String str) {
        this.A = str;
    }

    @Override // com.startapp.sdk.internal.w7
    public final void a(Bundle bundle) throws Throwable {
        zb.a(this.f65429a).a(this.f65431c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        B = false;
        this.f65450v = new RelativeLayout(this.f65429a);
        String str = this.A;
        if (this.f65451w == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f65429a);
            this.f65451w = navigationBarLayout;
            navigationBarLayout.d();
            this.f65451w.c();
            this.f65451w.setButtonsListener(this);
        }
        this.f65450v.addView(this.f65451w);
        this.f65453y = new AnimatingProgressBar(this.f65429a, null, android.R.attr.progressBarStyleHorizontal);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.f65453y.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.f65453y.setBackgroundColor(-1);
        this.f65453y.setId(H);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, li.a(this.f65429a, 4));
        layoutParams.addRule(3, C);
        this.f65450v.addView(this.f65453y, layoutParams);
        this.f65454z = new FrameLayout(this.f65429a);
        if (this.f65452x == null) {
            try {
                j();
                this.f65452x.loadUrl(str);
            } catch (Throwable th2) {
                g9.a(th2);
                this.f65451w.e();
                h0.b(this.f65429a, str);
                this.f65429a.finish();
            }
        }
        this.f65454z.addView(this.f65452x);
        this.f65454z.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, H);
        this.f65450v.addView(this.f65454z, layoutParams2);
        if (bundle != null) {
            this.f65452x.restoreState(bundle);
        }
        this.f65429a.setContentView(this.f65450v, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.startapp.sdk.internal.w7
    public final void b(Bundle bundle) {
        this.f65452x.saveState(bundle);
    }

    @Override // com.startapp.sdk.internal.w7
    public final void f() {
    }

    @Override // com.startapp.sdk.internal.w7
    public final void g() {
    }

    public final void i() {
        try {
            B = true;
            this.f65452x.stopLoading();
            this.f65452x.removeAllViews();
            this.f65452x.postInvalidate();
            this.f65452x.onPause();
            this.f65452x.destroy();
            this.f65452x = null;
        } catch (Exception unused) {
        }
        this.f65451w.e();
        this.f65429a.finish();
    }

    public final void j() {
        WebView webViewC = ((tk) com.startapp.sdk.components.a.a(this.f65429a).f64175b.a()).c();
        this.f65452x = webViewC;
        webViewC.getSettings().setJavaScriptEnabled(true);
        this.f65452x.getSettings().setUseWideViewPort(true);
        this.f65452x.getSettings().setLoadWithOverviewMode(true);
        this.f65452x.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f65452x.getSettings().setBuiltInZoomControls(true);
        this.f65452x.getSettings().setDisplayZoomControls(false);
        this.f65452x.setWebViewClient(new v8(this.f65429a, this.f65451w, this.f65453y, this));
        this.f65452x.setWebChromeClient(new u8(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        if (id2 == F) {
            WebView webView = this.f65452x;
            if (webView == null || !webView.canGoBack()) {
                return;
            }
            this.f65453y.a();
            this.f65452x.goBack();
            return;
        }
        if (id2 == G) {
            WebView webView2 = this.f65452x;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.f65453y.a();
            this.f65452x.goForward();
            return;
        }
        if (id2 != E) {
            if (id2 == D) {
                i();
            }
        } else {
            WebView webView3 = this.f65452x;
            if (webView3 != null) {
                h0.b(this.f65429a, webView3.getUrl());
                i();
            }
        }
    }

    @Override // com.startapp.sdk.internal.w7
    public final boolean a(int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return false;
        }
        WebView webView = this.f65452x;
        if (webView != null && webView.canGoBack()) {
            this.f65453y.a();
            this.f65452x.goBack();
            return true;
        }
        i();
        return true;
    }
}
