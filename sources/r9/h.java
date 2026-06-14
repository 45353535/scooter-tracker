package r9;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f99331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f99332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f99333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f99334d;

    public h(byte[] bArr, int i10, int i11) {
        j(bArr, i10, i11);
    }

    private void a() {
        int i10;
        int i11 = this.f99333c;
        q9.a.g(i11 >= 0 && (i11 < (i10 = this.f99332b) || (i11 == i10 && this.f99334d == 0)));
    }

    private int g() {
        int i10 = 0;
        while (!e()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? f(i10) : 0);
    }

    private boolean k(int i10) {
        if (2 > i10 || i10 >= this.f99332b) {
            return false;
        }
        byte[] bArr = this.f99331a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void b() {
        int i10 = this.f99334d;
        if (i10 > 0) {
            m(8 - i10);
        }
    }

    public boolean c(int i10) {
        int i11 = this.f99333c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f99334d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f99332b) {
                break;
            }
            if (k(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f99332b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean d() {
        int i10 = this.f99333c;
        int i11 = this.f99334d;
        int i12 = 0;
        while (this.f99333c < this.f99332b && !e()) {
            i12++;
        }
        boolean z10 = this.f99333c == this.f99332b;
        this.f99333c = i10;
        this.f99334d = i11;
        return !z10 && c((i12 * 2) + 1);
    }

    public boolean e() {
        boolean z10 = (this.f99331a[this.f99333c] & (128 >> this.f99334d)) != 0;
        l();
        return z10;
    }

    public int f(int i10) {
        int i11;
        this.f99334d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f99334d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f99334d = i13;
            byte[] bArr = this.f99331a;
            int i14 = this.f99333c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!k(i14 + 1)) {
                i = 1;
            }
            this.f99333c = i14 + i;
        }
        byte[] bArr2 = this.f99331a;
        int i15 = this.f99333c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f99334d = 0;
            this.f99333c = i15 + (k(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public int h() {
        int iG = g();
        return (iG % 2 == 0 ? -1 : 1) * ((iG + 1) / 2);
    }

    public int i() {
        return g();
    }

    public void j(byte[] bArr, int i10, int i11) {
        this.f99331a = bArr;
        this.f99333c = i10;
        this.f99332b = i11;
        this.f99334d = 0;
        a();
    }

    public void l() {
        int i10 = this.f99334d + 1;
        this.f99334d = i10;
        if (i10 == 8) {
            this.f99334d = 0;
            int i11 = this.f99333c;
            this.f99333c = i11 + (k(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void m(int i10) {
        int i11 = this.f99333c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f99333c = i13;
        int i14 = this.f99334d + (i10 - (i12 * 8));
        this.f99334d = i14;
        if (i14 > 7) {
            this.f99333c = i13 + 1;
            this.f99334d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f99333c) {
                a();
                return;
            } else if (k(i11)) {
                this.f99333c++;
                i11 += 2;
            }
        }
    }
}
