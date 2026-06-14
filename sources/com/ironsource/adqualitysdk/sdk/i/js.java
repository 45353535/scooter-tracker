package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.ironsource.adqualitysdk.sdk.i.bb;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class js implements jk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<WebView, js> f2904 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2905;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Set<jk> f2906 = new HashSet();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jt f2907;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.js$4, reason: invalid class name */
    final class AnonymousClass4 extends WebChromeClient {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2912 = false;

        AnonymousClass4() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            js.this.mo4561(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            if (i10 != 100 || this.f2912) {
                return;
            }
            this.f2912 = true;
            js.this.mo4560(webView);
        }
    }

    private js(WebView webView, String str) {
        this.f2905 = str;
        jt jtVar = new jt(webView);
        this.f2907 = jtVar;
        jtVar.m7023(new AnonymousClass2());
        this.f2907.m7021(new AnonymousClass4());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static js m7005(WebView webView, String str) {
        js jsVar = f2904.get(webView);
        if (jsVar != null) {
            return jsVar;
        }
        js jsVar2 = new js(webView, str);
        f2904.put(webView, jsVar2);
        return jsVar2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m7008(jk jkVar) {
        this.f2906.add(jkVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final bb.e m7010() {
        return this.f2907.m7019();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m7013(jk jkVar) {
        this.f2906.remove(jkVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m7009() {
        return this.f2907.m7022();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ｋ */
    public final void mo4563(WebView webView, String str, boolean z10) {
        for (jk jkVar : new HashSet(this.f2906)) {
            if (jkVar != null) {
                jkVar.mo4563(webView, str, z10);
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m7011() {
        this.f2907.m7023(new AnonymousClass2());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final WebView m7012() {
        return this.f2907.m7020();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻛ */
    public final void mo4562(WebView webView, String str, String str2) {
        for (jk jkVar : new HashSet(this.f2906)) {
            if (jkVar != null) {
                jkVar.mo4562(webView, str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m7007() {
        this.f2907.m7021(new AnonymousClass4());
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.js$2, reason: invalid class name */
    final class AnonymousClass2 extends WebViewClient {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean f2911 = false;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2909 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f2910 = null;

        AnonymousClass2() {
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean m7014(WebView webView) {
            if (this.f2911 && this.f2909) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f2910 == null || webView.getOriginalUrl().equals(this.f2910)) ? false : true;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean m7015(WebView webView, String str) {
            if (!str.startsWith(js.this.f2905)) {
                return false;
            }
            this.f2910 = webView.getOriginalUrl();
            String strSubstring = str.substring(js.this.f2905.length());
            js jsVar = js.this;
            jsVar.mo4562(webView, jsVar.f2905, strSubstring);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            js.this.mo4560(webView);
            this.f2911 = false;
            this.f2909 = true;
            if (this.f2910 == null) {
                this.f2910 = webView.getOriginalUrl();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            js.this.mo4560(webView);
            this.f2911 = true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (m7015(webView, str)) {
                return true;
            }
            if (this.f2910 == null) {
                this.f2910 = webView.getOriginalUrl();
            }
            js.this.mo4563(webView, str, m7014(webView));
            this.f2909 = true;
            this.f2911 = false;
            return false;
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 24)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻛ */
    public final void mo4561(WebView webView, String str) {
        for (jk jkVar : new HashSet(this.f2906)) {
            if (jkVar != null) {
                jkVar.mo4561(webView, str);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻐ */
    public final void mo4560(WebView webView) {
        for (jk jkVar : new HashSet(this.f2906)) {
            if (jkVar != null) {
                jkVar.mo4560(webView);
            }
        }
    }
}
