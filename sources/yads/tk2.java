package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class tk2 extends d41 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final tk2 f116278j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f116279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f116280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f116281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f116282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f116283h;

    static {
        Object[] objArr = new Object[0];
        f116278j = new tk2(objArr, 0, objArr, 0, 0);
    }

    public tk2(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f116279d = objArr;
        this.f116280e = i10;
        this.f116281f = objArr2;
        this.f116282g = i11;
        this.f116283h = i12;
    }

    @Override // yads.s31
    public final int a(int i10, Object[] objArr) {
        System.arraycopy(this.f116279d, 0, objArr, i10, this.f116283h);
        return i10 + this.f116283h;
    }

    @Override // yads.s31
    public final Object[] b() {
        return this.f116279d;
    }

    @Override // yads.s31
    public final int c() {
        return this.f116283h;
    }

    @Override // yads.s31, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f116281f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA = az0.a(obj.hashCode());
        while (true) {
            int i10 = iA & this.f116282g;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i10 + 1;
        }
    }

    @Override // yads.s31
    public final int d() {
        return 0;
    }

    @Override // yads.s31
    public final boolean e() {
        return false;
    }

    @Override // yads.d41
    public final y31 f() {
        return y31.b(this.f116283h, this.f116279d);
    }

    @Override // yads.d41, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f116280e;
    }

    @Override // yads.s31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final w73 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f116283h;
    }
}
