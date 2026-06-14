package com.iab.omid.library.inmobi.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.internal.g;
import com.iab.omid.library.inmobi.internal.h;
import com.iab.omid.library.inmobi.utils.c;
import com.iab.omid.library.inmobi.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f35212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f35213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f35214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f35215j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.inmobi.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0398b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f35217a;

        RunnableC0398b() {
            this.f35217a = b.this.f35212g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35217a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f35213h = null;
        this.f35214i = map;
        this.f35215j = str2;
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0398b(), Math.max(4000 - (this.f35213h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f35213h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f35212g = null;
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f35212g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f35212g.getSettings().setAllowContentAccess(false);
        this.f35212g.getSettings().setAllowFileAccess(false);
        this.f35212g.setWebViewClient(new a());
        a(this.f35212g);
        h.a().c(this.f35212g, this.f35215j);
        for (String str : this.f35214i.keySet()) {
            h.a().d(this.f35212g, this.f35214i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f35213h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.inmobi.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
