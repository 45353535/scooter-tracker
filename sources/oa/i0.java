package oa;

/* JADX INFO: loaded from: classes12.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f96562a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f96563b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f96564c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f96565d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f96566e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f96567f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f96568g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f96569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f96570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f96571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f96572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f96573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f96574f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f96575g;

        public a() {
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!i0.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f96569a = i11;
            this.f96570b = i0.f96562a[3 - i12];
            int i15 = i0.f96563b[i14];
            this.f96572d = i15;
            if (i11 == 2) {
                this.f96572d = i15 / 2;
            } else if (i11 == 0) {
                this.f96572d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f96575g = i0.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? i0.f96564c[i13 - 1] : i0.f96565d[i13 - 1];
                this.f96574f = i17;
                this.f96571c = (((i17 * 12) / this.f96572d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? i0.f96566e[i13 - 1] : i0.f96567f[i13 - 1];
                    this.f96574f = i18;
                    this.f96571c = ((i18 * 144) / this.f96572d) + i16;
                } else {
                    int i19 = i0.f96568g[i13 - 1];
                    this.f96574f = i19;
                    this.f96571c = (((i12 == 1 ? 72 : 144) * i19) / this.f96572d) + i16;
                }
            }
            this.f96573e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f96569a = aVar.f96569a;
            this.f96570b = aVar.f96570b;
            this.f96571c = aVar.f96571c;
            this.f96572d = aVar.f96572d;
            this.f96573e = aVar.f96573e;
            this.f96574f = aVar.f96574f;
            this.f96575g = aVar.f96575g;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f96563b[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f96564c[i13 - 1] : f96565d[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f96566e[i13 - 1] : f96567f[i13 - 1] : f96568g[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
