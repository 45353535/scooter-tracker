package com.iab.omid.library.fyber.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.purchase.ADJPConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.ErrorType;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import com.iab.omid.library.fyber.internal.g;
import com.iab.omid.library.fyber.internal.h;
import com.iab.omid.library.fyber.utils.c;
import com.iab.omid.library.fyber.utils.f;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.fyber.weakreference.b f35062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdEvents f35063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediaEvents f35064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f35065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f35066f;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f35061a = str;
        this.f35062b = new com.iab.omid.library.fyber.weakreference.b(null);
    }

    public void a() {
        this.f35066f = f.b();
        this.f35065e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f35062b.clear();
    }

    public AdEvents c() {
        return this.f35063c;
    }

    public MediaEvents d() {
        return this.f35064d;
    }

    public boolean e() {
        return this.f35062b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f35061a);
    }

    public void g() {
        h.a().b(getWebView(), this.f35061a);
    }

    public WebView getWebView() {
        return this.f35062b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }

    public void a(float f10) {
        h.a().a(getWebView(), this.f35061a, f10);
    }

    public void b(String str, long j10) {
        if (j10 >= this.f35066f) {
            this.f35065e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f35061a, str);
        }
    }

    void a(WebView webView) {
        this.f35062b = new com.iab.omid.library.fyber.weakreference.b(webView);
    }

    public void b(boolean z10) {
        if (e()) {
            h.a().a(getWebView(), this.f35061a, z10 ? "locked" : "unlocked");
        }
    }

    public void a(AdEvents adEvents) {
        this.f35063c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f35061a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f35061a, errorType, str);
    }

    public void a(com.iab.omid.library.fyber.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.fyber.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String strC = aVar.c();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, ADJPConstants.KEY_ENVIRONMENT, "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.fyber.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.fyber.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.5.4-Fyber");
        c.a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, g.b().a().getApplicationContext().getPackageName());
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
        h.a().a(getWebView(), strC, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f35064d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        if (j10 >= this.f35066f) {
            a aVar = this.f35065e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f35065e = aVar2;
                h.a().b(getWebView(), this.f35061a, str);
            }
        }
    }

    public void a(String str, @Nullable JSONObject jSONObject) {
        h.a().a(getWebView(), this.f35061a, str, jSONObject);
    }

    public void a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(@Nullable JSONObject jSONObject) {
        h.a().b(getWebView(), this.f35061a, jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            h.a().c(getWebView(), this.f35061a, z10 ? "foregrounded" : "backgrounded");
        }
    }
}
