package com.iab.omid.library.fyber.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.internal.g;
import com.iab.omid.library.fyber.internal.h;
import com.iab.omid.library.fyber.utils.c;
import com.iab.omid.library.fyber.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f35071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f35072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f35073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f35074j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0393b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f35076a;

        RunnableC0393b() {
            this.f35076a = b.this.f35071g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35076a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f35072h = null;
        this.f35073i = map;
        this.f35074j = str2;
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0393b(), Math.max(4000 - (this.f35072h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f35072h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f35071g = null;
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f35071g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f35071g.getSettings().setAllowContentAccess(false);
        this.f35071g.getSettings().setAllowFileAccess(false);
        this.f35071g.setWebViewClient(new a());
        a(this.f35071g);
        h.a().c(this.f35071g, this.f35074j);
        for (String str : this.f35073i.keySet()) {
            h.a().d(this.f35071g, this.f35073i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f35072h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.fyber.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
