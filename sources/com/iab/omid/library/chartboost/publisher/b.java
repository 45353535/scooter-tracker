package com.iab.omid.library.chartboost.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.internal.g;
import com.iab.omid.library.chartboost.internal.h;
import com.iab.omid.library.chartboost.utils.c;
import com.iab.omid.library.chartboost.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f34822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f34823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f34824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f34825j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0386b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f34827a;

        RunnableC0386b() {
            this.f34827a = b.this.f34822g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34827a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f34823h = null;
        this.f34824i = map;
        this.f34825j = str2;
    }

    @Override // com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0386b(), Math.max(4000 - (this.f34823h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f34823h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f34822g = null;
    }

    @Override // com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f34822g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f34822g.getSettings().setAllowContentAccess(false);
        this.f34822g.getSettings().setAllowFileAccess(false);
        this.f34822g.setWebViewClient(new a());
        a(this.f34822g);
        h.a().c(this.f34822g, this.f34825j);
        for (String str : this.f34824i.keySet()) {
            h.a().d(this.f34822g, this.f34824i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f34823h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.chartboost.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
