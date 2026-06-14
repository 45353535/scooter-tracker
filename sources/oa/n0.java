package oa;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f96612c = new n0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f96613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96614b;

    public n0(long j10, long j11) {
        this.f96613a = j10;
        this.f96614b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (this.f96613a == n0Var.f96613a && this.f96614b == n0Var.f96614b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f96613a) * 31) + ((int) this.f96614b);
    }

    public String toString() {
        return "[timeUs=" + this.f96613a + ", position=" + this.f96614b + C4240b4.j.f42674e;
    }
}
