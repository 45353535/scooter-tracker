package oa;

import com.amazon.device.ads.DtbConstants;
import com.google.android.material.internal.ViewUtils;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f96625a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f96626b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f96627c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f96628d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f96629e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f96630f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f96631g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f96632h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f96633i = {5, 8, 10, 12};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f96635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f96636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f96637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f96638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f96639f;

        private b(String str, int i10, int i11, int i12, long j10, int i13) {
            this.f96634a = str;
            this.f96636c = i10;
            this.f96635b = i11;
            this.f96637d = i12;
            this.f96638e = j10;
            this.f96639f = i13;
        }
    }

    private static void a(byte[] bArr, int i10) throws n9.x {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & 255) | ((bArr[i11] << 8) & 65535)) != q9.o0.v(bArr, 0, i11, 65535)) {
            throw n9.x.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.p.b(byte[]):int");
    }

    public static int c(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    private static q9.c0 d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new q9.c0(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        q9.c0 c0Var = new q9.c0(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            q9.c0 c0Var2 = new q9.c0(bArrCopyOf);
            while (c0Var2.b() >= 16) {
                c0Var2.r(2);
                c0Var.f(c0Var2.h(14), 14);
            }
        }
        c0Var.n(bArrCopyOf);
        return c0Var;
    }

    private static boolean e(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static io.bidmachine.media3.common.a h(byte[] bArr, String str, String str2, int i10, String str3, DrmInitData drmInitData) {
        q9.c0 c0VarD = d(bArr);
        c0VarD.r(60);
        int i11 = f96625a[c0VarD.h(6)];
        int i12 = f96626b[c0VarD.h(4)];
        int iH = c0VarD.h(5);
        int[] iArr = f96627c;
        int i13 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        c0VarD.r(10);
        return new a.b().f0(str).U(str3).u0("audio/vnd.dts").Q(i13).R(i11 + (c0VarD.h(2) > 0 ? 1 : 0)).v0(i12).Y(drmInitData).j0(str2).s0(i10).N();
    }

    public static b i(byte[] bArr) throws n9.x {
        int i10;
        int i11;
        int iH;
        int i12;
        long jC1;
        int i13;
        q9.c0 c0VarD = d(bArr);
        c0VarD.r(40);
        int iH2 = c0VarD.h(2);
        if (c0VarD.g()) {
            i10 = 20;
            i11 = 12;
        } else {
            i10 = 16;
            i11 = 8;
        }
        c0VarD.r(i11);
        int iH3 = c0VarD.h(i10) + 1;
        boolean zG = c0VarD.g();
        int iH4 = -1;
        int i14 = 0;
        if (zG) {
            iH = c0VarD.h(2);
            int iH5 = (c0VarD.h(3) + 1) * 512;
            if (c0VarD.g()) {
                c0VarD.r(36);
            }
            int iH6 = c0VarD.h(3) + 1;
            int iH7 = c0VarD.h(3) + 1;
            if (iH6 != 1 || iH7 != 1) {
                throw n9.x.d("Multiple audio presentations or assets not supported");
            }
            int i15 = iH2 + 1;
            int iH8 = c0VarD.h(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                if (((iH8 >> i16) & 1) == 1) {
                    c0VarD.r(8);
                }
            }
            if (c0VarD.g()) {
                c0VarD.r(2);
                int iH9 = (c0VarD.h(2) + 1) << 2;
                int iH10 = c0VarD.h(2) + 1;
                while (i14 < iH10) {
                    c0VarD.r(iH9);
                    i14++;
                }
            }
            i14 = iH5;
        } else {
            iH = -1;
        }
        c0VarD.r(i10);
        c0VarD.r(12);
        if (zG) {
            if (c0VarD.g()) {
                c0VarD.r(4);
            }
            if (c0VarD.g()) {
                c0VarD.r(24);
            }
            if (c0VarD.g()) {
                c0VarD.s(c0VarD.h(10) + 1);
            }
            c0VarD.r(5);
            i12 = f96628d[c0VarD.h(4)];
            iH4 = c0VarD.h(8) + 1;
        } else {
            i12 = -2147483647;
        }
        int i17 = i12;
        if (zG) {
            if (iH == 0) {
                i13 = 32000;
            } else if (iH == 1) {
                i13 = 44100;
            } else {
                if (iH != 2) {
                    throw n9.x.a("Unsupported reference clock code in DTS HD header: " + iH, null);
                }
                i13 = 48000;
            }
            jC1 = q9.o0.c1(i14, 1000000L, i13);
        } else {
            jC1 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", iH4, i17, iH3, jC1, 0);
    }

    public static int j(byte[] bArr) {
        q9.c0 c0VarD = d(bArr);
        c0VarD.r(42);
        return c0VarD.h(c0VarD.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) throws n9.x {
        int iH;
        long jC1;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        q9.c0 c0VarD = d(bArr);
        int i12 = c0VarD.h(32) == 1078008818 ? 1 : 0;
        int iM = m(c0VarD, f96629e, true) + 1;
        if (i12 == 0) {
            iH = -2147483647;
            jC1 = -9223372036854775807L;
        } else {
            if (!c0VarD.g()) {
                throw n9.x.d("Only supports full channel mask-based audio presentation");
            }
            a(bArr, iM);
            int iH2 = c0VarD.h(2);
            if (iH2 == 0) {
                i10 = 512;
            } else if (iH2 == 1) {
                i10 = DtbConstants.DEFAULT_PLAYER_HEIGHT;
            } else {
                if (iH2 != 2) {
                    throw n9.x.a("Unsupported base duration index in DTS UHD header: " + iH2, null);
                }
                i10 = 384;
            }
            int iH3 = i10 * (c0VarD.h(3) + 1);
            int iH4 = c0VarD.h(2);
            if (iH4 == 0) {
                i11 = 32000;
            } else if (iH4 == 1) {
                i11 = 44100;
            } else {
                if (iH4 != 2) {
                    throw n9.x.a("Unsupported clock rate index in DTS UHD header: " + iH4, null);
                }
                i11 = 48000;
            }
            if (c0VarD.g()) {
                c0VarD.r(36);
            }
            iH = (1 << c0VarD.h(2)) * i11;
            jC1 = q9.o0.c1(iH3, 1000000L, i11);
        }
        int i13 = iH;
        long j10 = jC1;
        int iM2 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            iM2 += m(c0VarD, f96630f, true);
        }
        if (i12 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(m(c0VarD, f96631g, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i13, iM + iM2 + (atomicInteger2.get() != 0 ? m(c0VarD, f96632h, true) : 0), j10, 0);
    }

    public static int l(byte[] bArr) {
        q9.c0 c0VarD = d(bArr);
        c0VarD.r(32);
        return m(c0VarD, f96633i, true) + 1;
    }

    private static int m(q9.c0 c0Var, int[] iArr, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && c0Var.g(); i12++) {
            i11++;
        }
        if (z10) {
            int i13 = 0;
            while (i10 < i11) {
                i13 += 1 << iArr[i10];
                i10++;
            }
            i10 = i13;
        }
        return i10 + c0Var.h(iArr[i11]);
    }
}
