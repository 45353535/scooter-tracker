package com.appodeal.ads.adapters.meta;

import com.appodeal.ads.AdUnitParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12465a;

    public b(String metaKey) {
        Intrinsics.checkNotNullParameter(metaKey, "metaKey");
        this.f12465a = metaKey;
    }

    public final String toString() {
        return "MetaRequestParams(metaKey='" + this.f12465a + "')";
    }
}
