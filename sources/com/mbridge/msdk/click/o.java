package com.mbridge.msdk.click;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.net.HttpHeaders;
import com.ironsource.D5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f46544r = "o";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46546b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f46548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f46549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f46551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WebView f46552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f46553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f46554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f46555k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f46557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f46558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f46559o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f46556l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f46560p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f46561q = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f46547c = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f46563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f46564c;

        a(String str, String str2, Context context) {
            this.f46562a = str;
            this.f46563b = str2;
            this.f46564c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.a(this.f46562a, this.f46563b, this.f46564c, oVar.f46550f);
        }
    }

    class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f46567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f46568c;

        b(String str, String str2, Context context) {
            this.f46566a = str;
            this.f46567b = str2;
            this.f46568c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
                if (o.this.f46557m) {
                    o.this.f46555k = 0;
                    o.this.f();
                    return;
                }
                o.this.f46559o = false;
                if (webView.getTag() == null) {
                    webView.setTag("has_first_started");
                } else {
                    o.this.f46558n = true;
                }
                synchronized (o.f46544r) {
                    try {
                        o.this.f46550f = str;
                        if (o.this.f46549e == null || !o.this.f46549e.a(str)) {
                            o.this.h();
                        } else {
                            o.this.f46557m = true;
                            o.this.f();
                        }
                    } finally {
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            synchronized (o.f46544r) {
                o.this.f46557m = true;
                o.this.b();
                o.this.f();
            }
            if (o.this.f46549e != null) {
                o.this.f46549e.a(i10, webView.getUrl(), str, o.this.f46554j);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.f46566a) || TextUtils.isEmpty(this.f46567b)) {
                    return;
                }
                new com.mbridge.msdk.foundation.same.report.h(this.f46568c).a(this.f46567b, this.f46566a, webView.getUrl());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (o.f46544r) {
                    o.this.f46557m = true;
                    o.this.b();
                    o.this.f();
                }
                if (o.this.f46549e != null) {
                    o.this.f46549e.a(-1, webView.getUrl(), "WebView render process crash.", o.this.f46554j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th2) {
                q0.b(o.f46544r, th2.getMessage());
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            synchronized (o.f46544r) {
                try {
                    o oVar = o.this;
                    oVar.f46559o = true;
                    oVar.c();
                    if (o.this.f46557m) {
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    o.this.f46550f = str;
                    if (o.this.f46549e != null && o.this.f46549e.c(str)) {
                        o.this.f46557m = true;
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    if (o.this.f46553i) {
                        HashMap map = new HashMap();
                        if (o.this.f46552h.getUrl() != null) {
                            map.put(HttpHeaders.REFERER, o.this.f46552h.getUrl());
                        }
                        o.this.f46552h.loadUrl(str, map);
                    } else {
                        o.this.f46552h.loadUrl(str);
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class c extends WebChromeClient {
        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (!o.this.f46557m) {
                        o oVar = o.this;
                        if (!oVar.f46559o) {
                            oVar.g();
                        }
                    }
                    if (o.this.f46549e != null) {
                        o.this.f46549e.b(webView.getUrl());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f46556l = true;
            o.this.f46555k = 1;
            o.this.e();
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f46556l = true;
            o.this.f46555k = 2;
            o.this.e();
        }
    }

    interface f {
        void a(int i10, String str, String str2, String str3);

        void a(String str, boolean z10, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public o() {
        this.f46545a = 15000;
        this.f46546b = 3000;
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f46548d = gVarD;
        if (gVarD == null) {
            this.f46548d = com.mbridge.msdk.setting.h.b().a();
        }
        this.f46553i = this.f46548d.J0();
        this.f46545a = (int) this.f46548d.p0();
        this.f46546b = (int) this.f46548d.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f46547c.removeCallbacks(this.f46560p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f46547c.removeCallbacks(this.f46561q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (f46544r) {
            try {
                try {
                    b();
                    this.f46552h.destroy();
                    f fVar = this.f46549e;
                    if (fVar != null) {
                        fVar.a(this.f46550f, this.f46556l, this.f46554j);
                    }
                } catch (Exception e10) {
                    q0.b(f46544r, e10.getMessage());
                } catch (Throwable th2) {
                    q0.b(f46544r, th2.getMessage());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (f46544r) {
            try {
                try {
                    try {
                        b();
                        f fVar = this.f46549e;
                        if (fVar != null) {
                            fVar.a(this.f46550f, this.f46556l, this.f46554j);
                        }
                    } catch (Exception e10) {
                        q0.b(f46544r, e10.getMessage());
                    }
                } finally {
                }
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d();
        j();
    }

    private void i() {
        this.f46547c.postDelayed(this.f46560p, this.f46546b);
    }

    private void j() {
        this.f46547c.postDelayed(this.f46561q, this.f46545a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar != null) {
            this.f46551g = str4;
            this.f46550f = str3;
            this.f46549e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar != null) {
            this.f46550f = str3;
            this.f46549e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f46550f);
        } else {
            this.f46547c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f46551g)) {
                this.f46552h.getSettings().setDefaultTextEncodingName(D5.N);
                this.f46546b = 2000;
                this.f46545a = 2000;
                q0.c(f46544r, this.f46551g);
                this.f46552h.loadDataWithBaseURL(str3, this.f46551g, "*/*", D5.N, str3);
                return;
            }
            if (this.f46553i) {
                HashMap map = new HashMap();
                if (this.f46552h.getUrl() != null) {
                    map.put(HttpHeaders.REFERER, this.f46552h.getUrl());
                }
                this.f46552h.loadUrl(str3, map);
                return;
            }
            this.f46552h.loadUrl(str3);
        } catch (Throwable th2) {
            try {
                f fVar = this.f46549e;
                if (fVar != null) {
                    fVar.a(0, this.f46550f, th2.getMessage(), this.f46554j);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.f46552h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f46552h.getSettings().setCacheMode(2);
        this.f46552h.getSettings().setLoadsImagesAutomatically(false);
        this.f46552h.setWebViewClient(new b(str2, str, context));
        this.f46552h.setWebChromeClient(new c());
    }
}
