package com.appodeal.ads.adapters.iab.unified;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12309b;

    public y(String str, long j10) {
        this.f12308a = str;
        this.f12309b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.f12308a, yVar.f12308a) && this.f12309b == yVar.f12309b;
    }

    public final int hashCode() {
        String str = this.f12308a;
        return androidx.collection.b.a(this.f12309b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "TrackingPackage(packageName=" + this.f12308a + ", expiry=" + this.f12309b + ")";
    }
}
