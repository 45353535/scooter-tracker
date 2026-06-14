package com.appodeal.ads.adapters.meta;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12470a;

    public c(String mediatorName) {
        Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
        this.f12470a = mediatorName;
    }

    public final String toString() {
        return "MetaInitializeParams(mediatorName='" + this.f12470a + "')";
    }
}
