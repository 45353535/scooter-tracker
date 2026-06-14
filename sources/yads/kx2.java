package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kx2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f112888c;

    public kx2(int i10, int i11) {
        this.f112887b = i10;
        this.f112888c = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        kx2 kx2Var = (kx2) obj;
        return Intrinsics.compare(this.f112887b * this.f112888c, kx2Var.f112887b * kx2Var.f112888c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx2)) {
            return false;
        }
        kx2 kx2Var = (kx2) obj;
        return this.f112887b == kx2Var.f112887b && this.f112888c == kx2Var.f112888c;
    }

    public final int hashCode() {
        return this.f112888c + (this.f112887b * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f112887b + ", height=" + this.f112888c + ")";
    }
}
