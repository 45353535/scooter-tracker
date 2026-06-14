package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f14047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f14048b;

    public h(Boolean bool, Boolean bool2) {
        this.f14047a = bool;
        this.f14048b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f14047a, hVar.f14047a) && Intrinsics.areEqual(this.f14048b, hVar.f14048b);
    }

    public final int hashCode() {
        Boolean bool = this.f14047a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f14048b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "Get(adTypeDebug=" + this.f14047a + ", checkSdkVersion=" + this.f14048b + ")";
    }
}
