package org.bidon.taurusx;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f97729b;

    public d(String adUnitId, a adFormat) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f97728a = adUnitId;
        this.f97729b = adFormat;
    }

    public final String a() {
        return this.f97728a;
    }

    public final a b() {
        return this.f97729b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f97728a, dVar.f97728a) && this.f97729b == dVar.f97729b;
    }

    public int hashCode() {
        return (this.f97728a.hashCode() * 31) + this.f97729b.hashCode();
    }

    public String toString() {
        return "TaurusXPlacement(adUnitId=" + this.f97728a + ", adFormat=" + this.f97729b + ")";
    }
}
