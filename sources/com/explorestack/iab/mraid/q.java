package com.explorestack.iab.mraid;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import e2.s;

/* JADX INFO: loaded from: classes5.dex */
public class q extends WebView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d f18153h = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f18154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e2.s f18155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f18156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18159g;

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            q.this.f18154b.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    class b implements s.d {
        b() {
        }

        @Override // e2.s.d
        public void a(boolean z10) {
            q.this.k();
        }
    }

    class c implements ValueCallback {
        c() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
            com.explorestack.iab.mraid.d.a("MraidWebView", "evaluate js complete: %s", str);
        }
    }

    private static final class d extends WebChromeClient {
        private d() {
        }

        private boolean a(JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String str;
            if (consoleMessage == null || consoleMessage.message() == null) {
                return false;
            }
            if (com.explorestack.iab.mraid.d.c() && !consoleMessage.message().contains("Uncaught ReferenceError")) {
                String strMessage = consoleMessage.message();
                if (consoleMessage.sourceId() == null) {
                    str = "";
                } else {
                    str = " at " + consoleMessage.sourceId();
                }
                com.explorestack.iab.mraid.d.a("JS console", String.format("%s%s:%d", strMessage, str, Integer.valueOf(consoleMessage.lineNumber())), new Object[0]);
            }
            if (com.explorestack.iab.mraid.d.e() && consoleMessage.message().contains("AppodealAlert")) {
                com.explorestack.iab.mraid.d.d("Appodeal", consoleMessage.message().replace("AppodealAlert:", ""), new Object[0]);
            }
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            com.explorestack.iab.mraid.d.a("JS alert", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            com.explorestack.iab.mraid.d.a("JS confirm", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            com.explorestack.iab.mraid.d.a("JS prompt", str2, new Object[0]);
            return a(jsPromptResult);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    public interface e {
        void a(boolean z10);
    }

    public q(Context context) {
        super(context);
        this.f18157e = false;
        this.f18158f = false;
        this.f18159g = false;
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setScrollBarStyle(33554432);
        setFocusableInTouchMode(false);
        this.f18154b = new t(context);
        setOnTouchListener(new a());
        setWebChromeClient(f18153h);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setBackgroundColor(0);
        this.f18155c = new e2.s(context, this, new b());
    }

    private void b() {
        com.explorestack.iab.mraid.d.a("MraidWebView", C4240b4.i.f42653t0, new Object[0]);
        try {
            onPause();
        } catch (Throwable th2) {
            com.explorestack.iab.mraid.d.b("MraidWebView", th2);
        }
        this.f18158f = true;
        k();
    }

    private void d() {
        com.explorestack.iab.mraid.d.a("MraidWebView", C4240b4.i.f42655u0, new Object[0]);
        try {
            onResume();
        } catch (Throwable th2) {
            com.explorestack.iab.mraid.d.b("MraidWebView", th2);
        }
        this.f18158f = false;
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        boolean z10 = !this.f18158f && this.f18155c.h();
        if (z10 != this.f18157e) {
            this.f18157e = z10;
            e eVar = this.f18156d;
            if (eVar != null) {
                eVar.a(z10);
            }
        }
    }

    public void c(String str) {
        if (f()) {
            com.explorestack.iab.mraid.d.a("MraidWebView", "can't evaluating js: WebView is destroyed", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.explorestack.iab.mraid.d.a("MraidWebView", "can't evaluating js: js is empty", new Object[0]);
            return;
        }
        try {
            com.explorestack.iab.mraid.d.a("MraidWebView", "evaluating js: %s", str);
            evaluateJavascript(str, new c());
        } catch (Throwable th2) {
            com.explorestack.iab.mraid.d.d("MraidWebView", th2.getMessage(), new Object[0]);
            com.explorestack.iab.mraid.d.a("MraidWebView", "loading url: %s", str);
            loadUrl("javascript:" + str);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f18159g = true;
        try {
            i();
            removeAllViews();
            this.f18155c.i();
            super.destroy();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public boolean f() {
        return this.f18159g;
    }

    public boolean g() {
        return this.f18157e;
    }

    public void h() {
        this.f18155c.k();
    }

    public void i() {
        stopLoading();
        loadUrl("");
        b();
    }

    public void j() {
        this.f18154b.b();
    }

    public boolean l() {
        return this.f18154b.a();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            d();
        } else {
            b();
        }
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        return false;
    }

    public void setListener(@Nullable e eVar) {
        this.f18156d = eVar;
    }
}
