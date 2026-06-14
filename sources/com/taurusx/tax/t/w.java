package com.taurusx.tax.t;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.iab.omid.library.taurusx.ScriptInjector;
import com.ironsource.D5;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.t.z;
import com.taurusx.tax.w.s.a;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class w extends com.taurusx.tax.t.z {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f66574t = "NormalWebView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f66575a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66576c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f66577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.taurusx.tax.w.s.z f66578o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f66579s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f66580w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f66581y;

    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66580w = 0;
        this.f66581y = 0;
        this.f66576c = false;
        this.f66578o = new com.taurusx.tax.w.s.z();
        this.f66579s = new a();
    }

    private void c() {
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        requestFocus();
    }

    private void o() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT < 33) {
            settings.setAppCacheEnabled(true);
            settings.setAppCacheMaxSize(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
        }
        settings.setDatabasePath(getContext().getCacheDir().getAbsolutePath());
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setAllowUniversalAccessFromFileURLs(true);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    private void s() {
        setWebViewClient(new z());
    }

    @Override // com.taurusx.tax.t.z, android.webkit.WebView
    public void destroy() {
        super.destroy();
        this.mWebViewListener = null;
    }

    @Override // com.taurusx.tax.t.z
    public void loadHtmlResponse(String str) {
        this.f66576c = false;
        if (!str.contains("<html>")) {
            str = "<html><head></head><body style='margin:0;padding:0;'>" + str + "</body></html>";
        }
        if (this.f66575a) {
            str = ScriptInjector.injectScriptContentIntoHtml(com.taurusx.tax.s.w.z(this.f66577n), str);
        }
        loadDataWithBaseURL("file:///taurusx", str, "text/html", D5.N, null);
    }

    @Override // com.taurusx.tax.t.z
    public void loadHtmlResponseWithBaseUrl(String str, String str2) {
        this.f66576c = false;
        if (!str.contains("<html>")) {
            str = "<html><head></head><body style='margin:0;padding:0;'>" + str + "</body></html>";
        }
        if (this.f66575a) {
            str = ScriptInjector.injectScriptContentIntoHtml(com.taurusx.tax.s.w.z(this.f66577n), str);
        }
        loadDataWithBaseURL(str2, str, "text/html", D5.N, null);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (str == null) {
            return;
        }
        super.loadUrl(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        z.InterfaceC0815z interfaceC0815z = this.mWebViewListener;
        if (interfaceC0815z != null) {
            interfaceC0815z.w();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f66579s.f67468z = System.currentTimeMillis();
            this.f66578o.w(String.valueOf((int) motionEvent.getX()));
            this.f66578o.y(String.valueOf((int) motionEvent.getY()));
            this.f66580w = (int) motionEvent.getX();
            this.f66581y = (int) motionEvent.getY();
            z.InterfaceC0815z interfaceC0815z = this.mWebViewListener;
            if (interfaceC0815z != null) {
                interfaceC0815z.z(this.f66578o, this.f66579s);
            }
        }
        if (motionEvent.getAction() == 1) {
            this.f66579s.f67466w = System.currentTimeMillis();
            this.f66579s.f67467y = motionEvent.getDownTime();
            this.f66579s.f67463c = motionEvent.getEventTime();
            this.f66579s.z(motionEvent);
            this.f66578o.o(String.valueOf((int) motionEvent.getX()));
            this.f66578o.s(String.valueOf((int) motionEvent.getY()));
            this.f66578o.c(String.valueOf(getHeight()));
            this.f66578o.a(String.valueOf(getWidth()));
            this.f66578o.z(String.valueOf(System.currentTimeMillis()));
            z.InterfaceC0815z interfaceC0815z2 = this.mWebViewListener;
            if (interfaceC0815z2 != null) {
                interfaceC0815z2.w(this.f66578o, this.f66579s);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        WebSettings settings;
        if (this.mDestroyed || (settings = getSettings()) == null) {
            return;
        }
        settings.setJavaScriptEnabled(false);
        super.stopLoading();
        settings.setJavaScriptEnabled(true);
    }

    public class z extends WebViewClient {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f66583z = 0;

        public z() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            z.InterfaceC0815z interfaceC0815z = w.this.mWebViewListener;
            if (interfaceC0815z != null) {
                interfaceC0815z.w(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            LogUtil.d("taurusx", "WebView onPageFinished");
            int i10 = this.f66583z - 1;
            this.f66583z = i10;
            if (i10 == 0) {
                if (w.this.f66576c) {
                    return;
                } else {
                    w.this.f66576c = true;
                }
            }
            w.this.setWebViewScaleJS();
            z.InterfaceC0815z interfaceC0815z = w.this.mWebViewListener;
            if (interfaceC0815z != null) {
                interfaceC0815z.z();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f66583z = Math.max(this.f66583z, 1);
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            LogUtil.d("taurusx", "WebView received error, request:" + webResourceRequest.getUrl() + ", error: " + webResourceError.getErrorCode() + TokenBuilder.TOKEN_DELIMITER + ((Object) webResourceError.getDescription()));
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            z.InterfaceC0815z interfaceC0815z = w.this.mWebViewListener;
            return interfaceC0815z != null ? interfaceC0815z.z(webView, str) : super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            LogUtil.d(w.f66574t, "url: " + str);
            this.f66583z = this.f66583z + 1;
            z.InterfaceC0815z interfaceC0815z = w.this.mWebViewListener;
            return interfaceC0815z != null && interfaceC0815z.z(str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            LogUtil.d("taurusx", "WebView received error: " + i10 + ", description: " + str + ", failingUrl: " + str2);
        }
    }

    public w(Context context) {
        super(context);
        this.f66580w = 0;
        this.f66581y = 0;
        this.f66576c = false;
        this.f66578o = new com.taurusx.tax.w.s.z();
        this.f66579s = new a();
        c();
        o();
        setBackgroundColor(0);
        s();
    }

    public w(Context context, boolean z10) {
        super(context);
        this.f66580w = 0;
        this.f66581y = 0;
        this.f66576c = false;
        this.f66578o = new com.taurusx.tax.w.s.z();
        this.f66579s = new a();
        this.f66577n = context;
        this.f66575a = z10;
        c();
        o();
        setBackgroundColor(0);
        s();
    }
}
