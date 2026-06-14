package com.iab.omid.library.bytedance2.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.internal.h;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f34682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f34683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f34684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f34685j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.publisher.b$b, reason: collision with other inner class name */
    class RunnableC0381b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f34687a;

        RunnableC0381b() {
            this.f34687a = b.this.f34682g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34687a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f34683h = null;
        this.f34684i = map;
        this.f34685j = str2;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0381b(), Math.max(4000 - (this.f34683h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f34683h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f34682g = null;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f34682g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f34682g.getSettings().setAllowContentAccess(false);
        this.f34682g.getSettings().setAllowFileAccess(false);
        this.f34682g.setWebViewClient(new a());
        a(this.f34682g);
        h.a().c(this.f34682g, this.f34685j);
        for (String str : this.f34684i.keySet()) {
            h.a().c(this.f34682g, this.f34684i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f34683h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
