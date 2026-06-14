package com.iab.omid.library.pubmatic.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.purchase.ADJPConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iab.omid.library.pubmatic.adsession.AdEvents;
import com.iab.omid.library.pubmatic.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubmatic.adsession.AdSessionContext;
import com.iab.omid.library.pubmatic.adsession.ErrorType;
import com.iab.omid.library.pubmatic.adsession.VerificationScriptResource;
import com.iab.omid.library.pubmatic.adsession.media.MediaEvents;
import com.iab.omid.library.pubmatic.internal.g;
import com.iab.omid.library.pubmatic.internal.h;
import com.iab.omid.library.pubmatic.utils.c;
import com.iab.omid.library.pubmatic.utils.f;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.pubmatic.weakreference.b f35749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdEvents f35750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediaEvents f35751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f35752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f35753f;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f35748a = str;
        this.f35749b = new com.iab.omid.library.pubmatic.weakreference.b(null);
    }

    public void a() {
        this.f35753f = f.b();
        this.f35752e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f35749b.clear();
    }

    public AdEvents c() {
        return this.f35750c;
    }

    public MediaEvents d() {
        return this.f35751d;
    }

    public boolean e() {
        return this.f35749b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f35748a);
    }

    public void g() {
        h.a().b(getWebView(), this.f35748a);
    }

    public WebView getWebView() {
        return this.f35749b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }

    public void a(float f10) {
        h.a().a(getWebView(), this.f35748a, f10);
    }

    public void b(String str, long j10) {
        if (j10 >= this.f35753f) {
            this.f35752e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f35748a, str);
        }
    }

    void a(WebView webView) {
        this.f35749b = new com.iab.omid.library.pubmatic.weakreference.b(webView);
    }

    public void b(boolean z10) {
        if (e()) {
            h.a().a(getWebView(), this.f35748a, z10 ? "locked" : "unlocked");
        }
    }

    public void a(AdEvents adEvents) {
        this.f35750c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f35748a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f35748a, errorType, str);
    }

    public void a(com.iab.omid.library.pubmatic.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.pubmatic.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String strC = aVar.c();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, ADJPConstants.KEY_ENVIRONMENT, "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.pubmatic.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.pubmatic.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.5.6-Pubmatic");
        c.a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        if (adSessionContext.getUniversalAdId() != null) {
            c.a(jSONObject2, "universalAdId", adSessionContext.getUniversalAdId());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), strC, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f35751d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        if (j10 >= this.f35753f) {
            a aVar = this.f35752e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f35752e = aVar2;
                h.a().b(getWebView(), this.f35748a, str);
            }
        }
    }

    public void a(String str, @Nullable JSONObject jSONObject) {
        h.a().a(getWebView(), this.f35748a, str, jSONObject);
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
        h.a().b(getWebView(), this.f35748a, jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            h.a().c(getWebView(), this.f35748a, z10 ? "foregrounded" : "backgrounded");
        }
    }
}
