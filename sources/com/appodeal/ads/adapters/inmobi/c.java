package com.appodeal.ads.adapters.inmobi;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f12355b;

    public c(String accId, Boolean bool) {
        Intrinsics.checkNotNullParameter(accId, "accId");
        this.f12354a = accId;
        this.f12355b = bool;
    }

    public final String toString() {
        return "InmobiInitializeParams(accId='" + this.f12354a + "', isMuted=" + this.f12355b + ")";
    }
}
