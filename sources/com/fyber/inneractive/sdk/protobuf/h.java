package com.fyber.inneractive.sdk.protobuf;

import androidx.work.WorkInfo;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23477a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f23478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23482f;

    public h(ByteBuffer byteBuffer) {
        this.f23478b = byteBuffer.array();
        this.f23479c = byteBuffer.position() + byteBuffer.arrayOffset();
        this.f23480d = byteBuffer.limit() + byteBuffer.arrayOffset();
    }

    public final String a(boolean z10) throws n1 {
        c(2);
        int iX = x();
        if (iX == 0) {
            return "";
        }
        a(iX);
        if (z10) {
            byte[] bArr = this.f23478b;
            int i10 = this.f23479c;
            if (!d4.f23458a.b(bArr, i10, i10 + iX)) {
                throw new n1("Protocol message had invalid UTF-8.");
            }
        }
        String str = new String(this.f23478b, this.f23479c, iX, l1.f23521a);
        this.f23479c += iX;
        return str;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(Class cls, h0 h0Var) throws m1 {
        c(2);
        return d(p2.f23544c.a(cls), h0Var);
    }

    public final Object c(t2 t2Var, h0 h0Var) {
        int i10 = this.f23482f;
        this.f23482f = ((this.f23481e >>> 3) << 3) | 4;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f23481e == this.f23482f) {
                return objA;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.f23482f = i10;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int e() {
        return this.f23481e;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long f() throws m1 {
        c(0);
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long g() throws n1 {
        c(1);
        a(8);
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() throws n1 {
        c(1);
        a(8);
        return Double.longBitsToDouble(w());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    @Override // com.fyber.inneractive.sdk.protobuf.s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            r7 = this;
            r0 = 1
            boolean r1 = r7.u()
            r2 = 0
            if (r1 != 0) goto Lad
            int r1 = r7.f23481e
            int r3 = r7.f23482f
            if (r1 != r3) goto L10
            goto Lad
        L10:
            r4 = r1 & 7
            if (r4 == 0) goto L6e
            if (r4 == r0) goto L63
            r2 = 2
            if (r4 == r2) goto L56
            r2 = 4
            r5 = 3
            if (r4 == r5) goto L31
            r1 = 5
            if (r4 != r1) goto L29
            r7.a(r2)
            int r1 = r7.f23479c
            int r1 = r1 + r2
            r7.f23479c = r1
            return r0
        L29:
            int r0 = com.fyber.inneractive.sdk.protobuf.n1.f23533a
            com.fyber.inneractive.sdk.protobuf.m1 r0 = new com.fyber.inneractive.sdk.protobuf.m1
            r0.<init>()
            throw r0
        L31:
            int r1 = r1 >>> r5
            int r1 = r1 << r5
            r1 = r1 | r2
            r7.f23482f = r1
        L36:
            int r1 = r7.s()
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L45
            boolean r1 = r7.i()
            if (r1 != 0) goto L36
        L45:
            int r1 = r7.f23481e
            int r2 = r7.f23482f
            if (r1 != r2) goto L4e
            r7.f23482f = r3
            return r0
        L4e:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            java.lang.String r1 = "Failed to parse the message."
            r0.<init>(r1)
            throw r0
        L56:
            int r1 = r7.x()
            r7.a(r1)
            int r2 = r7.f23479c
            int r2 = r2 + r1
            r7.f23479c = r2
            return r0
        L63:
            r1 = 8
            r7.a(r1)
            int r2 = r7.f23479c
            int r2 = r2 + r1
            r7.f23479c = r2
            return r0
        L6e:
            int r1 = r7.f23480d
            int r3 = r7.f23479c
            int r1 = r1 - r3
            r4 = 10
            if (r1 < r4) goto L88
            byte[] r1 = r7.f23478b
            r5 = r2
        L7a:
            if (r5 >= r4) goto L88
            int r6 = r3 + 1
            r3 = r1[r3]
            if (r3 < 0) goto L85
            r7.f23479c = r6
            goto L9a
        L85:
            int r5 = r5 + r0
            r3 = r6
            goto L7a
        L88:
            if (r2 >= r4) goto La5
            int r1 = r7.f23479c
            int r3 = r7.f23480d
            if (r1 == r3) goto L9d
            byte[] r3 = r7.f23478b
            int r5 = r1 + 1
            r7.f23479c = r5
            r1 = r3[r1]
            if (r1 < 0) goto L9b
        L9a:
            return r0
        L9b:
            int r2 = r2 + r0
            goto L88
        L9d:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
        La5:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            throw r0
        Lad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.h.i():boolean");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int j() throws m1 {
        c(0);
        return w.b(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final float k() throws n1 {
        c(5);
        a(4);
        return Float.intBitsToFloat(v());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long l() throws m1 {
        c(0);
        return w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int m() throws n1 {
        c(5);
        a(4);
        return v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String n() {
        return a(false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long o() throws m1 {
        c(0);
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String p() {
        return a(true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int q() throws n1 {
        c(5);
        a(4);
        return v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean r() throws m1 {
        c(0);
        return x() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int s() throws n1 {
        if (u()) {
            return Integer.MAX_VALUE;
        }
        int iX = x();
        this.f23481e = iX;
        if (iX == this.f23482f) {
            return Integer.MAX_VALUE;
        }
        return iX >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long t() throws n1 {
        c(1);
        a(8);
        return w();
    }

    public final boolean u() {
        return this.f23479c == this.f23480d;
    }

    public final int v() {
        int i10 = this.f23479c;
        byte[] bArr = this.f23478b;
        this.f23479c = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long w() {
        int i10 = this.f23479c;
        byte[] bArr = this.f23478b;
        this.f23479c = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[PHI: r2
  0x00a4: PHI (r2v7 int) = (r2v6 int), (r2v9 int) binds: [B:37:0x0082, B:41:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int x() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            r9 = this;
            int r0 = r9.f23479c
            int r1 = r9.f23480d
            java.lang.String r2 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            if (r1 == r0) goto Laa
            byte[] r3 = r9.f23478b
            int r4 = r0 + 1
            r5 = r3[r0]
            if (r5 < 0) goto L13
            r9.f23479c = r4
            return r5
        L13:
            int r1 = r1 - r4
            java.lang.String r6 = "CodedInputStream encountered a malformed varint."
            r7 = 9
            if (r1 >= r7) goto L49
            r0 = 0
            r3 = 0
        L1d:
            r4 = 64
            if (r3 >= r4) goto L43
            int r4 = r9.f23479c
            int r5 = r9.f23480d
            if (r4 == r5) goto L3d
            byte[] r5 = r9.f23478b
            int r7 = r4 + 1
            r9.f23479c = r7
            r4 = r5[r4]
            r5 = r4 & 127(0x7f, float:1.78E-43)
            long r7 = (long) r5
            long r7 = r7 << r3
            long r0 = r0 | r7
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 != 0) goto L3a
            int r0 = (int) r0
            return r0
        L3a:
            int r3 = r3 + 7
            goto L1d
        L3d:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            r0.<init>(r2)
            throw r0
        L43:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            r0.<init>(r6)
            throw r0
        L49:
            int r1 = r0 + 2
            r2 = r3[r4]
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L55
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La7
        L55:
            int r4 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            r1 = r1 ^ r2
            if (r1 < 0) goto L62
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
        L60:
            r1 = r4
            goto La7
        L62:
            int r2 = r0 + 4
            r4 = r3[r4]
            int r4 = r4 << 21
            r1 = r1 ^ r4
            if (r1 >= 0) goto L71
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            r1 = r2
            goto La7
        L71:
            int r4 = r0 + 5
            r2 = r3[r2]
            int r5 = r2 << 28
            r1 = r1 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r1 = r1 ^ r5
            if (r2 >= 0) goto La5
            int r2 = r0 + 6
            r4 = r3[r4]
            if (r4 >= 0) goto La4
            int r4 = r0 + 7
            r2 = r3[r2]
            if (r2 >= 0) goto La5
            int r2 = r0 + 8
            r4 = r3[r4]
            if (r4 >= 0) goto La4
            int r4 = r0 + 9
            r2 = r3[r2]
            if (r2 >= 0) goto La5
            int r0 = r0 + 10
            r2 = r3[r4]
            if (r2 < 0) goto L9e
            r4 = r0
            goto La5
        L9e:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            r0.<init>(r6)
            throw r0
        La4:
            r4 = r2
        La5:
            r0 = r1
            goto L60
        La7:
            r9.f23479c = r1
            return r0
        Laa:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.h.x():int");
    }

    public final long y() throws n1 {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f23479c;
        int i11 = this.f23480d;
        if (i11 == i10) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f23478b;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            this.f23479c = i12;
            return b10;
        }
        long j14 = 0;
        if (i11 - i12 < 9) {
            for (int i13 = 0; i13 < 64; i13 += 7) {
                int i14 = this.f23479c;
                if (i14 == this.f23480d) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f23478b;
                this.f23479c = i14 + 1;
                byte b11 = bArr2[i14];
                j14 |= ((long) (b11 & Ascii.DEL)) << i13;
                if ((b11 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j14;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
        }
        int i15 = i10 + 2;
        int i16 = (bArr[i12] << 7) ^ b10;
        if (i16 < 0) {
            j10 = i16 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        } else {
            int i17 = i10 + 3;
            int i18 = (bArr[i15] << Ascii.SO) ^ i16;
            if (i18 >= 0) {
                j10 = i18 ^ 16256;
                i15 = i17;
            } else {
                int i19 = i10 + 4;
                int i20 = i18 ^ (bArr[i17] << Ascii.NAK);
                if (i20 < 0) {
                    j13 = (-2080896) ^ i20;
                } else {
                    long j15 = i20;
                    i15 = i10 + 5;
                    long j16 = j15 ^ (((long) bArr[i19]) << 28);
                    if (j16 >= 0) {
                        j12 = 266354560;
                    } else {
                        i19 = i10 + 6;
                        long j17 = j16 ^ (((long) bArr[i15]) << 35);
                        if (j17 < 0) {
                            j11 = -34093383808L;
                        } else {
                            i15 = i10 + 7;
                            j16 = j17 ^ (((long) bArr[i19]) << 42);
                            if (j16 >= 0) {
                                j12 = 4363953127296L;
                            } else {
                                i19 = i10 + 8;
                                j17 = j16 ^ (((long) bArr[i15]) << 49);
                                if (j17 < 0) {
                                    j11 = -558586000294016L;
                                } else {
                                    i15 = i10 + 9;
                                    long j18 = (j17 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                    if (j18 < 0) {
                                        int i21 = i10 + 10;
                                        if (bArr[i15] < 0) {
                                            throw new n1("CodedInputStream encountered a malformed varint.");
                                        }
                                        i15 = i21;
                                    }
                                    j10 = j18;
                                }
                            }
                        }
                        j13 = j11 ^ j17;
                    }
                    j10 = j12 ^ j16;
                }
                i15 = i19;
                j10 = j13;
            }
        }
        this.f23479c = i15;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(List list) throws n1 {
        int i10;
        int i11;
        if (!(list instanceof a1)) {
            int i12 = this.f23481e & 7;
            if (i12 == 2) {
                int iX = x();
                d(iX);
                int i13 = this.f23479c + iX;
                while (this.f23479c < i13) {
                    list.add(Integer.valueOf(v()));
                }
                return;
            }
            if (i12 != 5) {
                int i14 = n1.f23533a;
                throw new m1();
            }
            do {
                list.add(Integer.valueOf(q()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        a1 a1Var = (a1) list;
        int i15 = this.f23481e & 7;
        if (i15 == 2) {
            int iX2 = x();
            d(iX2);
            int i16 = this.f23479c + iX2;
            while (this.f23479c < i16) {
                a1Var.c(v());
            }
            return;
        }
        if (i15 != 5) {
            int i17 = n1.f23533a;
            throw new m1();
        }
        do {
            a1Var.c(q());
            if (u()) {
                return;
            } else {
                i11 = this.f23479c;
            }
        } while (x() == this.f23481e);
        this.f23479c = i11;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(List list) throws n1 {
        int i10;
        int i11;
        if (!(list instanceof u1)) {
            int i12 = this.f23481e & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(g()));
                    if (u()) {
                        return;
                    } else {
                        i10 = this.f23479c;
                    }
                } while (x() == this.f23481e);
                this.f23479c = i10;
                return;
            }
            if (i12 != 2) {
                int i13 = n1.f23533a;
                throw new m1();
            }
            int iX = x();
            e(iX);
            int i14 = this.f23479c + iX;
            while (this.f23479c < i14) {
                list.add(Long.valueOf(w()));
            }
            return;
        }
        u1 u1Var = (u1) list;
        int i15 = this.f23481e & 7;
        if (i15 == 1) {
            do {
                u1Var.a(g());
                if (u()) {
                    return;
                } else {
                    i11 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i11;
            return;
        }
        if (i15 != 2) {
            int i16 = n1.f23533a;
            throw new m1();
        }
        int iX2 = x();
        e(iX2);
        int i17 = this.f23479c + iX2;
        while (this.f23479c < i17) {
            u1Var.a(w());
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(List list) throws n1 {
        int i10;
        int i11;
        if (!(list instanceof a1)) {
            int i12 = this.f23481e & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    int i13 = n1.f23533a;
                    throw new m1();
                }
                int iX = this.f23479c + x();
                while (this.f23479c < iX) {
                    list.add(Integer.valueOf(x()));
                }
                return;
            }
            do {
                c(0);
                list.add(Integer.valueOf(x()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        a1 a1Var = (a1) list;
        int i14 = this.f23481e & 7;
        if (i14 != 0) {
            if (i14 != 2) {
                int i15 = n1.f23533a;
                throw new m1();
            }
            int iX2 = this.f23479c + x();
            while (this.f23479c < iX2) {
                a1Var.c(x());
            }
            return;
        }
        do {
            c(0);
            a1Var.c(x());
            if (u()) {
                return;
            } else {
                i11 = this.f23479c;
            }
        } while (x() == this.f23481e);
        this.f23479c = i11;
    }

    public final Object d(t2 t2Var, h0 h0Var) throws n1 {
        int iX = x();
        a(iX);
        int i10 = this.f23480d;
        int i11 = this.f23479c + iX;
        this.f23480d = i11;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f23479c == i11) {
                return objA;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.f23480d = i10;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f23481e & 7;
            if (i12 == 2) {
                int iX = x();
                d(iX);
                int i13 = this.f23479c + iX;
                while (this.f23479c < i13) {
                    a1Var.c(v());
                }
                return;
            }
            if (i12 == 5) {
                do {
                    a1Var.c(m());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f23479c;
                    }
                } while (x() == this.f23481e);
                this.f23479c = i11;
                return;
            }
            int i14 = n1.f23533a;
            throw new m1();
        }
        int i15 = this.f23481e & 7;
        if (i15 == 2) {
            int iX2 = x();
            d(iX2);
            int i16 = this.f23479c + iX2;
            while (this.f23479c < i16) {
                list.add(Integer.valueOf(v()));
            }
            return;
        }
        if (i15 == 5) {
            do {
                list.add(Integer.valueOf(m()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        int i17 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int i12 = this.f23481e & 7;
            if (i12 == 1) {
                do {
                    d0Var.a(h());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f23479c;
                    }
                } while (x() == this.f23481e);
                this.f23479c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = x();
                e(iX);
                int i13 = this.f23479c + iX;
                while (this.f23479c < i13) {
                    d0Var.a(Double.longBitsToDouble(w()));
                }
                return;
            }
            int i14 = n1.f23533a;
            throw new m1();
        }
        int i15 = this.f23481e & 7;
        if (i15 == 1) {
            do {
                list.add(Double.valueOf(h()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        if (i15 == 2) {
            int iX2 = x();
            e(iX2);
            int i16 = this.f23479c + iX2;
            while (this.f23479c < i16) {
                list.add(Double.valueOf(Double.longBitsToDouble(w())));
            }
            return;
        }
        int i17 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof j) {
            j jVar = (j) list;
            int i12 = this.f23481e & 7;
            if (i12 == 0) {
                do {
                    jVar.a(r());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f23479c;
                    }
                } while (x() == this.f23481e);
                this.f23479c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f23479c + x();
                while (this.f23479c < iX) {
                    jVar.a(x() != 0);
                }
                b(iX);
                return;
            }
            int i13 = n1.f23533a;
            throw new m1();
        }
        int i14 = this.f23481e & 7;
        if (i14 == 0) {
            do {
                list.add(Boolean.valueOf(r()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f23479c + x();
            while (this.f23479c < iX2) {
                list.add(Boolean.valueOf(x() != 0));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f23481e & 7;
            if (i12 == 0) {
                do {
                    c(0);
                    a1Var.c(x());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f23479c;
                    }
                } while (x() == this.f23481e);
                this.f23479c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f23479c + x();
                while (this.f23479c < iX) {
                    a1Var.c(x());
                }
                b(iX);
                return;
            }
            int i13 = n1.f23533a;
            throw new m1();
        }
        int i14 = this.f23481e & 7;
        if (i14 == 0) {
            do {
                c(0);
                list.add(Integer.valueOf(x()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f23479c + x();
            while (this.f23479c < iX2) {
                list.add(Integer.valueOf(x()));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(t2 t2Var, h0 h0Var) throws m1 {
        c(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f23481e & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    int iX = this.f23479c + x();
                    while (this.f23479c < iX) {
                        u1Var.a(w.a(y()));
                    }
                    return;
                }
                int i13 = n1.f23533a;
                throw new m1();
            }
            do {
                c(0);
                u1Var.a(w.a(y()));
                if (u()) {
                    return;
                } else {
                    i11 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i11;
            return;
        }
        int i14 = this.f23481e & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int iX2 = this.f23479c + x();
                while (this.f23479c < iX2) {
                    list.add(Long.valueOf(w.a(y())));
                }
                return;
            }
            int i15 = n1.f23533a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Long.valueOf(w.a(y())));
            if (u()) {
                return;
            } else {
                i10 = this.f23479c;
            }
        } while (x() == this.f23481e);
        this.f23479c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f23481e & 7;
            if (i12 == 1) {
                do {
                    u1Var.a(t());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f23479c;
                    }
                } while (x() == this.f23481e);
                this.f23479c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = x();
                e(iX);
                int i13 = this.f23479c + iX;
                while (this.f23479c < i13) {
                    u1Var.a(w());
                }
                return;
            }
            int i14 = n1.f23533a;
            throw new m1();
        }
        int i15 = this.f23481e & 7;
        if (i15 == 1) {
            do {
                list.add(Long.valueOf(t()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        if (i15 == 2) {
            int iX2 = x();
            e(iX2);
            int i16 = this.f23479c + iX2;
            while (this.f23479c < i16) {
                list.add(Long.valueOf(w()));
            }
            return;
        }
        int i17 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(List list) throws m1 {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(List list) throws m1 {
        int i10;
        if ((this.f23481e & 7) == 2) {
            do {
                list.add(a());
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        int i11 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f23481e & 7;
            if (i12 == 0) {
                do {
                    c(0);
                    u1Var.a(y());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f23479c;
                    }
                } while (x() == this.f23481e);
                this.f23479c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f23479c + x();
                while (this.f23479c < iX) {
                    u1Var.a(y());
                }
                b(iX);
                return;
            }
            int i13 = n1.f23533a;
            throw new m1();
        }
        int i14 = this.f23481e & 7;
        if (i14 == 0) {
            do {
                c(0);
                list.add(Long.valueOf(y()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f23479c + x();
            while (this.f23479c < iX2) {
                list.add(Long.valueOf(y()));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int b() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list) throws m1 {
        a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list, t2 t2Var, h0 h0Var) throws m1 {
        int i10;
        int i11 = this.f23481e;
        if ((i11 & 7) == 2) {
            do {
                list.add(d(t2Var, h0Var));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == i11);
            this.f23479c = i10;
            return;
        }
        int i12 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(Class cls, h0 h0Var) throws m1 {
        c(3);
        return c(p2.f23544c.a(cls), h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(t2 t2Var, h0 h0Var) throws m1 {
        c(3);
        return c(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f23481e & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    int iX = this.f23479c + x();
                    while (this.f23479c < iX) {
                        a1Var.c(w.b(x()));
                    }
                    return;
                }
                int i13 = n1.f23533a;
                throw new m1();
            }
            do {
                c(0);
                a1Var.c(w.b(x()));
                if (u()) {
                    return;
                } else {
                    i11 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i11;
            return;
        }
        int i14 = this.f23481e & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int iX2 = this.f23479c + x();
                while (this.f23479c < iX2) {
                    list.add(Integer.valueOf(w.b(x())));
                }
                return;
            }
            int i15 = n1.f23533a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Integer.valueOf(w.b(x())));
            if (u()) {
                return;
            } else {
                i10 = this.f23479c;
            }
        } while (x() == this.f23481e);
        this.f23479c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final s a() throws n1 {
        s qVar;
        c(2);
        int iX = x();
        if (iX == 0) {
            return s.f23563b;
        }
        a(iX);
        if (this.f23477a) {
            byte[] bArr = this.f23478b;
            int i10 = this.f23479c;
            q qVar2 = s.f23563b;
            qVar = new n(bArr, i10, iX);
        } else {
            byte[] bArr2 = this.f23478b;
            int i11 = this.f23479c;
            q qVar3 = s.f23563b;
            s.a(i11, i11 + iX, bArr2.length);
            qVar = new q(s.f23564c.a(bArr2, i11, iX));
        }
        this.f23479c += iX;
        return qVar;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            int i12 = this.f23481e & 7;
            if (i12 == 2) {
                int iX = x();
                d(iX);
                int i13 = this.f23479c + iX;
                while (this.f23479c < i13) {
                    q0Var.a(Float.intBitsToFloat(v()));
                }
                return;
            }
            if (i12 == 5) {
                do {
                    q0Var.a(k());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f23479c;
                    }
                } while (x() == this.f23481e);
                this.f23479c = i11;
                return;
            }
            int i14 = n1.f23533a;
            throw new m1();
        }
        int i15 = this.f23481e & 7;
        if (i15 == 2) {
            int iX2 = x();
            d(iX2);
            int i16 = this.f23479c + iX2;
            while (this.f23479c < i16) {
                list.add(Float.valueOf(Float.intBitsToFloat(v())));
            }
            return;
        }
        if (i15 == 5) {
            do {
                list.add(Float.valueOf(k()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        int i17 = n1.f23533a;
        throw new m1();
    }

    public final void b(int i10) throws n1 {
        if (this.f23479c != i10) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f23481e & 7;
            if (i12 == 0) {
                do {
                    c(0);
                    u1Var.a(y());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f23479c;
                    }
                } while (x() == this.f23481e);
                this.f23479c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f23479c + x();
                while (this.f23479c < iX) {
                    u1Var.a(y());
                }
                b(iX);
                return;
            }
            int i13 = n1.f23533a;
            throw new m1();
        }
        int i14 = this.f23481e & 7;
        if (i14 == 0) {
            do {
                c(0);
                list.add(Long.valueOf(y()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f23479c + x();
            while (this.f23479c < iX2) {
                list.add(Long.valueOf(y()));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f23481e & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    int iX = this.f23479c + x();
                    while (this.f23479c < iX) {
                        a1Var.c(x());
                    }
                    return;
                }
                int i13 = n1.f23533a;
                throw new m1();
            }
            do {
                c(0);
                a1Var.c(x());
                if (u()) {
                    return;
                } else {
                    i11 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i11;
            return;
        }
        int i14 = this.f23481e & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int iX2 = this.f23479c + x();
                while (this.f23479c < iX2) {
                    list.add(Integer.valueOf(x()));
                }
                return;
            }
            int i15 = n1.f23533a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Integer.valueOf(x()));
            if (u()) {
                return;
            } else {
                i10 = this.f23479c;
            }
        } while (x() == this.f23481e);
        this.f23479c = i10;
    }

    public final void e(int i10) throws n1 {
        a(i10);
        if ((i10 & 7) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final void c(int i10) throws m1 {
        if ((this.f23481e & 7) == i10) {
            return;
        }
        int i11 = n1.f23533a;
        throw new m1();
    }

    public final void d(int i10) throws n1 {
        a(i10);
        if ((i10 & 3) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final void a(List list, boolean z10) throws m1 {
        int i10;
        int i11;
        if ((this.f23481e & 7) == 2) {
            if ((list instanceof q1) && !z10) {
                q1 q1Var = (q1) list;
                do {
                    q1Var.a(a());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f23479c;
                    }
                } while (x() == this.f23481e);
                this.f23479c = i11;
                return;
            }
            do {
                list.add(a(z10));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == this.f23481e);
            this.f23479c = i10;
            return;
        }
        int i12 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list, t2 t2Var, h0 h0Var) throws m1 {
        int i10;
        int i11 = this.f23481e;
        if ((i11 & 7) == 3) {
            do {
                list.add(c(t2Var, h0Var));
                if (u()) {
                    return;
                } else {
                    i10 = this.f23479c;
                }
            } while (x() == i11);
            this.f23479c = i10;
            return;
        }
        int i12 = n1.f23533a;
        throw new m1();
    }

    public final void a(int i10) throws n1 {
        if (i10 < 0 || i10 > this.f23480d - this.f23479c) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
