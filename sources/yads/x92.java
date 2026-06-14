package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class x92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f117741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f117742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f117744d;

    public x92(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11);
    }

    public final void a() {
        int i10 = this.f117743c;
        if (i10 >= 0) {
            int i11 = this.f117742b;
            if (i10 < i11) {
                return;
            }
            if (i10 == i11 && this.f117744d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        int i10 = this.f117743c;
        int i11 = this.f117744d;
        int i12 = 0;
        while (this.f117743c < this.f117742b && !c()) {
            i12++;
        }
        boolean z10 = this.f117743c == this.f117742b;
        this.f117743c = i10;
        this.f117744d = i11;
        return !z10 && a((i12 * 2) + 1);
    }

    public final boolean c() {
        boolean z10 = (this.f117741a[this.f117743c] & (128 >> this.f117744d)) != 0;
        f();
        return z10;
    }

    public final int d() {
        int i10 = 0;
        while (!c()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? b(i10) : 0);
    }

    public final int e() {
        int iD = d();
        return ((iD + 1) / 2) * (iD % 2 == 0 ? -1 : 1);
    }

    public final void f() {
        int i10 = this.f117744d + 1;
        this.f117744d = i10;
        if (i10 == 8) {
            this.f117744d = 0;
            int i11 = this.f117743c;
            this.f117743c = i11 + (c(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public final boolean a(int i10) {
        int i11 = this.f117743c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f117744d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            int i15 = i11 + 1;
            if (i15 > i13 || i13 >= this.f117742b) {
                break;
            }
            if (c(i15)) {
                i13++;
                i11 += 3;
            } else {
                i11 = i15;
            }
        }
        int i16 = this.f117742b;
        if (i13 >= i16) {
            return i13 == i16 && i14 == 0;
        }
        return true;
    }

    public final boolean c(int i10) {
        if (2 > i10 || i10 >= this.f117742b) {
            return false;
        }
        byte[] bArr = this.f117741a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public final void d(int i10) {
        int i11 = this.f117743c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f117743c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f117744d;
        this.f117744d = i14;
        if (i14 > 7) {
            this.f117743c = i13 + 1;
            this.f117744d = i14 - 8;
        }
        while (true) {
            int i15 = i11 + 1;
            if (i15 <= this.f117743c) {
                if (c(i15)) {
                    this.f117743c++;
                    i11 += 3;
                } else {
                    i11 = i15;
                }
            } else {
                a();
                return;
            }
        }
    }

    public final int b(int i10) {
        int i11;
        this.f117744d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f117744d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f117744d = i13;
            byte[] bArr = this.f117741a;
            int i14 = this.f117743c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!c(i14 + 1)) {
                i = 1;
            }
            this.f117743c = i14 + i;
        }
        byte[] bArr2 = this.f117741a;
        int i15 = this.f117743c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f117744d = 0;
            this.f117743c = i15 + (c(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        this.f117741a = bArr;
        this.f117743c = i10;
        this.f117742b = i11;
        this.f117744d = 0;
        a();
    }
}
