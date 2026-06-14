package yads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class z72 implements xo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ap0 f118591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l13 f118592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f118593c;

    static {
        new cp0() { // from class: yads.o71
            @Override // yads.cp0
            public final xo0[] a() {
                return z72.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f118591a = ap0Var;
    }

    @Override // yads.xo0
    public final void release() {
    }

    @Override // yads.xo0
    public final int a(yo0 yo0Var, be2 be2Var) throws ba2, EOFException, InterruptedIOException {
        int i10;
        if (this.f118591a == null) {
            throw new IllegalStateException();
        }
        if (this.f118592b == null) {
            yc0 yc0Var = (yc0) yo0Var;
            if (!a(yc0Var)) {
                throw new ba2("Failed to determine bitstream type", null, true, 1);
            }
            yc0Var.f118154f = 0;
        }
        if (!this.f118593c) {
            z43 z43VarA = this.f118591a.a(0, 1);
            this.f118591a.a();
            l13 l13Var = this.f118592b;
            l13Var.f112914c = this.f118591a;
            l13Var.f112913b = z43VarA;
            l13Var.a(true);
            this.f118593c = true;
        }
        l13 l13Var2 = this.f118592b;
        if (l13Var2.f112913b == null) {
            throw new IllegalStateException();
        }
        int i11 = w83.f117341a;
        int i12 = l13Var2.f112919h;
        if (i12 == 0) {
            while (true) {
                yc0 yc0Var2 = (yc0) yo0Var;
                if (!l13Var2.f112912a.a(yc0Var2)) {
                    l13Var2.f112919h = 3;
                    break;
                }
                long j10 = yc0Var2.f118152d;
                long j11 = l13Var2.f112917f;
                l13Var2.f112922k = j10 - j11;
                if (!l13Var2.a(l13Var2.f112912a.f108599b, j11, l13Var2.f112921j)) {
                    yv0 yv0Var = l13Var2.f112921j.f112218a;
                    l13Var2.f112920i = yv0Var.A;
                    if (!l13Var2.f112924m) {
                        l13Var2.f112913b.a(yv0Var);
                        l13Var2.f112924m = true;
                    }
                    ju0 ju0Var = l13Var2.f112921j.f112219b;
                    if (ju0Var != null) {
                        l13Var2.f112915d = ju0Var;
                    } else {
                        long j12 = yc0Var2.f118151c;
                        if (j12 != -1) {
                            b82 b82Var = l13Var2.f112912a.f108598a;
                            i10 = 2;
                            l13Var2.f112915d = new vd0(l13Var2, l13Var2.f112917f, j12, b82Var.f108936d + b82Var.f108937e, b82Var.f108934b, (b82Var.f108933a & 4) != 0);
                            l13Var2.f112919h = i10;
                            l13Var2.f112912a.a();
                            return 0;
                        }
                        l13Var2.f112915d = new k13();
                    }
                    i10 = 2;
                    l13Var2.f112919h = i10;
                    l13Var2.f112912a.a();
                    return 0;
                }
                l13Var2.f112917f = yc0Var2.f118152d;
            }
        } else {
            if (i12 == 1) {
                ((yc0) yo0Var).a((int) l13Var2.f112917f);
                l13Var2.f112919h = 2;
                return 0;
            }
            if (i12 == 2) {
                yc0 yc0Var3 = (yc0) yo0Var;
                long jA = l13Var2.f112915d.a(yc0Var3);
                if (jA >= 0) {
                    be2Var.f108980a = jA;
                    return 1;
                }
                if (jA < -1) {
                    l13Var2.a(-(jA + 2));
                }
                if (!l13Var2.f112923l) {
                    nu2 nu2VarA = l13Var2.f112915d.a();
                    if (nu2VarA == null) {
                        throw new IllegalStateException();
                    }
                    l13Var2.f112914c.a(nu2VarA);
                    l13Var2.f112923l = true;
                }
                if (l13Var2.f112922k <= 0 && !l13Var2.f112912a.a(yc0Var3)) {
                    l13Var2.f112919h = 3;
                    return -1;
                }
                l13Var2.f112922k = 0L;
                w92 w92Var = l13Var2.f112912a.f108599b;
                long jA2 = l13Var2.a(w92Var);
                if (jA2 >= 0) {
                    long j13 = l13Var2.f112918g;
                    if (j13 + jA2 >= l13Var2.f112916e) {
                        long j14 = (j13 * 1000000) / ((long) l13Var2.f112920i);
                        l13Var2.f112913b.a(w92Var.f117358c, w92Var);
                        l13Var2.f112913b.a(j14, 1, w92Var.f117358c, 0, null);
                        l13Var2.f112916e = -1L;
                    }
                }
                l13Var2.f112918g += jA2;
                return 0;
            }
            if (i12 != 3) {
                throw new IllegalStateException();
            }
        }
        return -1;
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        l13 l13Var = this.f118592b;
        if (l13Var != null) {
            a82 a82Var = l13Var.f112912a;
            b82 b82Var = a82Var.f108598a;
            b82Var.f108933a = 0;
            b82Var.f108934b = 0L;
            b82Var.f108935c = 0;
            b82Var.f108936d = 0;
            b82Var.f108937e = 0;
            a82Var.f108599b.c(0);
            a82Var.f108600c = -1;
            a82Var.f108602e = false;
            if (j10 == 0) {
                l13Var.a(!l13Var.f112923l);
                return;
            }
            if (l13Var.f112919h != 0) {
                long j12 = (((long) l13Var.f112920i) * j11) / 1000000;
                l13Var.f112916e = j12;
                c82 c82Var = l13Var.f112915d;
                int i10 = w83.f117341a;
                c82Var.a(j12);
                l13Var.f112919h = 2;
            }
        }
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) {
        try {
            return a((yc0) yo0Var);
        } catch (ba2 unused) {
            return false;
        }
    }

    public static /* synthetic */ xo0[] a() {
        return new xo0[]{new z72()};
    }

    public final boolean a(yc0 yc0Var) {
        b82 b82Var = new b82();
        if (b82Var.a(yc0Var, true) && (b82Var.f108933a & 2) == 2) {
            int iMin = Math.min(b82Var.f108937e, 8);
            w92 w92Var = new w92(iMin);
            yc0Var.b(w92Var.f117356a, 0, iMin, false);
            w92Var.e(0);
            if (w92Var.f117358c - w92Var.f117357b >= 5 && w92Var.m() == 127 && w92Var.n() == 1179402563) {
                this.f118592b = new ku0();
            } else {
                w92Var.e(0);
                if (jk3.a(1, w92Var, true)) {
                    this.f118592b = new fk3();
                } else {
                    w92Var.e(0);
                    if (d92.a(w92Var, d92.f109842o)) {
                        this.f118592b = new d92();
                    }
                }
            }
            return true;
        }
        return false;
    }
}
