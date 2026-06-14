package com.appodeal.ads.adapters.mintegral;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12496c;

    public b(String appId, String appKey, String mediatorName) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
        this.f12494a = appId;
        this.f12495b = appKey;
        this.f12496c = mediatorName;
    }

    public final String toString() {
        return "MintegralInitializeParams(appId='" + this.f12494a + "', appKey='" + this.f12495b + "', mediator='" + this.f12496c + "')";
    }
}
