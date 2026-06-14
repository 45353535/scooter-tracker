package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f23134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23136c;

    public n() {
    }

    public final int a() {
        byte[] bArr = this.f23134a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int b() {
        byte[] bArr = this.f23134a;
        int i10 = this.f23135b;
        int i11 = i10 + 1;
        this.f23135b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f23135b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f23135b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f23135b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public final void c(int i10) {
        this.f23134a = a() < i10 ? new byte[i10] : this.f23134a;
        this.f23136c = i10;
        this.f23135b = 0;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 > this.f23134a.length) {
            throw new IllegalArgumentException();
        }
        this.f23136c = i10;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 > this.f23136c) {
            throw new IllegalArgumentException();
        }
        this.f23135b = i10;
    }

    public final int f() {
        byte[] bArr = this.f23134a;
        int i10 = this.f23135b;
        int i11 = i10 + 1;
        this.f23135b = i11;
        int i12 = bArr[i10] & 255;
        this.f23135b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long g() {
        byte[] bArr = this.f23134a;
        int i10 = this.f23135b;
        int i11 = i10 + 1;
        this.f23135b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f23135b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f23135b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f23135b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f23135b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f23135b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f23135b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f23135b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public final void h() {
        int i10 = this.f23136c;
        int i11 = this.f23135b;
        if (i10 - i11 == 0) {
            return;
        }
        while (i11 < this.f23136c && this.f23134a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f23134a;
        int i12 = this.f23135b;
        new String(bArr, i12, i11 - i12);
        this.f23135b = i11;
        if (i11 < this.f23136c) {
            this.f23135b = i11 + 1;
        }
    }

    public final int i() {
        return (j() << 21) | (j() << 14) | (j() << 7) | j();
    }

    public final int j() {
        byte[] bArr = this.f23134a;
        int i10 = this.f23135b;
        this.f23135b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long k() {
        byte[] bArr = this.f23134a;
        int i10 = this.f23135b;
        int i11 = i10 + 1;
        this.f23135b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f23135b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f23135b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f23135b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public final int l() {
        byte[] bArr = this.f23134a;
        int i10 = this.f23135b;
        int i11 = i10 + 1;
        this.f23135b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f23135b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f23135b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public final int m() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Top bit not zero: ", iB));
    }

    public final long n() {
        long jG = g();
        if (jG >= 0) {
            return jG;
        }
        throw new IllegalStateException("Top bit not zero: " + jG);
    }

    public final int o() {
        byte[] bArr = this.f23134a;
        int i10 = this.f23135b;
        int i11 = i10 + 1;
        this.f23135b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f23135b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public n(int i10) {
        this.f23134a = new byte[i10];
        this.f23136c = i10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f23134a, this.f23135b, bArr, i10, i11);
        this.f23135b += i11;
    }

    public final String b(int i10) {
        String str = new String(this.f23134a, this.f23135b, i10, Charset.defaultCharset());
        this.f23135b += i10;
        return str;
    }

    public final String a(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f23135b;
        int i12 = (i11 + i10) - 1;
        String str = new String(this.f23134a, i11, (i12 >= this.f23136c || this.f23134a[i12] != 0) ? i10 : i10 - 1);
        this.f23135b += i10;
        return str;
    }

    public final int d() {
        byte[] bArr = this.f23134a;
        int i10 = this.f23135b;
        int i11 = i10 + 1;
        this.f23135b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f23135b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f23135b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f23135b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public final long e() {
        byte[] bArr = this.f23134a;
        int i10 = this.f23135b;
        int i11 = i10 + 1;
        this.f23135b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f23135b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f23135b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f23135b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public n(byte[] bArr) {
        this.f23134a = bArr;
        this.f23136c = bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c() {
        /*
            r8 = this;
            int r0 = r8.f23136c
            int r1 = r8.f23135b
            int r0 = r0 - r1
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            int r0 = r8.f23136c
            r2 = 13
            r3 = 10
            if (r1 >= r0) goto L1f
            byte[] r0 = r8.f23134a
            r0 = r0[r1]
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f23162a
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L9
        L1f:
            int r0 = r8.f23135b
            int r4 = r1 - r0
            r5 = 3
            if (r4 < r5) goto L41
            byte[] r4 = r8.f23134a
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
            r8.f23135b = r0
        L41:
            java.lang.String r0 = new java.lang.String
            byte[] r4 = r8.f23134a
            int r5 = r8.f23135b
            int r6 = r1 - r5
            r0.<init>(r4, r5, r6)
            r8.f23135b = r1
            int r4 = r8.f23136c
            if (r1 != r4) goto L53
            goto L6a
        L53:
            byte[] r5 = r8.f23134a
            r6 = r5[r1]
            if (r6 != r2) goto L60
            int r1 = r1 + 1
            r8.f23135b = r1
            if (r1 != r4) goto L60
            goto L6a
        L60:
            int r1 = r8.f23135b
            r2 = r5[r1]
            if (r2 != r3) goto L6a
            int r1 = r1 + 1
            r8.f23135b = r1
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.n.c():java.lang.String");
    }

    public n(int i10, byte[] bArr) {
        this.f23134a = bArr;
        this.f23136c = i10;
    }
}
