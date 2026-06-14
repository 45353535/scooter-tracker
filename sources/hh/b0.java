package hh;

import hh.t;
import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f73510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f73511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f73512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f73513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f73514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t f73515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f73516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b0 f73517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b0 f73518j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b0 f73519k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f73520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f73521m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mh.c f73522n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f73523o;

    public b0(z request, y protocol, String message, int i10, s sVar, t headers, c0 c0Var, b0 b0Var, b0 b0Var2, b0 b0Var3, long j10, long j11, mh.c cVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f73510b = request;
        this.f73511c = protocol;
        this.f73512d = message;
        this.f73513e = i10;
        this.f73514f = sVar;
        this.f73515g = headers;
        this.f73516h = c0Var;
        this.f73517i = b0Var;
        this.f73518j = b0Var2;
        this.f73519k = b0Var3;
        this.f73520l = j10;
        this.f73521m = j11;
        this.f73522n = cVar;
    }

    public static /* synthetic */ String M(b0 b0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return b0Var.z(str, str2);
    }

    public final t R() {
        return this.f73515g;
    }

    public final boolean U() {
        int i10 = this.f73513e;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final String V() {
        return this.f73512d;
    }

    public final b0 W() {
        return this.f73517i;
    }

    public final a b0() {
        return new a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c0 c0Var = this.f73516h;
        if (c0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        c0Var.close();
    }

    public final b0 e0() {
        return this.f73519k;
    }

    public final y i0() {
        return this.f73511c;
    }

    public final boolean isSuccessful() {
        int i10 = this.f73513e;
        return 200 <= i10 && i10 < 300;
    }

    public final c0 m() {
        return this.f73516h;
    }

    public final d n() {
        d dVar = this.f73523o;
        if (dVar != null) {
            return dVar;
        }
        d dVarB = d.f73576n.b(this.f73515g);
        this.f73523o = dVarB;
        return dVarB;
    }

    public final long n0() {
        return this.f73521m;
    }

    public final b0 o() {
        return this.f73518j;
    }

    public final List p() {
        String str;
        t tVar = this.f73515g;
        int i10 = this.f73513e;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return nh.e.a(tVar, str);
    }

    public final int q() {
        return this.f73513e;
    }

    public final z r0() {
        return this.f73510b;
    }

    public final mh.c s() {
        return this.f73522n;
    }

    public final long s0() {
        return this.f73520l;
    }

    public String toString() {
        return "Response{protocol=" + this.f73511c + ", code=" + this.f73513e + ", message=" + this.f73512d + ", url=" + this.f73510b.l() + '}';
    }

    public final s w() {
        return this.f73514f;
    }

    public final String y(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return M(this, name, null, 2, null);
    }

    public final String z(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = this.f73515g.a(name);
        return strA == null ? str : strA;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z f73524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y f73525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f73526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f73527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s f73528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t.a f73529f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c0 f73530g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private b0 f73531h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private b0 f73532i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private b0 f73533j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f73534k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f73535l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private mh.c f73536m;

        public a() {
            this.f73526c = -1;
            this.f73529f = new t.a();
        }

        private final void e(b0 b0Var) {
            if (b0Var != null && b0Var.m() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String str, b0 b0Var) {
            if (b0Var != null) {
                if (b0Var.m() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (b0Var.W() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (b0Var.o() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (b0Var.e0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f73529f.a(name, value);
            return this;
        }

        public a b(c0 c0Var) {
            this.f73530g = c0Var;
            return this;
        }

        public b0 c() {
            int i10 = this.f73526c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f73526c).toString());
            }
            z zVar = this.f73524a;
            if (zVar == null) {
                throw new IllegalStateException("request == null");
            }
            y yVar = this.f73525b;
            if (yVar == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f73527d;
            if (str != null) {
                return new b0(zVar, yVar, str, i10, this.f73528e, this.f73529f.e(), this.f73530g, this.f73531h, this.f73532i, this.f73533j, this.f73534k, this.f73535l, this.f73536m);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(b0 b0Var) {
            f("cacheResponse", b0Var);
            this.f73532i = b0Var;
            return this;
        }

        public a g(int i10) {
            this.f73526c = i10;
            return this;
        }

        public final int h() {
            return this.f73526c;
        }

        public a i(s sVar) {
            this.f73528e = sVar;
            return this;
        }

        public a j(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f73529f.i(name, value);
            return this;
        }

        public a k(t headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f73529f = headers.f();
            return this;
        }

        public final void l(mh.c deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f73536m = deferredTrailers;
        }

        public a m(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f73527d = message;
            return this;
        }

        public a n(b0 b0Var) {
            f("networkResponse", b0Var);
            this.f73531h = b0Var;
            return this;
        }

        public a o(b0 b0Var) {
            e(b0Var);
            this.f73533j = b0Var;
            return this;
        }

        public a p(y protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f73525b = protocol;
            return this;
        }

        public a q(long j10) {
            this.f73535l = j10;
            return this;
        }

        public a r(z request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f73524a = request;
            return this;
        }

        public a s(long j10) {
            this.f73534k = j10;
            return this;
        }

        public a(b0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f73526c = -1;
            this.f73524a = response.r0();
            this.f73525b = response.i0();
            this.f73526c = response.q();
            this.f73527d = response.V();
            this.f73528e = response.w();
            this.f73529f = response.R().f();
            this.f73530g = response.m();
            this.f73531h = response.W();
            this.f73532i = response.o();
            this.f73533j = response.e0();
            this.f73534k = response.s0();
            this.f73535l = response.n0();
            this.f73536m = response.s();
        }
    }
}
