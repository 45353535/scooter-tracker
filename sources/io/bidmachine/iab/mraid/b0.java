package io.bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b9.r;
import com.google.common.base.Ascii;
import com.ironsource.C4240b4;
import com.ironsource.sdk.controller.f;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes12.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f80192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f80193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f80194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f80195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f80196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f80197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u f80198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f80199h;

    public interface a {
        void a(boolean z10);

        void b();

        void c(boolean z10);

        void d(String str);

        void e(String str);

        void f(String str);

        void g(String str);

        void h(n nVar);

        void onClose();

        void onOpen(String str);

        void onPageFinished(String str);

        void q(String str);

        void y(y8.b bVar);
    }

    private class d implements c0 {
        private d() {
        }

        @Override // io.bidmachine.iab.mraid.c0
        public void a(boolean z10) {
            if (b0.this.f80195d.get()) {
                b0.this.m(z10);
            }
            b0.this.f80192a.a(z10);
        }

        @Override // io.bidmachine.iab.mraid.c0
        public void b(p pVar) {
            if (!b0.this.f80195d.get() || b0.this.f80198g == u.HIDDEN) {
                return;
            }
            b0.this.j(pVar);
        }
    }

    public b0(Context context, a aVar, long j10) {
        this.f80192a = aVar;
        this.f80193b = j10;
        a0 a0Var = new a0(context);
        this.f80194c = a0Var;
        a0Var.setWebViewClient(new c());
        a0Var.setMraidWebViewListener(new d());
        this.f80196e = false;
        this.f80197f = false;
        this.f80198g = u.LOADING;
        this.f80195d = new AtomicBoolean(false);
    }

    private void b() {
        p("mraid.nativeCallComplete();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        Map mapP;
        i.c("MraidWebViewController", "handleJsCommand - %s", str);
        try {
            mapP = r.p(str);
        } catch (Throwable th2) {
            i.e("MraidWebViewController", th2);
        }
        if (mapP == null) {
            return;
        }
        String str2 = (String) mapP.get(f.b.f45113g);
        if (str2 == null) {
            i.h("MraidWebViewController", "handleJsCommand not found", new Object[0]);
        } else {
            e(str2, mapP);
            b();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void e(String str, Map map) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1886160473:
                if (str.equals("playVideo")) {
                    b10 = 0;
                }
                break;
            case -1700226527:
                if (str.equals("openPrivacySheet")) {
                    b10 = 1;
                }
                break;
            case -1289167206:
                if (str.equals("expand")) {
                    b10 = 2;
                }
                break;
            case -1097519099:
                if (str.equals(C4240b4.i.f42648r)) {
                    b10 = 3;
                }
                break;
            case -1041060124:
                if (str.equals("noFill")) {
                    b10 = 4;
                }
                break;
            case -934437708:
                if (str.equals("resize")) {
                    b10 = 5;
                }
                break;
            case -733616544:
                if (str.equals("createCalendarEvent")) {
                    b10 = 6;
                }
                break;
            case 3417674:
                if (str.equals("open")) {
                    b10 = 7;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    b10 = 8;
                }
                break;
            case 133423073:
                if (str.equals(MRAIDPresenter.SET_ORIENTATION_PROPERTIES)) {
                    b10 = 9;
                }
                break;
            case 459238621:
                if (str.equals(MRAIDNativeFeature.STORE_PICTURE)) {
                    b10 = 10;
                }
                break;
            case 1614272768:
                if (str.equals("useCustomClose")) {
                    b10 = Ascii.VT;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.f80192a.d((String) map.get("url"));
                break;
            case 1:
                String str2 = (String) map.get("data");
                if (TextUtils.isEmpty(str2)) {
                    i.d("MraidWebViewController", "data is null or empty", new Object[0]);
                } else {
                    try {
                        this.f80192a.f(new String(Base64.decode(str2, 2)));
                    } catch (Throwable unused) {
                        i.d("MraidWebViewController", "data must be base64 encoded json", new Object[0]);
                        return;
                    }
                }
                break;
            case 2:
                t((String) map.get("url"));
                break;
            case 3:
                this.f80192a.b();
                break;
            case 4:
                this.f80192a.y(y8.b.g("Fired noFill event from mraid.js"));
                break;
            case 5:
                i.c("MraidWebViewController", "mraid.resize is not supported", new Object[0]);
                break;
            case 6:
                this.f80192a.g((String) map.get("eventJSON"));
                break;
            case 7:
                String str3 = (String) map.get("url");
                if (!TextUtils.isEmpty(str3)) {
                    r(str3);
                } else {
                    i.d("MraidWebViewController", "url is null or empty", new Object[0]);
                }
                break;
            case 8:
                this.f80192a.onClose();
                break;
            case 9:
                n nVar = new n(Boolean.parseBoolean((String) map.get("allowOrientationChange")), n.a((String) map.get("forceOrientation")));
                this.f80199h = nVar;
                this.f80192a.h(nVar);
                break;
            case 10:
                this.f80192a.e((String) map.get("url"));
                break;
            case 11:
                boolean z10 = Boolean.parseBoolean((String) map.get("useCustomClose"));
                if (this.f80196e != z10) {
                    this.f80196e = z10;
                    this.f80192a.c(z10);
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str) {
        if (!this.f80194c.t()) {
            i.c("MraidWebViewController", "Can't open url because webView wasn't clicked", new Object[0]);
        } else {
            this.f80192a.onOpen(str);
            this.f80194c.r();
        }
    }

    private void t(String str) {
        if (this.f80193b == 0 || System.currentTimeMillis() - this.f80194c.getClickTimeMs() > this.f80193b) {
            return;
        }
        this.f80192a.q(str);
    }

    public boolean A() {
        return this.f80194c.o();
    }

    public void B(String str) {
        this.f80195d.set(false);
        this.f80194c.loadUrl(str);
    }

    public void C(String str, String str2, String str3, String str4) {
        this.f80195d.set(false);
        this.f80194c.loadDataWithBaseURL(str, str2, str3, str4, null);
    }

    public void D() {
        p("mraid.fireReadyEvent();");
    }

    public void g(int i10, int i11) {
        p(String.format("(function click(x, y) {var ev = new MouseEvent('click', {    'view': window,    'bubbles': true,    'cancelable': true,    'screenX': x,    'screenY': y});var el = document.elementFromPoint(x, y);if (el !== null) {      el.dispatchEvent(ev); }})(%s, %s)", Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public void h(r.a aVar) {
        if (aVar == r.a.debug) {
            p("mraid.logLevel = mraid.LogLevelEnum.DEBUG;");
            return;
        }
        if (aVar == r.a.info) {
            p("mraid.logLevel = mraid.LogLevelEnum.INFO;");
            return;
        }
        if (aVar == r.a.warning) {
            p("mraid.logLevel = mraid.LogLevelEnum.WARNING;");
        } else if (aVar == r.a.error) {
            p("mraid.logLevel = mraid.LogLevelEnum.ERROR;");
        } else if (aVar == r.a.none) {
            p("mraid.logLevel = mraid.LogLevelEnum.NONE;");
        }
    }

    public void i(o oVar) {
        if (oVar == null) {
            return;
        }
        p("mraid.setPlacementType('" + oVar.g() + "');");
    }

    public void j(p pVar) {
        Rect rectE = pVar.e();
        Rect rectD = pVar.d();
        p("mraid.setScreenSize(" + rectE.width() + StringUtils.COMMA + rectE.height() + ");mraid.setMaxSize(" + rectD.width() + StringUtils.COMMA + rectD.height() + ");mraid.setCurrentPosition(" + b9.u.I(pVar.b()) + ");mraid.setDefaultPosition(" + b9.u.I(pVar.c()) + ");mraid.fireSizeChangeEvent(" + b9.u.J(pVar.b()) + ");");
    }

    public void k(u uVar) {
        this.f80198g = uVar;
        p("mraid.fireStateChangeEvent('" + uVar.g() + "');");
    }

    public void l(k kVar) {
        p("mraid.setSupports(mraid.SUPPORTED_FEATURES.CALENDAR, " + kVar.b() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.INLINEVIDEO, " + kVar.c() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.SMS, " + kVar.d() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.STOREPICTURE, " + kVar.e() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.TEL, " + kVar.f() + ");");
    }

    public void m(boolean z10) {
        p("mraid.fireViewableChangeEvent(" + z10 + ");");
    }

    void p(String str) {
        this.f80194c.m(str);
    }

    public void u() {
        a0 a0Var = this.f80194c;
        b9.u.F(a0Var);
        a0Var.destroy();
    }

    public n v() {
        return this.f80199h;
    }

    public p w() {
        return this.f80194c.getMraidScreenMetrics();
    }

    public a0 x() {
        return this.f80194c;
    }

    public boolean y() {
        return this.f80197f;
    }

    public boolean z() {
        return this.f80196e;
    }

    private class c extends WebViewClient {
        private c() {
        }

        private WebResourceResponse a() {
            String strH = r.h();
            Charset charset = StandardCharsets.UTF_8;
            return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(strH.getBytes(charset)));
        }

        private void b(String str, String str2, int i10) {
            i.c("MraidWebViewController", "onError: %s / %s / %d", str, str2, Integer.valueOf(i10));
            if (str2 == null || !str2.contains("ERR_INTERNET_DISCONNECTED")) {
                return;
            }
            b0.this.f80197f = true;
        }

        boolean c(Uri uri) {
            return "mraid.js".equals(uri.getLastPathSegment());
        }

        boolean d(String str) {
            return c(Uri.parse(str.toLowerCase(Locale.US)));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            i.c("MraidWebViewController", "onPageFinished", new Object[0]);
            if (b0.this.f80195d.compareAndSet(false, true)) {
                b0.this.f80192a.onPageFinished(str);
                b0.this.f80194c.p();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            i.c("MraidWebViewController", "onPageStarted", new Object[0]);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Uri url = webResourceRequest.getUrl();
            b(url != null ? url.toString() : null, webResourceError.getDescription().toString(), webResourceError.getErrorCode());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            i.c("MraidWebViewController", "onRenderProcessGone", new Object[0]);
            b0.this.u();
            b0.this.f80192a.y(y8.b.f("WebViewClient - onRenderProcessGone"));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return c(webResourceRequest.getUrl()) ? a() : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("mraid://")) {
                b0.this.d(str);
                return true;
            }
            if (z8.b.d(str)) {
                z8.b.c(b0.this.f80194c, str);
                return true;
            }
            b0.this.r(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (d(str)) {
                return a();
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            b(str2, str, i10);
            super.onReceivedError(webView, i10, str, str2);
        }
    }
}
