package com.iab.omid.library.appodeal.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import com.iab.omid.library.appodeal.internal.g;
import com.iab.omid.library.appodeal.internal.h;
import com.iab.omid.library.appodeal.utils.c;
import com.iab.omid.library.appodeal.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f34431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f34432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f34433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f34434j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.appodeal.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0374b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f34436a;

        RunnableC0374b() {
            this.f34436a = b.this.f34431g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34436a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f34432h = null;
        this.f34433i = map;
        this.f34434j = str2;
    }

    @Override // com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0374b(), Math.max(4000 - (this.f34432h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f34432h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f34431g = null;
    }

    @Override // com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f34431g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f34431g.getSettings().setAllowContentAccess(false);
        this.f34431g.getSettings().setAllowFileAccess(false);
        this.f34431g.setWebViewClient(new a());
        a(this.f34431g);
        h.a().c(this.f34431g, this.f34434j);
        for (String str : this.f34433i.keySet()) {
            h.a().d(this.f34431g, this.f34433i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f34432h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.appodeal.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
