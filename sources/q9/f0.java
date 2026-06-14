package q9;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f98785c = new f0(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f98786d = new f0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f98787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f98788b;

    public f0(int i10, int i11) {
        a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f98787a = i10;
        this.f98788b = i11;
    }

    public int a() {
        return this.f98788b;
    }

    public int b() {
        return this.f98787a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.f98787a == f0Var.f98787a && this.f98788b == f0Var.f98788b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f98788b;
        int i11 = this.f98787a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f98787a + "x" + this.f98788b;
    }
}
