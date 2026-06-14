package mh;

import hh.d0;
import hh.r;
import hh.u;
import hh.x;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import mh.j;
import ph.n;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f94941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hh.a f94942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f94943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f94944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j.b f94945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f94946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f94947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f94948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f94949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d0 f94950j;

    public d(g connectionPool, hh.a address, e call, r eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f94941a = connectionPool;
        this.f94942b = address;
        this.f94943c = call;
        this.f94944d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final mh.f b(int r13, int r14, int r15, int r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.d.b(int, int, int, int, boolean):mh.f");
    }

    private final f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            f fVarB = b(i10, i11, i12, i13, z10);
            boolean z12 = z10;
            int i14 = i13;
            int i15 = i12;
            int i16 = i11;
            int i17 = i10;
            if (fVarB.u(z11)) {
                return fVarB;
            }
            fVarB.y();
            if (this.f94950j == null) {
                j.b bVar = this.f94945e;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    j jVar = this.f94946f;
                    if (!(jVar != null ? jVar.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i10 = i17;
            i11 = i16;
            i12 = i15;
            i13 = i14;
            z10 = z12;
        }
    }

    private final d0 f() {
        f fVarO;
        if (this.f94947g > 1 || this.f94948h > 1 || this.f94949i > 0 || (fVarO = this.f94943c.o()) == null) {
            return null;
        }
        synchronized (fVarO) {
            if (fVarO.q() != 0) {
                return null;
            }
            if (ih.d.j(fVarO.z().a().l(), this.f94942b.l())) {
                return fVarO.z();
            }
            return null;
        }
    }

    public final nh.d a(x client, nh.g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
        } catch (IOException e10) {
            e = e10;
        } catch (i e11) {
            e = e11;
        }
        try {
            return c(chain.e(), chain.g(), chain.i(), client.F(), client.L(), !Intrinsics.areEqual(chain.h().h(), "GET")).w(client, chain);
        } catch (IOException e12) {
            e = e12;
            IOException iOException = e;
            h(iOException);
            throw new i(iOException);
        } catch (i e13) {
            e = e13;
            i iVar = e;
            h(iVar.g());
            throw iVar;
        }
    }

    public final hh.a d() {
        return this.f94942b;
    }

    public final boolean e() {
        j jVar;
        if (this.f94947g == 0 && this.f94948h == 0 && this.f94949i == 0) {
            return false;
        }
        if (this.f94950j != null) {
            return true;
        }
        d0 d0VarF = f();
        if (d0VarF != null) {
            this.f94950j = d0VarF;
            return true;
        }
        j.b bVar = this.f94945e;
        if ((bVar == null || !bVar.b()) && (jVar = this.f94946f) != null) {
            return jVar.a();
        }
        return true;
    }

    public final boolean g(u url) {
        Intrinsics.checkNotNullParameter(url, "url");
        u uVarL = this.f94942b.l();
        return url.l() == uVarL.l() && Intrinsics.areEqual(url.h(), uVarL.h());
    }

    public final void h(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f94950j = null;
        if ((e10 instanceof n) && ((n) e10).f98549b == ph.b.REFUSED_STREAM) {
            this.f94947g++;
        } else if (e10 instanceof ph.a) {
            this.f94948h++;
        } else {
            this.f94949i++;
        }
    }
}
