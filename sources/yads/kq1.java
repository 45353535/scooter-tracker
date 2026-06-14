package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f112805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f112806c;

    public kq1(long j10, String str, List list) {
        this.f112804a = str;
        this.f112805b = list;
        this.f112806c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq1)) {
            return false;
        }
        kq1 kq1Var = (kq1) obj;
        return Intrinsics.areEqual(this.f112804a, kq1Var.f112804a) && Intrinsics.areEqual(this.f112805b, kq1Var.f112805b) && this.f112806c == kq1Var.f112806c;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f112806c) + cb.a(this.f112805b, this.f112804a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnitSettings(adUnitId=" + this.f112804a + ", networks=" + this.f112805b + ", loadTimeoutMillis=" + this.f112806c + ")";
    }
}
