package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 extends m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f59927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f59929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f59930g;

    public interface a {
        void a();

        void a(WebView webView);

        void a(String str);

        void b(String str);
    }

    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            gb.a("BannerWebView$MyWebChromeClient: JS console message " + consoleMessage.message() + " at line " + consoleMessage.lineNumber());
            return false;
        }
    }

    public interface d {
        void a();
    }

    public static final class e extends GestureDetector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f59932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f59933b;

        public interface a {
            void a();
        }

        public e(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        public void a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                onTouchEvent(motionEvent);
                return;
            }
            if (action != 1) {
                if (action == 2 && a(motionEvent, this.f59932a)) {
                    onTouchEvent(motionEvent);
                    return;
                }
                return;
            }
            if (this.f59933b == null) {
                gb.a("BannerWebView$ViewGestureDetector: View's onUserClick() is not registered");
            } else {
                gb.a("BannerWebView$ViewGestureDetector: Gestures - user clicked");
                this.f59933b.a();
            }
        }

        public e(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.f59932a = view;
            setIsLongpressEnabled(false);
        }

        public void a(a aVar) {
            this.f59933b = aVar;
        }

        public final boolean a(MotionEvent motionEvent, View view) {
            if (motionEvent != null && view != null) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (x10 >= 0.0f && x10 <= view.getWidth() && y10 >= 0.0f && y10 <= view.getHeight()) {
                    return true;
                }
            }
            return false;
        }
    }

    public j0(Context context) {
        super(context);
        b bVar = new b();
        c cVar = new c();
        final e eVar = new e(getContext(), this);
        eVar.a(new e.a() { // from class: k5.u0
            @Override // com.my.target.j0.e.a
            public final void a() {
                this.f86146a.g();
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: k5.v0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return com.my.target.j0.a(eVar, view, motionEvent);
            }
        });
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        setWebChromeClient(bVar);
        setWebViewClient(cVar);
    }

    public static /* synthetic */ boolean a(e eVar, View view, MotionEvent motionEvent) {
        eVar.a(motionEvent);
        return false;
    }

    public void b(String str) {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    public void c(String str) {
        a aVar = this.f59927d;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    public final /* synthetic */ void g() {
        this.f59929f = true;
    }

    public void h() {
        this.f59929f = false;
    }

    @Override // com.my.target.m0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d dVar = this.f59930g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setBannerWebViewListener(@Nullable a aVar) {
        this.f59927d = aVar;
    }

    public void setData(@NonNull String str) {
        this.f59928e = false;
        this.f59929f = false;
        a("https://ad.mail.ru/", str, "text/html", "UTF-8", null);
    }

    public void setForceMediaPlayback(boolean z10) {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.getSettings().setMediaPlaybackRequiresUserGesture(!z10);
    }

    public void setOnLayoutListener(@Nullable d dVar) {
        this.f59930g = dVar;
    }

    public final class c extends y6 {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            j0 j0Var = j0.this;
            if (j0Var.f59928e) {
                return;
            }
            j0Var.f59928e = true;
            gb.a("BannerWebView$MyWebViewClient: Page loaded");
            super.onPageFinished(webView, str);
            a aVar = j0.this.f59927d;
            if (aVar != null) {
                aVar.a(webView);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            gb.a("BannerWebView$MyWebViewClient: Load page started");
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            gb.a("BannerWebView$MyWebViewClient: Load failed. Error - " + i10 + ", description - " + str + ", url - " + str2);
            super.onReceivedError(webView, i10, str, str2);
            a aVar = j0.this.f59927d;
            if (aVar == null) {
                return;
            }
            if (str == null) {
                str = "unknown JS error";
            }
            aVar.a(str);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            gb.b("WebView crashed");
            a aVar = j0.this.f59927d;
            if (aVar == null) {
                return true;
            }
            aVar.a();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f10, float f11) {
            super.onScaleChanged(webView, f10, f11);
            gb.a("BannerWebView$MyWebViewClient: Scale new - " + f11 + ", old - " + f10);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            j0 j0Var = j0.this;
            if (j0Var.f59929f && str != null) {
                j0Var.c(str);
                j0.this.h();
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            if (!j0.this.f59929f || (url = webResourceRequest.getUrl()) == null) {
                return true;
            }
            j0.this.c(url.toString());
            j0.this.h();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            CharSequence description = webResourceError.getDescription();
            String string = description != null ? description.toString() : null;
            gb.a("BannerWebView$MyWebViewClient: Load failed. Error - " + webResourceError.getErrorCode() + ", description - " + string + ", url - " + webResourceRequest.getUrl().toString());
            a aVar = j0.this.f59927d;
            if (aVar == null) {
                return;
            }
            if (string == null) {
                string = "Unknown JS error";
            }
            aVar.a(string);
        }
    }
}
