package com.appodeal.ads;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class wa implements AdNetworkMediationParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc f15200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.appodeal.ads.utils.session.g f15201b;

    public wa(zc restrictedData, com.appodeal.ads.utils.session.g sessionManager) {
        Intrinsics.checkNotNullParameter(restrictedData, "restrictedData");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        this.f15200a = restrictedData;
        this.f15201b = sessionManager;
    }

    @Override // com.appodeal.ads.AdNetworkMediationParams
    public final String getFramework() {
        return Appodeal.getFrameworkName();
    }

    @Override // com.appodeal.ads.AdNetworkMediationParams
    public final String getFrameworkVersion() {
        return Appodeal.getEngineVersion();
    }

    @Override // com.appodeal.ads.AdNetworkMediationParams
    public final RestrictedData getRestrictedData() {
        return this.f15200a;
    }

    @Override // com.appodeal.ads.AdNetworkMediationParams
    public final long getSegmentId() {
        return Appodeal.getSegmentId();
    }

    @Override // com.appodeal.ads.AdNetworkMediationParams
    public final String getSessionId() {
        com.appodeal.ads.utils.session.e eVar;
        com.appodeal.ads.utils.session.f fVarF = this.f15201b.f();
        if (fVarF == null || (eVar = fVarF.f15074b) == null) {
            return null;
        }
        return eVar.f15065b;
    }

    @Override // com.appodeal.ads.AdNetworkMediationParams
    public final JSONObject getToken() {
        return v4.c();
    }

    @Override // com.appodeal.ads.AdNetworkMediationParams
    public final boolean isTestMode() {
        return db.e();
    }
}
