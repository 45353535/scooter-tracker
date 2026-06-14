package yads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ru0 implements xo0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ap0 f115602f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f115604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f115605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f115606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f115607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f115608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f115609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f115610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public cl f115611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zg3 f115612p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w92 f115597a = new w92(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f115598b = new w92(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w92 f115599c = new w92(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w92 f115600d = new w92();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pq2 f115601e = new pq2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f115603g = 1;

    static {
        new cp0() { // from class: yads.yp0
            @Override // yads.cp0
            public final xo0[] a() {
                return ru0.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f115602f = ap0Var;
    }

    @Override // yads.xo0
    public final void release() {
    }

    public final w92 a(yc0 yc0Var) throws EOFException, InterruptedIOException {
        int i10 = this.f115608l;
        w92 w92Var = this.f115600d;
        byte[] bArr = w92Var.f117356a;
        if (i10 > bArr.length) {
            w92Var.f117356a = new byte[Math.max(bArr.length * 2, i10)];
            w92Var.f117358c = 0;
            w92Var.f117357b = 0;
        } else {
            w92Var.e(0);
        }
        this.f115600d.d(this.f115608l);
        yc0Var.a(this.f115600d.f117356a, 0, this.f115608l, false);
        return this.f115600d;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0006 A[SYNTHETIC] */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yo0 r17, yads.be2 r18) throws yads.ba2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ru0.a(yads.yo0, yads.be2):int");
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        if (j10 == 0) {
            this.f115603g = 1;
            this.f115604h = false;
        } else {
            this.f115603g = 3;
        }
        this.f115606j = 0;
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) throws EOFException, InterruptedIOException {
        yc0 yc0Var = (yc0) yo0Var;
        yc0Var.b(this.f115597a.f117356a, 0, 3, false);
        this.f115597a.e(0);
        if (this.f115597a.o() != 4607062) {
            return false;
        }
        yc0Var.b(this.f115597a.f117356a, 0, 2, false);
        this.f115597a.e(0);
        if ((this.f115597a.r() & 250) != 0) {
            return false;
        }
        yc0Var.b(this.f115597a.f117356a, 0, 4, false);
        this.f115597a.e(0);
        int iB = this.f115597a.b();
        yc0Var.f118154f = 0;
        yc0Var.a(false, iB);
        yc0Var.b(this.f115597a.f117356a, 0, 4, false);
        this.f115597a.e(0);
        return this.f115597a.b() == 0;
    }

    public static /* synthetic */ xo0[] a() {
        return new xo0[]{new ru0()};
    }
}
