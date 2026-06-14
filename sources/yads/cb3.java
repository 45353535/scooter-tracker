package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cb3 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109315d;

    public cb3(int i10, int i11, int i12) {
        this.f109313b = i10;
        this.f109314c = i11;
        this.f109315d = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cb3 cb3Var) {
        int i10 = this.f109313b;
        int i11 = cb3Var.f109313b;
        if (i10 != i11) {
            return Intrinsics.compare(i10, i11);
        }
        int i12 = this.f109314c;
        int i13 = cb3Var.f109314c;
        return i12 != i13 ? Intrinsics.compare(i12, i13) : Intrinsics.compare(this.f109315d, cb3Var.f109315d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb3)) {
            return false;
        }
        cb3 cb3Var = (cb3) obj;
        return this.f109313b == cb3Var.f109313b && this.f109314c == cb3Var.f109314c && this.f109315d == cb3Var.f109315d;
    }

    public final int hashCode() {
        return this.f109315d + bb3.a(this.f109314c, this.f109313b * 31, 31);
    }

    public final String toString() {
        return this.f109313b + "." + this.f109314c + "." + this.f109315d;
    }
}
