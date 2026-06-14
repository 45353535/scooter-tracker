package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f109734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final az2 f109735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f109736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f109737g;

    public d31(int i10, int i11, String str, String str2, az2 az2Var, boolean z10, String str3) {
        this.f109731a = i10;
        this.f109732b = i11;
        this.f109733c = str;
        this.f109734d = str2;
        this.f109735e = az2Var;
        this.f109736f = z10;
        this.f109737g = str3;
    }

    public final int a() {
        return this.f109732b;
    }

    public final int b() {
        return this.f109731a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d31)) {
            return false;
        }
        d31 d31Var = (d31) obj;
        return this.f109731a == d31Var.f109731a && this.f109732b == d31Var.f109732b && Intrinsics.areEqual(this.f109733c, d31Var.f109733c) && Intrinsics.areEqual(this.f109734d, d31Var.f109734d) && Intrinsics.areEqual(this.f109735e, d31Var.f109735e) && this.f109736f == d31Var.f109736f && Intrinsics.areEqual(this.f109737g, d31Var.f109737g);
    }

    public final int hashCode() {
        int iA = j4.a(this.f109733c, bb3.a(this.f109732b, this.f109731a * 31, 31), 31);
        String str = this.f109734d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        az2 az2Var = this.f109735e;
        int iA2 = (androidx.compose.foundation.c.a(this.f109736f) + ((iHashCode + (az2Var == null ? 0 : az2Var.hashCode())) * 31)) * 31;
        String str2 = this.f109737g;
        return iA2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ImageValue(width=" + this.f109731a + ", height=" + this.f109732b + ", url=" + this.f109733c + ", sizeType=" + this.f109734d + ", smartCenterSettings=" + this.f109735e + ", preload=" + this.f109736f + ", preview=" + this.f109737g + ")";
    }
}
