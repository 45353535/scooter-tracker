package yads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.taurusx.tax.vast.ViewabilityVendor;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class kt3 extends ia {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WebView f112849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f112850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f112851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f112852j;

    public kt3(String str, String str2, Map map) {
        super(str);
        this.f112850h = null;
        this.f112851i = map;
        this.f112852j = str2;
    }

    @Override // yads.ia
    public final void b() {
        this.f111922b.clear();
        new Handler().postDelayed(new gt3(this), Math.max(4000 - (this.f112850h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f112850h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f112849g = null;
    }

    @Override // yads.ia
    public final void c() {
        WebView webView = new WebView(mu3.f113613b.f113614a);
        this.f112849g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f112849g.getSettings().setAllowContentAccess(false);
        this.f112849g.getSettings().setAllowFileAccess(false);
        this.f112849g.setWebViewClient(new ft3(this));
        this.f111922b = new ot3(this.f112849g);
        pu3.a(this.f112849g, this.f112852j);
        for (String str : this.f112851i.keySet()) {
            String externalForm = ((ab3) this.f112851i.get(str)).f108620b.toExternalForm();
            WebView webView2 = this.f112849g;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                pu3.a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.f112850h = Long.valueOf(System.nanoTime());
    }

    @Override // yads.ia
    public final void a(dt3 dt3Var, ga gaVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(gaVar.f111125d);
        for (String str : mapUnmodifiableMap.keySet()) {
            ab3 ab3Var = (ab3) mapUnmodifiableMap.get(str);
            ab3Var.getClass();
            JSONObject jSONObject2 = new JSONObject();
            st3.a(jSONObject2, "vendorKey", ab3Var.f108619a);
            st3.a(jSONObject2, "resourceUrl", ab3Var.f108620b.toString());
            st3.a(jSONObject2, ViewabilityVendor.f67069t, ab3Var.f108621c);
            st3.a(jSONObject, str, jSONObject2);
        }
        a(dt3Var, gaVar, jSONObject);
    }
}
