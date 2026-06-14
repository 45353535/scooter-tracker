package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14017e;

    public d(String ifa, String advertisingTracking, boolean z10, String str, String str2) {
        Intrinsics.checkNotNullParameter(ifa, "ifa");
        Intrinsics.checkNotNullParameter(advertisingTracking, "advertisingTracking");
        this.f14013a = ifa;
        this.f14014b = advertisingTracking;
        this.f14015c = z10;
        this.f14016d = str;
        this.f14017e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f14013a, dVar.f14013a) && Intrinsics.areEqual(this.f14014b, dVar.f14014b) && this.f14015c == dVar.f14015c && Intrinsics.areEqual(this.f14016d, dVar.f14016d) && Intrinsics.areEqual(this.f14017e, dVar.f14017e);
    }

    public final int hashCode() {
        int iA = (androidx.compose.foundation.c.a(this.f14015c) + com.appodeal.ads.initializing.f.a(this.f14014b, this.f14013a.hashCode() * 31, 31)) * 31;
        String str = this.f14016d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14017e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Advertising(ifa=" + this.f14013a + ", advertisingTracking=" + this.f14014b + ", advertisingIdGenerated=" + this.f14015c + ", appSetId=" + this.f14016d + ", appSetIdScope=" + this.f14017e + ")";
    }
}
