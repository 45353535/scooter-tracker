package yads;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class v92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f116906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116909d;

    public v92() {
        this.f116906a = w83.f117346f;
    }

    public final void a() {
        int i10 = this.f116907b;
        if (i10 >= 0) {
            int i11 = this.f116909d;
            if (i10 < i11) {
                return;
            }
            if (i10 == i11 && this.f116908c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int b() {
        return ((this.f116909d - this.f116907b) * 8) - this.f116908c;
    }

    public final int c() {
        if (this.f116908c == 0) {
            return this.f116907b;
        }
        throw new IllegalStateException();
    }

    public final int d() {
        return (this.f116907b * 8) + this.f116908c;
    }

    public final boolean e() {
        boolean z10 = (this.f116906a[this.f116907b] & (128 >> this.f116908c)) != 0;
        g();
        return z10;
    }

    public final long f() {
        int iA = a(4);
        int iA2 = a(32);
        int i10 = w83.f117341a;
        return ((((long) iA) & 4294967295L) << 32) | (((long) iA2) & 4294967295L);
    }

    public final void g() {
        int i10 = this.f116908c + 1;
        this.f116908c = i10;
        if (i10 == 8) {
            this.f116908c = 0;
            this.f116907b++;
        }
        a();
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        this.f116907b = i11;
        this.f116908c = i10 - (i11 * 8);
        a();
    }

    public final void d(int i10) {
        if (this.f116908c != 0) {
            throw new IllegalStateException();
        }
        this.f116907b += i10;
        a();
    }

    public v92(int i10, byte[] bArr) {
        this.f116906a = bArr;
        this.f116909d = i10;
    }

    public final int a(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f116908c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f116908c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f116908c = i13;
            byte[] bArr = this.f116906a;
            int i14 = this.f116907b;
            this.f116907b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f116906a;
        int i15 = this.f116907b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f116908c = 0;
            this.f116907b = i15 + 1;
        }
        a();
        return i16;
    }

    public final void c(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f116907b + i11;
        this.f116907b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f116908c;
        this.f116908c = i13;
        if (i13 > 7) {
            this.f116907b = i12 + 1;
            this.f116908c = i13 - 8;
        }
        a();
    }

    public v92(byte[] bArr) {
        this(bArr.length, bArr);
    }

    public final void a(byte[] bArr, int i10) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f116906a;
            int i13 = this.f116907b;
            int i14 = i13 + 1;
            this.f116907b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f116908c;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f116908c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f116906a;
            int i18 = this.f116907b;
            this.f116907b = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f116908c = i17 - 8;
        }
        int i19 = this.f116908c + i16;
        this.f116908c = i19;
        byte[] bArr4 = this.f116906a;
        int i20 = this.f116907b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f116908c = 0;
            this.f116907b = i20 + 1;
        }
        a();
    }

    public final String a(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        if (this.f116908c == 0) {
            System.arraycopy(this.f116906a, this.f116907b, bArr, 0, i10);
            this.f116907b += i10;
            a();
            return new String(bArr, charset);
        }
        throw new IllegalStateException();
    }

    public final void a(int i10, byte[] bArr) {
        this.f116906a = bArr;
        this.f116907b = 0;
        this.f116908c = 0;
        this.f116909d = i10;
    }
}
