package oa;

/* JADX INFO: loaded from: classes12.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f96653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f96654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f96655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96656d;

    public u0(byte[] bArr) {
        this.f96653a = bArr;
        this.f96654b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f96655c;
        q9.a.g(i11 >= 0 && (i11 < (i10 = this.f96654b) || (i11 == i10 && this.f96656d == 0)));
    }

    public int b() {
        return (this.f96655c * 8) + this.f96656d;
    }

    public boolean c() {
        boolean z10 = (((this.f96653a[this.f96655c] & 255) >> this.f96656d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f96655c;
        int iMin = Math.min(i10, 8 - this.f96656d);
        int i12 = i11 + 1;
        int i13 = ((this.f96653a[i11] & 255) >> this.f96656d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f96653a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f96655c + i11;
        this.f96655c = i12;
        int i13 = this.f96656d + (i10 - (i11 * 8));
        this.f96656d = i13;
        if (i13 > 7) {
            this.f96655c = i12 + 1;
            this.f96656d = i13 - 8;
        }
        a();
    }
}
