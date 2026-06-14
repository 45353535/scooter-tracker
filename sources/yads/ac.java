package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f108622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f108623b;

    public ac(long j10, long j11) {
        this.f108622a = j10;
        this.f108623b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f108622a == acVar.f108622a && this.f108623b == acVar.f108623b;
    }

    public final int hashCode() {
        return (((int) this.f108622a) * 31) + ((int) this.f108623b);
    }
}
