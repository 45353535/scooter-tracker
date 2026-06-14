package com.fyber.inneractive.sdk.protobuf;

import androidx.work.WorkInfo;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f23579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f23580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23586l = Integer.MAX_VALUE;

    public u(InputStream inputStream) {
        Charset charset = l1.f23521a;
        if (inputStream == null) {
            throw new NullPointerException("input");
        }
        this.f23579e = inputStream;
        this.f23580f = new byte[4096];
        this.f23581g = 0;
        this.f23583i = 0;
        this.f23585k = 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10) throws n1 {
        if (this.f23584j != i10) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int b() {
        return this.f23585k + this.f23583i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i10) {
        this.f23586l = i10;
        z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean d() {
        return y() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean e(int i10) throws n1 {
        int iT;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f23581g - this.f23583i >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.f23580f;
                    int i13 = this.f23583i;
                    this.f23583i = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                if (this.f23583i == this.f23581g) {
                    i(1);
                }
                byte[] bArr2 = this.f23580f;
                int i14 = this.f23583i;
                this.f23583i = i14 + 1;
                if (bArr2[i14] < 0) {
                    i12++;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            j(8);
            return true;
        }
        if (i11 == 2) {
            j(m());
            return true;
        }
        if (i11 == 3) {
            do {
                iT = t();
                if (iT == 0) {
                    break;
                }
            } while (e(iT));
            a(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        if (i11 == 5) {
            j(4);
            return true;
        }
        int i15 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final double f() {
        return Double.longBitsToDouble(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int g() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int h() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long i() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final float j() {
        return Float.intBitsToFloat(w());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int k() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long l() {
        return y();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0 A[PHI: r3
  0x00a0: PHI (r3v13 int) = (r3v12 int), (r3v15 int) binds: [B:25:0x0053, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            r6 = this;
            int r0 = r6.f23583i
            int r1 = r6.f23581g
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r6.f23580f
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L12
            r6.f23583i = r3
            return r4
        L12:
            int r1 = r1 - r3
            r5 = 9
            if (r1 >= r5) goto L18
            goto L6d
        L18:
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            if (r3 >= 0) goto L25
            r0 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La3
        L25:
            int r4 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            r1 = r1 ^ r3
            if (r1 < 0) goto L33
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
        L30:
            r1 = r4
            goto La3
        L33:
            int r3 = r0 + 4
            r4 = r2[r4]
            int r4 = r4 << 21
            r1 = r1 ^ r4
            if (r1 >= 0) goto L42
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            r1 = r3
            goto La3
        L42:
            int r4 = r0 + 5
            r3 = r2[r3]
            int r5 = r3 << 28
            r1 = r1 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r1 = r1 ^ r5
            if (r3 >= 0) goto La1
            int r3 = r0 + 6
            r4 = r2[r4]
            if (r4 >= 0) goto La0
            int r4 = r0 + 7
            r3 = r2[r3]
            if (r3 >= 0) goto La1
            int r3 = r0 + 8
            r4 = r2[r4]
            if (r4 >= 0) goto La0
            int r4 = r0 + 9
            r3 = r2[r3]
            if (r3 >= 0) goto La1
            int r0 = r0 + 10
            r2 = r2[r4]
            if (r2 >= 0) goto L9e
        L6d:
            r0 = 0
            r2 = 0
        L70:
            r3 = 64
            if (r2 >= r3) goto L96
            int r3 = r6.f23583i
            int r4 = r6.f23581g
            if (r3 != r4) goto L7e
            r3 = 1
            r6.i(r3)
        L7e:
            byte[] r3 = r6.f23580f
            int r4 = r6.f23583i
            int r5 = r4 + 1
            r6.f23583i = r5
            r3 = r3[r4]
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r2
            long r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L93
            int r0 = (int) r0
            return r0
        L93:
            int r2 = r2 + 7
            goto L70
        L96:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            throw r0
        L9e:
            r4 = r0
            goto La1
        La0:
            r4 = r3
        La1:
            r0 = r1
            goto L30
        La3:
            r6.f23583i = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.u.m():int");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int n() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long o() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int p() {
        return w.b(m());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long q() {
        return w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String r() throws n1 {
        int iM = m();
        if (iM > 0) {
            int i10 = this.f23581g;
            int i11 = this.f23583i;
            if (iM <= i10 - i11) {
                String str = new String(this.f23580f, i11, iM, l1.f23521a);
                this.f23583i += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM > this.f23581g) {
            return new String(f(iM), l1.f23521a);
        }
        i(iM);
        String str2 = new String(this.f23580f, this.f23583i, iM, l1.f23521a);
        this.f23583i += iM;
        return str2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String s() throws IOException {
        byte[] bArrF;
        int iM = m();
        int i10 = this.f23583i;
        int i11 = this.f23581g;
        if (iM <= i11 - i10 && iM > 0) {
            bArrF = this.f23580f;
            this.f23583i = i10 + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            i10 = 0;
            if (iM <= i11) {
                i(iM);
                bArrF = this.f23580f;
                this.f23583i = iM;
            } else {
                bArrF = f(iM);
            }
        }
        return d4.f23458a.a(bArrF, i10, iM);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int t() throws n1 {
        if (c()) {
            this.f23584j = 0;
            return 0;
        }
        int iM = m();
        this.f23584j = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new n1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int u() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long v() {
        return y();
    }

    public final int w() throws n1 {
        int i10 = this.f23583i;
        if (this.f23581g - i10 < 4) {
            i(4);
            i10 = this.f23583i;
        }
        byte[] bArr = this.f23580f;
        this.f23583i = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long x() throws n1 {
        int i10 = this.f23583i;
        if (this.f23581g - i10 < 8) {
            i(8);
            i10 = this.f23583i;
        }
        byte[] bArr = this.f23580f;
        this.f23583i = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final long y() throws n1 {
        long j10;
        long j11;
        long j12;
        int i10 = this.f23583i;
        int i11 = this.f23581g;
        long j13 = 0;
        if (i11 != i10) {
            byte[] bArr = this.f23580f;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f23583i = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << Ascii.SO) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << Ascii.NAK);
                        if (i18 < 0) {
                            j10 = (-2080896) ^ i18;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (((long) bArr[i17]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (((long) bArr[i17]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j16 = j15 ^ (((long) bArr[i13]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j10 = j16 ^ j11;
                            }
                            j10 = j12 ^ j15;
                        }
                        i13 = i17;
                    }
                }
                this.f23583i = i13;
                return j10;
            }
        }
        for (int i20 = 0; i20 < 64; i20 += 7) {
            if (this.f23583i == this.f23581g) {
                i(1);
            }
            byte[] bArr2 = this.f23580f;
            int i21 = this.f23583i;
            this.f23583i = i21 + 1;
            byte b11 = bArr2[i21];
            j13 |= ((long) (b11 & Ascii.DEL)) << i20;
            if ((b11 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j13;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        int i10 = this.f23581g + this.f23582h;
        this.f23581g = i10;
        int i11 = this.f23585k + i10;
        int i12 = this.f23586l;
        if (i11 <= i12) {
            this.f23582h = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f23582h = i13;
        this.f23581g = i10 - i13;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i10) throws n1 {
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f23585k + this.f23583i + i10;
        int i12 = this.f23586l;
        if (i11 > i12) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f23586l = i11;
        z();
        return i12;
    }

    public final byte[] f(int i10) throws IOException {
        byte[] bArrG = g(i10);
        if (bArrG != null) {
            return bArrG;
        }
        int i11 = this.f23583i;
        int i12 = this.f23581g;
        int length = i12 - i11;
        this.f23585k += i12;
        this.f23583i = 0;
        this.f23581g = 0;
        ArrayList<byte[]> arrayListH = h(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f23580f, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListH) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] g(int i10) throws IOException {
        if (i10 == 0) {
            return l1.f23522b;
        }
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f23585k;
        int i12 = this.f23583i;
        int i13 = i11 + i12 + i10;
        if (i13 - this.f23604c > 0) {
            throw new n1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f23586l;
        if (i13 > i14) {
            j((i14 - i11) - i12);
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.f23581g - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096 && i16 > this.f23579e.available()) {
            return null;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f23580f, this.f23583i, bArr, 0, i15);
        this.f23585k += this.f23581g;
        this.f23583i = 0;
        this.f23581g = 0;
        while (i15 < i10) {
            int i17 = this.f23579e.read(bArr, i15, i10 - i15);
            if (i17 == -1) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f23585k += i17;
            i15 += i17;
        }
        return bArr;
    }

    public final ArrayList h(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f23579e.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f23585k += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void i(int i10) throws n1 {
        if (k(i10)) {
            return;
        }
        if (i10 <= (this.f23604c - this.f23585k) - this.f23583i) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new n1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void j(int i10) throws n1 {
        int i11 = this.f23581g;
        int i12 = this.f23583i;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f23583i = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f23585k;
        int i15 = i14 + i12;
        int i16 = i15 + i10;
        int i17 = this.f23586l;
        if (i16 > i17) {
            j((i17 - i14) - i12);
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f23585k = i15;
        this.f23581g = 0;
        this.f23583i = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                long jSkip = this.f23579e.skip(j10);
                if (jSkip < 0 || jSkip > j10) {
                    throw new IllegalStateException(this.f23579e.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i13 += (int) jSkip;
                }
            } finally {
                this.f23585k += i13;
                z();
            }
        }
        if (i13 >= i10) {
            return;
        }
        int i18 = this.f23581g;
        int i19 = i18 - this.f23583i;
        this.f23583i = i18;
        i(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f23581g;
            if (i20 <= i21) {
                this.f23583i = i20;
                return;
            } else {
                i19 += i21;
                this.f23583i = i21;
                i(1);
            }
        }
    }

    public final boolean k(int i10) throws IOException {
        int i11 = this.f23583i;
        int i12 = i11 + i10;
        int i13 = this.f23581g;
        if (i12 <= i13) {
            throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
        }
        int i14 = this.f23604c;
        int i15 = this.f23585k;
        if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f23586l) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.f23580f;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            this.f23585k += i11;
            this.f23581g -= i11;
            this.f23583i = 0;
        }
        InputStream inputStream = this.f23579e;
        byte[] bArr2 = this.f23580f;
        int i16 = this.f23581g;
        int i17 = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f23604c - this.f23585k) - i16));
        if (i17 == 0 || i17 < -1 || i17 > this.f23580f.length) {
            throw new IllegalStateException(this.f23579e.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
        }
        if (i17 <= 0) {
            return false;
        }
        this.f23581g += i17;
        z();
        if (this.f23581g >= i10) {
            return true;
        }
        return k(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.f23583i == this.f23581g && !k(1);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10, c2 c2Var, h0 h0Var) throws IOException {
        int i11 = this.f23602a;
        if (i11 < this.f23603b) {
            this.f23602a = i11 + 1;
            ((t0) c2Var).a(this, h0Var);
            a((i10 << 3) | 4);
            this.f23602a--;
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(c2 c2Var, h0 h0Var) throws IOException {
        int iM = m();
        if (this.f23602a < this.f23603b) {
            int iD = d(iM);
            this.f23602a++;
            ((t0) c2Var).a(this, h0Var);
            a(0);
            this.f23602a--;
            this.f23586l = iD;
            z();
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final q e() throws IOException {
        int iM = m();
        int i10 = this.f23581g;
        int i11 = this.f23583i;
        if (iM <= i10 - i11 && iM > 0) {
            byte[] bArr = this.f23580f;
            q qVar = s.f23563b;
            s.a(i11, i11 + iM, bArr.length);
            q qVar2 = new q(s.f23564c.a(bArr, i11, iM));
            this.f23583i += iM;
            return qVar2;
        }
        if (iM == 0) {
            return s.f23563b;
        }
        byte[] bArrG = g(iM);
        if (bArrG != null) {
            int length = bArrG.length;
            s.a(0, length, bArrG.length);
            return new q(s.f23564c.a(bArrG, 0, length));
        }
        int i12 = this.f23583i;
        int i13 = this.f23581g;
        int length2 = i13 - i12;
        this.f23585k += i13;
        this.f23583i = 0;
        this.f23581g = 0;
        ArrayList<byte[]> arrayListH = h(iM - length2);
        byte[] bArr2 = new byte[iM];
        System.arraycopy(this.f23580f, i12, bArr2, 0, length2);
        for (byte[] bArr3 : arrayListH) {
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        q qVar3 = s.f23563b;
        return new q(bArr2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i10 = this.f23586l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f23585k + this.f23583i);
    }
}
