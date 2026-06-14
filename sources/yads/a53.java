package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class a53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r43 f108566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f108568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f108569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f108570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f108571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f108572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f108573h;

    public a53(r43 r43Var, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        fi.a(iArr.length == jArr2.length);
        fi.a(jArr.length == jArr2.length);
        fi.a(iArr2.length == jArr2.length);
        this.f108566a = r43Var;
        this.f108568c = jArr;
        this.f108569d = iArr;
        this.f108570e = i10;
        this.f108571f = jArr2;
        this.f108572g = iArr2;
        this.f108573h = j10;
        this.f108567b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        for (int iA = w83.a(this.f108571f, j10, true); iA < this.f108571f.length; iA++) {
            if ((this.f108572g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
