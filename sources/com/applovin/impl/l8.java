package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f9272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f9274e = DesugarCollections.synchronizedSet(new HashSet());

    /* JADX INFO: Access modifiers changed from: private */
    class a extends t4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f9275a;

        public a(boolean z10) {
            this.f9275a = z10;
        }

        @Override // com.applovin.impl.t4
        protected Map a() {
            return CollectionUtils.hashMap("name", "WebTrackerManagerWebViewClient");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f9275a) {
                com.applovin.impl.sdk.o unused = l8.this.f9271b;
                if (com.applovin.impl.sdk.o.a()) {
                    l8.this.f9271b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                l8.this.f9273d = true;
            }
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == l8.this.f9272c) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.jc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9143b.b();
                    }
                });
            } else {
                l8.this.b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            l8.this.f9272c.destroy();
            l8.this.f9272c = null;
        }
    }

    public l8(com.applovin.impl.sdk.k kVar) {
        this.f9270a = kVar;
        this.f9271b = kVar.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        final WebView webViewA = a(str);
        if (webViewA != null) {
            this.f9274e.add(webViewA);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.ec
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8809b.b(webViewA);
                }
            }, ((Integer) this.f9270a.a(x4.K2)).intValue());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f9271b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    public void b() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.dc
            @Override // java.lang.Runnable
            public final void run() {
                this.f8687b.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f9272c = webViewA;
        if (webViewA == null && com.applovin.impl.sdk.o.a()) {
            this.f9271b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, final AppLovinPostbackListener appLovinPostbackListener) {
        final String strAppendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f9270a.a(x4.f11335i3)).booleanValue());
        if (this.f9272c == null) {
            WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f9272c = webViewA;
            if (webViewA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9271b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (c() && !this.f9273d) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9271b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put("source", "webViewNotInitialized");
            mapHashMap.put("url", strAppendQueryParameters);
            this.f9270a.D().d(d2.f8562b1, mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        String str = "al_firePostback('" + strAppendQueryParameters + "')";
        if (((Boolean) this.f9270a.a(x4.Q2)).booleanValue()) {
            o8.a(this.f9272c, str, this.f9270a).a(this.f9270a.q0().a("evaluateJavascriptPromise"), new s4.b() { // from class: com.applovin.impl.hc
                @Override // com.applovin.impl.s4.b
                public final void a(boolean z10, Object obj, Object obj2) {
                    this.f9004a.a(appLovinPostbackListener, strAppendQueryParameters, z10, (String) obj, (String) obj2);
                }
            });
        } else {
            o8.a(this.f9272c, str);
            appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
        }
    }

    public void a(final com.applovin.impl.sdk.network.e eVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ic
            @Override // java.lang.Runnable
            public final void run() {
                this.f9102b.b(eVar, appLovinPostbackListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z10, String str2, String str3) {
        if (z10) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put("source", "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.f9270a.D().d(d2.f8562b1, map);
    }

    private boolean c() {
        return ((Boolean) this.f9270a.a(x4.P2)).booleanValue();
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z10) {
        n7.b();
        WebView webViewB = n7.b(com.applovin.impl.sdk.k.o(), "web tracker");
        if (webViewB == null) {
            return null;
        }
        webViewB.getSettings().setJavaScriptEnabled(true);
        webViewB.setWebViewClient(new a(z10 && c()));
        webViewB.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return webViewB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final WebView webView) {
        if (webView == null || !this.f9274e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.gc
            @Override // java.lang.Runnable
            public final void run() {
                webView.destroy();
            }
        });
    }

    public void b(final String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9271b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9271b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.fc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8872b.c(str);
                }
            });
        }
    }
}
