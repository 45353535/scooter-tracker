package com.explorestack.iab.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.explorestack.iab.mraid.q;
import com.ironsource.sdk.controller.f;
import e2.f;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f18163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f18164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18165c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f18168f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18167e = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18166d = false;

    class a implements q.e {
        a() {
        }

        @Override // com.explorestack.iab.mraid.q.e
        public void a(boolean z10) {
            if (r.this.f18165c) {
                r.this.l(z10);
            }
            r.this.f18163a.a(z10);
        }
    }

    public interface b {
        void a(boolean z10);

        void b();

        void c(boolean z10);

        void onClose();

        void onOpen(String str);

        void onPageFinished(String str);

        void p(b2.b bVar);

        void q(String str);

        void r(e eVar);

        void s(String str);

        void t(g gVar);
    }

    private class c extends WebViewClient {
        private c() {
        }

        private void a(String str, String str2, int i10) {
            d.a("MraidWebViewController", "onError: %s / %s / %d", str, str2, Integer.valueOf(i10));
            if (str2 == null || !str2.contains("ERR_INTERNET_DISCONNECTED")) {
                return;
            }
            r.this.f18167e = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            d.a("MraidWebViewController", "onPageFinished", new Object[0]);
            if (r.this.f18165c) {
                return;
            }
            r.this.f18165c = true;
            r.this.f18163a.onPageFinished(str);
            r.this.t().h();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            d.a("MraidWebViewController", "onPageStarted", new Object[0]);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            a(str2, str, i10);
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            d.a("MraidWebViewController", "onRenderProcessGone", new Object[0]);
            r.this.a();
            r.this.f18163a.p(b2.b.f("WebViewClient - onRenderProcessGone"));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("mraid://")) {
                r.this.i(str);
                return true;
            }
            if (c2.a.d(str)) {
                c2.a.c(r.this.f18164b, str);
                return true;
            }
            r.this.y(str);
            return true;
        }

        /* synthetic */ c(r rVar, a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Uri url = webResourceRequest.getUrl();
            a(url != null ? url.toString() : null, webResourceError.getDescription().toString(), webResourceError.getErrorCode());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public r(Context context, b bVar) {
        this.f18163a = bVar;
        q qVar = new q(context);
        this.f18164b = qVar;
        qVar.setWebViewClient(new c(this, null));
        qVar.setListener(new a());
    }

    private void B() {
        r("mraid.nativeCallComplete();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        Map mapQ;
        d.a("MraidWebViewController", "handleJsCommand - %s", str);
        try {
            mapQ = p.q(str);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (mapQ == null) {
            return;
        }
        String str2 = (String) mapQ.get(f.b.f45113g);
        if (str2 == null) {
            d.g("MraidWebViewController", "handleJsCommand not found", new Object[0]);
        } else {
            k(str2, mapQ);
            B();
        }
    }

    private void k(String str, Map map) {
        str.getClass();
        switch (str) {
            case "playVideo":
                this.f18163a.s((String) map.get("url"));
                break;
            case "expand":
                this.f18163a.q((String) map.get("url"));
                break;
            case "loaded":
                this.f18163a.b();
                break;
            case "noFill":
                this.f18163a.p(b2.b.g("Fired noFill event from mraid.js"));
                break;
            case "resize":
                g gVar = new g();
                gVar.f18069a = w((String) map.get("width"));
                gVar.f18070b = w((String) map.get("height"));
                gVar.f18071c = w((String) map.get("offsetX"));
                gVar.f18072d = w((String) map.get("offsetY"));
                gVar.f18074f = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                gVar.f18073e = m.g((String) map.get("customClosePosition"));
                this.f18163a.t(gVar);
                break;
            case "open":
                String str2 = (String) map.get("url");
                if (!TextUtils.isEmpty(str2)) {
                    y(str2);
                    break;
                } else {
                    d.d("MraidWebViewController", "url is null or empty", new Object[0]);
                    break;
                }
                break;
            case "close":
                this.f18163a.onClose();
                break;
            case "setOrientationProperties":
                e eVar = new e(Boolean.parseBoolean((String) map.get("allowOrientationChange")), e.a((String) map.get("forceOrientation")));
                this.f18168f = eVar;
                this.f18163a.r(eVar);
                break;
            case "useCustomClose":
                boolean z10 = Boolean.parseBoolean((String) map.get("useCustomClose"));
                if (this.f18166d != z10) {
                    this.f18166d = z10;
                    this.f18163a.c(z10);
                    break;
                }
                break;
        }
    }

    private int w(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(String str) {
        if (!this.f18164b.l()) {
            d.a("MraidWebViewController", "Can't open url because webView wasn't clicked", new Object[0]);
        } else {
            this.f18163a.onOpen(str);
            this.f18164b.j();
        }
    }

    public boolean A() {
        return this.f18164b.g();
    }

    public void C() {
        r("mraid.fireReadyEvent();");
    }

    public void a() {
        q qVarT = t();
        e2.g.F(qVarT);
        qVarT.destroy();
    }

    public void b(int i10, int i11) {
        r(String.format("(function click(x, y) {var ev = new MouseEvent('click', {    'view': window,    'bubbles': true,    'cancelable': true,    'screenX': x,    'screenY': y});var el = document.elementFromPoint(x, y);if (el !== null) {      el.dispatchEvent(ev); }})(%s, %s)", Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public void c(f fVar) {
        r("mraid.setPlacementType('" + fVar.g() + "');");
    }

    public void d(h hVar) {
        Rect rectK = hVar.k();
        Rect rectJ = hVar.j();
        r("mraid.setScreenSize(" + rectK.width() + StringUtils.COMMA + rectK.height() + ");mraid.setMaxSize(" + rectJ.width() + StringUtils.COMMA + rectJ.height() + ");mraid.setCurrentPosition(" + e2.g.G(hVar.a()) + ");mraid.setDefaultPosition(" + e2.g.G(hVar.h()) + ");mraid.fireSizeChangeEvent(" + e2.g.H(hVar.a()) + ");");
    }

    public void e(l lVar) {
        r("mraid.fireStateChangeEvent('" + lVar.g() + "');");
    }

    public void f(o oVar) {
        r("mraid.setSupports(mraid.SUPPORTED_FEATURES.CALENDAR, " + oVar.a() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.INLINEVIDEO, " + oVar.b() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.SMS, " + oVar.c() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.STOREPICTURE, " + oVar.d() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.TEL, " + oVar.e() + ");");
    }

    public void h(f.a aVar) {
        String str;
        if (aVar == f.a.debug) {
            str = "mraid.logLevel = mraid.LogLevelEnum.DEBUG;";
        } else if (aVar == f.a.info) {
            str = "mraid.logLevel = mraid.LogLevelEnum.INFO;";
        } else if (aVar == f.a.warning) {
            str = "mraid.logLevel = mraid.LogLevelEnum.WARNING;";
        } else if (aVar == f.a.error) {
            str = "mraid.logLevel = mraid.LogLevelEnum.ERROR;";
        } else if (aVar != f.a.none) {
            return;
        } else {
            str = "mraid.logLevel = mraid.LogLevelEnum.NONE;";
        }
        r(str);
    }

    public void j(String str, String str2, String str3, String str4) {
        this.f18165c = false;
        t().loadDataWithBaseURL(str, str2, str3, str4, null);
    }

    public void l(boolean z10) {
        r("mraid.fireViewableChangeEvent(" + z10 + ");");
    }

    public e o() {
        return this.f18168f;
    }

    void r(String str) {
        this.f18164b.c(str);
    }

    public q t() {
        return this.f18164b;
    }

    public void v(String str) {
        this.f18165c = false;
        t().loadUrl(str);
    }

    public boolean x() {
        return this.f18167e;
    }

    public boolean z() {
        return this.f18166d;
    }
}
