package com.applovin.impl.sdk.ad;

import com.applovin.impl.f4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends AppLovinAdImpl {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAd f10552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.u f10553e;

    public c(com.applovin.impl.u uVar, com.applovin.impl.sdk.k kVar) {
        super(new JSONObject(), new JSONObject(), kVar);
        this.f10553e = uVar;
    }

    private AppLovinAd d() {
        return (AppLovinAd) this.sdk.i().f(this.f10553e);
    }

    private String e() {
        com.applovin.impl.u adZone = getAdZone();
        if (adZone == null || adZone.i()) {
            return null;
        }
        return adZone.e();
    }

    public void a(AppLovinAd appLovinAd) {
        this.f10552d = appLovinAd;
    }

    public AppLovinAd c() {
        AppLovinAd appLovinAd = this.f10552d;
        return appLovinAd != null ? appLovinAd : d();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        AppLovinAd appLovinAdC = c();
        return appLovinAdC != null ? appLovinAdC.equals(obj) : super.equals(obj);
    }

    public AppLovinAd f() {
        return this.f10552d;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public f4 getAdEventTracker() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        AppLovinAd appLovinAdC = c();
        if (appLovinAdC instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdC).getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public com.applovin.impl.u getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) c();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.f10553e;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd appLovinAdC = c();
        if (appLovinAdC instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdC).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String getMediationServeId() {
        AppLovinAd appLovinAdC = c();
        if (appLovinAdC instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdC).getMediationServeId();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public String getOpenMeasurementContentUrl() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public List getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        AppLovinAd appLovinAdC = c();
        if (appLovinAdC instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdC).getOriginalFullResponse();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return getAdZone().f();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return getAdZone().g();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (this.f10553e.i()) {
            return null;
        }
        return this.f10553e.e();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        AppLovinAd appLovinAdC = c();
        return appLovinAdC != null ? appLovinAdC.hashCode() : super.hashCode();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean isExpired() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) c();
        return appLovinAdImpl != null && appLovinAdImpl.isExpired();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean isVideoAd() {
        AppLovinAd appLovinAdC = c();
        return (appLovinAdC instanceof AppLovinAdImpl) && ((AppLovinAdImpl) appLovinAdC).isVideoAd();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + e() + "'}";
    }
}
