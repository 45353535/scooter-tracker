package com.iab.omid.library.taurusx.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.taurusx.adsession.AdSessionContext;
import com.iab.omid.library.taurusx.adsession.VerificationScriptResource;
import com.iab.omid.library.taurusx.internal.g;
import com.iab.omid.library.taurusx.utils.c;
import com.iab.omid.library.taurusx.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WebView f36150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f36151g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f36152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f36153i;

    class a extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f36154a = "OMID NativeBridge WebViewClient";

        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w(this.f36154a, "WebView renderer gone: " + renderProcessGoneDetail.toString());
            if (b.this.getWebView() != webView) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            Log.w(this.f36154a, "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            b.this.a((WebView) null);
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.taurusx.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0427b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f36156a;

        RunnableC0427b() {
            this.f36156a = b.this.f36150f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36156a.destroy();
        }
    }

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f36152h = map;
        this.f36153i = str;
    }

    @Override // com.iab.omid.library.taurusx.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0427b(), Math.max(4000 - (this.f36151g == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f36151g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f36150f = null;
    }

    @Override // com.iab.omid.library.taurusx.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(com.iab.omid.library.taurusx.internal.f.b().a());
        this.f36150f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f36150f.getSettings().setAllowContentAccess(false);
        this.f36150f.getSettings().setAllowFileAccess(false);
        this.f36150f.setWebViewClient(new a());
        a(this.f36150f);
        g.a().c(this.f36150f, this.f36153i);
        for (String str : this.f36152h.keySet()) {
            g.a().a(this.f36150f, this.f36152h.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f36151g = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.taurusx.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.taurusx.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
