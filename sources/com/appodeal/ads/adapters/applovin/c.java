package com.appodeal.ads.adapters.applovin;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11966c;

    public c(String applovinKey, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(applovinKey, "applovinKey");
        this.f11964a = applovinKey;
        this.f11965b = str;
        this.f11966c = z10;
    }

    public final String toString() {
        return "ApplovinInitializeParams(applovinKey='" + this.f11964a + "', mediatorName=" + this.f11965b + ", isMuted=" + this.f11966c + ")";
    }
}
