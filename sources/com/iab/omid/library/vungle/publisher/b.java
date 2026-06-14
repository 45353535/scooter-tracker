package com.iab.omid.library.vungle.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.internal.g;
import com.iab.omid.library.vungle.internal.h;
import com.iab.omid.library.vungle.utils.c;
import com.iab.omid.library.vungle.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f36419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f36420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f36421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f36422j;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0436b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f36424a;

        RunnableC0436b() {
            this.f36424a = b.this.f36419g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36424a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f36420h = null;
        this.f36421i = map;
        this.f36422j = str2;
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0436b(), Math.max(4000 - (this.f36420h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f36420h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f36419g = null;
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f36419g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f36419g.getSettings().setAllowContentAccess(false);
        this.f36419g.getSettings().setAllowFileAccess(false);
        this.f36419g.setWebViewClient(new a());
        a(this.f36419g);
        h.a().c(this.f36419g, this.f36422j);
        for (String str : this.f36421i.keySet()) {
            h.a().d(this.f36419g, this.f36421i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f36420h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.vungle.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
