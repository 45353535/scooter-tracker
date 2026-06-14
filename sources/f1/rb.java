package f1;

/* JADX INFO: loaded from: classes6.dex */
public final class rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f70990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f70991b;

    public rb(double d10, double d11) {
        this.f70990a = d10;
        this.f70991b = d11;
    }

    public final double a() {
        return this.f70991b;
    }

    public final double b() {
        return this.f70990a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb)) {
            return false;
        }
        rb rbVar = (rb) obj;
        return Double.compare(this.f70990a, rbVar.f70990a) == 0 && Double.compare(this.f70991b, rbVar.f70991b) == 0;
    }

    public int hashCode() {
        return (androidx.collection.a.a(this.f70990a) * 31) + androidx.collection.a.a(this.f70991b);
    }

    public String toString() {
        return "DoubleSize(width=" + this.f70990a + ", height=" + this.f70991b + ")";
    }
}
