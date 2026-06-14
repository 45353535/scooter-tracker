package yads;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes4.dex */
public final class pu2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pu2 f114788c = new pu2(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f114789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f114790b;

    public pu2(long j10, long j11) {
        this.f114789a = j10;
        this.f114790b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pu2.class == obj.getClass()) {
            pu2 pu2Var = (pu2) obj;
            if (this.f114789a == pu2Var.f114789a && this.f114790b == pu2Var.f114790b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f114789a) * 31) + ((int) this.f114790b);
    }

    public final String toString() {
        return "[timeUs=" + this.f114789a + ", position=" + this.f114790b + C4240b4.j.f42674e;
    }
}
