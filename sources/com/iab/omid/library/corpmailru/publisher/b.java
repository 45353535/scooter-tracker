package com.iab.omid.library.corpmailru.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.corpmailru.adsession.AdSessionContext;
import com.iab.omid.library.corpmailru.adsession.VerificationScriptResource;
import com.iab.omid.library.corpmailru.b.e;
import com.iab.omid.library.corpmailru.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f34948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f34949b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f34950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34951d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f34950c = map;
        this.f34951d = str;
    }

    @Override // com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.corpmailru.publisher.b.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final WebView f34953b;

            {
                this.f34953b = b.this.f34948a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f34953b.destroy();
            }
        }, Math.max(4000 - (this.f34949b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f34949b.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f34948a = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(com.iab.omid.library.corpmailru.b.d.a().b());
        this.f34948a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f34948a);
        e.a().a(this.f34948a, this.f34951d);
        for (String str : this.f34950c.keySet()) {
            e.a().a(this.f34948a, this.f34950c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f34949b = Long.valueOf(d.a());
    }

    @Override // com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.corpmailru.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.corpmailru.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
