package yads;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ez2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f110532a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(yo0 yo0Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        long jB = yo0Var.b();
        long j10 = -1;
        int i12 = (jB > (-1L) ? 1 : (jB == (-1L) ? 0 : -1));
        long j11 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i12 != 0 && jB <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j11 = jB;
        }
        int i13 = (int) j11;
        w92 w92Var = new w92(64);
        int i14 = 0;
        int i15 = 0;
        boolean z14 = false;
        while (i15 < i13) {
            w92Var.c(8);
            if (!yo0Var.b(w92Var.f117356a, i14, 8, true)) {
                break;
            }
            long jN = w92Var.n();
            int iB = w92Var.b();
            if (jN == 1) {
                yo0Var.a(w92Var.f117356a, 8, 8);
                w92Var.d(16);
                z13 = i14;
                i10 = i15;
                i11 = 16;
                jN = w92Var.i();
            } else {
                if (jN == 0) {
                    long jB2 = yo0Var.b();
                    if (jB2 != j10) {
                        jN = (jB2 - yo0Var.f()) + ((long) 8);
                    }
                }
                z13 = i14;
                i10 = i15;
                i11 = 8;
            }
            long j12 = i11;
            if (jN < j12) {
                return z13;
            }
            int i16 = i10 + i11;
            boolean z15 = z13;
            if (iB == 1836019574) {
                i13 += (int) jN;
                if (i12 != 0 && i13 > jB) {
                    i13 = (int) jB;
                }
                i15 = i16;
                i14 = z15 ? 1 : 0;
                j10 = -1;
            } else {
                if (iB == 1836019558 || iB == 1836475768) {
                    z12 = true;
                    break;
                }
                int i17 = i12;
                if ((((long) i16) + jN) - j12 >= i13) {
                    break;
                }
                int i18 = (int) (jN - j12);
                i15 = i16 + i18;
                if (iB == 1718909296) {
                    if (i18 < 8) {
                        return z15;
                    }
                    w92Var.c(i18);
                    yo0Var.a(w92Var.f117356a, z15 ? 1 : 0, i18);
                    int i19 = i18 / 4;
                    for (int i20 = 0; i20 < i19; i20++) {
                        if (i20 != 1) {
                            int iB2 = w92Var.b();
                            if ((iB2 >>> 8) != 3368816 && (iB2 != 1751476579 || !z11)) {
                                int[] iArr = f110532a;
                                for (int i21 = 0; i21 < 29; i21++) {
                                    if (iArr[i21] != iB2) {
                                    }
                                }
                            }
                            z14 = true;
                            break;
                        }
                        w92Var.e(w92Var.f117357b + 4);
                    }
                    if (!z14) {
                        return false;
                    }
                } else if (i18 != 0) {
                    yo0Var.b(i18);
                }
                i12 = i17;
                j10 = -1;
                i14 = 0;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }
}
