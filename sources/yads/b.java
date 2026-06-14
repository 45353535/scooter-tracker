package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f108874a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f108875b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static a a(v92 v92Var, boolean z10) throws ba2 {
        int iA;
        int iA2;
        int iA3 = v92Var.a(5);
        if (iA3 == 31) {
            iA3 = v92Var.a(6) + 32;
        }
        int iA4 = v92Var.a(4);
        if (iA4 == 15) {
            iA = v92Var.a(24);
        } else {
            if (iA4 >= 13) {
                throw new ba2(null, null, true, 1);
            }
            iA = f108874a[iA4];
        }
        int iA5 = v92Var.a(4);
        String strA = he2.a("mp4a.40.", iA3);
        if (iA3 == 5 || iA3 == 29) {
            int iA6 = v92Var.a(4);
            if (iA6 == 15) {
                iA2 = v92Var.a(24);
            } else {
                if (iA6 >= 13) {
                    throw new ba2(null, null, true, 1);
                }
                iA2 = f108874a[iA6];
            }
            iA = iA2;
            int iA7 = v92Var.a(5);
            if (iA7 == 31) {
                iA7 = v92Var.a(6) + 32;
            }
            iA3 = iA7;
            if (iA3 == 22) {
                iA5 = v92Var.a(4);
            }
        }
        if (z10) {
            if (iA3 != 6 && iA3 != 7 && iA3 != 17 && iA3 != 1 && iA3 != 2 && iA3 != 3 && iA3 != 4) {
                switch (iA3) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ba2.b("Unsupported audio object type: " + iA3);
                }
            }
            if (v92Var.e()) {
                uf1.d("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (v92Var.e()) {
                v92Var.c(14);
            }
            boolean zE = v92Var.e();
            if (iA5 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iA3 == 6 || iA3 == 20) {
                v92Var.c(3);
            }
            if (zE) {
                if (iA3 == 22) {
                    v92Var.c(16);
                }
                if (iA3 == 17 || iA3 == 19 || iA3 == 20 || iA3 == 23) {
                    v92Var.c(3);
                }
                v92Var.c(1);
            }
            switch (iA3) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iA8 = v92Var.a(2);
                    if (iA8 == 2 || iA8 == 3) {
                        throw ba2.b("Unsupported epConfig: " + iA8);
                    }
                    break;
            }
        }
        int i10 = f108875b[iA5];
        if (i10 != -1) {
            return new a(iA, i10, strA);
        }
        throw new ba2(null, null, true, 1);
    }
}
