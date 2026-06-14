package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteBuffer f23594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f23598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23601l = Integer.MAX_VALUE;

    public v(ByteBuffer byteBuffer, boolean z10) {
        this.f23594e = byteBuffer;
        w3 w3Var = x3.f23629c;
        long j10 = w3Var.f23615a.getLong(byteBuffer, x3.f23633g);
        this.f23595f = j10;
        this.f23596g = ((long) byteBuffer.limit()) + j10;
        long jPosition = j10 + ((long) byteBuffer.position());
        this.f23597h = jPosition;
        this.f23598i = jPosition;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10) throws n1 {
        if (this.f23600k != i10) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int b() {
        return (int) (this.f23597h - this.f23598i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i10) {
        this.f23601l = i10;
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
            if (((int) (this.f23596g - this.f23597h)) >= 10) {
                while (i12 < 10) {
                    long j10 = this.f23597h;
                    this.f23597h = j10 + 1;
                    if (x3.f23629c.a(j10) < 0) {
                        i12++;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                long j11 = this.f23597h;
                if (j11 == this.f23596g) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f23597h = j11 + 1;
                if (x3.f23629c.a(j11) < 0) {
                    i12++;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            f(8);
            return true;
        }
        if (i11 == 2) {
            f(m());
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
            f(4);
            return true;
        }
        int i13 = n1.f23533a;
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[PHI: r6
  0x00cc: PHI (r6v9 long) = (r6v8 long), (r6v12 long) binds: [B:22:0x0064, B:26:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.v.m():int");
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
            long j10 = this.f23596g;
            long j11 = this.f23597h;
            if (iM <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iM];
                long j12 = iM;
                x3.f23629c.a(j11, bArr, j12);
                String str = new String(bArr, l1.f23521a);
                this.f23597h += j12;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String s() throws n1 {
        int iM = m();
        if (iM > 0) {
            long j10 = this.f23596g;
            long j11 = this.f23597h;
            if (iM <= ((int) (j10 - j11))) {
                int i10 = (int) (j11 - this.f23595f);
                ByteBuffer byteBuffer = this.f23594e;
                z3 z3Var = d4.f23458a;
                z3Var.getClass();
                String strA = byteBuffer.hasArray() ? z3Var.a(byteBuffer.array(), byteBuffer.arrayOffset() + i10, iM) : byteBuffer.isDirect() ? z3Var.b(byteBuffer, i10, iM) : z3.a(byteBuffer, i10, iM);
                this.f23597h += (long) iM;
                return strA;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int t() throws n1 {
        if (c()) {
            this.f23600k = 0;
            return 0;
        }
        int iM = m();
        this.f23600k = iM;
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
        long j10 = this.f23597h;
        if (this.f23596g - j10 < 4) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f23597h = 4 + j10;
        w3 w3Var = x3.f23629c;
        return ((w3Var.a(j10 + 3) & 255) << 24) | (w3Var.a(j10) & 255) | ((w3Var.a(1 + j10) & 255) << 8) | ((w3Var.a(2 + j10) & 255) << 16);
    }

    public final long x() throws n1 {
        long j10 = this.f23597h;
        if (this.f23596g - j10 < 8) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f23597h = 8 + j10;
        w3 w3Var = x3.f23629c;
        return ((((long) w3Var.a(j10 + 7)) & 255) << 56) | (((long) w3Var.a(j10)) & 255) | ((((long) w3Var.a(1 + j10)) & 255) << 8) | ((((long) w3Var.a(2 + j10)) & 255) << 16) | ((((long) w3Var.a(3 + j10)) & 255) << 24) | ((((long) w3Var.a(4 + j10)) & 255) << 32) | ((((long) w3Var.a(5 + j10)) & 255) << 40) | ((((long) w3Var.a(6 + j10)) & 255) << 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long y() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.v.y():long");
    }

    public final void z() {
        long j10 = this.f23596g + ((long) this.f23599j);
        this.f23596g = j10;
        int i10 = (int) (j10 - this.f23598i);
        int i11 = this.f23601l;
        if (i10 <= i11) {
            this.f23599j = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f23599j = i12;
        this.f23596g = j10 - ((long) i12);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i10) throws n1 {
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + ((int) (this.f23597h - this.f23598i));
        int i12 = this.f23601l;
        if (i11 > i12) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f23601l = i11;
        z();
        return i12;
    }

    public final void f(int i10) throws n1 {
        if (i10 >= 0) {
            long j10 = this.f23596g;
            long j11 = this.f23597h;
            if (i10 <= ((int) (j10 - j11))) {
                this.f23597h = j11 + ((long) i10);
                return;
            }
        }
        if (i10 >= 0) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.f23597h == this.f23596g;
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
            this.f23601l = iD;
            z();
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final q e() throws n1 {
        int iM = m();
        if (iM > 0) {
            long j10 = this.f23596g;
            long j11 = this.f23597h;
            if (iM <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iM];
                long j12 = iM;
                x3.f23629c.a(j11, bArr, j12);
                this.f23597h += j12;
                q qVar = s.f23563b;
                return new q(bArr);
            }
        }
        if (iM == 0) {
            return s.f23563b;
        }
        if (iM < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i10 = this.f23601l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - ((int) (this.f23597h - this.f23598i));
    }
}
