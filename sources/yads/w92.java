package yads;

import com.applovin.shadow.okio.Utf8;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class w92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f117356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f117357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117358c;

    public w92() {
        this.f117356a = w83.f117346f;
    }

    public final void a(int i10) {
        byte[] bArr = this.f117356a;
        if (i10 > bArr.length) {
            this.f117356a = Arrays.copyOf(bArr, i10);
        }
    }

    public final int b() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        int i11 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 8);
        this.f117357b = i10 + 4;
        return (bArr[i12] & 255) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c() {
        /*
            r8 = this;
            int r0 = r8.f117358c
            int r1 = r8.f117357b
            int r0 = r0 - r1
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            int r0 = r8.f117358c
            r2 = 13
            r3 = 10
            if (r1 >= r0) goto L1f
            byte[] r0 = r8.f117356a
            r0 = r0[r1]
            int r4 = yads.w83.f117341a
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L9
        L1f:
            int r0 = r8.f117357b
            int r4 = r1 - r0
            r5 = 3
            if (r4 < r5) goto L41
            byte[] r4 = r8.f117356a
            r6 = r4[r0]
            r7 = -17
            if (r6 != r7) goto L41
            int r6 = r0 + 1
            r6 = r4[r6]
            r7 = -69
            if (r6 != r7) goto L41
            int r6 = r0 + 2
            r4 = r4[r6]
            r6 = -65
            if (r4 != r6) goto L41
            int r0 = r0 + r5
            r8.f117357b = r0
        L41:
            byte[] r0 = r8.f117356a
            int r4 = r8.f117357b
            int r5 = r1 - r4
            java.lang.String r0 = yads.w83.a(r0, r4, r5)
            r8.f117357b = r1
            int r4 = r8.f117358c
            if (r1 != r4) goto L52
            goto L69
        L52:
            byte[] r5 = r8.f117356a
            r6 = r5[r1]
            if (r6 != r2) goto L5f
            int r1 = r1 + 1
            r8.f117357b = r1
            if (r1 != r4) goto L5f
            goto L69
        L5f:
            int r1 = r8.f117357b
            r2 = r5[r1]
            if (r2 != r3) goto L69
            int r1 = r1 + 1
            r8.f117357b = r1
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.w92.c():java.lang.String");
    }

    public final int d() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        int i11 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 16);
        this.f117357b = i10 + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public final long e() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        int i11 = i10 + 7;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        this.f117357b = i10 + 8;
        return ((((long) bArr[i11]) & 255) << 56) | j10;
    }

    public final short f() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f117357b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final long g() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        int i11 = i10 + 3;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16);
        this.f117357b = i10 + 4;
        return ((((long) bArr[i11]) & 255) << 24) | j10;
    }

    public final int h() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f117357b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long i() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        int i11 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        this.f117357b = i10 + 8;
        return (((long) bArr[i11]) & 255) | j10;
    }

    public final String j() {
        int i10 = this.f117358c;
        int i11 = this.f117357b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f117358c && this.f117356a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f117356a;
        int i12 = this.f117357b;
        String strA = w83.a(bArr, i12, i11 - i12);
        this.f117357b = i11;
        if (i11 < this.f117358c) {
            this.f117357b = i11 + 1;
        }
        return strA;
    }

    public final short k() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f117357b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final int l() {
        return (m() << 21) | (m() << 14) | (m() << 7) | m();
    }

    public final int m() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        this.f117357b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long n() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        int i11 = i10 + 3;
        long j10 = ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i10 + 1]) & 255) << 16) | ((((long) bArr[i10 + 2]) & 255) << 8);
        this.f117357b = i10 + 4;
        return (((long) bArr[i11]) & 255) | j10;
    }

    public final int o() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
        this.f117357b = i10 + 3;
        return (bArr[i11] & 255) | i12;
    }

    public final int p() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(he2.a("Top bit not zero: ", iB));
    }

    public final long q() {
        long jI = i();
        if (jI >= 0) {
            return jI;
        }
        throw new IllegalStateException("Top bit not zero: " + jI);
    }

    public final int r() {
        byte[] bArr = this.f117356a;
        int i10 = this.f117357b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f117357b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long s() {
        int i10;
        int i11;
        long j10 = this.f117356a[this.f117357b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f117356a[this.f117357b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & Utf8.REPLACEMENT_BYTE));
        }
        this.f117357b += i11;
        return j10;
    }

    public final String b(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f117357b;
        int i12 = (i11 + i10) - 1;
        String strA = w83.a(this.f117356a, i11, (i12 >= this.f117358c || this.f117356a[i12] != 0) ? i10 : i10 - 1);
        this.f117357b += i10;
        return strA;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 > this.f117356a.length) {
            throw new IllegalArgumentException();
        }
        this.f117358c = i10;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 > this.f117358c) {
            throw new IllegalArgumentException();
        }
        this.f117357b = i10;
    }

    public w92(int i10) {
        this.f117356a = new byte[i10];
        this.f117358c = i10;
    }

    public final byte[] a() {
        return this.f117356a;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f117356a, this.f117357b, bArr, i10, i11);
        this.f117357b += i11;
    }

    public w92(int i10, byte[] bArr) {
        this.f117356a = bArr;
        this.f117358c = i10;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        this.f117356a = bArr;
        this.f117358c = length;
        this.f117357b = 0;
    }

    public w92(byte[] bArr) {
        this.f117356a = bArr;
        this.f117358c = bArr.length;
    }

    public final String a(int i10, Charset charset) {
        String str = new String(this.f117356a, this.f117357b, i10, charset);
        this.f117357b += i10;
        return str;
    }

    public final void c(int i10) {
        byte[] bArr = this.f117356a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        this.f117356a = bArr;
        this.f117358c = i10;
        this.f117357b = 0;
    }
}
