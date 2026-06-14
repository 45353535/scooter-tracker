package f1;

/* JADX INFO: loaded from: classes6.dex */
public final class b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f69443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f69444c;

    public b9(long j10, long j11, long j12) {
        this.f69442a = j10;
        this.f69443b = j11;
        this.f69444c = j12;
    }

    public final long a() {
        return this.f69442a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj;
        return this.f69442a == b9Var.f69442a && this.f69443b == b9Var.f69443b && this.f69444c == b9Var.f69444c;
    }

    public int hashCode() {
        return (((androidx.collection.b.a(this.f69442a) * 31) + androidx.collection.b.a(this.f69443b)) * 31) + androidx.collection.b.a(this.f69444c);
    }

    public String toString() {
        return "TimeSourceBodyFields(currentTimeMillis=" + this.f69442a + ", nanoTime=" + this.f69443b + ", uptimeMillis=" + this.f69444c + ")";
    }
}
