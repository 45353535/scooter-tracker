package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class uh2 implements me1, w01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f116642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d13 f116643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tq f116644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ap0 f116645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hy f116646e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f116648g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f116650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h30 f116651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public hq2 f116652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f116653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zh2 f116654m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final be2 f116647f = new be2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f116649h = true;

    public uh2(zh2 zh2Var, Uri uri, c30 c30Var, tq tqVar, ap0 ap0Var, hy hyVar) {
        this.f116654m = zh2Var;
        this.f116642a = uri;
        this.f116643b = new d13(c30Var);
        this.f116644c = tqVar;
        this.f116645d = ap0Var;
        this.f116646e = hyVar;
        ge1.a();
        this.f116651j = a(0L);
    }

    public final h30 a(long j10) {
        Uri uri = this.f116642a;
        String str = this.f116654m.f118695j;
        Map map = zh2.N;
        fi.a(uri, "The uri must be set.");
        return new h30(uri, 0L, 1, null, map, j10, -1L, str, 6, null);
    }

    @Override // yads.me1
    public final void b() {
        this.f116648g = true;
    }

    @Override // yads.me1
    public final void a() {
        c30 x01Var;
        int i10;
        int iA = 0;
        while (iA == 0 && !this.f116648g) {
            try {
                long j10 = this.f116647f.f108980a;
                h30 h30VarA = a(j10);
                this.f116651j = h30VarA;
                long jA = this.f116643b.a(h30VarA);
                if (jA != -1) {
                    jA += j10;
                    this.f116654m.h();
                }
                long j11 = jA;
                this.f116654m.f118704s = a11.a(this.f116643b.f109696a.c());
                d13 d13Var = this.f116643b;
                a11 a11Var = this.f116654m.f118704s;
                if (a11Var == null || (i10 = a11Var.f108514g) == -1) {
                    x01Var = d13Var;
                } else {
                    x01Var = new x01(d13Var, i10, this);
                    zh2 zh2Var = this.f116654m;
                    zh2Var.getClass();
                    hq2 hq2VarA = zh2Var.a(new xh2(true, 0));
                    this.f116652k = hq2VarA;
                    hq2VarA.a(zh2.O);
                }
                this.f116644c.a(x01Var, this.f116642a, this.f116643b.f109696a.c(), j10, j11, this.f116645d);
                if (this.f116654m.f118704s != null) {
                    xo0 xo0Var = this.f116644c.f116342b;
                    if (xo0Var instanceof ut1) {
                        ((ut1) xo0Var).f116773q = true;
                    }
                }
                if (this.f116649h) {
                    tq tqVar = this.f116644c;
                    long j12 = this.f116650i;
                    xo0 xo0Var2 = tqVar.f116342b;
                    xo0Var2.getClass();
                    xo0Var2.a(j10, j12);
                    this.f116649h = false;
                }
                while (iA == 0 && !this.f116648g) {
                    try {
                        this.f116646e.a();
                        tq tqVar2 = this.f116644c;
                        be2 be2Var = this.f116647f;
                        xo0 xo0Var3 = tqVar2.f116342b;
                        xo0Var3.getClass();
                        yc0 yc0Var = tqVar2.f116343c;
                        yc0Var.getClass();
                        iA = xo0Var3.a(yc0Var, be2Var);
                        yc0 yc0Var2 = this.f116644c.f116343c;
                        long j13 = yc0Var2 != null ? yc0Var2.f118152d : -1L;
                        if (j13 > this.f116654m.f118696k + j10) {
                            hy hyVar = this.f116646e;
                            synchronized (hyVar) {
                                hyVar.f111800a = false;
                            }
                            zh2 zh2Var2 = this.f116654m;
                            zh2Var2.f118702q.post(zh2Var2.f118701p);
                            j10 = j13;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iA == 1) {
                    iA = 0;
                } else {
                    yc0 yc0Var3 = this.f116644c.f116343c;
                    if ((yc0Var3 != null ? yc0Var3.f118152d : -1L) != -1) {
                        this.f116647f.f108980a = yc0Var3 != null ? yc0Var3.f118152d : -1L;
                    }
                }
                f30.a(this.f116643b);
            } catch (Throwable th2) {
                if (iA != 1) {
                    yc0 yc0Var4 = this.f116644c.f116343c;
                    if ((yc0Var4 != null ? yc0Var4.f118152d : -1L) != -1) {
                        this.f116647f.f108980a = yc0Var4 != null ? yc0Var4.f118152d : -1L;
                    }
                }
                f30.a(this.f116643b);
                throw th2;
            }
        }
    }
}
