package com.iab.omid.library.ironsrc.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.internal.g;
import com.iab.omid.library.ironsrc.internal.h;
import com.iab.omid.library.ironsrc.utils.c;
import com.iab.omid.library.ironsrc.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f35347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f35348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f35349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f35350j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0402b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f35352a;

        RunnableC0402b() {
            this.f35352a = b.this.f35347g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35352a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f35348h = null;
        this.f35349i = map;
        this.f35350j = str2;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0402b(), Math.max(4000 - (this.f35348h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f35348h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f35347g = null;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f35347g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f35347g.getSettings().setAllowContentAccess(false);
        this.f35347g.getSettings().setAllowFileAccess(false);
        this.f35347g.setWebViewClient(new a());
        a(this.f35347g);
        h.a().c(this.f35347g, this.f35350j);
        for (String str : this.f35349i.keySet()) {
            h.a().d(this.f35347g, this.f35349i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f35348h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
