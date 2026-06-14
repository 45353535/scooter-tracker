package sg.bigo.ads.controller.landing;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import sg.bigo.ads.a.a;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final sg.bigo.ads.api.core.b f103728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final b.InterfaceC1253b f103729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f103730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f103731d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f103732e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    sg.bigo.ads.core.h.e f103733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f103734g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: sg.bigo.ads.controller.landing.a$a, reason: collision with other inner class name */
    public interface InterfaceC1284a {
        void a(String str);

        void a(String str, long j10, boolean z10, int i10);
    }

    public a(@NonNull sg.bigo.ads.api.core.b bVar) {
        this.f103728a = bVar;
        b.InterfaceC1253b interfaceC1253bN = bVar.N();
        this.f103729b = interfaceC1253bN;
        this.f103730c = interfaceC1253bN.f();
    }

    public final void a() {
        sg.bigo.ads.common.t.a.a(0, 3, "Preload", "recycleLandWebView isPreloadWebViewReady=" + this.f103731d);
        sg.bigo.ads.core.h.e eVar = this.f103733f;
        if (eVar != null) {
            eVar.destroy();
            this.f103733f = null;
        }
    }

    final boolean b() {
        int i10 = this.f103730c;
        return i10 == 3 || i10 == 4;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    final void a(Context context, final String str, @NonNull final InterfaceC1284a interfaceC1284a) {
        this.f103734g = SystemClock.elapsedRealtime();
        interfaceC1284a.a(str);
        sg.bigo.ads.core.h.e eVarA = sg.bigo.ads.core.h.e.a(context);
        this.f103733f = eVarA;
        if (eVarA == null) {
            return;
        }
        eVarA.setWebChromeClient(new sg.bigo.ads.core.h.c());
        this.f103733f.setWebViewClient(new sg.bigo.ads.core.h.d() { // from class: sg.bigo.ads.controller.landing.a.2
            @Override // sg.bigo.ads.core.h.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                a.this.f103733f = null;
                interfaceC1284a.a(str, SystemClock.elapsedRealtime() - a.this.f103734g, false, 0);
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                sg.bigo.ads.common.t.a.a(0, 3, "Preload", "onPageFinished: url=" + webView.getUrl());
                interfaceC1284a.a(str2, SystemClock.elapsedRealtime() - a.this.f103734g, true, 0);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i10, String str2, String str3) {
                super.onReceivedError(webView, i10, str2, str3);
                sg.bigo.ads.common.t.a.b("Preload", "onReceivedError: " + i10 + " " + str2);
                interfaceC1284a.a(str, SystemClock.elapsedRealtime() - a.this.f103734g, false, 0);
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            @TargetApi(23)
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    onReceivedError(webView, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceRequest.getUrl().toString());
                }
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            @TargetApi(23)
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
                }
            }
        });
        this.f103733f.setLeft(0);
        this.f103733f.setTop(0);
        this.f103733f.setRight(sg.bigo.ads.common.utils.e.b(context));
        this.f103733f.setBottom(sg.bigo.ads.common.utils.e.c(context) - sg.bigo.ads.common.utils.e.a(context, 55));
        this.f103733f.loadUrl(str);
    }

    static /* synthetic */ void a(a aVar, Context context, final String str, int i10, final InterfaceC1284a interfaceC1284a) {
        if (i10 == 0) {
            aVar.a(context, str, interfaceC1284a);
            return;
        }
        if (i10 != 2) {
            sg.bigo.ads.common.t.a.a(0, "Preload", "PreloadLand: error open type.");
            return;
        }
        aVar.f103734g = SystemClock.elapsedRealtime();
        a.C1201a c1201a = new a.C1201a();
        c1201a.f100067a = str;
        sg.bigo.ads.a.a aVarA = c1201a.a();
        sg.bigo.ads.a.c.a(context, aVarA.f100060a, new a.b() { // from class: sg.bigo.ads.controller.landing.a.1
            @Override // sg.bigo.ads.a.a.b
            public final void a(Context context2, String str2, final int i11, String str3) {
                sg.bigo.ads.common.t.a.a(0, 3, "Preload", "Preload by chrome tabs failed, using webView.");
                a.this.a(context2, str2, new InterfaceC1284a() { // from class: sg.bigo.ads.controller.landing.a.1.1
                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC1284a
                    public final void a(String str4) {
                        InterfaceC1284a interfaceC1284a2 = interfaceC1284a;
                        if (interfaceC1284a2 != null) {
                            interfaceC1284a2.a(str4);
                        }
                    }

                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC1284a
                    public final void a(String str4, long j10, boolean z10, int i12) {
                        InterfaceC1284a interfaceC1284a2 = interfaceC1284a;
                        if (interfaceC1284a2 != null) {
                            interfaceC1284a2.a(str4, j10, z10, e.a(i11));
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.a.a.b
            public final void a(String str2, String str3, String str4) {
                InterfaceC1284a interfaceC1284a2 = interfaceC1284a;
                if (interfaceC1284a2 != null) {
                    interfaceC1284a2.a(str, SystemClock.elapsedRealtime() - a.this.f103734g, true, 2);
                }
            }
        });
    }
}
