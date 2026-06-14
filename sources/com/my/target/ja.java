package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes11.dex */
public final class ja extends m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f59964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f59966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f59967g;

    public interface a {
        void a(int i10, String str, String str2);

        void a(String str);
    }

    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String strMessage = consoleMessage.message();
            gb.a("JS Console Message at line " + consoleMessage.lineNumber() + ": " + strMessage);
            return false;
        }
    }

    public ja(Context context) {
        super(context);
        this.f59967g = 0L;
        b bVar = new b();
        c cVar = new c();
        new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()).setIsLongpressEnabled(false);
        setOnTouchListener(new View.OnTouchListener() { // from class: k5.a1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f85987b.a(view, motionEvent);
            }
        });
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebViewBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
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

    public final /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f59967g = Long.MAX_VALUE;
            gb.a("ShoppableWebView: action down");
            onTouchEvent(motionEvent);
            return false;
        }
        if (action == 1) {
            this.f59967g = System.currentTimeMillis();
            gb.a("ShoppableWebView: action up");
            this.f59966f = true;
            return false;
        }
        if (action != 2) {
            if (action != 3) {
                return false;
            }
            this.f59967g = System.currentTimeMillis();
            gb.a("ShoppableWebView: action cancel");
            return false;
        }
        gb.a("ShoppableWebView: action move");
        this.f59967g = Long.MAX_VALUE;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (x10 < 0.0f || x10 > view.getWidth() || y10 < 0.0f || y10 > view.getHeight()) {
            return false;
        }
        onTouchEvent(motionEvent);
        return false;
    }

    public void b(String str) {
        this.f59966f = false;
        a aVar = this.f59964d;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public long getAndResetInteractionEnd() {
        long j10 = this.f59967g;
        this.f59967g = 0L;
        return j10;
    }

    @Override // com.my.target.m0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setListener(@Nullable a aVar) {
        this.f59964d = aVar;
    }

    public final class c extends y6 {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ja jaVar = ja.this;
            if (jaVar.f59965e) {
                return;
            }
            jaVar.f59965e = true;
            gb.a("ShoppableWebView$MyWebViewClient: page loaded");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            gb.a("ShoppableWebView$MyWebViewClient: page started");
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            gb.a("ShoppableWebView$MyWebViewClient: load failed, error - " + i10 + ", description - " + str + ", url - " + str2);
            super.onReceivedError(webView, i10, str, str2);
            a aVar = ja.this.f59964d;
            if (aVar != null) {
                aVar.a(i10, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f10, float f11) {
            super.onScaleChanged(webView, f10, f11);
            gb.a("ShoppableWebView$MyWebViewClient: new scale - " + f11 + ", old scale - " + f10);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            ja jaVar = ja.this;
            if (jaVar.f59966f && str != null) {
                jaVar.b(str);
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            if (!ja.this.f59966f || (url = webResourceRequest.getUrl()) == null) {
                return true;
            }
            ja.this.b(url.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            CharSequence description = webResourceError.getDescription();
            String string = description != null ? description.toString() : null;
            int errorCode = webResourceError.getErrorCode();
            String string2 = webResourceRequest.getUrl().toString();
            gb.a("ShoppableWebView$MyWebViewClient: load failed, error - " + errorCode + ", description - " + string + ", url - " + string2);
            a aVar = ja.this.f59964d;
            if (aVar != null) {
                aVar.a(errorCode, string, string2);
            }
        }
    }
}
