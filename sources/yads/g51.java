package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g51 implements j51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111066a;

    public g51(String str) {
        this.f111066a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g51) && Intrinsics.areEqual(this.f111066a, ((g51) obj).f111066a);
    }

    public final int hashCode() {
        return this.f111066a.hashCode();
    }

    public final String toString() {
        return "Failure(message=" + this.f111066a + ")";
    }
}
