package com.appodeal.ads.initializing;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {
    public static l a(String networkName) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        for (l lVar : l.values()) {
            if (Intrinsics.areEqual(lVar.f13483b, networkName)) {
                return lVar;
            }
        }
        return null;
    }
}
