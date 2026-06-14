package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class xu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f117969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f117970b;

    public xu2(long j10, long j11) {
        this.f117969a = j10;
        this.f117970b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xu2.class == obj.getClass()) {
            xu2 xu2Var = (xu2) obj;
            if (this.f117969a == xu2Var.f117969a && this.f117970b == xu2Var.f117970b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f117969a) * 31) + ((int) this.f117970b);
    }
}
