package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class xh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f117819b;

    public xh2(boolean z10, int i10) {
        this.f117818a = i10;
        this.f117819b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xh2.class == obj.getClass()) {
            xh2 xh2Var = (xh2) obj;
            if (this.f117818a == xh2Var.f117818a && this.f117819b == xh2Var.f117819b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f117818a * 31) + (this.f117819b ? 1 : 0);
    }
}
