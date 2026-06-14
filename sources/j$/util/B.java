package j$.util;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f84772c = new B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f84774b;

    public B() {
        this.f84773a = false;
        this.f84774b = Double.NaN;
    }

    public B(double d10) {
        this.f84773a = true;
        this.f84774b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        boolean z10 = this.f84773a;
        return (z10 && b10.f84773a) ? Double.compare(this.f84774b, b10.f84774b) == 0 : z10 == b10.f84773a;
    }

    public final int hashCode() {
        if (!this.f84773a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f84774b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.f84773a) {
            return "OptionalDouble[" + this.f84774b + C4240b4.j.f42674e;
        }
        return "OptionalDouble.empty";
    }
}
