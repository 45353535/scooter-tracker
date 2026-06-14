package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3661di extends AbstractC4195z2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3887mi f38452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function1 f38453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f38455i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3661di(C3887mi c3887mi, InterfaceC3878m9 interfaceC3878m9, Function1 onRenderViewProcessGone) {
        super(interfaceC3878m9);
        Intrinsics.checkNotNullParameter(onRenderViewProcessGone, "onRenderViewProcessGone");
        this.f38452f = c3887mi;
        this.f38453g = onRenderViewProcessGone;
        this.f38455i = "redirect";
    }

    public final boolean a(WebView webView, String str) {
        boolean z10;
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("RenderViewClient", "onShouldOverrideUrlLoading  - url - " + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3635ci) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) webView;
            gestureDetectorOnGestureListenerC3635ci.getClass();
            z10 = true;
            if (!gestureDetectorOnGestureListenerC3635ci.a()) {
                gestureDetectorOnGestureListenerC3635ci.a(this.f38455i);
                return true;
            }
            InterfaceC3878m9 interfaceC3878m92 = this.f40028a;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("RenderViewClient", "Placement type:  " + ((int) gestureDetectorOnGestureListenerC3635ci.getPlacementType()) + "  url:" + str);
            }
            a(gestureDetectorOnGestureListenerC3635ci, str);
        } else {
            z10 = false;
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f40028a;
        if (interfaceC3878m93 != null) {
            ((C3903n9) interfaceC3878m93).a("RenderViewClient", "Override URL loading :" + str + " returned " + z10);
        }
        return z10;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("RenderViewClient", "Resource loading:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3635ci) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) webView;
            String url = gestureDetectorOnGestureListenerC3635ci.getUrl();
            if (str == null || url == null || StringsKt.a0(url, "file:", false, 2, null)) {
                return;
            }
            a(gestureDetectorOnGestureListenerC3635ci);
        }
    }

    @Override // com.inmobi.media.AbstractC4195z2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Gh gh2;
        C3887mi c3887mi = this.f38452f;
        if (c3887mi != null) {
            Map mapA = c3887mi.a();
            long j10 = c3887mi.f39043c;
            CoroutineScope coroutineScope = AbstractC3790il.f38771a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3887mi.a("WebViewLoadFinished");
            Wj wj = Wj.f37959a;
            Wj.b(strA, mapA, EnumC3585ak.f38215a);
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("RenderViewClient", "Page load finished:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3635ci) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) webView;
            a(gestureDetectorOnGestureListenerC3635ci);
            if (Intrinsics.areEqual("Loading", gestureDetectorOnGestureListenerC3635ci.f38402z)) {
                gestureDetectorOnGestureListenerC3635ci.g("window.imaiview.broadcastEvent('ready');");
                gestureDetectorOnGestureListenerC3635ci.g("window.mraidview.broadcastEvent('ready');");
                eg.i.d(A9.f36557c, null, null, new Zh(gestureDetectorOnGestureListenerC3635ci, null), 3, null);
            }
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f40028a;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f40028a;
        if (interfaceC3878m93 == null || (gh2 = ((C3903n9) interfaceC3878m93).f39085a) == null) {
            return;
        }
        gh2.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Gh gh2;
        C3887mi c3887mi = this.f38452f;
        if (c3887mi != null) {
            Map mapA = c3887mi.a();
            long j10 = c3887mi.f39043c;
            CoroutineScope coroutineScope = AbstractC3790il.f38771a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3887mi.a("PageStarted");
            Wj wj = Wj.f37959a;
            Wj.b(strA, mapA, EnumC3585ak.f38215a);
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("RenderViewClient", "Page load started:" + str);
        }
        if (webView instanceof GestureDetectorOnGestureListenerC3635ci) {
            InterfaceC3878m9 interfaceC3878m92 = this.f40028a;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("RenderViewClient", "Page load started renderview: " + ((GestureDetectorOnGestureListenerC3635ci) webView).getMarkupType());
            }
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = (GestureDetectorOnGestureListenerC3635ci) webView;
            a(gestureDetectorOnGestureListenerC3635ci);
            gestureDetectorOnGestureListenerC3635ci.setAndUpdateViewState("Loading");
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f40028a;
        if (interfaceC3878m93 != null) {
            ((C3903n9) interfaceC3878m93).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        InterfaceC3878m9 interfaceC3878m94 = this.f40028a;
        if (interfaceC3878m94 == null || (gh2 = ((C3903n9) interfaceC3878m94).f39085a) == null) {
            return;
        }
        gh2.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("RenderViewClient", "OnReceivedError - errorCode - " + i10 + ", description - " + description + ", url - " + failingUrl);
        }
        super.onReceivedError(view, i10, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("RenderViewClient", "ReceivedHttpError - error - " + (webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null) + ", statusCode - " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null) + " url - " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " isMainFrame - " + (webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("RenderViewClient", "onReceivedSSLError - error - " + (sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null) + " - url - " + (sslError != null ? sslError.getUrl() : null));
        }
    }

    @Override // com.inmobi.media.AbstractC4195z2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        if (Build.VERSION.SDK_INT >= 26) {
            InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).c("RenderViewClient", "onRenderProcessGone detail did crash- " + detail.didCrash() + " priority - " + detail.rendererPriorityAtExit());
            }
            this.f38453g.invoke(Boolean.valueOf(detail.didCrash()));
        } else {
            InterfaceC3878m9 interfaceC3878m92 = this.f40028a;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).c("RenderViewClient", "onRenderProcessGone");
            }
        }
        return super.onRenderProcessGone(view, detail);
    }

    @Override // com.inmobi.media.AbstractC4195z2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        WebResourceResponse webResourceResponseA = AbstractC3692eo.a(request, this.f40028a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, request) : webResourceResponseA;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        C4148x5.f39893a.getClass();
        if (!C4148x5.v()) {
            return false;
        }
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return a(view, string);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
        C4148x5.f39893a.getClass();
        if (C4148x5.x()) {
            InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
            if (interfaceC3878m9 != null) {
                int errorCode = error.getErrorCode();
                CharSequence description = error.getDescription();
                ((C3903n9) interfaceC3878m9).b("RenderViewClient", "OnReceivedError - errorCode - " + errorCode + ", description - " + ((Object) description) + ", url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f40028a;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).b("RenderViewClient", "OnReceivedError ");
        }
    }

    @Override // com.inmobi.media.AbstractC4195z2, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        WebResourceResponse webResourceResponseA = AbstractC3692eo.a(url, this.f40028a);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, url) : webResourceResponseA;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("RenderViewClient", "shouldOverrideUrlLoading Called " + url);
        }
        return a(view, url);
    }

    public final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("RenderViewClient", "Override URL loading :" + str);
        }
        gestureDetectorOnGestureListenerC3635ci.s();
        Ta taA = Ua.a(gestureDetectorOnGestureListenerC3635ci.getLandingPageHandler(), this.f38455i, (String) null, str, (Ya) null, 24);
        InterfaceC3878m9 interfaceC3878m92 = this.f40028a;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a("RenderViewClient", "Current Index :" + gestureDetectorOnGestureListenerC3635ci.copyBackForwardList().getCurrentIndex() + " Original Url :" + gestureDetectorOnGestureListenerC3635ci.getOriginalUrl() + " URL: " + str);
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f40028a;
        if (interfaceC3878m93 != null) {
            ((C3903n9) interfaceC3878m93).c("RenderViewClient", "landingPage process result - " + taA.f37760a);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        if (this.f38454h || gestureDetectorOnGestureListenerC3635ci.f38360e) {
            return;
        }
        this.f38454h = true;
        InterfaceC3878m9 interfaceC3878m9 = this.f40028a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        gestureDetectorOnGestureListenerC3635ci.g(gestureDetectorOnGestureListenerC3635ci.getMraidJsString());
    }
}
