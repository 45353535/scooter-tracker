package com.appodeal.ads.adapters.dtexchange;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f12192c;

    public c(String appId, String publisherId, Boolean bool) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(publisherId, "publisherId");
        this.f12190a = appId;
        this.f12191b = publisherId;
        this.f12192c = bool;
    }

    public final String toString() {
        return "DTExchangeInitializeParams(appId='" + this.f12190a + "', publisherId='" + this.f12191b + "', isMute=" + this.f12192c + ")";
    }
}
