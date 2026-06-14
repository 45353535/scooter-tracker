package com.appodeal.ads.adapters.vungle;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12596a;

    public b(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f12596a = appId;
    }

    public final String toString() {
        return "VungleInitializeParams(appId='" + this.f12596a + "')";
    }
}
