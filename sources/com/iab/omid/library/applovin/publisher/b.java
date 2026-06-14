package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f34295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f34296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f34297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f34298j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0370b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f34300a;

        RunnableC0370b() {
            this.f34300a = b.this.f34295g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34300a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f34296h = null;
        this.f34297i = map;
        this.f34298j = str2;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0370b(), Math.max(4000 - (this.f34296h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f34296h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f34295g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f34295g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f34295g.getSettings().setAllowContentAccess(false);
        this.f34295g.getSettings().setAllowFileAccess(false);
        this.f34295g.setWebViewClient(new a());
        a(this.f34295g);
        h.a().c(this.f34295g, this.f34298j);
        for (String str : this.f34297i.keySet()) {
            h.a().d(this.f34295g, this.f34297i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f34296h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
