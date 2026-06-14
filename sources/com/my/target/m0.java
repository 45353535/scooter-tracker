package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class m0 extends FrameLayout implements fc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f60119c = "vkAdsWebInterface";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f60120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f60121b;

    public m0(Context context) {
        super(context);
        try {
            WebView webView = new WebView(a(context));
            this.f60120a = webView;
            webView.clearCache(true);
            this.f60120a.addJavascriptInterface(this, f60119c);
            addView(this.f60120a);
            this.f60121b = new ArrayList();
        } catch (Throwable th2) {
            gb.b("BaseWebView: Webview cannot be initialized, ad will not work properly - " + th2.getMessage());
            th2.printStackTrace();
        }
    }

    public static Context a(Context context) {
        return context;
    }

    public void b() {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        try {
            webView.goBack();
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public final /* synthetic */ void c() {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        try {
            webView.destroy();
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public void d() {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        try {
            webView.onPause();
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public void e() {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        try {
            webView.onResume();
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public void f() {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        try {
            webView.stopLoading();
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Nullable
    public WebSettings getSettings() {
        try {
            WebView webView = this.f60120a;
            if (webView == null) {
                return null;
            }
            return webView.getSettings();
        } catch (Throwable th2) {
            a(th2);
            return null;
        }
    }

    @Nullable
    public String getUrl() {
        try {
            WebView webView = this.f60120a;
            if (webView == null) {
                return null;
            }
            return webView.getUrl();
        } catch (Throwable th2) {
            a(th2);
            return null;
        }
    }

    @Nullable
    public WebView getWebView() {
        return this.f60120a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        webView.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        WebView webView = this.f60120a;
        if (webView == null) {
            setMeasuredDimension(0, 0);
        } else {
            webView.measure(i10, i11);
            setMeasuredDimension(this.f60120a.getMeasuredWidth(), this.f60120a.getMeasuredHeight());
        }
    }

    @Override // com.my.target.fc
    @JavascriptInterface
    public void sendMessage(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        gb.a("BaseWebView: sendMessage " + str + " " + str2 + " " + str3);
        r8 r8VarA = new t8().a(str, str2, str3);
        if (r8VarA == null) {
            return;
        }
        Iterator it = this.f60121b.iterator();
        while (it.hasNext()) {
            ((s8) it.next()).a(r8VarA);
        }
    }

    @Override // android.view.View
    public void setHorizontalScrollBarEnabled(boolean z10) {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        webView.setHorizontalScrollBarEnabled(z10);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(@Nullable View.OnTouchListener onTouchListener) {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        webView.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.View
    public void setScrollContainer(boolean z10) {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        webView.setScrollContainer(z10);
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z10) {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        webView.setVerticalScrollBarEnabled(z10);
    }

    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        try {
            webView.setWebChromeClient(webChromeClient);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public void setWebViewBackgroundColor(int i10) {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        webView.setBackgroundColor(i10);
    }

    public void setWebViewClient(@NonNull WebViewClient webViewClient) {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        try {
            webView.setWebViewClient(webViewClient);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public static void a(Throwable th2) {
        gb.b("BaseWebView: WebView fail - " + th2.getMessage());
    }

    public boolean a() {
        try {
            WebView webView = this.f60120a;
            if (webView != null) {
                if (webView.canGoBack()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            a(th2);
            return false;
        }
    }

    public void a(int i10) {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        if (i10 <= 0) {
            try {
                webView.destroy();
                return;
            } catch (Throwable th2) {
                a(th2);
                return;
            }
        }
        f0.a(new Runnable() { // from class: k5.k1
            @Override // java.lang.Runnable
            public final void run() {
                this.f86069b.c();
            }
        }, i10);
    }

    public void a(String str) {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        try {
            webView.loadUrl(str);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        WebView webView = this.f60120a;
        if (webView == null) {
            return;
        }
        try {
            webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public void a(s8 s8Var) {
        this.f60121b.add(s8Var);
    }
}
