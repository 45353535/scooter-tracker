package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class U5 extends AbstractC4195z2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f37821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f37822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function1 f37823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function2 f37824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ya f37825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Wa f37826k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5(String api, Function0 onUserLandingCompleted, Function1 onLpLifecycleEvent, Function2 fireLandingPageTracker, InterfaceC3878m9 interfaceC3878m9) {
        super(interfaceC3878m9);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(onUserLandingCompleted, "onUserLandingCompleted");
        Intrinsics.checkNotNullParameter(onLpLifecycleEvent, "onLpLifecycleEvent");
        Intrinsics.checkNotNullParameter(fireLandingPageTracker, "fireLandingPageTracker");
        this.f37821f = api;
        this.f37822g = onUserLandingCompleted;
        this.f37823h = onLpLifecycleEvent;
        this.f37824i = fireLandingPageTracker;
    }

    public final boolean a(WebView webView, String str) {
        String url;
        Integer num;
        int i10;
        T5 t52;
        InterfaceC3586al userLeftApplicationListener;
        if (this.f40032e.get()) {
            return true;
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("EmbeddedBrowserViewClient", "onShouldOverrideUrlLoading: " + str);
        }
        if (webView instanceof AbstractC4170y2) {
            url = str;
            Ta taA = Ua.a(((AbstractC4170y2) webView).getLandingPageHandler(), this.f37821f, (String) null, url, this.f37825j, 16);
            num = taA.f37761b;
            i10 = taA.f37760a;
        } else {
            url = str;
            num = null;
            i10 = 0;
        }
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                return false;
            }
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 10);
            Wa wa2 = this.f37826k;
            if (wa2 != null) {
                wa2.a(3, false, url, numValueOf);
            }
            return true;
        }
        boolean z10 = webView instanceof V5;
        if (z10) {
            ViewParent parent = ((V5) webView).getParent();
            if ((parent instanceof Q5) && (userLeftApplicationListener = ((Q5) parent).getUserLeftApplicationListener()) != null) {
                userLeftApplicationListener.a();
            }
        }
        Function1 function1 = this.f37823h;
        Mh mh2 = GestureDetectorOnGestureListenerC3635ci.f38345e1;
        String str2 = this.f37821f;
        mh2.getClass();
        function1.invoke(Mh.a(str2, "onNavigatingAway"));
        a(webView);
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(uri, "Uri.parse(this)");
        if (!AbstractC4146x3.a(uri) || Intrinsics.areEqual(com.taurusx.tax.g.f0.f66126w, uri.getHost()) || Intrinsics.areEqual(com.taurusx.tax.g.f0.f66128z, uri.getHost()) || Intrinsics.areEqual("market", uri.getScheme())) {
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (z10) {
                ViewParent parent2 = ((V5) webView).getParent();
                if ((parent2 instanceof Q5) && (t52 = ((Q5) parent2).f37576d) != null) {
                    M8.a(((L8) t52).f37270a);
                }
            }
        }
        a(this, 2, false, url, 8);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("EmbeddedBrowserViewClient", "onPageCommitVisible: " + str);
        }
        a(this, 4, true, str, 8);
    }

    @Override // com.inmobi.media.AbstractC4195z2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("EmbeddedBrowserViewClient", "onPageFinished: " + str);
        }
        a(this, 2, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("EmbeddedBrowserViewClient", "onPageStarted: " + str);
        }
        Function1 function1 = this.f37823h;
        Mh mh2 = GestureDetectorOnGestureListenerC3635ci.f38345e1;
        String str2 = this.f37821f;
        mh2.getClass();
        function1.invoke(Mh.a(str2, "onPageStart"));
        a(this, 1, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        Integer numValueOf = Integer.valueOf(i10);
        Wa wa2 = this.f37826k;
        if (wa2 != null) {
            wa2.a(3, false, failingUrl, numValueOf);
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("EmbeddedBrowserViewClient", "onReceivedError: " + failingUrl);
        }
    }

    @Override // com.inmobi.media.AbstractC4195z2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        boolean zOnRenderProcessGone = super.onRenderProcessGone(view, detail);
        if (Build.VERSION.SDK_INT >= 26) {
            Wa wa2 = this.f37826k;
            if (wa2 != null) {
                wa2.a(3, true, null, 8007);
            }
            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("source", "embedded_browser"), TuplesKt.to("isCrashed", Boolean.valueOf(detail.didCrash())));
            Wj wj = Wj.f37959a;
            Wj.b("WebViewRenderProcessGoneEvent", mapMutableMapOf, EnumC3585ak.f38215a);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string;
        Uri url;
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        C4148x5.f39893a.getClass();
        if (!C4148x5.v()) {
            return false;
        }
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            string = "";
        }
        if (webView == null || string.length() <= 0) {
            return false;
        }
        return a(webView, string);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("EmbeddedBrowserViewClient", "onReceivedError: " + request.getUrl());
        }
        if (request.isForMainFrame()) {
            Integer numValueOf = Integer.valueOf(error.getErrorCode());
            String string = request.getUrl().toString();
            Wa wa2 = this.f37826k;
            if (wa2 != null) {
                wa2.a(3, true, string, numValueOf);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (webView == null || str == null) {
            return false;
        }
        return a(webView, str);
    }

    public static void a(U5 u52, int i10, boolean z10, String str, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        Wa wa2 = u52.f37826k;
        if (wa2 != null) {
            wa2.a(i10, z10, str, null);
        }
    }
}
