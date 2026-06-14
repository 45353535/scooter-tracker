package com.appodeal.ads.adapters.level_play;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12394b;

    public c(String appKey, String mediatorName) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
        this.f12393a = appKey;
        this.f12394b = mediatorName;
    }

    public final String toString() {
        return "LevelPlayInitializeParams(appKey='" + this.f12393a + "', mediatorName='" + this.f12394b + "')";
    }
}
