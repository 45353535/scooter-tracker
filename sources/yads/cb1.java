package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109311d;

    public cb1(int i10, int i11, String str, String str2) {
        this.f109308a = str;
        this.f109309b = str2;
        this.f109310c = i10;
        this.f109311d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb1)) {
            return false;
        }
        cb1 cb1Var = (cb1) obj;
        return Intrinsics.areEqual(this.f109308a, cb1Var.f109308a) && Intrinsics.areEqual(this.f109309b, cb1Var.f109309b) && this.f109310c == cb1Var.f109310c && this.f109311d == cb1Var.f109311d;
    }

    public final int hashCode() {
        return this.f109311d + bb3.a(this.f109310c, j4.a(this.f109309b, this.f109308a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "InteractiveCreativeFile(html=" + this.f109308a + ", mimeType=" + this.f109309b + ", height=" + this.f109310c + ", width=" + this.f109311d + ")";
    }
}
