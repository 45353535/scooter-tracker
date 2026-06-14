package com.explorestack.protobuf;

import androidx.work.WorkInfo;
import com.explorestack.protobuf.MessageLite;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f19146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f19147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f19148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    m f19149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19150e;

    private static final class b extends l {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final byte[] f19151f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f19152g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f19153h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f19154i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f19155j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f19156k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f19157l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f19158m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f19159n;

        private void V() {
            int i10 = this.f19153h + this.f19154i;
            this.f19153h = i10;
            int i11 = i10 - this.f19156k;
            int i12 = this.f19159n;
            if (i11 <= i12) {
                this.f19154i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f19154i = i13;
            this.f19153h = i10 - i13;
        }

        private void Y() throws InvalidProtocolBufferException {
            if (this.f19153h - this.f19155j >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f19151f;
                int i11 = this.f19155j;
                this.f19155j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void a0() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (P() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.explorestack.protobuf.l
        public MessageLite A(p1 p1Var, w wVar) throws InvalidProtocolBufferException {
            int iC = C();
            if (this.f19146a >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f19146a++;
            MessageLite messageLite = (MessageLite) p1Var.parsePartialFrom(this, wVar);
            a(0);
            this.f19146a--;
            o(iP);
            return messageLite;
        }

        @Override // com.explorestack.protobuf.l
        public void B(MessageLite.Builder builder, w wVar) throws IOException {
            int iC = C();
            if (this.f19146a >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f19146a++;
            builder.mergeFrom(this, wVar);
            a(0);
            this.f19146a--;
            o(iP);
        }

        @Override // com.explorestack.protobuf.l
        public int C() {
            int i10;
            int i11 = this.f19155j;
            int i12 = this.f19153h;
            if (i12 != i11) {
                byte[] bArr = this.f19151f;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f19155j = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << Ascii.SO) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << Ascii.NAK);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << Ascii.FS)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f19155j = i14;
                    return i10;
                }
            }
            return (int) U();
        }

        @Override // com.explorestack.protobuf.l
        public int E() {
            return R();
        }

        @Override // com.explorestack.protobuf.l
        public long F() {
            return S();
        }

        @Override // com.explorestack.protobuf.l
        public int G() {
            return l.b(C());
        }

        @Override // com.explorestack.protobuf.l
        public long H() {
            return l.c(T());
        }

        @Override // com.explorestack.protobuf.l
        public String I() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f19153h;
                int i11 = this.f19155j;
                if (iC <= i10 - i11) {
                    String str = new String(this.f19151f, i11, iC, j0.f19127a);
                    this.f19155j += iC;
                    return str;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.explorestack.protobuf.l
        public String J() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f19153h;
                int i11 = this.f19155j;
                if (iC <= i10 - i11) {
                    String strH = x2.h(this.f19151f, i11, iC);
                    this.f19155j += iC;
                    return strH;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.explorestack.protobuf.l
        public int K() throws InvalidProtocolBufferException {
            if (f()) {
                this.f19157l = 0;
                return 0;
            }
            int iC = C();
            this.f19157l = iC;
            if (z2.a(iC) != 0) {
                return this.f19157l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.explorestack.protobuf.l
        public int L() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public long M() {
            return T();
        }

        @Override // com.explorestack.protobuf.l
        public boolean O(int i10) throws InvalidProtocolBufferException {
            int iB = z2.b(i10);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                X(8);
                return true;
            }
            if (iB == 2) {
                X(C());
                return true;
            }
            if (iB == 3) {
                W();
                a(z2.c(z2.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            X(4);
            return true;
        }

        public byte P() throws InvalidProtocolBufferException {
            int i10 = this.f19155j;
            if (i10 == this.f19153h) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f19151f;
            this.f19155j = i10 + 1;
            return bArr[i10];
        }

        public byte[] Q(int i10) throws InvalidProtocolBufferException {
            if (i10 > 0) {
                int i11 = this.f19153h;
                int i12 = this.f19155j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f19155j = i13;
                    return Arrays.copyOfRange(this.f19151f, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 == 0) {
                return j0.f19129c;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public int R() throws InvalidProtocolBufferException {
            int i10 = this.f19155j;
            if (this.f19153h - i10 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f19151f;
            this.f19155j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long S() throws InvalidProtocolBufferException {
            int i10 = this.f19155j;
            if (this.f19153h - i10 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f19151f;
            this.f19155j = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public long T() {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f19155j;
            int i11 = this.f19153h;
            if (i11 != i10) {
                byte[] bArr = this.f19151f;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f19155j = i12;
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
                                j13 = (-2080896) ^ i18;
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
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f19155j = i13;
                    return j10;
                }
            }
            return U();
        }

        long U() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bP = P();
                j10 |= ((long) (bP & Ascii.DEL)) << i10;
                if ((bP & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public void W() throws InvalidProtocolBufferException {
            int iK;
            do {
                iK = K();
                if (iK == 0) {
                    return;
                }
            } while (O(iK));
        }

        public void X(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int i11 = this.f19153h;
                int i12 = this.f19155j;
                if (i10 <= i11 - i12) {
                    this.f19155j = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.explorestack.protobuf.l
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f19157l != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.explorestack.protobuf.l
        public int d() {
            int i10 = this.f19159n;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - e();
        }

        @Override // com.explorestack.protobuf.l
        public int e() {
            return this.f19155j - this.f19156k;
        }

        @Override // com.explorestack.protobuf.l
        public boolean f() {
            return this.f19155j == this.f19153h;
        }

        @Override // com.explorestack.protobuf.l
        public void o(int i10) {
            this.f19159n = i10;
            V();
        }

        @Override // com.explorestack.protobuf.l
        public int p(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i11 = this.f19159n;
            if (iE > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f19159n = iE;
            V();
            return i11;
        }

        @Override // com.explorestack.protobuf.l
        public boolean q() {
            return T() != 0;
        }

        @Override // com.explorestack.protobuf.l
        public ByteString r() {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f19153h;
                int i11 = this.f19155j;
                if (iC <= i10 - i11) {
                    ByteString byteStringWrap = (this.f19152g && this.f19158m) ? ByteString.wrap(this.f19151f, i11, iC) : ByteString.copyFrom(this.f19151f, i11, iC);
                    this.f19155j += iC;
                    return byteStringWrap;
                }
            }
            return iC == 0 ? ByteString.EMPTY : ByteString.wrap(Q(iC));
        }

        @Override // com.explorestack.protobuf.l
        public double s() {
            return Double.longBitsToDouble(S());
        }

        @Override // com.explorestack.protobuf.l
        public int t() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public int u() {
            return R();
        }

        @Override // com.explorestack.protobuf.l
        public long v() {
            return S();
        }

        @Override // com.explorestack.protobuf.l
        public float w() {
            return Float.intBitsToFloat(R());
        }

        @Override // com.explorestack.protobuf.l
        public void x(int i10, MessageLite.Builder builder, w wVar) throws IOException {
            int i11 = this.f19146a;
            if (i11 >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f19146a = i11 + 1;
            builder.mergeFrom(this, wVar);
            a(z2.c(i10, 4));
            this.f19146a--;
        }

        @Override // com.explorestack.protobuf.l
        public int y() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public long z() {
            return T();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f19159n = Integer.MAX_VALUE;
            this.f19151f = bArr;
            this.f19153h = i11 + i10;
            this.f19155j = i10;
            this.f19156k = i10;
            this.f19152g = z10;
        }
    }

    private static final class c extends l {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Iterable f19160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Iterator f19161g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ByteBuffer f19162h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f19163i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f19164j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f19165k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f19166l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f19167m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f19168n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f19169o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f19170p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f19171q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f19172r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private long f19173s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f19174t;

        private long P() {
            return this.f19174t - this.f19171q;
        }

        private void Q() throws InvalidProtocolBufferException {
            if (!this.f19161g.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            d0();
        }

        private void S(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if (i11 < 0 || i11 > Y()) {
                if (i11 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i12 = i11;
            while (i12 > 0) {
                if (P() == 0) {
                    Q();
                }
                int iMin = Math.min(i12, (int) P());
                long j10 = iMin;
                w2.p(this.f19171q, bArr, (i11 - i12) + i10, j10);
                i12 -= iMin;
                this.f19171q += j10;
            }
        }

        private void X() {
            int i10 = this.f19165k + this.f19166l;
            this.f19165k = i10;
            int i11 = i10 - this.f19170p;
            int i12 = this.f19167m;
            if (i11 <= i12) {
                this.f19166l = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f19166l = i13;
            this.f19165k = i10 - i13;
        }

        private int Y() {
            return (int) ((((long) (this.f19165k - this.f19169o)) - this.f19171q) + this.f19172r);
        }

        private void b0() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (R() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer c0(int i10, int i11) {
            int iPosition = this.f19162h.position();
            int iLimit = this.f19162h.limit();
            try {
                try {
                    this.f19162h.position(i10);
                    this.f19162h.limit(i11);
                    return this.f19162h.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                this.f19162h.position(iPosition);
                this.f19162h.limit(iLimit);
            }
        }

        private void d0() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f19161g.next();
            this.f19162h = byteBuffer;
            this.f19169o += (int) (this.f19171q - this.f19172r);
            long jPosition = byteBuffer.position();
            this.f19171q = jPosition;
            this.f19172r = jPosition;
            this.f19174t = this.f19162h.limit();
            long jK = w2.k(this.f19162h);
            this.f19173s = jK;
            this.f19171q += jK;
            this.f19172r += jK;
            this.f19174t += jK;
        }

        @Override // com.explorestack.protobuf.l
        public MessageLite A(p1 p1Var, w wVar) throws InvalidProtocolBufferException {
            int iC = C();
            if (this.f19146a >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f19146a++;
            MessageLite messageLite = (MessageLite) p1Var.parsePartialFrom(this, wVar);
            a(0);
            this.f19146a--;
            o(iP);
            return messageLite;
        }

        @Override // com.explorestack.protobuf.l
        public void B(MessageLite.Builder builder, w wVar) throws IOException {
            int iC = C();
            if (this.f19146a >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f19146a++;
            builder.mergeFrom(this, wVar);
            a(0);
            this.f19146a--;
            o(iP);
        }

        @Override // com.explorestack.protobuf.l
        public int C() {
            int i10;
            long j10 = this.f19171q;
            if (this.f19174t != j10) {
                long j11 = j10 + 1;
                byte bW = w2.w(j10);
                if (bW >= 0) {
                    this.f19171q++;
                    return bW;
                }
                if (this.f19174t - this.f19171q >= 10) {
                    long j12 = 2 + j10;
                    int iW = (w2.w(j11) << 7) ^ bW;
                    if (iW < 0) {
                        i10 = iW ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        long j13 = 3 + j10;
                        int iW2 = (w2.w(j12) << Ascii.SO) ^ iW;
                        if (iW2 >= 0) {
                            i10 = iW2 ^ 16256;
                        } else {
                            long j14 = 4 + j10;
                            int iW3 = iW2 ^ (w2.w(j13) << Ascii.NAK);
                            if (iW3 < 0) {
                                i10 = (-2080896) ^ iW3;
                            } else {
                                j13 = 5 + j10;
                                byte bW2 = w2.w(j14);
                                int i11 = (iW3 ^ (bW2 << Ascii.FS)) ^ 266354560;
                                if (bW2 < 0) {
                                    j14 = 6 + j10;
                                    if (w2.w(j13) < 0) {
                                        j13 = 7 + j10;
                                        if (w2.w(j14) < 0) {
                                            j14 = 8 + j10;
                                            if (w2.w(j13) < 0) {
                                                j13 = 9 + j10;
                                                if (w2.w(j14) < 0) {
                                                    long j15 = j10 + 10;
                                                    if (w2.w(j13) >= 0) {
                                                        i10 = i11;
                                                        j12 = j15;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i11;
                                }
                                i10 = i11;
                            }
                            j12 = j14;
                        }
                        j12 = j13;
                    }
                    this.f19171q = j12;
                    return i10;
                }
            }
            return (int) W();
        }

        @Override // com.explorestack.protobuf.l
        public int E() {
            return T();
        }

        @Override // com.explorestack.protobuf.l
        public long F() {
            return U();
        }

        @Override // com.explorestack.protobuf.l
        public int G() {
            return l.b(C());
        }

        @Override // com.explorestack.protobuf.l
        public long H() {
            return l.c(V());
        }

        @Override // com.explorestack.protobuf.l
        public String I() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC > 0) {
                long j10 = iC;
                long j11 = this.f19174t;
                long j12 = this.f19171q;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[iC];
                    w2.p(j12, bArr, 0L, j10);
                    String str = new String(bArr, j0.f19127a);
                    this.f19171q += j10;
                    return str;
                }
            }
            if (iC > 0 && iC <= Y()) {
                byte[] bArr2 = new byte[iC];
                S(bArr2, 0, iC);
                return new String(bArr2, j0.f19127a);
            }
            if (iC == 0) {
                return "";
            }
            if (iC < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.explorestack.protobuf.l
        public String J() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC > 0) {
                long j10 = iC;
                long j11 = this.f19174t;
                long j12 = this.f19171q;
                if (j10 <= j11 - j12) {
                    String strG = x2.g(this.f19162h, (int) (j12 - this.f19172r), iC);
                    this.f19171q += j10;
                    return strG;
                }
            }
            if (iC >= 0 && iC <= Y()) {
                byte[] bArr = new byte[iC];
                S(bArr, 0, iC);
                return x2.h(bArr, 0, iC);
            }
            if (iC == 0) {
                return "";
            }
            if (iC <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.explorestack.protobuf.l
        public int K() throws InvalidProtocolBufferException {
            if (f()) {
                this.f19168n = 0;
                return 0;
            }
            int iC = C();
            this.f19168n = iC;
            if (z2.a(iC) != 0) {
                return this.f19168n;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.explorestack.protobuf.l
        public int L() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public long M() {
            return V();
        }

        @Override // com.explorestack.protobuf.l
        public boolean O(int i10) throws InvalidProtocolBufferException {
            int iB = z2.b(i10);
            if (iB == 0) {
                b0();
                return true;
            }
            if (iB == 1) {
                a0(8);
                return true;
            }
            if (iB == 2) {
                a0(C());
                return true;
            }
            if (iB == 3) {
                Z();
                a(z2.c(z2.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            a0(4);
            return true;
        }

        public byte R() throws InvalidProtocolBufferException {
            if (P() == 0) {
                Q();
            }
            long j10 = this.f19171q;
            this.f19171q = 1 + j10;
            return w2.w(j10);
        }

        public int T() {
            if (P() < 4) {
                return (R() & 255) | ((R() & 255) << 8) | ((R() & 255) << 16) | ((R() & 255) << 24);
            }
            long j10 = this.f19171q;
            this.f19171q = 4 + j10;
            return ((w2.w(j10 + 3) & 255) << 24) | (w2.w(j10) & 255) | ((w2.w(1 + j10) & 255) << 8) | ((w2.w(2 + j10) & 255) << 16);
        }

        public long U() throws InvalidProtocolBufferException {
            char c10;
            long jR;
            byte bR;
            if (P() >= 8) {
                long j10 = this.f19171q;
                this.f19171q = 8 + j10;
                c10 = '8';
                jR = (((long) w2.w(j10)) & 255) | ((((long) w2.w(1 + j10)) & 255) << 8) | ((((long) w2.w(2 + j10)) & 255) << 16) | ((((long) w2.w(3 + j10)) & 255) << 24) | ((((long) w2.w(4 + j10)) & 255) << 32) | ((((long) w2.w(5 + j10)) & 255) << 40) | ((((long) w2.w(6 + j10)) & 255) << 48);
                bR = w2.w(j10 + 7);
            } else {
                c10 = '8';
                jR = (((long) R()) & 255) | ((((long) R()) & 255) << 8) | ((((long) R()) & 255) << 16) | ((((long) R()) & 255) << 24) | ((((long) R()) & 255) << 32) | ((((long) R()) & 255) << 40) | ((((long) R()) & 255) << 48);
                bR = R();
            }
            return jR | ((((long) bR) & 255) << c10);
        }

        public long V() {
            long j10;
            long j11;
            long j12;
            long j13 = this.f19171q;
            if (this.f19174t != j13) {
                long j14 = j13 + 1;
                byte bW = w2.w(j13);
                if (bW >= 0) {
                    this.f19171q++;
                    return bW;
                }
                if (this.f19174t - this.f19171q >= 10) {
                    long j15 = 2 + j13;
                    int iW = (w2.w(j14) << 7) ^ bW;
                    if (iW < 0) {
                        j10 = iW ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        long j16 = 3 + j13;
                        int iW2 = (w2.w(j15) << Ascii.SO) ^ iW;
                        if (iW2 >= 0) {
                            j10 = iW2 ^ 16256;
                            j15 = j16;
                        } else {
                            long j17 = 4 + j13;
                            int iW3 = iW2 ^ (w2.w(j16) << Ascii.NAK);
                            if (iW3 < 0) {
                                j10 = (-2080896) ^ iW3;
                                j15 = j17;
                            } else {
                                long j18 = 5 + j13;
                                long jW = (((long) w2.w(j17)) << 28) ^ ((long) iW3);
                                if (jW >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j19 = 6 + j13;
                                    long jW2 = jW ^ (((long) w2.w(j18)) << 35);
                                    if (jW2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j18 = 7 + j13;
                                        jW = jW2 ^ (((long) w2.w(j19)) << 42);
                                        if (jW >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j19 = 8 + j13;
                                            jW2 = jW ^ (((long) w2.w(j18)) << 49);
                                            if (jW2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                j18 = 9 + j13;
                                                long jW3 = (jW2 ^ (((long) w2.w(j19)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (w2.w(j18) >= 0) {
                                                        j15 = j20;
                                                        j10 = jW3;
                                                    }
                                                } else {
                                                    j10 = jW3;
                                                    j15 = j18;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jW2;
                                    j15 = j19;
                                }
                                j10 = j12 ^ jW;
                                j15 = j18;
                            }
                        }
                    }
                    this.f19171q = j15;
                    return j10;
                }
            }
            return W();
        }

        long W() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bR = R();
                j10 |= ((long) (bR & Ascii.DEL)) << i10;
                if ((bR & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public void Z() throws InvalidProtocolBufferException {
            int iK;
            do {
                iK = K();
                if (iK == 0) {
                    return;
                }
            } while (O(iK));
        }

        @Override // com.explorestack.protobuf.l
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f19168n != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public void a0(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0 || i10 > (((long) (this.f19165k - this.f19169o)) - this.f19171q) + this.f19172r) {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i10 > 0) {
                if (P() == 0) {
                    Q();
                }
                int iMin = Math.min(i10, (int) P());
                i10 -= iMin;
                this.f19171q += (long) iMin;
            }
        }

        @Override // com.explorestack.protobuf.l
        public int d() {
            int i10 = this.f19167m;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - e();
        }

        @Override // com.explorestack.protobuf.l
        public int e() {
            return (int) ((((long) (this.f19169o - this.f19170p)) + this.f19171q) - this.f19172r);
        }

        @Override // com.explorestack.protobuf.l
        public boolean f() {
            return (((long) this.f19169o) + this.f19171q) - this.f19172r == ((long) this.f19165k);
        }

        @Override // com.explorestack.protobuf.l
        public void o(int i10) {
            this.f19167m = i10;
            X();
        }

        @Override // com.explorestack.protobuf.l
        public int p(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iE = i10 + e();
            int i11 = this.f19167m;
            if (iE > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f19167m = iE;
            X();
            return i11;
        }

        @Override // com.explorestack.protobuf.l
        public boolean q() {
            return V() != 0;
        }

        @Override // com.explorestack.protobuf.l
        public ByteString r() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC > 0) {
                long j10 = iC;
                long j11 = this.f19174t;
                long j12 = this.f19171q;
                if (j10 <= j11 - j12) {
                    if (this.f19163i && this.f19164j) {
                        int i10 = (int) (j12 - this.f19173s);
                        ByteString byteStringWrap = ByteString.wrap(c0(i10, iC + i10));
                        this.f19171q += j10;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[iC];
                    w2.p(j12, bArr, 0L, j10);
                    this.f19171q += j10;
                    return ByteString.wrap(bArr);
                }
            }
            if (iC <= 0 || iC > Y()) {
                if (iC == 0) {
                    return ByteString.EMPTY;
                }
                if (iC < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.f19163i || !this.f19164j) {
                byte[] bArr2 = new byte[iC];
                S(bArr2, 0, iC);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (iC > 0) {
                if (P() == 0) {
                    Q();
                }
                int iMin = Math.min(iC, (int) P());
                int i11 = (int) (this.f19171q - this.f19173s);
                arrayList.add(ByteString.wrap(c0(i11, i11 + iMin)));
                iC -= iMin;
                this.f19171q += (long) iMin;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // com.explorestack.protobuf.l
        public double s() {
            return Double.longBitsToDouble(U());
        }

        @Override // com.explorestack.protobuf.l
        public int t() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public int u() {
            return T();
        }

        @Override // com.explorestack.protobuf.l
        public long v() {
            return U();
        }

        @Override // com.explorestack.protobuf.l
        public float w() {
            return Float.intBitsToFloat(T());
        }

        @Override // com.explorestack.protobuf.l
        public void x(int i10, MessageLite.Builder builder, w wVar) throws IOException {
            int i11 = this.f19146a;
            if (i11 >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f19146a = i11 + 1;
            builder.mergeFrom(this, wVar);
            a(z2.c(i10, 4));
            this.f19146a--;
        }

        @Override // com.explorestack.protobuf.l
        public int y() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public long z() {
            return V();
        }

        private c(Iterable iterable, int i10, boolean z10) {
            super();
            this.f19167m = Integer.MAX_VALUE;
            this.f19165k = i10;
            this.f19160f = iterable;
            this.f19161g = iterable.iterator();
            this.f19163i = z10;
            this.f19169o = 0;
            this.f19170p = 0;
            if (i10 != 0) {
                d0();
                return;
            }
            this.f19162h = j0.f19130d;
            this.f19171q = 0L;
            this.f19172r = 0L;
            this.f19174t = 0L;
            this.f19173s = 0L;
        }
    }

    private static final class d extends l {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InputStream f19175f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f19176g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f19177h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f19178i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f19179j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f19180k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f19181l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f19182m;

        private static int P(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private static int Q(InputStream inputStream, byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private ByteString R(int i10) throws IOException {
            byte[] bArrU = U(i10);
            if (bArrU != null) {
                return ByteString.copyFrom(bArrU);
            }
            int i11 = this.f19179j;
            int i12 = this.f19177h;
            int length = i12 - i11;
            this.f19181l += i12;
            this.f19179j = 0;
            this.f19177h = 0;
            List<byte[]> listV = V(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f19176g, i11, bArr, 0, length);
            for (byte[] bArr2 : listV) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        private byte[] T(int i10, boolean z10) throws IOException {
            byte[] bArrU = U(i10);
            if (bArrU != null) {
                return z10 ? (byte[]) bArrU.clone() : bArrU;
            }
            int i11 = this.f19179j;
            int i12 = this.f19177h;
            int length = i12 - i11;
            this.f19181l += i12;
            this.f19179j = 0;
            this.f19177h = 0;
            List<byte[]> listV = V(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f19176g, i11, bArr, 0, length);
            for (byte[] bArr2 : listV) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] U(int i10) throws InvalidProtocolBufferException {
            if (i10 == 0) {
                return j0.f19129c;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = this.f19181l;
            int i12 = this.f19179j;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f19148c > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i14 = this.f19182m;
            if (i13 > i14) {
                e0((i14 - i11) - i12);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i15 = this.f19177h - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > P(this.f19175f)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f19176g, this.f19179j, bArr, 0, i15);
            this.f19181l += this.f19177h;
            this.f19179j = 0;
            this.f19177h = 0;
            while (i15 < i10) {
                int iQ = Q(this.f19175f, bArr, i15, i10 - i15);
                if (iQ == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f19181l += iQ;
                i15 += iQ;
            }
            return bArr;
        }

        private List V(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f19175f.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.f19181l += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void a0() {
            int i10 = this.f19177h + this.f19178i;
            this.f19177h = i10;
            int i11 = this.f19181l + i10;
            int i12 = this.f19182m;
            if (i11 <= i12) {
                this.f19178i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f19178i = i13;
            this.f19177h = i10 - i13;
        }

        private void b0(int i10) throws InvalidProtocolBufferException {
            if (j0(i10)) {
                return;
            }
            if (i10 <= (this.f19148c - this.f19181l) - this.f19179j) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        private static long c0(InputStream inputStream, long j10) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j10);
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private void f0(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = this.f19181l;
            int i12 = this.f19179j;
            int i13 = i11 + i12 + i10;
            int i14 = this.f19182m;
            if (i13 > i14) {
                e0((i14 - i11) - i12);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f19181l = i11 + i12;
            int i15 = this.f19177h - i12;
            this.f19177h = 0;
            this.f19179j = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jC0 = c0(this.f19175f, j10);
                    if (jC0 < 0 || jC0 > j10) {
                        throw new IllegalStateException(this.f19175f.getClass() + "#skip returned invalid result: " + jC0 + "\nThe InputStream implementation is buggy.");
                    }
                    if (jC0 == 0) {
                        break;
                    } else {
                        i15 += (int) jC0;
                    }
                } finally {
                    this.f19181l += i15;
                    a0();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f19177h;
            int i17 = i16 - this.f19179j;
            this.f19179j = i16;
            b0(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f19177h;
                if (i18 <= i19) {
                    this.f19179j = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f19179j = i19;
                    b0(1);
                }
            }
        }

        private void g0() throws InvalidProtocolBufferException {
            if (this.f19177h - this.f19179j >= 10) {
                h0();
            } else {
                i0();
            }
        }

        private void h0() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f19176g;
                int i11 = this.f19179j;
                this.f19179j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void i0() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private boolean j0(int i10) throws InvalidProtocolBufferException {
            int i11 = this.f19179j;
            int i12 = i11 + i10;
            int i13 = this.f19177h;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f19148c;
            int i15 = this.f19181l;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f19182m) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f19176g;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f19181l += i11;
                this.f19177h -= i11;
                this.f19179j = 0;
            }
            InputStream inputStream = this.f19175f;
            byte[] bArr2 = this.f19176g;
            int i16 = this.f19177h;
            int iQ = Q(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f19148c - this.f19181l) - i16));
            if (iQ == 0 || iQ < -1 || iQ > this.f19176g.length) {
                throw new IllegalStateException(this.f19175f.getClass() + "#read(byte[]) returned invalid result: " + iQ + "\nThe InputStream implementation is buggy.");
            }
            if (iQ <= 0) {
                return false;
            }
            this.f19177h += iQ;
            a0();
            if (this.f19177h >= i10) {
                return true;
            }
            return j0(i10);
        }

        @Override // com.explorestack.protobuf.l
        public MessageLite A(p1 p1Var, w wVar) throws InvalidProtocolBufferException {
            int iC = C();
            if (this.f19146a >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f19146a++;
            MessageLite messageLite = (MessageLite) p1Var.parsePartialFrom(this, wVar);
            a(0);
            this.f19146a--;
            o(iP);
            return messageLite;
        }

        @Override // com.explorestack.protobuf.l
        public void B(MessageLite.Builder builder, w wVar) throws IOException {
            int iC = C();
            if (this.f19146a >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f19146a++;
            builder.mergeFrom(this, wVar);
            a(0);
            this.f19146a--;
            o(iP);
        }

        @Override // com.explorestack.protobuf.l
        public int C() {
            int i10;
            int i11 = this.f19179j;
            int i12 = this.f19177h;
            if (i12 != i11) {
                byte[] bArr = this.f19176g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f19179j = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << Ascii.SO) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << Ascii.NAK);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << Ascii.FS)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f19179j = i14;
                    return i10;
                }
            }
            return (int) Z();
        }

        @Override // com.explorestack.protobuf.l
        public int E() {
            return W();
        }

        @Override // com.explorestack.protobuf.l
        public long F() {
            return X();
        }

        @Override // com.explorestack.protobuf.l
        public int G() {
            return l.b(C());
        }

        @Override // com.explorestack.protobuf.l
        public long H() {
            return l.c(Y());
        }

        @Override // com.explorestack.protobuf.l
        public String I() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f19177h;
                int i11 = this.f19179j;
                if (iC <= i10 - i11) {
                    String str = new String(this.f19176g, i11, iC, j0.f19127a);
                    this.f19179j += iC;
                    return str;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC > this.f19177h) {
                return new String(T(iC, false), j0.f19127a);
            }
            b0(iC);
            String str2 = new String(this.f19176g, this.f19179j, iC, j0.f19127a);
            this.f19179j += iC;
            return str2;
        }

        @Override // com.explorestack.protobuf.l
        public String J() throws IOException {
            byte[] bArrT;
            int iC = C();
            int i10 = this.f19179j;
            int i11 = this.f19177h;
            if (iC <= i11 - i10 && iC > 0) {
                bArrT = this.f19176g;
                this.f19179j = i10 + iC;
            } else {
                if (iC == 0) {
                    return "";
                }
                i10 = 0;
                if (iC <= i11) {
                    b0(iC);
                    bArrT = this.f19176g;
                    this.f19179j = iC;
                } else {
                    bArrT = T(iC, false);
                }
            }
            return x2.h(bArrT, i10, iC);
        }

        @Override // com.explorestack.protobuf.l
        public int K() throws InvalidProtocolBufferException {
            if (f()) {
                this.f19180k = 0;
                return 0;
            }
            int iC = C();
            this.f19180k = iC;
            if (z2.a(iC) != 0) {
                return this.f19180k;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.explorestack.protobuf.l
        public int L() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public long M() {
            return Y();
        }

        @Override // com.explorestack.protobuf.l
        public boolean O(int i10) throws InvalidProtocolBufferException {
            int iB = z2.b(i10);
            if (iB == 0) {
                g0();
                return true;
            }
            if (iB == 1) {
                e0(8);
                return true;
            }
            if (iB == 2) {
                e0(C());
                return true;
            }
            if (iB == 3) {
                d0();
                a(z2.c(z2.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            e0(4);
            return true;
        }

        public byte S() throws InvalidProtocolBufferException {
            if (this.f19179j == this.f19177h) {
                b0(1);
            }
            byte[] bArr = this.f19176g;
            int i10 = this.f19179j;
            this.f19179j = i10 + 1;
            return bArr[i10];
        }

        public int W() throws InvalidProtocolBufferException {
            int i10 = this.f19179j;
            if (this.f19177h - i10 < 4) {
                b0(4);
                i10 = this.f19179j;
            }
            byte[] bArr = this.f19176g;
            this.f19179j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long X() throws InvalidProtocolBufferException {
            int i10 = this.f19179j;
            if (this.f19177h - i10 < 8) {
                b0(8);
                i10 = this.f19179j;
            }
            byte[] bArr = this.f19176g;
            this.f19179j = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public long Y() {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f19179j;
            int i11 = this.f19177h;
            if (i11 != i10) {
                byte[] bArr = this.f19176g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f19179j = i12;
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
                                j13 = (-2080896) ^ i18;
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
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f19179j = i13;
                    return j10;
                }
            }
            return Z();
        }

        long Z() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bS = S();
                j10 |= ((long) (bS & Ascii.DEL)) << i10;
                if ((bS & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.explorestack.protobuf.l
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f19180k != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.explorestack.protobuf.l
        public int d() {
            int i10 = this.f19182m;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f19181l + this.f19179j);
        }

        public void d0() throws InvalidProtocolBufferException {
            int iK;
            do {
                iK = K();
                if (iK == 0) {
                    return;
                }
            } while (O(iK));
        }

        @Override // com.explorestack.protobuf.l
        public int e() {
            return this.f19181l + this.f19179j;
        }

        public void e0(int i10) throws InvalidProtocolBufferException {
            int i11 = this.f19177h;
            int i12 = this.f19179j;
            if (i10 > i11 - i12 || i10 < 0) {
                f0(i10);
            } else {
                this.f19179j = i12 + i10;
            }
        }

        @Override // com.explorestack.protobuf.l
        public boolean f() {
            return this.f19179j == this.f19177h && !j0(1);
        }

        @Override // com.explorestack.protobuf.l
        public void o(int i10) {
            this.f19182m = i10;
            a0();
        }

        @Override // com.explorestack.protobuf.l
        public int p(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = i10 + this.f19181l + this.f19179j;
            int i12 = this.f19182m;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f19182m = i11;
            a0();
            return i12;
        }

        @Override // com.explorestack.protobuf.l
        public boolean q() {
            return Y() != 0;
        }

        @Override // com.explorestack.protobuf.l
        public ByteString r() {
            int iC = C();
            int i10 = this.f19177h;
            int i11 = this.f19179j;
            if (iC > i10 - i11 || iC <= 0) {
                return iC == 0 ? ByteString.EMPTY : R(iC);
            }
            ByteString byteStringCopyFrom = ByteString.copyFrom(this.f19176g, i11, iC);
            this.f19179j += iC;
            return byteStringCopyFrom;
        }

        @Override // com.explorestack.protobuf.l
        public double s() {
            return Double.longBitsToDouble(X());
        }

        @Override // com.explorestack.protobuf.l
        public int t() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public int u() {
            return W();
        }

        @Override // com.explorestack.protobuf.l
        public long v() {
            return X();
        }

        @Override // com.explorestack.protobuf.l
        public float w() {
            return Float.intBitsToFloat(W());
        }

        @Override // com.explorestack.protobuf.l
        public void x(int i10, MessageLite.Builder builder, w wVar) throws IOException {
            int i11 = this.f19146a;
            if (i11 >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f19146a = i11 + 1;
            builder.mergeFrom(this, wVar);
            a(z2.c(i10, 4));
            this.f19146a--;
        }

        @Override // com.explorestack.protobuf.l
        public int y() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public long z() {
            return Y();
        }

        private d(InputStream inputStream, int i10) {
            super();
            this.f19182m = Integer.MAX_VALUE;
            j0.b(inputStream, "input");
            this.f19175f = inputStream;
            this.f19176g = new byte[i10];
            this.f19177h = 0;
            this.f19179j = 0;
            this.f19181l = 0;
        }
    }

    private static final class e extends l {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ByteBuffer f19183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f19184g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f19185h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f19186i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f19187j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f19188k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f19189l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f19190m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f19191n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f19192o;

        private int P(long j10) {
            return (int) (j10 - this.f19185h);
        }

        static boolean Q() {
            return w2.K();
        }

        private void W() {
            long j10 = this.f19186i + ((long) this.f19189l);
            this.f19186i = j10;
            int i10 = (int) (j10 - this.f19188k);
            int i11 = this.f19192o;
            if (i10 <= i11) {
                this.f19189l = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f19189l = i12;
            this.f19186i = j10 - ((long) i12);
        }

        private int X() {
            return (int) (this.f19186i - this.f19187j);
        }

        private void a0() throws InvalidProtocolBufferException {
            if (X() >= 10) {
                b0();
            } else {
                c0();
            }
        }

        private void b0() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f19187j;
                this.f19187j = 1 + j10;
                if (w2.w(j10) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void c0() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (R() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer d0(long j10, long j11) {
            int iPosition = this.f19183f.position();
            int iLimit = this.f19183f.limit();
            try {
                try {
                    this.f19183f.position(P(j10));
                    this.f19183f.limit(P(j11));
                    return this.f19183f.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                this.f19183f.position(iPosition);
                this.f19183f.limit(iLimit);
            }
        }

        @Override // com.explorestack.protobuf.l
        public MessageLite A(p1 p1Var, w wVar) throws InvalidProtocolBufferException {
            int iC = C();
            if (this.f19146a >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f19146a++;
            MessageLite messageLite = (MessageLite) p1Var.parsePartialFrom(this, wVar);
            a(0);
            this.f19146a--;
            o(iP);
            return messageLite;
        }

        @Override // com.explorestack.protobuf.l
        public void B(MessageLite.Builder builder, w wVar) throws IOException {
            int iC = C();
            if (this.f19146a >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f19146a++;
            builder.mergeFrom(this, wVar);
            a(0);
            this.f19146a--;
            o(iP);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.explorestack.protobuf.w2.w(r3) < 0) goto L34;
         */
        @Override // com.explorestack.protobuf.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int C() {
            /*
                r9 = this;
                long r0 = r9.f19187j
                long r2 = r9.f19186i
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.explorestack.protobuf.w2.w(r0)
                if (r4 < 0) goto L16
                r9.f19187j = r2
                return r4
            L16:
                long r5 = r9.f19186i
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.explorestack.protobuf.w2.w(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.explorestack.protobuf.w2.w(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.explorestack.protobuf.w2.w(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.explorestack.protobuf.w2.w(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.explorestack.protobuf.w2.w(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.explorestack.protobuf.w2.w(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.explorestack.protobuf.w2.w(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.explorestack.protobuf.w2.w(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.explorestack.protobuf.w2.w(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.V()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f19187j = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.l.e.C():int");
        }

        @Override // com.explorestack.protobuf.l
        public int E() {
            return S();
        }

        @Override // com.explorestack.protobuf.l
        public long F() {
            return T();
        }

        @Override // com.explorestack.protobuf.l
        public int G() {
            return l.b(C());
        }

        @Override // com.explorestack.protobuf.l
        public long H() {
            return l.c(U());
        }

        @Override // com.explorestack.protobuf.l
        public String I() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC <= 0 || iC > X()) {
                if (iC == 0) {
                    return "";
                }
                if (iC < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[iC];
            long j10 = iC;
            w2.p(this.f19187j, bArr, 0L, j10);
            String str = new String(bArr, j0.f19127a);
            this.f19187j += j10;
            return str;
        }

        @Override // com.explorestack.protobuf.l
        public String J() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC > 0 && iC <= X()) {
                String strG = x2.g(this.f19183f, P(this.f19187j), iC);
                this.f19187j += (long) iC;
                return strG;
            }
            if (iC == 0) {
                return "";
            }
            if (iC <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.explorestack.protobuf.l
        public int K() throws InvalidProtocolBufferException {
            if (f()) {
                this.f19190m = 0;
                return 0;
            }
            int iC = C();
            this.f19190m = iC;
            if (z2.a(iC) != 0) {
                return this.f19190m;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.explorestack.protobuf.l
        public int L() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public long M() {
            return U();
        }

        @Override // com.explorestack.protobuf.l
        public boolean O(int i10) throws InvalidProtocolBufferException {
            int iB = z2.b(i10);
            if (iB == 0) {
                a0();
                return true;
            }
            if (iB == 1) {
                Z(8);
                return true;
            }
            if (iB == 2) {
                Z(C());
                return true;
            }
            if (iB == 3) {
                Y();
                a(z2.c(z2.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            Z(4);
            return true;
        }

        public byte R() throws InvalidProtocolBufferException {
            long j10 = this.f19187j;
            if (j10 == this.f19186i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f19187j = 1 + j10;
            return w2.w(j10);
        }

        public int S() throws InvalidProtocolBufferException {
            long j10 = this.f19187j;
            if (this.f19186i - j10 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f19187j = 4 + j10;
            return ((w2.w(j10 + 3) & 255) << 24) | (w2.w(j10) & 255) | ((w2.w(1 + j10) & 255) << 8) | ((w2.w(2 + j10) & 255) << 16);
        }

        public long T() throws InvalidProtocolBufferException {
            long j10 = this.f19187j;
            if (this.f19186i - j10 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f19187j = 8 + j10;
            return ((((long) w2.w(j10 + 7)) & 255) << 56) | (((long) w2.w(j10)) & 255) | ((((long) w2.w(1 + j10)) & 255) << 8) | ((((long) w2.w(2 + j10)) & 255) << 16) | ((((long) w2.w(3 + j10)) & 255) << 24) | ((((long) w2.w(4 + j10)) & 255) << 32) | ((((long) w2.w(5 + j10)) & 255) << 40) | ((((long) w2.w(6 + j10)) & 255) << 48);
        }

        public long U() {
            long j10;
            long j11;
            long j12;
            int i10;
            long j13 = this.f19187j;
            if (this.f19186i != j13) {
                long j14 = 1 + j13;
                byte bW = w2.w(j13);
                if (bW >= 0) {
                    this.f19187j = j14;
                    return bW;
                }
                if (this.f19186i - j14 >= 9) {
                    long j15 = 2 + j13;
                    int iW = (w2.w(j14) << 7) ^ bW;
                    if (iW >= 0) {
                        long j16 = 3 + j13;
                        int iW2 = iW ^ (w2.w(j15) << Ascii.SO);
                        if (iW2 >= 0) {
                            j10 = iW2 ^ 16256;
                            j15 = j16;
                        } else {
                            j15 = 4 + j13;
                            int iW3 = iW2 ^ (w2.w(j16) << Ascii.NAK);
                            if (iW3 < 0) {
                                i10 = (-2080896) ^ iW3;
                            } else {
                                long j17 = 5 + j13;
                                long jW = ((long) iW3) ^ (((long) w2.w(j15)) << 28);
                                if (jW >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j18 = 6 + j13;
                                    long jW2 = jW ^ (((long) w2.w(j17)) << 35);
                                    if (jW2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j17 = 7 + j13;
                                        jW = jW2 ^ (((long) w2.w(j18)) << 42);
                                        if (jW >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j13;
                                            jW2 = jW ^ (((long) w2.w(j17)) << 49);
                                            if (jW2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                long j19 = 9 + j13;
                                                long jW3 = (jW2 ^ (((long) w2.w(j18)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (w2.w(j19) >= 0) {
                                                        j15 = j20;
                                                        j10 = jW3;
                                                    }
                                                } else {
                                                    j10 = jW3;
                                                    j15 = j19;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jW2;
                                    j15 = j18;
                                }
                                j10 = j12 ^ jW;
                                j15 = j17;
                            }
                        }
                        this.f19187j = j15;
                        return j10;
                    }
                    i10 = iW ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    j10 = i10;
                    this.f19187j = j15;
                    return j10;
                }
            }
            return V();
        }

        long V() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bR = R();
                j10 |= ((long) (bR & Ascii.DEL)) << i10;
                if ((bR & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public void Y() throws InvalidProtocolBufferException {
            int iK;
            do {
                iK = K();
                if (iK == 0) {
                    return;
                }
            } while (O(iK));
        }

        public void Z(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0 && i10 <= X()) {
                this.f19187j += (long) i10;
            } else {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        @Override // com.explorestack.protobuf.l
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f19190m != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.explorestack.protobuf.l
        public int d() {
            int i10 = this.f19192o;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - e();
        }

        @Override // com.explorestack.protobuf.l
        public int e() {
            return (int) (this.f19187j - this.f19188k);
        }

        @Override // com.explorestack.protobuf.l
        public boolean f() {
            return this.f19187j == this.f19186i;
        }

        @Override // com.explorestack.protobuf.l
        public void o(int i10) {
            this.f19192o = i10;
            W();
        }

        @Override // com.explorestack.protobuf.l
        public int p(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iE = i10 + e();
            int i11 = this.f19192o;
            if (iE > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f19192o = iE;
            W();
            return i11;
        }

        @Override // com.explorestack.protobuf.l
        public boolean q() {
            return U() != 0;
        }

        @Override // com.explorestack.protobuf.l
        public ByteString r() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC <= 0 || iC > X()) {
                if (iC == 0) {
                    return ByteString.EMPTY;
                }
                if (iC < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.f19184g && this.f19191n) {
                long j10 = this.f19187j;
                long j11 = iC;
                ByteBuffer byteBufferD0 = d0(j10, j10 + j11);
                this.f19187j += j11;
                return ByteString.wrap(byteBufferD0);
            }
            byte[] bArr = new byte[iC];
            long j12 = iC;
            w2.p(this.f19187j, bArr, 0L, j12);
            this.f19187j += j12;
            return ByteString.wrap(bArr);
        }

        @Override // com.explorestack.protobuf.l
        public double s() {
            return Double.longBitsToDouble(T());
        }

        @Override // com.explorestack.protobuf.l
        public int t() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public int u() {
            return S();
        }

        @Override // com.explorestack.protobuf.l
        public long v() {
            return T();
        }

        @Override // com.explorestack.protobuf.l
        public float w() {
            return Float.intBitsToFloat(S());
        }

        @Override // com.explorestack.protobuf.l
        public void x(int i10, MessageLite.Builder builder, w wVar) throws IOException {
            int i11 = this.f19146a;
            if (i11 >= this.f19147b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f19146a = i11 + 1;
            builder.mergeFrom(this, wVar);
            a(z2.c(i10, 4));
            this.f19146a--;
        }

        @Override // com.explorestack.protobuf.l
        public int y() {
            return C();
        }

        @Override // com.explorestack.protobuf.l
        public long z() {
            return U();
        }

        private e(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f19192o = Integer.MAX_VALUE;
            this.f19183f = byteBuffer;
            long jK = w2.k(byteBuffer);
            this.f19185h = jK;
            this.f19186i = ((long) byteBuffer.limit()) + jK;
            long jPosition = jK + ((long) byteBuffer.position());
            this.f19187j = jPosition;
            this.f19188k = jPosition;
            this.f19184g = z10;
        }
    }

    public static int D(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static l g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static l h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? l(j0.f19129c) : new d(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    static l i(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        int i10 = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new c(iterable, iRemaining, z10) : g(new k0(iterable));
    }

    public static l j(ByteBuffer byteBuffer) {
        return k(byteBuffer, false);
    }

    static l k(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return n(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && e.Q()) {
            return new e(byteBuffer, z10);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return n(bArr, 0, iRemaining, true);
    }

    public static l l(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static l m(byte[] bArr, int i10, int i11) {
        return n(bArr, i10, i11, false);
    }

    static l n(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.p(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract MessageLite A(p1 p1Var, w wVar);

    public abstract void B(MessageLite.Builder builder, w wVar);

    public abstract int C();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract String I();

    public abstract String J();

    public abstract int K();

    public abstract int L();

    public abstract long M();

    final boolean N() {
        return this.f19150e;
    }

    public abstract boolean O(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract int e();

    public abstract boolean f();

    public abstract void o(int i10);

    public abstract int p(int i10);

    public abstract boolean q();

    public abstract ByteString r();

    public abstract double s();

    public abstract int t();

    public abstract int u();

    public abstract long v();

    public abstract float w();

    public abstract void x(int i10, MessageLite.Builder builder, w wVar);

    public abstract int y();

    public abstract long z();

    private l() {
        this.f19147b = 100;
        this.f19148c = Integer.MAX_VALUE;
        this.f19150e = false;
    }
}
