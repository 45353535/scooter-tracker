package com.explorestack.protobuf;

import androidx.work.WorkInfo;
import com.explorestack.protobuf.x2;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f19233b = Logger.getLogger(n.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f19234c = w2.J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19235a;

    private static abstract class b extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final byte[] f19236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f19237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f19238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f19239g;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f19236d = bArr;
            this.f19237e = bArr.length;
        }

        final void a1(byte b10) {
            byte[] bArr = this.f19236d;
            int i10 = this.f19238f;
            this.f19238f = i10 + 1;
            bArr[i10] = b10;
            this.f19239g++;
        }

        final void b1(int i10) {
            byte[] bArr = this.f19236d;
            int i11 = this.f19238f;
            int i12 = i11 + 1;
            this.f19238f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f19238f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f19238f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f19238f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f19239g += 4;
        }

        final void c1(long j10) {
            byte[] bArr = this.f19236d;
            int i10 = this.f19238f;
            int i11 = i10 + 1;
            this.f19238f = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f19238f = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f19238f = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f19238f = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f19238f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f19238f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f19238f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f19238f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f19239g += 8;
        }

        final void d1(int i10) {
            if (i10 >= 0) {
                f1(i10);
            } else {
                g1(i10);
            }
        }

        final void e1(int i10, int i11) {
            f1(z2.c(i10, i11));
        }

        final void f1(int i10) {
            if (!n.f19234c) {
                while ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    byte[] bArr = this.f19236d;
                    int i11 = this.f19238f;
                    this.f19238f = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f19239g++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f19236d;
                int i12 = this.f19238f;
                this.f19238f = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f19239g++;
                return;
            }
            long j10 = this.f19238f;
            while ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                byte[] bArr3 = this.f19236d;
                int i13 = this.f19238f;
                this.f19238f = i13 + 1;
                w2.Q(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f19236d;
            int i14 = this.f19238f;
            this.f19238f = i14 + 1;
            w2.Q(bArr4, i14, (byte) i10);
            this.f19239g += (int) (((long) this.f19238f) - j10);
        }

        final void g1(long j10) {
            if (!n.f19234c) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f19236d;
                    int i10 = this.f19238f;
                    this.f19238f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f19239g++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f19236d;
                int i11 = this.f19238f;
                this.f19238f = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f19239g++;
                return;
            }
            long j11 = this.f19238f;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f19236d;
                int i12 = this.f19238f;
                this.f19238f = i12 + 1;
                w2.Q(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f19236d;
            int i13 = this.f19238f;
            this.f19238f = i13 + 1;
            w2.Q(bArr4, i13, (byte) j10);
            this.f19239g += (int) (((long) this.f19238f) - j11);
        }

        @Override // com.explorestack.protobuf.n
        public final int l0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f19240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f19241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f19242f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19243g;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f19240d = bArr;
            this.f19241e = i10;
            this.f19243g = i10;
            this.f19242f = i12;
        }

        @Override // com.explorestack.protobuf.n
        public final void A0(long j10) throws d {
            try {
                byte[] bArr = this.f19240d;
                int i10 = this.f19243g;
                int i11 = i10 + 1;
                this.f19243g = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f19243g = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f19243g = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f19243g = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f19243g = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f19243g = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f19243g = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f19243g = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19243g), Integer.valueOf(this.f19242f), 1), e10);
            }
        }

        @Override // com.explorestack.protobuf.n
        public final void F0(int i10, int i11) throws d {
            V0(i10, 0);
            G0(i11);
        }

        @Override // com.explorestack.protobuf.n
        public final void G0(int i10) throws d {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        @Override // com.explorestack.protobuf.n
        public final void J0(int i10, MessageLite messageLite) throws IOException {
            V0(i10, 2);
            K0(messageLite);
        }

        @Override // com.explorestack.protobuf.n
        public final void K0(MessageLite messageLite) throws IOException {
            X0(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.explorestack.protobuf.n
        public final void L0(int i10, MessageLite messageLite) throws IOException {
            V0(1, 3);
            W0(2, i10);
            J0(3, messageLite);
            V0(1, 4);
        }

        @Override // com.explorestack.protobuf.n
        public final void M0(int i10, ByteString byteString) throws IOException {
            V0(1, 3);
            W0(2, i10);
            r0(3, byteString);
            V0(1, 4);
        }

        @Override // com.explorestack.protobuf.n
        public final void T0(int i10, String str) throws d {
            V0(i10, 2);
            U0(str);
        }

        @Override // com.explorestack.protobuf.n
        public final void U0(String str) throws d {
            int i10 = this.f19243g;
            try {
                int iZ = n.Z(str.length() * 3);
                int iZ2 = n.Z(str.length());
                if (iZ2 != iZ) {
                    X0(x2.j(str));
                    this.f19243g = x2.i(str, this.f19240d, this.f19243g, l0());
                    return;
                }
                int i11 = i10 + iZ2;
                this.f19243g = i11;
                int i12 = x2.i(str, this.f19240d, i11, l0());
                this.f19243g = i10;
                X0((i12 - i10) - iZ2);
                this.f19243g = i12;
            } catch (x2.d e10) {
                this.f19243g = i10;
                f0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // com.explorestack.protobuf.n
        public final void V0(int i10, int i11) throws d {
            X0(z2.c(i10, i11));
        }

        @Override // com.explorestack.protobuf.n
        public final void W0(int i10, int i11) throws d {
            V0(i10, 0);
            X0(i11);
        }

        @Override // com.explorestack.protobuf.n
        public final void X0(int i10) throws d {
            if (!n.f19234c || com.explorestack.protobuf.d.c() || l0() < 5) {
                while ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    try {
                        byte[] bArr = this.f19240d;
                        int i11 = this.f19243g;
                        this.f19243g = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19243g), Integer.valueOf(this.f19242f), 1), e10);
                    }
                }
                byte[] bArr2 = this.f19240d;
                int i12 = this.f19243g;
                this.f19243g = i12 + 1;
                bArr2[i12] = (byte) i10;
                return;
            }
            if ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr3 = this.f19240d;
                int i13 = this.f19243g;
                this.f19243g = 1 + i13;
                w2.Q(bArr3, i13, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f19240d;
            int i14 = this.f19243g;
            this.f19243g = i14 + 1;
            w2.Q(bArr4, i14, (byte) (i10 | 128));
            int i15 = i10 >>> 7;
            if ((i15 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr5 = this.f19240d;
                int i16 = this.f19243g;
                this.f19243g = 1 + i16;
                w2.Q(bArr5, i16, (byte) i15);
                return;
            }
            byte[] bArr6 = this.f19240d;
            int i17 = this.f19243g;
            this.f19243g = i17 + 1;
            w2.Q(bArr6, i17, (byte) (i15 | 128));
            int i18 = i10 >>> 14;
            if ((i18 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr7 = this.f19240d;
                int i19 = this.f19243g;
                this.f19243g = 1 + i19;
                w2.Q(bArr7, i19, (byte) i18);
                return;
            }
            byte[] bArr8 = this.f19240d;
            int i20 = this.f19243g;
            this.f19243g = i20 + 1;
            w2.Q(bArr8, i20, (byte) (i18 | 128));
            int i21 = i10 >>> 21;
            if ((i21 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr9 = this.f19240d;
                int i22 = this.f19243g;
                this.f19243g = 1 + i22;
                w2.Q(bArr9, i22, (byte) i21);
                return;
            }
            byte[] bArr10 = this.f19240d;
            int i23 = this.f19243g;
            this.f19243g = i23 + 1;
            w2.Q(bArr10, i23, (byte) (i21 | 128));
            byte[] bArr11 = this.f19240d;
            int i24 = this.f19243g;
            this.f19243g = 1 + i24;
            w2.Q(bArr11, i24, (byte) (i10 >>> 28));
        }

        @Override // com.explorestack.protobuf.n
        public final void Y0(int i10, long j10) throws d {
            V0(i10, 0);
            Z0(j10);
        }

        @Override // com.explorestack.protobuf.n
        public final void Z0(long j10) throws d {
            if (n.f19234c && l0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f19240d;
                    int i10 = this.f19243g;
                    this.f19243g = i10 + 1;
                    w2.Q(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f19240d;
                int i11 = this.f19243g;
                this.f19243g = 1 + i11;
                w2.Q(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f19240d;
                    int i12 = this.f19243g;
                    this.f19243g = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19243g), Integer.valueOf(this.f19242f), 1), e10);
                }
            }
            byte[] bArr4 = this.f19240d;
            int i13 = this.f19243g;
            this.f19243g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.explorestack.protobuf.j
        public final void a(ByteBuffer byteBuffer) throws d {
            a1(byteBuffer);
        }

        public final void a1(ByteBuffer byteBuffer) throws d {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f19240d, this.f19243g, iRemaining);
                this.f19243g += iRemaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19243g), Integer.valueOf(this.f19242f), Integer.valueOf(iRemaining)), e10);
            }
        }

        @Override // com.explorestack.protobuf.n, com.explorestack.protobuf.j
        public final void b(byte[] bArr, int i10, int i11) throws d {
            b1(bArr, i10, i11);
        }

        public final void b1(byte[] bArr, int i10, int i11) throws d {
            try {
                System.arraycopy(bArr, i10, this.f19240d, this.f19243g, i11);
                this.f19243g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19243g), Integer.valueOf(this.f19242f), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.explorestack.protobuf.n
        public void e0() {
        }

        @Override // com.explorestack.protobuf.n
        public final int l0() {
            return this.f19242f - this.f19243g;
        }

        @Override // com.explorestack.protobuf.n
        public final void m0(byte b10) throws d {
            try {
                byte[] bArr = this.f19240d;
                int i10 = this.f19243g;
                this.f19243g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19243g), Integer.valueOf(this.f19242f), 1), e10);
            }
        }

        @Override // com.explorestack.protobuf.n
        public final void n0(int i10, boolean z10) throws d {
            V0(i10, 0);
            m0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.explorestack.protobuf.n
        public final void q0(byte[] bArr, int i10, int i11) throws d {
            X0(i11);
            b1(bArr, i10, i11);
        }

        @Override // com.explorestack.protobuf.n
        public final void r0(int i10, ByteString byteString) throws IOException {
            V0(i10, 2);
            s0(byteString);
        }

        @Override // com.explorestack.protobuf.n
        public final void s0(ByteString byteString) throws IOException {
            X0(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.explorestack.protobuf.n
        public final void x0(int i10, int i11) throws d {
            V0(i10, 5);
            y0(i11);
        }

        @Override // com.explorestack.protobuf.n
        public final void y0(int i10) throws d {
            try {
                byte[] bArr = this.f19240d;
                int i11 = this.f19243g;
                int i12 = i11 + 1;
                this.f19243g = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f19243g = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f19243g = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f19243g = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19243g), Integer.valueOf(this.f19242f), 1), e10);
            }
        }

        @Override // com.explorestack.protobuf.n
        public final void z0(int i10, long j10) throws d {
            V0(i10, 1);
            A0(j10);
        }
    }

    public static class d extends IOException {
        d(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        d(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    private static final class e extends b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final OutputStream f19244h;

        e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f19244h = outputStream;
        }

        private void h1() throws IOException {
            this.f19244h.write(this.f19236d, 0, this.f19238f);
            this.f19238f = 0;
        }

        private void i1(int i10) throws IOException {
            if (this.f19237e - this.f19238f < i10) {
                h1();
            }
        }

        @Override // com.explorestack.protobuf.n
        public void A0(long j10) throws IOException {
            i1(8);
            c1(j10);
        }

        @Override // com.explorestack.protobuf.n
        public void F0(int i10, int i11) throws IOException {
            i1(20);
            e1(i10, 0);
            d1(i11);
        }

        @Override // com.explorestack.protobuf.n
        public void G0(int i10) throws IOException {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        @Override // com.explorestack.protobuf.n
        public void J0(int i10, MessageLite messageLite) throws IOException {
            V0(i10, 2);
            K0(messageLite);
        }

        @Override // com.explorestack.protobuf.n
        public void K0(MessageLite messageLite) throws IOException {
            X0(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.explorestack.protobuf.n
        public void L0(int i10, MessageLite messageLite) throws IOException {
            V0(1, 3);
            W0(2, i10);
            J0(3, messageLite);
            V0(1, 4);
        }

        @Override // com.explorestack.protobuf.n
        public void M0(int i10, ByteString byteString) throws IOException {
            V0(1, 3);
            W0(2, i10);
            r0(3, byteString);
            V0(1, 4);
        }

        @Override // com.explorestack.protobuf.n
        public void T0(int i10, String str) throws IOException {
            V0(i10, 2);
            U0(str);
        }

        @Override // com.explorestack.protobuf.n
        public void U0(String str) throws IOException {
            int iJ;
            try {
                int length = str.length() * 3;
                int iZ = n.Z(length);
                int i10 = iZ + length;
                int i11 = this.f19237e;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int i12 = x2.i(str, bArr, 0, length);
                    X0(i12);
                    b(bArr, 0, i12);
                    return;
                }
                if (i10 > i11 - this.f19238f) {
                    h1();
                }
                int iZ2 = n.Z(str.length());
                int i13 = this.f19238f;
                try {
                    if (iZ2 == iZ) {
                        int i14 = i13 + iZ2;
                        this.f19238f = i14;
                        int i15 = x2.i(str, this.f19236d, i14, this.f19237e - i14);
                        this.f19238f = i13;
                        iJ = (i15 - i13) - iZ2;
                        f1(iJ);
                        this.f19238f = i15;
                    } else {
                        iJ = x2.j(str);
                        f1(iJ);
                        this.f19238f = x2.i(str, this.f19236d, this.f19238f, iJ);
                    }
                    this.f19239g += iJ;
                } catch (x2.d e10) {
                    this.f19239g -= this.f19238f - i13;
                    this.f19238f = i13;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (x2.d e12) {
                f0(str, e12);
            }
        }

        @Override // com.explorestack.protobuf.n
        public void V0(int i10, int i11) throws IOException {
            X0(z2.c(i10, i11));
        }

        @Override // com.explorestack.protobuf.n
        public void W0(int i10, int i11) throws IOException {
            i1(20);
            e1(i10, 0);
            f1(i11);
        }

        @Override // com.explorestack.protobuf.n
        public void X0(int i10) throws IOException {
            i1(5);
            f1(i10);
        }

        @Override // com.explorestack.protobuf.n
        public void Y0(int i10, long j10) throws IOException {
            i1(20);
            e1(i10, 0);
            g1(j10);
        }

        @Override // com.explorestack.protobuf.n
        public void Z0(long j10) throws IOException {
            i1(10);
            g1(j10);
        }

        @Override // com.explorestack.protobuf.j
        public void a(ByteBuffer byteBuffer) throws IOException {
            j1(byteBuffer);
        }

        @Override // com.explorestack.protobuf.n, com.explorestack.protobuf.j
        public void b(byte[] bArr, int i10, int i11) throws IOException {
            k1(bArr, i10, i11);
        }

        @Override // com.explorestack.protobuf.n
        public void e0() throws IOException {
            if (this.f19238f > 0) {
                h1();
            }
        }

        public void j1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.f19237e;
            int i11 = this.f19238f;
            if (i10 - i11 >= iRemaining) {
                byteBuffer.get(this.f19236d, i11, iRemaining);
                this.f19238f += iRemaining;
                this.f19239g += iRemaining;
                return;
            }
            int i12 = i10 - i11;
            byteBuffer.get(this.f19236d, i11, i12);
            int i13 = iRemaining - i12;
            this.f19238f = this.f19237e;
            this.f19239g += i12;
            h1();
            while (true) {
                int i14 = this.f19237e;
                if (i13 <= i14) {
                    byteBuffer.get(this.f19236d, 0, i13);
                    this.f19238f = i13;
                    this.f19239g += i13;
                    return;
                } else {
                    byteBuffer.get(this.f19236d, 0, i14);
                    this.f19244h.write(this.f19236d, 0, this.f19237e);
                    int i15 = this.f19237e;
                    i13 -= i15;
                    this.f19239g += i15;
                }
            }
        }

        public void k1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f19237e;
            int i13 = this.f19238f;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f19236d, i13, i11);
                this.f19238f += i11;
                this.f19239g += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f19236d, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f19238f = this.f19237e;
            this.f19239g += i14;
            h1();
            if (i16 <= this.f19237e) {
                System.arraycopy(bArr, i15, this.f19236d, 0, i16);
                this.f19238f = i16;
            } else {
                this.f19244h.write(bArr, i15, i16);
            }
            this.f19239g += i16;
        }

        @Override // com.explorestack.protobuf.n
        public void m0(byte b10) throws IOException {
            if (this.f19238f == this.f19237e) {
                h1();
            }
            a1(b10);
        }

        @Override // com.explorestack.protobuf.n
        public void n0(int i10, boolean z10) throws IOException {
            i1(11);
            e1(i10, 0);
            a1(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.explorestack.protobuf.n
        public void q0(byte[] bArr, int i10, int i11) throws IOException {
            X0(i11);
            k1(bArr, i10, i11);
        }

        @Override // com.explorestack.protobuf.n
        public void r0(int i10, ByteString byteString) throws IOException {
            V0(i10, 2);
            s0(byteString);
        }

        @Override // com.explorestack.protobuf.n
        public void s0(ByteString byteString) throws IOException {
            X0(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.explorestack.protobuf.n
        public void x0(int i10, int i11) throws IOException {
            i1(14);
            e1(i10, 5);
            b1(i11);
        }

        @Override // com.explorestack.protobuf.n
        public void y0(int i10) throws IOException {
            i1(4);
            b1(i10);
        }

        @Override // com.explorestack.protobuf.n
        public void z0(int i10, long j10) throws IOException {
            i1(18);
            e1(i10, 1);
            c1(j10);
        }
    }

    public static int A(long j10) {
        return b0(j10);
    }

    public static int B(int i10, n0 n0Var) {
        return (X(1) * 2) + Y(2, i10) + C(3, n0Var);
    }

    public static int C(int i10, n0 n0Var) {
        return X(i10) + D(n0Var);
    }

    public static int D(n0 n0Var) {
        return E(n0Var.a());
    }

    static int E(int i10) {
        return Z(i10) + i10;
    }

    public static int F(int i10, MessageLite messageLite) {
        return (X(1) * 2) + Y(2, i10) + G(3, messageLite);
    }

    public static int G(int i10, MessageLite messageLite) {
        return X(i10) + I(messageLite);
    }

    static int H(int i10, MessageLite messageLite, x1 x1Var) {
        return X(i10) + J(messageLite, x1Var);
    }

    public static int I(MessageLite messageLite) {
        return E(messageLite.getSerializedSize());
    }

    static int J(MessageLite messageLite, x1 x1Var) {
        return E(((com.explorestack.protobuf.a) messageLite).getSerializedSize(x1Var));
    }

    static int K(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int L(int i10, ByteString byteString) {
        return (X(1) * 2) + Y(2, i10) + h(3, byteString);
    }

    public static int M(int i10) {
        return Z(i10);
    }

    public static int N(int i10, int i11) {
        return X(i10) + O(i11);
    }

    public static int O(int i10) {
        return 4;
    }

    public static int P(int i10, long j10) {
        return X(i10) + Q(j10);
    }

    public static int Q(long j10) {
        return 8;
    }

    public static int R(int i10, int i11) {
        return X(i10) + S(i11);
    }

    public static int S(int i10) {
        return Z(c0(i10));
    }

    public static int T(int i10, long j10) {
        return X(i10) + U(j10);
    }

    public static int U(long j10) {
        return b0(d0(j10));
    }

    public static int V(int i10, String str) {
        return X(i10) + W(str);
    }

    public static int W(String str) {
        int length;
        try {
            length = x2.j(str);
        } catch (x2.d unused) {
            length = str.getBytes(j0.f19127a).length;
        }
        return E(length);
    }

    public static int X(int i10) {
        return Z(z2.c(i10, 0));
    }

    public static int Y(int i10, int i11) {
        return X(i10) + Z(i11);
    }

    public static int Z(int i10) {
        if ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int a0(int i10, long j10) {
        return X(i10) + b0(j10);
    }

    public static int b0(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int c0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long d0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int e(int i10, boolean z10) {
        return X(i10) + f(z10);
    }

    public static int f(boolean z10) {
        return 1;
    }

    public static int g(byte[] bArr) {
        return E(bArr.length);
    }

    public static int h(int i10, ByteString byteString) {
        return X(i10) + i(byteString);
    }

    public static n h0(OutputStream outputStream) {
        return i0(outputStream, 4096);
    }

    public static int i(ByteString byteString) {
        return E(byteString.size());
    }

    public static n i0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int j(int i10, double d10) {
        return X(i10) + k(d10);
    }

    public static n j0(byte[] bArr) {
        return k0(bArr, 0, bArr.length);
    }

    public static int k(double d10) {
        return 8;
    }

    public static n k0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int l(int i10, int i11) {
        return X(i10) + m(i11);
    }

    public static int m(int i10) {
        return y(i10);
    }

    public static int n(int i10, int i11) {
        return X(i10) + o(i11);
    }

    public static int o(int i10) {
        return 4;
    }

    public static int p(int i10, long j10) {
        return X(i10) + q(j10);
    }

    public static int q(long j10) {
        return 8;
    }

    public static int r(int i10, float f10) {
        return X(i10) + s(f10);
    }

    public static int s(float f10) {
        return 4;
    }

    public static int t(int i10, MessageLite messageLite) {
        return (X(i10) * 2) + v(messageLite);
    }

    static int u(int i10, MessageLite messageLite, x1 x1Var) {
        return (X(i10) * 2) + w(messageLite, x1Var);
    }

    public static int v(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    static int w(MessageLite messageLite, x1 x1Var) {
        return ((com.explorestack.protobuf.a) messageLite).getSerializedSize(x1Var);
    }

    public static int x(int i10, int i11) {
        return X(i10) + y(i11);
    }

    public static int y(int i10) {
        if (i10 >= 0) {
            return Z(i10);
        }
        return 10;
    }

    public static int z(int i10, long j10) {
        return X(i10) + A(j10);
    }

    public abstract void A0(long j10);

    public final void B0(int i10, float f10) {
        x0(i10, Float.floatToRawIntBits(f10));
    }

    public final void C0(float f10) {
        y0(Float.floatToRawIntBits(f10));
    }

    public final void D0(int i10, MessageLite messageLite) {
        V0(i10, 3);
        E0(messageLite);
        V0(i10, 4);
    }

    public final void E0(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public abstract void F0(int i10, int i11);

    public abstract void G0(int i10);

    public final void H0(int i10, long j10) {
        Y0(i10, j10);
    }

    public final void I0(long j10) {
        Z0(j10);
    }

    public abstract void J0(int i10, MessageLite messageLite);

    public abstract void K0(MessageLite messageLite);

    public abstract void L0(int i10, MessageLite messageLite);

    public abstract void M0(int i10, ByteString byteString);

    public final void N0(int i10) {
        X0(i10);
    }

    public final void O0(int i10) {
        y0(i10);
    }

    public final void P0(long j10) {
        A0(j10);
    }

    public final void Q0(int i10, int i11) {
        W0(i10, c0(i11));
    }

    public final void R0(int i10) {
        X0(c0(i10));
    }

    public final void S0(long j10) {
        Z0(d0(j10));
    }

    public abstract void T0(int i10, String str);

    public abstract void U0(String str);

    public abstract void V0(int i10, int i11);

    public abstract void W0(int i10, int i11);

    public abstract void X0(int i10);

    public abstract void Y0(int i10, long j10);

    public abstract void Z0(long j10);

    @Override // com.explorestack.protobuf.j
    public abstract void b(byte[] bArr, int i10, int i11);

    public final void d() {
        if (l0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void e0();

    final void f0(String str, x2.d dVar) throws d {
        f19233b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(j0.f19127a);
        try {
            X0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (d e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new d(e11);
        }
    }

    boolean g0() {
        return this.f19235a;
    }

    public abstract int l0();

    public abstract void m0(byte b10);

    public abstract void n0(int i10, boolean z10);

    public final void o0(boolean z10) {
        m0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void p0(byte[] bArr) {
        q0(bArr, 0, bArr.length);
    }

    abstract void q0(byte[] bArr, int i10, int i11);

    public abstract void r0(int i10, ByteString byteString);

    public abstract void s0(ByteString byteString);

    public final void t0(int i10, double d10) {
        z0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void u0(double d10) {
        A0(Double.doubleToRawLongBits(d10));
    }

    public final void v0(int i10, int i11) {
        F0(i10, i11);
    }

    public final void w0(int i10) {
        G0(i10);
    }

    public abstract void x0(int i10, int i11);

    public abstract void y0(int i10);

    public abstract void z0(int i10, long j10);

    private n() {
    }
}
