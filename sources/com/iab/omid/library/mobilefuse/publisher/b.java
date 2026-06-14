package com.iab.omid.library.mobilefuse.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.mobilefuse.adsession.AdSessionContext;
import com.iab.omid.library.mobilefuse.adsession.VerificationScriptResource;
import com.iab.omid.library.mobilefuse.internal.g;
import com.iab.omid.library.mobilefuse.internal.h;
import com.iab.omid.library.mobilefuse.utils.c;
import com.iab.omid.library.mobilefuse.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f35617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f35618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f35619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f35620j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.mobilefuse.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0410b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f35622a;

        RunnableC0410b() {
            this.f35622a = b.this.f35617g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35622a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f35618h = null;
        this.f35619i = map;
        this.f35620j = str2;
    }

    @Override // com.iab.omid.library.mobilefuse.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0410b(), Math.max(4000 - (this.f35618h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f35618h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f35617g = null;
    }

    @Override // com.iab.omid.library.mobilefuse.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f35617g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f35617g.getSettings().setAllowContentAccess(false);
        this.f35617g.getSettings().setAllowFileAccess(false);
        this.f35617g.setWebViewClient(new a());
        a(this.f35617g);
        h.a().c(this.f35617g, this.f35620j);
        for (String str : this.f35619i.keySet()) {
            h.a().d(this.f35617g, this.f35619i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f35618h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.mobilefuse.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.mobilefuse.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
