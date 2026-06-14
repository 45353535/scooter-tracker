package com.applovin.impl;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class m8 extends t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f9348b;

    public interface a {
        void a(Uri uri, com.applovin.impl.adview.l lVar);

        void a(com.applovin.impl.adview.l lVar);

        void b(Uri uri, com.applovin.impl.adview.l lVar);

        void b(com.applovin.impl.adview.l lVar);

        void c(com.applovin.impl.adview.l lVar);

        void d(com.applovin.impl.adview.l lVar);
    }

    public m8(com.applovin.impl.sdk.k kVar) {
        this.f9347a = kVar.O();
    }

    public void a(WeakReference weakReference) {
        this.f9348b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }

    @Override // com.applovin.impl.t4
    protected Map a() {
        return CollectionUtils.hashMap("name", "WebViewButtonClient");
    }

    private void a(WebView webView, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9347a.d("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof com.applovin.impl.adview.l)) {
            return;
        }
        com.applovin.impl.adview.l lVar = (com.applovin.impl.adview.l) webView;
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();
        a aVar = (a) this.f9348b.get();
        if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.b(lVar);
                return;
            }
            if ("/close_ad".equals(path)) {
                aVar.a(lVar);
                return;
            }
            if ("/skip_ad".equals(path)) {
                aVar.d(lVar);
                return;
            }
            if ("/load_url".equals(path)) {
                aVar.a(uri, lVar);
                return;
            }
            if ("/template_error".equals(path)) {
                aVar.b(uri, lVar);
                return;
            }
            if ("/fully_watched".equals(path)) {
                aVar.c(lVar);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f9347a.k("WebViewButtonClient", "Unknown URL: " + str);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f9347a.k("WebViewButtonClient", "Path: " + path);
            }
        }
    }
}
