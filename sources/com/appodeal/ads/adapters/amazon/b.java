package com.appodeal.ads.adapters.amazon;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11959a;

    public b(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.f11959a = appKey;
    }

    public final String toString() {
        return "AmazonInitParams(appKey='" + this.f11959a + "')";
    }
}
