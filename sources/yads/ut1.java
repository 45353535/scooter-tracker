package yads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ut1 implements xo0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d11 f116756t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wj0 f116762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ap0 f116763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z43 f116764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z43 f116765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f116766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fr1 f116767k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f116769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f116770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f116771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ru2 f116772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f116773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f116774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f116775s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116757a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f116758b = new w92(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final au1 f116759c = new au1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lx0 f116760d = new lx0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f116768l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h11 f116761e = new h11();

    static {
        new cp0() { // from class: yads.nr0
            @Override // yads.cp0
            public final xo0[] a() {
                return ut1.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
        f116756t = new d11() { // from class: yads.or0
            @Override // yads.d11
            public final boolean a(int i10, int i11, int i12, int i13, int i14) {
                return ut1.a(i10, i11, i12, i13, i14);
            }
        };
    }

    public ut1(int i10) {
        wj0 wj0Var = new wj0();
        this.f116762f = wj0Var;
        this.f116765i = wj0Var;
    }

    public static /* synthetic */ boolean a(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    @Override // yads.xo0
    public final void release() {
    }

    public static long a(fr1 fr1Var) {
        if (fr1Var == null) {
            return -9223372036854775807L;
        }
        int length = fr1Var.f110835b.length;
        for (int i10 = 0; i10 < length; i10++) {
            er1 er1Var = fr1Var.f110835b[i10];
            if (er1Var instanceof k33) {
                k33 k33Var = (k33) er1Var;
                if (k33Var.f111025b.equals("TLEN")) {
                    return w83.a(Long.parseLong(k33Var.f112577d));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f116763g = ap0Var;
        z43 z43VarA = ap0Var.a(0, 1);
        this.f116764h = z43VarA;
        this.f116765i = z43VarA;
        this.f116763g.a();
    }

    public final boolean a(yc0 yc0Var) {
        ru2 ru2Var = this.f116772p;
        if (ru2Var != null) {
            long jA = ru2Var.a();
            if (jA != -1 && yc0Var.f118152d + ((long) yc0Var.f118154f) > jA - 4) {
                return true;
            }
        }
        try {
            return !yc0Var.b(this.f116758b.f117356a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yo0 r43, yads.be2 r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ut1.a(yads.yo0, yads.be2):int");
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        this.f116766j = 0;
        this.f116768l = -9223372036854775807L;
        this.f116769m = 0L;
        this.f116771o = 0;
        this.f116775s = j11;
        ru2 ru2Var = this.f116772p;
        if (!(ru2Var instanceof s41) || ((s41) ru2Var).c(j11)) {
            return;
        }
        this.f116774r = true;
        this.f116765i = this.f116762f;
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) {
        return a((yc0) yo0Var, true);
    }

    public final boolean a(yc0 yc0Var, boolean z10) throws Throwable {
        int i10;
        int i11;
        int iA;
        int i12 = z10 ? 32768 : 131072;
        yc0Var.f118154f = 0;
        if (yc0Var.f118152d == 0) {
            fr1 fr1VarA = this.f116761e.a(yc0Var, (this.f116757a & 8) == 0 ? null : f116756t);
            this.f116767k = fr1VarA;
            if (fr1VarA != null) {
                this.f116760d.a(fr1VarA);
            }
            i10 = (int) (yc0Var.f118152d + ((long) yc0Var.f118154f));
            if (!z10) {
                yc0Var.a(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (!a(yc0Var)) {
                this.f116758b.e(0);
                int iB = this.f116758b.b();
                if ((i11 == 0 || ((-128000) & iB) == (((long) i11) & (-128000))) && (iA = bu1.a(iB)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f116759c.a(iB);
                        i11 = iB;
                    }
                    yc0Var.a(false, iA - 4);
                } else {
                    int i15 = i14 + 1;
                    if (i14 == i12) {
                        if (z10) {
                            return false;
                        }
                        throw new ba2("Searched too many bytes.", null, true, 1);
                    }
                    if (z10) {
                        yc0Var.f118154f = 0;
                        yc0Var.a(false, i10 + i15);
                    } else {
                        yc0Var.a(1);
                    }
                    i13 = 0;
                    i14 = i15;
                    i11 = 0;
                }
            } else if (i13 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            yc0Var.a(i10 + i14);
        } else {
            yc0Var.f118154f = 0;
        }
        this.f116766j = i11;
        return true;
    }

    public static xo0[] a() {
        return new xo0[]{new ut1(0)};
    }
}
