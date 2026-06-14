package com.appodeal.ads.adapters.ironsource;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12370b;

    public f(String appKey, String mediatorName) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
        this.f12369a = appKey;
        this.f12370b = mediatorName;
    }

    public final String toString() {
        return "IronsourceInitializeParams(appKey='" + this.f12369a + "', mediatorName='" + this.f12370b + "')";
    }
}
