package com.iab.omid.library.taurusx.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.adjust.sdk.purchase.ADJPConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iab.omid.library.taurusx.adsession.AdEvents;
import com.iab.omid.library.taurusx.adsession.AdSessionConfiguration;
import com.iab.omid.library.taurusx.adsession.AdSessionContext;
import com.iab.omid.library.taurusx.adsession.ErrorType;
import com.iab.omid.library.taurusx.adsession.VerificationScriptResource;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.iab.omid.library.taurusx.internal.g;
import com.iab.omid.library.taurusx.utils.c;
import com.iab.omid.library.taurusx.utils.f;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.iab.omid.library.taurusx.weakreference.b f36141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdEvents f36142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaEvents f36143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f36144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f36145e;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        a();
        this.f36141a = new com.iab.omid.library.taurusx.weakreference.b(null);
    }

    public void a() {
        this.f36145e = f.b();
        this.f36144d = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f36141a.clear();
    }

    public AdEvents c() {
        return this.f36142b;
    }

    public MediaEvents d() {
        return this.f36143c;
    }

    public boolean e() {
        return this.f36141a.get() != null;
    }

    public void f() {
        g.a().a(getWebView());
    }

    public void g() {
        g.a().b(getWebView());
    }

    public WebView getWebView() {
        return this.f36141a.get();
    }

    public void h() {
        g.a().c(getWebView());
    }

    public void i() {
    }

    public void a(float f10) {
        g.a().a(getWebView(), f10);
    }

    public void b(String str, long j10) {
        if (j10 >= this.f36145e) {
            this.f36144d = a.AD_STATE_VISIBLE;
            g.a().a(getWebView(), str);
        }
    }

    void a(WebView webView) {
        this.f36141a = new com.iab.omid.library.taurusx.weakreference.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f36142b = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        g.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        g.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.taurusx.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.taurusx.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, ADJPConstants.KEY_ENVIRONMENT, "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.taurusx.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.taurusx.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.4.8-Taurusx");
        c.a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, com.iab.omid.library.taurusx.internal.f.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        g.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f36143c = mediaEvents;
    }

    public void a(String str) {
        g.a().a(getWebView(), str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        if (j10 >= this.f36145e) {
            a aVar = this.f36144d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f36144d = aVar2;
                g.a().a(getWebView(), str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        g.a().a(getWebView(), str, jSONObject);
    }

    public void a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        g.a().c(getWebView(), jSONObject);
    }

    public void a(@NonNull JSONObject jSONObject) {
        g.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            g.a().b(getWebView(), z10 ? "foregrounded" : "backgrounded");
        }
    }
}
