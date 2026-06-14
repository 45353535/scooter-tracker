package vb;

import androidx.core.view.ViewCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.common.math.IntMath;
import com.google.common.math.LongMath;

/* JADX INFO: loaded from: classes12.dex */
abstract class v {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f106446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f106447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f106448c;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f106449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f106450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f106451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f106452d;

        private c(int i10, int i11, int i12, byte[] bArr) {
            this.f106449a = i10;
            this.f106450b = i11;
            this.f106451c = i12;
            this.f106452d = bArr;
        }
    }

    private static int a(int i10) throws n9.x {
        if (i10 == 0) {
            return ViewUtils.EDGE_TO_EDGE_FLAGS;
        }
        if (i10 == 1) {
            return 1024;
        }
        if (i10 == 2 || i10 == 3) {
            return 2048;
        }
        if (i10 == 4) {
            return 4096;
        }
        throw n9.x.d("Unsupported coreSbrFrameLengthIndex " + i10);
    }

    private static double b(int i10) throws n9.x {
        switch (i10) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw n9.x.d("Unsupported sampling rate " + i10);
        }
    }

    private static int c(int i10) throws n9.x {
        switch (i10) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw n9.x.d("Unsupported sampling rate index " + i10);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static int d(int i10) throws n9.x {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                if (i10 == 4) {
                    return 1;
                }
                throw n9.x.d("Unsupported coreSbrFrameLengthIndex " + i10);
            }
        }
        return i11;
    }

    public static boolean e(int i10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) == 12583333;
    }

    public static int f(q9.c0 c0Var) {
        if (!c0Var.g()) {
            return 0;
        }
        c0Var.r(2);
        return c0Var.h(13);
    }

    public static boolean g(q9.c0 c0Var, b bVar) throws n9.x {
        c0Var.d();
        int iK = k(c0Var, 3, 8, 8);
        bVar.f106446a = iK;
        if (iK == -1) {
            return false;
        }
        long jL = l(c0Var, 2, 8, 32);
        bVar.f106447b = jL;
        if (jL == -1) {
            return false;
        }
        if (jL > 16) {
            throw n9.x.d("Contains sub-stream with an invalid packet label " + bVar.f106447b);
        }
        if (jL == 0) {
            int i10 = bVar.f106446a;
            if (i10 == 1) {
                throw n9.x.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i10 == 2) {
                throw n9.x.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i10 == 17) {
                throw n9.x.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iK2 = k(c0Var, 11, 24, 24);
        bVar.f106448c = iK2;
        return iK2 != -1;
    }

    public static c h(q9.c0 c0Var) throws n9.x {
        int iH = c0Var.h(8);
        int iH2 = c0Var.h(5);
        int iH3 = iH2 == 31 ? c0Var.h(24) : c(iH2);
        int iH4 = c0Var.h(3);
        int iA = a(iH4);
        int iD = d(iH4);
        c0Var.r(2);
        p(c0Var);
        m(c0Var, j(c0Var), iD);
        byte[] bArr = null;
        if (c0Var.g()) {
            int iK = k(c0Var, 2, 4, 8) + 1;
            for (int i10 = 0; i10 < iK; i10++) {
                int iK2 = k(c0Var, 4, 8, 16);
                int iK3 = k(c0Var, 4, 8, 16);
                if (iK2 == 7) {
                    int iH5 = c0Var.h(4) + 1;
                    c0Var.r(4);
                    byte[] bArr2 = new byte[iH5];
                    for (int i11 = 0; i11 < iH5; i11++) {
                        bArr2[i11] = (byte) c0Var.h(8);
                    }
                    bArr = bArr2;
                } else {
                    c0Var.r(iK3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dB = b(iH3);
        return new c(iH, (int) (((double) iH3) * dB), (int) (((double) iA) * dB), bArr3);
    }

    private static boolean i(q9.c0 c0Var) {
        c0Var.r(3);
        boolean zG = c0Var.g();
        if (zG) {
            c0Var.r(13);
        }
        return zG;
    }

    private static int j(q9.c0 c0Var) {
        int iH = c0Var.h(5);
        int iK = 0;
        for (int i10 = 0; i10 < iH + 1; i10++) {
            int iH2 = c0Var.h(3);
            iK += k(c0Var, 5, 8, 16) + 1;
            if ((iH2 == 0 || iH2 == 2) && c0Var.g()) {
                p(c0Var);
            }
        }
        return iK;
    }

    private static int k(q9.c0 c0Var, int i10, int i11, int i12) {
        q9.a.a(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        IntMath.checkedAdd(IntMath.checkedAdd(i13, i14), 1 << i12);
        if (c0Var.b() < i10) {
            return -1;
        }
        int iH = c0Var.h(i10);
        if (iH != i13) {
            return iH;
        }
        if (c0Var.b() < i11) {
            return -1;
        }
        int iH2 = c0Var.h(i11);
        int i15 = iH + iH2;
        if (iH2 != i14) {
            return i15;
        }
        if (c0Var.b() < i12) {
            return -1;
        }
        return i15 + c0Var.h(i12);
    }

    private static long l(q9.c0 c0Var, int i10, int i11, int i12) {
        q9.a.a(Math.max(Math.max(i10, i11), i12) <= 63);
        long j10 = (1 << i10) - 1;
        long j11 = (1 << i11) - 1;
        LongMath.checkedAdd(LongMath.checkedAdd(j10, j11), 1 << i12);
        if (c0Var.b() < i10) {
            return -1L;
        }
        long j12 = c0Var.j(i10);
        if (j12 != j10) {
            return j12;
        }
        if (c0Var.b() < i11) {
            return -1L;
        }
        long j13 = c0Var.j(i11);
        long j14 = j12 + j13;
        if (j13 != j11) {
            return j14;
        }
        if (c0Var.b() < i12) {
            return -1L;
        }
        return j14 + c0Var.j(i12);
    }

    private static void m(q9.c0 c0Var, int i10, int i11) {
        int iH;
        int iK = k(c0Var, 4, 8, 16) + 1;
        c0Var.q();
        for (int i12 = 0; i12 < iK; i12++) {
            int iH2 = c0Var.h(2);
            if (iH2 == 0) {
                i(c0Var);
                if (i11 > 0) {
                    o(c0Var);
                }
            } else if (iH2 == 1) {
                if (i(c0Var)) {
                    c0Var.q();
                }
                if (i11 > 0) {
                    o(c0Var);
                    iH = c0Var.h(2);
                } else {
                    iH = 0;
                }
                if (iH > 0) {
                    c0Var.r(6);
                    int iH3 = c0Var.h(2);
                    c0Var.r(4);
                    if (c0Var.g()) {
                        c0Var.r(5);
                    }
                    if (iH == 2 || iH == 3) {
                        c0Var.r(6);
                    }
                    if (iH3 == 2) {
                        c0Var.q();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i10 - 1) / Math.log(2.0d))) + 1;
                int iH4 = c0Var.h(2);
                if (iH4 > 0 && c0Var.g()) {
                    c0Var.r(iFloor);
                }
                if (c0Var.g()) {
                    c0Var.r(iFloor);
                }
                if (i11 == 0 && iH4 == 0) {
                    c0Var.q();
                }
            } else if (iH2 == 3) {
                k(c0Var, 4, 8, 16);
                int iK2 = k(c0Var, 4, 8, 16);
                if (c0Var.g()) {
                    k(c0Var, 8, 16, 0);
                }
                c0Var.q();
                if (iK2 > 0) {
                    c0Var.r(iK2 * 8);
                }
            }
        }
    }

    private static void n(q9.c0 c0Var, int i10) {
        int iH;
        boolean zG = c0Var.g();
        int i11 = zG ? 1 : 5;
        int i12 = zG ? 7 : 5;
        int i13 = zG ? 8 : 6;
        int i14 = 0;
        while (i14 < i10) {
            if (c0Var.g()) {
                c0Var.r(7);
                iH = 0;
            } else {
                if (c0Var.h(2) == 3 && c0Var.h(i12) * i11 != 0) {
                    c0Var.q();
                }
                iH = c0Var.h(i13) * i11;
                if (iH != 0 && iH != 180) {
                    c0Var.q();
                }
                c0Var.q();
            }
            if (iH != 0 && iH != 180 && c0Var.g()) {
                i14++;
            }
            i14++;
        }
    }

    private static void o(q9.c0 c0Var) {
        c0Var.r(3);
        c0Var.r(8);
        boolean zG = c0Var.g();
        boolean zG2 = c0Var.g();
        if (zG) {
            c0Var.r(5);
        }
        if (zG2) {
            c0Var.r(6);
        }
    }

    private static void p(q9.c0 c0Var) {
        int iH = c0Var.h(2);
        if (iH == 0) {
            c0Var.r(6);
            return;
        }
        int iK = k(c0Var, 5, 8, 16) + 1;
        if (iH == 1) {
            c0Var.r(iK * 7);
        } else if (iH == 2) {
            n(c0Var, iK);
        }
    }
}
