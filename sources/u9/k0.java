package u9;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f105313c = new k0(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105315b;

    public k0(int i10, boolean z10) {
        this.f105314a = i10;
        this.f105315b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f105314a == k0Var.f105314a && this.f105315b == k0Var.f105315b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f105314a << 1) + (this.f105315b ? 1 : 0);
    }
}
