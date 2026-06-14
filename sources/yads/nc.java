package yads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class nc implements xo0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w92 f113788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v92 f113789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ap0 f113790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f113791g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f113794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f113795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f113796l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f113785a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc f113786b = new oc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w92 f113787c = new w92(2048);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f113793i = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f113792h = -1;

    static {
        new cp0() { // from class: yads.tr
            @Override // yads.cp0
            public final xo0[] a() {
                return nc.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
    }

    public nc() {
        w92 w92Var = new w92(10);
        this.f113788d = w92Var;
        this.f113789e = new v92(w92Var.a());
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f113790f = ap0Var;
        this.f113786b.a(ap0Var, new y63(Integer.MIN_VALUE, 0, 1));
        ap0Var.a();
    }

    @Override // yads.xo0
    public final void release() {
    }

    public final int a(yc0 yc0Var) throws EOFException, InterruptedIOException {
        int i10 = 0;
        while (true) {
            yc0Var.b(this.f113788d.f117356a, 0, 10, false);
            this.f113788d.e(0);
            if (this.f113788d.o() != 4801587) {
                break;
            }
            w92 w92Var = this.f113788d;
            w92Var.e(w92Var.f117357b + 3);
            int iL = this.f113788d.l();
            i10 += iL + 10;
            yc0Var.a(false, iL);
        }
        yc0Var.f118154f = 0;
        yc0Var.a(false, i10);
        if (this.f113792h == -1) {
            this.f113792h = i10;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0125  */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yo0 r20, yads.be2 r21) throws yads.ba2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.nc.a(yads.yo0, yads.be2):int");
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        this.f113795k = false;
        this.f113786b.a();
        this.f113791g = j11;
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) throws EOFException, InterruptedIOException {
        yc0 yc0Var = (yc0) yo0Var;
        int iA = a(yc0Var);
        int i10 = iA;
        int i11 = 0;
        int i12 = 0;
        do {
            yc0Var.b(this.f113788d.f117356a, 0, 2, false);
            this.f113788d.e(0);
            if ((this.f113788d.r() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                yc0Var.b(this.f113788d.f117356a, 0, 4, false);
                this.f113789e.b(14);
                int iA2 = this.f113789e.a(13);
                if (iA2 <= 6) {
                    i10++;
                    yc0Var.f118154f = 0;
                    yc0Var.a(false, i10);
                } else {
                    yc0Var.a(false, iA2 - 6);
                    i12 += iA2;
                }
            } else {
                i10++;
                yc0Var.f118154f = 0;
                yc0Var.a(false, i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iA < 8192);
        return false;
    }

    public static xo0[] a() {
        return new xo0[]{new nc()};
    }
}
