package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f23137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23140d = 0;

    public o(byte[] bArr, int i10, int i11) {
        this.f23137a = bArr;
        this.f23139c = i10;
        this.f23138b = i11;
        a();
    }

    public final boolean a(int i10) {
        int i11 = this.f23139c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f23140d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            int i15 = i11 + 1;
            if (i15 > i13 || i13 >= this.f23138b) {
                break;
            }
            if (c(i15)) {
                i13++;
                i11 += 3;
            } else {
                i11 = i15;
            }
        }
        int i16 = this.f23138b;
        if (i13 >= i16) {
            return i13 == i16 && i14 == 0;
        }
        return true;
    }

    public final int b(int i10) {
        int i11;
        this.f23140d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f23140d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f23140d = i13;
            byte[] bArr = this.f23137a;
            int i14 = this.f23139c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!c(i14 + 1)) {
                i = 1;
            }
            this.f23139c = i14 + i;
        }
        byte[] bArr2 = this.f23137a;
        int i15 = this.f23139c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f23140d = 0;
            this.f23139c = i15 + (c(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public final boolean c() {
        boolean z10 = (this.f23137a[this.f23139c] & (128 >> this.f23140d)) != 0;
        f();
        return z10;
    }

    public final void d(int i10) {
        int i11 = this.f23139c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f23139c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f23140d;
        this.f23140d = i14;
        if (i14 > 7) {
            this.f23139c = i13 + 1;
            this.f23140d = i14 - 8;
        }
        while (true) {
            int i15 = i11 + 1;
            if (i15 > this.f23139c) {
                a();
                return;
            } else if (c(i15)) {
                this.f23139c++;
                i11 += 3;
            } else {
                i11 = i15;
            }
        }
    }

    public final int e() {
        int iD = d();
        return ((iD + 1) / 2) * (iD % 2 == 0 ? -1 : 1);
    }

    public final void f() {
        int i10 = this.f23140d + 1;
        this.f23140d = i10;
        if (i10 == 8) {
            this.f23140d = 0;
            int i11 = this.f23139c;
            this.f23139c = i11 + (c(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public final boolean c(int i10) {
        if (2 > i10 || i10 >= this.f23138b) {
            return false;
        }
        byte[] bArr = this.f23137a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public final void a() {
        int i10 = this.f23139c;
        if (i10 >= 0) {
            int i11 = this.f23138b;
            if (i10 < i11) {
                return;
            }
            if (i10 == i11 && this.f23140d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        int i10 = this.f23139c;
        int i11 = this.f23140d;
        int i12 = 0;
        while (this.f23139c < this.f23138b && !c()) {
            i12++;
        }
        boolean z10 = this.f23139c == this.f23138b;
        this.f23139c = i10;
        this.f23140d = i11;
        return !z10 && a((i12 * 2) + 1);
    }

    public final int d() {
        int i10 = 0;
        while (!c()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? b(i10) : 0);
    }
}
