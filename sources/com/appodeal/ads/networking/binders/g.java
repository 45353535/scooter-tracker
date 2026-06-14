package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14046b;

    public g(String str, String str2) {
        this.f14045a = str;
        this.f14046b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f14045a, gVar.f14045a) && Intrinsics.areEqual(this.f14046b, gVar.f14046b);
    }

    public final int hashCode() {
        String str = this.f14045a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14046b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Connection(connection=" + this.f14045a + ", connectionSubtype=" + this.f14046b + ")";
    }
}
