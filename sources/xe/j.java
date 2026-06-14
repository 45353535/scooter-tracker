package xe;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f108198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f108199b;

    public j(int i10, int i11) {
        this.f108198a = i10;
        this.f108199b = i11;
    }

    public final int a() {
        return this.f108199b;
    }

    public final int b() {
        return this.f108198a;
    }

    public final void c(int i10) {
        this.f108199b = i10;
    }

    public final void d(int i10) {
        this.f108198a = i10;
    }

    public String toString() {
        return "MutableRange(start=" + this.f108198a + ", end=" + this.f108199b + ')';
    }
}
