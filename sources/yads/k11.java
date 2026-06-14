package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mg f112553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p11 f112555c;

    public k11(mg mgVar, String str, p11 p11Var) {
        this.f112553a = mgVar;
        this.f112554b = str;
        this.f112555c = p11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k11)) {
            return false;
        }
        k11 k11Var = (k11) obj;
        return Intrinsics.areEqual(this.f112553a, k11Var.f112553a) && Intrinsics.areEqual(this.f112554b, k11Var.f112554b) && this.f112555c == k11Var.f112555c;
    }

    public final int hashCode() {
        return this.f112555c.hashCode() + j4.a(this.f112554b, this.f112553a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Identifiers(appMetricaIdentifiers=" + this.f112553a + ", mauid=" + this.f112554b + ", identifiersType=" + this.f112555c + ")";
    }
}
