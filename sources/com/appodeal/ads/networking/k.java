package com.appodeal.ads.networking;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f14141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f14142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f14143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f14144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f14145e;

    public k(g gVar, f fVar, h hVar, i iVar, j jVar) {
        this.f14141a = gVar;
        this.f14142b = fVar;
        this.f14143c = hVar;
        this.f14144d = iVar;
        this.f14145e = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f14141a, kVar.f14141a) && Intrinsics.areEqual(this.f14142b, kVar.f14142b) && Intrinsics.areEqual(this.f14143c, kVar.f14143c) && Intrinsics.areEqual(this.f14144d, kVar.f14144d) && Intrinsics.areEqual(this.f14145e, kVar.f14145e);
    }

    public final int hashCode() {
        g gVar = this.f14141a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        f fVar = this.f14142b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        h hVar = this.f14143c;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.f14144d;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j jVar = this.f14145e;
        return iHashCode4 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "Config(appsflyerConfig=" + this.f14141a + ", adjustConfig=" + this.f14142b + ", facebookConfig=" + this.f14143c + ", firebaseConfig=" + this.f14144d + ", sentryAnalyticConfig=" + this.f14145e + ")";
    }
}
