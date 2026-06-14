package io.appmetrica.analytics.billing.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4945a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f74958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f74959b;

    public C4945a(List list, boolean z10) {
        this.f74958a = list;
        this.f74959b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4945a)) {
            return false;
        }
        C4945a c4945a = (C4945a) obj;
        return Intrinsics.areEqual(this.f74958a, c4945a.f74958a) && this.f74959b == c4945a.f74959b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f74958a.hashCode() * 31;
        boolean z10 = this.f74959b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f74958a + ", firstInappCheckOccurred=" + this.f74959b + ')';
    }
}
