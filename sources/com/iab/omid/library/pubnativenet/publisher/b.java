package com.iab.omid.library.pubnativenet.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.pubnativenet.adsession.AdSessionContext;
import com.iab.omid.library.pubnativenet.adsession.VerificationScriptResource;
import com.iab.omid.library.pubnativenet.internal.g;
import com.iab.omid.library.pubnativenet.internal.h;
import com.iab.omid.library.pubnativenet.utils.c;
import com.iab.omid.library.pubnativenet.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f35893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f35894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f35895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f35896j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.pubnativenet.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0419b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f35898a;

        RunnableC0419b() {
            this.f35898a = b.this.f35893g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35898a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f35894h = null;
        this.f35895i = map;
        this.f35896j = str2;
    }

    @Override // com.iab.omid.library.pubnativenet.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0419b(), Math.max(4000 - (this.f35894h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f35894h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f35893g = null;
    }

    @Override // com.iab.omid.library.pubnativenet.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f35893g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f35893g.getSettings().setAllowContentAccess(false);
        this.f35893g.getSettings().setAllowFileAccess(false);
        this.f35893g.setWebViewClient(new a());
        a(this.f35893g);
        h.a().c(this.f35893g, this.f35896j);
        for (String str : this.f35895i.keySet()) {
            h.a().d(this.f35893g, this.f35895i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f35894h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.pubnativenet.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.pubnativenet.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
