package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class xj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117838c;

    public xj1(int i10, int i11, int i12) {
        this.f117836a = i10;
        this.f117837b = i11;
        this.f117838c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj1)) {
            return false;
        }
        xj1 xj1Var = (xj1) obj;
        return this.f117836a == xj1Var.f117836a && this.f117837b == xj1Var.f117837b && this.f117838c == xj1Var.f117838c;
    }

    public final int hashCode() {
        return this.f117838c + bb3.a(this.f117837b, this.f117836a * 31, 31);
    }

    public final String toString() {
        return "MediaFileInfo(width=" + this.f117836a + ", height=" + this.f117837b + ", bitrate=" + this.f117838c + ")";
    }
}
