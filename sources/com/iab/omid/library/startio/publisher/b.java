package com.iab.omid.library.startio.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.startio.adsession.AdSessionContext;
import com.iab.omid.library.startio.adsession.VerificationScriptResource;
import com.iab.omid.library.startio.internal.g;
import com.iab.omid.library.startio.internal.h;
import com.iab.omid.library.startio.utils.c;
import com.iab.omid.library.startio.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f36023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f36024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f36025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f36026j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.startio.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0423b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f36028a;

        RunnableC0423b() {
            this.f36028a = b.this.f36023g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36028a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f36024h = null;
        this.f36025i = map;
        this.f36026j = str2;
    }

    @Override // com.iab.omid.library.startio.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0423b(), Math.max(4000 - (this.f36024h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f36024h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f36023g = null;
    }

    @Override // com.iab.omid.library.startio.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f36023g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f36023g.getSettings().setAllowContentAccess(false);
        this.f36023g.getSettings().setAllowFileAccess(false);
        this.f36023g.setWebViewClient(new a());
        a(this.f36023g);
        h.a().c(this.f36023g, this.f36026j);
        for (String str : this.f36025i.keySet()) {
            h.a().c(this.f36023g, this.f36025i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f36024h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.startio.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.startio.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
