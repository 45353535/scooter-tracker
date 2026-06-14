package com.fyber.inneractive.sdk.activities;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j1;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberReportAdActivity f20140a;

    public a(FyberReportAdActivity fyberReportAdActivity) {
        this.f20140a = fyberReportAdActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        IAlog.f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i10), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        z.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        FyberReportAdActivity fyberReportAdActivity = this.f20140a;
        if (fyberReportAdActivity.f20111b == webView) {
            fyberReportAdActivity.f20111b = null;
        }
        if (webView != null) {
            v.a(webView);
            webView.destroy();
        }
        this.f20140a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.fyber.inneractive.sdk.flow.h hVar;
        if (str == null) {
            return false;
        }
        if (j1.a(str)) {
            WebView webView2 = this.f20140a.f20111b;
            if (webView2 != null) {
                webView2.loadUrl("chrome://crash");
            }
            return true;
        }
        if (!str.startsWith("fybermarketplace://reportAd?") || (hVar = FyberReportAdActivity.f20110f) == null) {
            return false;
        }
        String strSubstring = str.substring(28);
        com.fyber.inneractive.sdk.flow.g gVar = (com.fyber.inneractive.sdk.flow.g) hVar;
        w wVar = new w(u.FYBER_REPORT_AD, gVar.f20734b, gVar.f20735c);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, strSubstring);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", PglCryptUtils.KEY_MESSAGE, strSubstring);
        }
        wVar.f21421f.put(jSONObject);
        wVar.f21422g = true;
        wVar.a((String) null);
        WebView webView3 = this.f20140a.f20111b;
        if (webView3 != null) {
            q0.a(webView3, "reportSent();");
        }
        return true;
    }
}
