package com.appodeal.ads.adapters.unityads;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12567b;

    public f(String appId, String mediatorName) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
        this.f12566a = appId;
        this.f12567b = mediatorName;
    }

    public final String toString() {
        return "UnityAdsInitializeParams(appId='" + this.f12566a + "', mediatorName='" + this.f12567b + "')";
    }
}
