package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.media.AbstractC4195z2;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4195z2 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3878m9 f40028a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40031d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40029b = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f40032e = new AtomicBoolean(false);

    public AbstractC4195z2(InterfaceC3878m9 interfaceC3878m9) {
        this.f40028a = interfaceC3878m9;
    }

    public final void a(WebView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f40032e.set(true);
        view.postDelayed(new Runnable() { // from class: w3.kd
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4195z2.a(this.f107156b);
            }
        }, 1000L);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.f40031d) {
            this.f40031d = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Kb.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("BaseWebViewClient", "onRenderProcessGone - WebView crash detected, destroying ad ");
        }
        view.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        int i10;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        C4148x5.f39893a.getClass();
        if (!C4148x5.v() && -1 != (i10 = this.f40029b)) {
            if (i10 > 0) {
                this.f40029b = i10 - 1;
            } else if (!this.f40030c) {
                new Handler(Looper.getMainLooper()).post(new Ge(view));
                this.f40030c = true;
                if (view instanceof GestureDetectorOnGestureListenerC3635ci) {
                    ((GestureDetectorOnGestureListenerC3635ci) view).G();
                }
            }
        }
        WebResourceResponse webResourceResponseA = AbstractC3692eo.a(url, this.f40028a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, url) : webResourceResponseA;
    }

    public static final void a(AbstractC4195z2 abstractC4195z2) {
        abstractC4195z2.f40032e.set(false);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("BaseWebViewClient", "shouldInterceptRequest - url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
        }
        int i10 = this.f40029b;
        if (-1 != i10) {
            if (i10 > 0) {
                this.f40029b = i10 - 1;
            } else if (!this.f40030c) {
                new Handler(Looper.getMainLooper()).post(new Ge(view));
                this.f40030c = true;
                if (view instanceof GestureDetectorOnGestureListenerC3635ci) {
                    ((GestureDetectorOnGestureListenerC3635ci) view).G();
                }
            }
        }
        WebResourceResponse webResourceResponseA = AbstractC3692eo.a(request, this.f40028a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, request) : webResourceResponseA;
    }
}
