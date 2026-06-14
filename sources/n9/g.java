package n9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f95299h = new b().d(1).c(2).e(3).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f95300i = new b().d(1).c(1).e(2).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f95301j = o0.C0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f95302k = o0.C0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f95303l = o0.C0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f95304m = o0.C0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f95305n = o0.C0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f95306o = o0.C0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f95310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f95311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f95312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95313g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f95314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f95315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f95316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f95317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f95318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f95319f;

        public g a() {
            return new g(this.f95314a, this.f95315b, this.f95316c, this.f95317d, this.f95318e, this.f95319f);
        }

        public b b(int i10) {
            this.f95319f = i10;
            return this;
        }

        public b c(int i10) {
            this.f95315b = i10;
            return this;
        }

        public b d(int i10) {
            this.f95314a = i10;
            return this;
        }

        public b e(int i10) {
            this.f95316c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.f95317d = bArr;
            return this;
        }

        public b g(int i10) {
            this.f95318e = i10;
            return this;
        }

        public b() {
            this.f95314a = -1;
            this.f95315b = -1;
            this.f95316c = -1;
            this.f95318e = -1;
            this.f95319f = -1;
        }

        private b(g gVar) {
            this.f95314a = gVar.f95307a;
            this.f95315b = gVar.f95308b;
            this.f95316c = gVar.f95309c;
            this.f95317d = gVar.f95310d;
            this.f95318e = gVar.f95311e;
            this.f95319f = gVar.f95312f;
        }
    }

    private static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    private static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    private static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    private static String e(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return com.taurusx.tax.f.y.f66052c;
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static boolean h(g gVar) {
        if (gVar == null) {
            return true;
        }
        int i10 = gVar.f95307a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = gVar.f95308b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = gVar.f95309c;
        if ((i12 != -1 && i12 != 3) || gVar.f95310d != null) {
            return false;
        }
        int i13 = gVar.f95312f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = gVar.f95311e;
        return i14 == -1 || i14 == 8;
    }

    public static int j(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String l(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f95307a == gVar.f95307a && this.f95308b == gVar.f95308b && this.f95309c == gVar.f95309c && Arrays.equals(this.f95310d, gVar.f95310d) && this.f95311e == gVar.f95311e && this.f95312f == gVar.f95312f) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return (this.f95311e == -1 || this.f95312f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f95307a == -1 || this.f95308b == -1 || this.f95309c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f95313g == 0) {
            this.f95313g = ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f95307a) * 31) + this.f95308b) * 31) + this.f95309c) * 31) + Arrays.hashCode(this.f95310d)) * 31) + this.f95311e) * 31) + this.f95312f;
        }
        return this.f95313g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String strG = g() ? o0.G("%s/%s/%s", d(this.f95307a), c(this.f95308b), e(this.f95309c)) : "NA/NA/NA";
        if (f()) {
            str = this.f95311e + "/" + this.f95312f;
        } else {
            str = "NA/NA";
        }
        return strG + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f95307a));
        sb2.append(", ");
        sb2.append(c(this.f95308b));
        sb2.append(", ");
        sb2.append(e(this.f95309c));
        sb2.append(", ");
        sb2.append(this.f95310d != null);
        sb2.append(", ");
        sb2.append(l(this.f95311e));
        sb2.append(", ");
        sb2.append(b(this.f95312f));
        sb2.append(")");
        return sb2.toString();
    }

    private g(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f95307a = i10;
        this.f95308b = i11;
        this.f95309c = i12;
        this.f95310d = bArr;
        this.f95311e = i13;
        this.f95312f = i14;
    }
}
