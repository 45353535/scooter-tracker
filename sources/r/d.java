package r;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import r.a;
import r.b;
import vh.c0;
import vh.h;
import vh.l;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements r.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f99178e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f99179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f99180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f99181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r.b f99182d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.C1180b f99183a;

        public b(b.C1180b c1180b) {
            this.f99183a = c1180b;
        }

        @Override // r.a.b
        public void abort() {
            this.f99183a.a();
        }

        @Override // r.a.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            b.d dVarC = this.f99183a.c();
            if (dVarC != null) {
                return new c(dVarC);
            }
            return null;
        }

        @Override // r.a.b
        public c0 getData() {
            return this.f99183a.f(1);
        }

        @Override // r.a.b
        public c0 getMetadata() {
            return this.f99183a.f(0);
        }
    }

    private static final class c implements a.c, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b.d f99184b;

        public c(b.d dVar) {
            this.f99184b = dVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f99184b.close();
        }

        @Override // r.a.c
        public c0 getData() {
            return this.f99184b.n(1);
        }

        @Override // r.a.c
        public c0 getMetadata() {
            return this.f99184b.n(0);
        }

        @Override // r.a.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b J() {
            b.C1180b c1180bM = this.f99184b.m();
            if (c1180bM != null) {
                return new b(c1180bM);
            }
            return null;
        }
    }

    public d(long j10, c0 c0Var, l lVar, CoroutineDispatcher coroutineDispatcher) {
        this.f99179a = j10;
        this.f99180b = c0Var;
        this.f99181c = lVar;
        this.f99182d = new r.b(a(), c(), coroutineDispatcher, d(), 1, 2);
    }

    private final String e(String str) {
        return h.f106840e.d(str).J().r();
    }

    @Override // r.a
    public l a() {
        return this.f99181c;
    }

    @Override // r.a
    public a.b b(String str) {
        b.C1180b c1180bV = this.f99182d.V(e(str));
        if (c1180bV != null) {
            return new b(c1180bV);
        }
        return null;
    }

    public c0 c() {
        return this.f99180b;
    }

    public long d() {
        return this.f99179a;
    }

    @Override // r.a
    public a.c get(String str) {
        b.d dVarW = this.f99182d.W(e(str));
        if (dVarW != null) {
            return new c(dVarW);
        }
        return null;
    }
}
