package com.iab.omid.library.pubmatic.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.pubmatic.adsession.AdSessionContext;
import com.iab.omid.library.pubmatic.adsession.VerificationScriptResource;
import com.iab.omid.library.pubmatic.internal.g;
import com.iab.omid.library.pubmatic.internal.h;
import com.iab.omid.library.pubmatic.utils.c;
import com.iab.omid.library.pubmatic.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f35758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f35759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f35760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f35761j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.pubmatic.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0415b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f35763a;

        RunnableC0415b() {
            this.f35763a = b.this.f35758g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35763a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f35759h = null;
        this.f35760i = map;
        this.f35761j = str2;
    }

    @Override // com.iab.omid.library.pubmatic.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0415b(), Math.max(4000 - (this.f35759h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f35759h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f35758g = null;
    }

    @Override // com.iab.omid.library.pubmatic.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f35758g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f35758g.getSettings().setAllowContentAccess(false);
        this.f35758g.getSettings().setAllowFileAccess(false);
        this.f35758g.setWebViewClient(new a());
        a(this.f35758g);
        h.a().c(this.f35758g, this.f35761j);
        for (String str : this.f35760i.keySet()) {
            h.a().d(this.f35758g, this.f35760i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f35759h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.pubmatic.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.pubmatic.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
