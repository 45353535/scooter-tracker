package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f14049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f14050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f14051c;

    public i(Integer num, Float f10, Float f11) {
        this.f14049a = num;
        this.f14050b = f10;
        this.f14051c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f14049a, iVar.f14049a) && Intrinsics.areEqual((Object) this.f14050b, (Object) iVar.f14050b) && Intrinsics.areEqual((Object) this.f14051c, (Object) iVar.f14051c);
    }

    public final int hashCode() {
        Integer num = this.f14049a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f10 = this.f14050b;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f14051c;
        return iHashCode2 + (f11 != null ? f11.hashCode() : 0);
    }

    public final String toString() {
        return "Location(locationType=" + this.f14049a + ", latitude=" + this.f14050b + ", longitude=" + this.f14051c + ")";
    }
}
