package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f109625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dw2 f109628d;

    public cw2(int i10, long j10, dw2 dw2Var, String str) {
        this.f109625a = j10;
        this.f109626b = str;
        this.f109627c = i10;
        this.f109628d = dw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2)) {
            return false;
        }
        cw2 cw2Var = (cw2) obj;
        return this.f109625a == cw2Var.f109625a && Intrinsics.areEqual(this.f109626b, cw2Var.f109626b) && this.f109627c == cw2Var.f109627c && this.f109628d == cw2Var.f109628d;
    }

    public final int hashCode() {
        int iA = androidx.collection.b.a(this.f109625a) * 31;
        String str = this.f109626b;
        return this.f109628d.hashCode() + bb3.a(this.f109627c, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowNotice(delay=" + this.f109625a + ", url=" + this.f109626b + ", visibilityPercent=" + this.f109627c + ", type=" + this.f109628d + ")";
    }
}
