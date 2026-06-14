package yads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class rk3 implements xo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ap0 f115483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z43 f115484b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pk3 f115487e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115485c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f115486d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f115488f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f115489g = -1;

    static {
        new cp0() { // from class: yads.lp0
            @Override // yads.cp0
            public final xo0[] a() {
                return rk3.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f115483a = ap0Var;
        this.f115484b = ap0Var.a(0, 1);
        ap0Var.a();
    }

    @Override // yads.xo0
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x017c, code lost:
    
        if (r12 != 65534) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yo0 r25, yads.be2 r26) throws yads.ba2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.rk3.a(yads.yo0, yads.be2):int");
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        this.f115485c = j10 == 0 ? 0 : 4;
        pk3 pk3Var = this.f115487e;
        if (pk3Var != null) {
            pk3Var.a(j11);
        }
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) {
        return uk3.a((yc0) yo0Var);
    }

    public static /* synthetic */ xo0[] a() {
        return new xo0[]{new rk3()};
    }
}
