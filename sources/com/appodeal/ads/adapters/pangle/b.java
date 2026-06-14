package com.appodeal.ads.adapters.pangle;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12555a;

    public b(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f12555a = appId;
    }

    public final String toString() {
        return "PangleInitializeParams(appId='" + this.f12555a + "')";
    }
}
