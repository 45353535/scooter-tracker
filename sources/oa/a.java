package oa;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f96444a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f96445b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f96446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f96447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f96448c;

        private b(int i10, int i11, String str) {
            this.f96446a = i10;
            this.f96447b = i11;
            this.f96448c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int b(q9.c0 c0Var) {
        int iH = c0Var.h(5);
        return iH == 31 ? c0Var.h(6) + 32 : iH;
    }

    private static int c(q9.c0 c0Var) throws n9.x {
        int iH = c0Var.h(4);
        if (iH == 15) {
            if (c0Var.b() >= 24) {
                return c0Var.h(24);
            }
            throw n9.x.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f96444a[iH];
        }
        throw n9.x.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(q9.c0 c0Var, boolean z10) throws n9.x {
        int iB = b(c0Var);
        int iC = c(c0Var);
        int iH = c0Var.h(4);
        String str = "mp4a.40." + iB;
        if (iB == 5 || iB == 29) {
            iC = c(c0Var);
            iB = b(c0Var);
            if (iB == 22) {
                iH = c0Var.h(4);
            }
        }
        if (z10) {
            if (iB != 1 && iB != 2 && iB != 3 && iB != 4 && iB != 6 && iB != 7 && iB != 17) {
                switch (iB) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw n9.x.d("Unsupported audio object type: " + iB);
                }
            }
            f(c0Var, iB, iH);
            switch (iB) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = c0Var.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw n9.x.d("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f96445b[iH];
        if (i10 != -1) {
            return new b(iC, i10, str);
        }
        throw n9.x.a(null, null);
    }

    public static b e(byte[] bArr) {
        return d(new q9.c0(bArr), false);
    }

    private static void f(q9.c0 c0Var, int i10, int i11) {
        if (c0Var.g()) {
            q9.u.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c0Var.g()) {
            c0Var.r(14);
        }
        boolean zG = c0Var.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            c0Var.r(3);
        }
        if (zG) {
            if (i10 == 22) {
                c0Var.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                c0Var.r(3);
            }
            c0Var.r(1);
        }
    }
}
