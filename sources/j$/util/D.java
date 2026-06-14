package j$.util;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f84783c = new D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84785b;

    public D() {
        this.f84784a = false;
        this.f84785b = 0L;
    }

    public D(long j10) {
        this.f84784a = true;
        this.f84785b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        boolean z10 = this.f84784a;
        return (z10 && d10.f84784a) ? this.f84785b == d10.f84785b : z10 == d10.f84784a;
    }

    public final int hashCode() {
        if (!this.f84784a) {
            return 0;
        }
        long j10 = this.f84785b;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        if (this.f84784a) {
            return "OptionalLong[" + this.f84785b + C4240b4.j.f42674e;
        }
        return "OptionalLong.empty";
    }
}
