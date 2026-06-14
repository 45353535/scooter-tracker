package com.applovin.impl.sdk.ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.t1;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.u f10515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f10517c;

    protected AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, jSONObject2, kVar);
    }

    private long b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(x4.f11279c1)).longValue());
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && b() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd appLovinAdC;
        if ((obj instanceof c) && (appLovinAdC = ((c) obj).c()) != null) {
            obj = appLovinAdC;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    public com.applovin.impl.u getAdZone() {
        com.applovin.impl.u uVar = this.f10515a;
        if (uVar != null) {
            if (uVar.f() != null && this.f10515a.g() != null) {
                return this.f10515a;
            }
            if (getSize() == null && getType() == null) {
                return this.f10515a;
            }
        }
        com.applovin.impl.u uVarA = com.applovin.impl.u.a(getSize(), getType(), getStringFromFullResponse(Reporting.Key.ZONE_ID, null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f10515a = uVarA;
        return uVarA;
    }

    public c getDummyAd() {
        return this.f10517c;
    }

    @Nullable
    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String string;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.toString();
        }
        synchronized (this.fullResponseLock) {
            string = this.fullResponse.toString();
        }
        return string;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse(Reporting.Key.AD_SIZE, null));
    }

    @Override // com.applovin.impl.t1
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return b() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse(Reporting.Key.ZONE_ID, null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.O();
        if (!com.applovin.impl.sdk.o.a()) {
            return false;
        }
        this.sdk.O().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.f10516b;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.f10517c = cVar;
    }

    @Override // com.applovin.impl.t1
    public void setExpired() {
        this.f10516b = true;
    }

    public void setHasShown(boolean z10) {
        try {
            h5 h5Var = this.synchronizedAdObject;
            if (h5Var != null) {
                h5Var.a("shown", (Object) Boolean.valueOf(z10));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z10);
            }
        } catch (Throwable unused) {
        }
    }

    @NonNull
    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
