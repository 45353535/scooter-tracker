package com.appodeal.ads.adapters.dtexchange;

import com.appodeal.ads.AdUnitParams;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f12184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12185d;

    public b(String str, String mediatorVersion, Boolean bool, String spotId) {
        Intrinsics.checkNotNullParameter(mediatorVersion, "mediatorVersion");
        Intrinsics.checkNotNullParameter(spotId, "spotId");
        this.f12182a = str;
        this.f12183b = mediatorVersion;
        this.f12184c = bool;
        this.f12185d = spotId;
    }

    public final InneractiveAdSpot a() {
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        String str = this.f12182a;
        if (str != null && str.length() != 0) {
            inneractiveAdSpotCreateSpot.setMediationName(this.f12182a);
            inneractiveAdSpotCreateSpot.setMediationVersion(this.f12183b);
        }
        Intrinsics.checkNotNull(inneractiveAdSpotCreateSpot);
        return inneractiveAdSpotCreateSpot;
    }

    public final InneractiveAdRequest b() {
        InneractiveAdRequest inneractiveAdRequest = new InneractiveAdRequest(this.f12185d);
        Boolean bool = this.f12184c;
        if (bool != null) {
            inneractiveAdRequest.setMuteVideo(bool.booleanValue());
            InneractiveAdManager.setMuteVideo(this.f12184c.booleanValue());
        }
        return inneractiveAdRequest;
    }

    public final String toString() {
        return "DTExchangeAdUnitParams(mediatorName=" + this.f12182a + ", mediatorVersion='" + this.f12183b + "', isMuted=" + this.f12184c + ", spotId='" + this.f12185d + "')";
    }
}
