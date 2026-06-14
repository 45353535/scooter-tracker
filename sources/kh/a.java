package kh;

import com.google.common.net.HttpHeaders;
import hh.b0;
import hh.c0;
import hh.r;
import hh.t;
import hh.v;
import hh.y;
import hh.z;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kh.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nh.h;
import vh.f;
import vh.g;
import vh.j0;
import vh.l0;
import vh.m0;
import vh.x;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1063a f93156b = new C1063a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hh.c f93157a;

    /* JADX INFO: renamed from: kh.a$a, reason: collision with other inner class name */
    public static final class C1063a {
        public /* synthetic */ C1063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final t c(t tVar, t tVar2) {
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strE = tVar.e(i10);
                String strI = tVar.i(i10);
                if ((!StringsKt.N("Warning", strE, true) || !StringsKt.a0(strI, "1", false, 2, null)) && (d(strE) || !e(strE) || tVar2.a(strE) == null)) {
                    aVar.c(strE, strI);
                }
            }
            int size2 = tVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strE2 = tVar2.e(i11);
                if (!d(strE2) && e(strE2)) {
                    aVar.c(strE2, tVar2.i(i11));
                }
            }
            return aVar.e();
        }

        private final boolean d(String str) {
            return StringsKt.N("Content-Length", str, true) || StringsKt.N("Content-Encoding", str, true) || StringsKt.N("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (StringsKt.N("Connection", str, true) || StringsKt.N(HttpHeaders.KEEP_ALIVE, str, true) || StringsKt.N("Proxy-Authenticate", str, true) || StringsKt.N(HttpHeaders.PROXY_AUTHORIZATION, str, true) || StringsKt.N(HttpHeaders.TE, str, true) || StringsKt.N("Trailers", str, true) || StringsKt.N(HttpHeaders.TRANSFER_ENCODING, str, true) || StringsKt.N(HttpHeaders.UPGRADE, str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b0 f(b0 b0Var) {
            return (b0Var != null ? b0Var.m() : null) != null ? b0Var.b0().b(null).c() : b0Var;
        }

        private C1063a() {
        }
    }

    public static final class b implements l0, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f93158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f93159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kh.b f93160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f93161e;

        b(g gVar, kh.b bVar, f fVar) {
            this.f93159c = gVar;
            this.f93160d = bVar;
            this.f93161e = fVar;
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f93158b && !ih.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f93158b = true;
                this.f93160d.abort();
            }
            this.f93159c.close();
        }

        @Override // vh.l0
        public long read(vh.e sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                long j11 = this.f93159c.read(sink, j10);
                if (j11 != -1) {
                    sink.s(this.f93161e.getBuffer(), sink.e0() - j11, j11);
                    this.f93161e.emitCompleteSegments();
                    return j11;
                }
                if (!this.f93158b) {
                    this.f93158b = true;
                    this.f93161e.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (this.f93158b) {
                    throw e10;
                }
                this.f93158b = true;
                this.f93160d.abort();
                throw e10;
            }
        }

        @Override // vh.l0
        public m0 timeout() {
            return this.f93159c.timeout();
        }
    }

    public a(hh.c cVar) {
        this.f93157a = cVar;
    }

    private final b0 a(kh.b bVar, b0 b0Var) {
        if (bVar == null) {
            return b0Var;
        }
        j0 j0VarBody = bVar.body();
        c0 c0VarM = b0Var.m();
        Intrinsics.checkNotNull(c0VarM);
        b bVar2 = new b(c0VarM.getDelegateSource(), bVar, x.c(j0VarBody));
        return b0Var.b0().b(new h(b0.M(b0Var, "Content-Type", null, 2, null), b0Var.m().getContentLength(), x.d(bVar2))).c();
    }

    @Override // hh.v
    public b0 intercept(v.a chain) {
        r rVarP;
        c0 c0VarM;
        c0 c0VarM2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        hh.e eVarCall = chain.call();
        hh.c cVar = this.f93157a;
        b0 b0VarD = cVar != null ? cVar.d(chain.request()) : null;
        c cVarB = new c.b(System.currentTimeMillis(), chain.request(), b0VarD).b();
        z zVarB = cVarB.b();
        b0 b0VarA = cVarB.a();
        hh.c cVar2 = this.f93157a;
        if (cVar2 != null) {
            cVar2.y(cVarB);
        }
        mh.e eVar = eVarCall instanceof mh.e ? (mh.e) eVarCall : null;
        if (eVar == null || (rVarP = eVar.p()) == null) {
            rVarP = r.f73737b;
        }
        if (b0VarD != null && b0VarA == null && (c0VarM2 = b0VarD.m()) != null) {
            ih.d.m(c0VarM2);
        }
        if (zVarB == null && b0VarA == null) {
            b0 b0VarC = new b0.a().r(chain.request()).p(y.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(ih.d.f74838c).s(-1L).q(System.currentTimeMillis()).c();
            rVarP.A(eVarCall, b0VarC);
            return b0VarC;
        }
        if (zVarB == null) {
            Intrinsics.checkNotNull(b0VarA);
            b0 b0VarC2 = b0VarA.b0().d(f93156b.f(b0VarA)).c();
            rVarP.b(eVarCall, b0VarC2);
            return b0VarC2;
        }
        if (b0VarA != null) {
            rVarP.a(eVarCall, b0VarA);
        } else if (this.f93157a != null) {
            rVarP.c(eVarCall);
        }
        try {
            b0 b0VarA2 = chain.a(zVarB);
            if (b0VarA2 == null && b0VarD != null && c0VarM != null) {
            }
            if (b0VarA != null) {
                if (b0VarA2 != null && b0VarA2.q() == 304) {
                    b0.a aVarB0 = b0VarA.b0();
                    C1063a c1063a = f93156b;
                    b0 b0VarC3 = aVarB0.k(c1063a.c(b0VarA.R(), b0VarA2.R())).s(b0VarA2.s0()).q(b0VarA2.n0()).d(c1063a.f(b0VarA)).n(c1063a.f(b0VarA2)).c();
                    c0 c0VarM3 = b0VarA2.m();
                    Intrinsics.checkNotNull(c0VarM3);
                    c0VarM3.close();
                    hh.c cVar3 = this.f93157a;
                    Intrinsics.checkNotNull(cVar3);
                    cVar3.w();
                    this.f93157a.z(b0VarA, b0VarC3);
                    rVarP.b(eVarCall, b0VarC3);
                    return b0VarC3;
                }
                c0 c0VarM4 = b0VarA.m();
                if (c0VarM4 != null) {
                    ih.d.m(c0VarM4);
                }
            }
            Intrinsics.checkNotNull(b0VarA2);
            b0.a aVarB02 = b0VarA2.b0();
            C1063a c1063a2 = f93156b;
            b0 b0VarC4 = aVarB02.d(c1063a2.f(b0VarA)).n(c1063a2.f(b0VarA2)).c();
            if (this.f93157a != null) {
                if (nh.e.b(b0VarC4) && c.f93162c.a(b0VarC4, zVarB)) {
                    b0 b0VarA3 = a(this.f93157a.o(b0VarC4), b0VarC4);
                    if (b0VarA != null) {
                        rVarP.c(eVarCall);
                    }
                    return b0VarA3;
                }
                if (nh.f.f96156a.a(zVarB.h())) {
                    try {
                        this.f93157a.p(zVarB);
                    } catch (IOException unused) {
                    }
                }
            }
            return b0VarC4;
        } finally {
            if (b0VarD != null && (c0VarM = b0VarD.m()) != null) {
                ih.d.m(c0VarM);
            }
        }
    }
}
