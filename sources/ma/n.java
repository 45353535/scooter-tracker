package ma;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.a;
import io.bidmachine.media3.exoplayer.i2;
import j$.util.Objects;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import ma.g0;
import ma.n;
import n9.c0;
import n9.j0;
import n9.k0;
import n9.l0;
import n9.m0;
import q9.i0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements m0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Executor f94625y = new Executor() { // from class: ma.l
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            n.a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f94626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f94627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0.a f94628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray f94629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f94630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j0 f94631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g0 f94632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g0.b f94633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q9.h f94634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArraySet f94635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f94636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private io.bidmachine.media3.common.a f94637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q9.q f94638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f94639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Pair f94640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f94641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f94642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private i2.a f94643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f94644s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f94645t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f94646u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f94647v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f94648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f94649x;

    class a implements g0.b {
        a() {
        }

        @Override // ma.g0.b
        public void a() {
            n.w(n.this);
            androidx.privacysandbox.ads.adservices.topics.a.a(q9.a.i(null));
            throw null;
        }

        @Override // ma.g0.b
        public void b(long j10) {
            n.w(n.this);
            androidx.privacysandbox.ads.adservices.topics.a.a(q9.a.i(null));
            throw null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f94651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f94652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l0.a f94653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c0.a f94654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f94655e = ImmutableList.of();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private j0 f94656f = j0.f95414a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private q9.h f94657g = q9.h.f98789a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f94658h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f94659i;

        public b(Context context, s sVar) {
            this.f94651a = context.getApplicationContext();
            this.f94652b = sVar;
        }

        public n h() {
            q9.a.g(!this.f94659i);
            a aVar = null;
            if (this.f94654d == null) {
                if (this.f94653c == null) {
                    this.f94653c = new e(aVar);
                }
                this.f94654d = new f(this.f94653c);
            }
            n nVar = new n(this, aVar);
            this.f94659i = true;
            return nVar;
        }

        public b i(q9.h hVar) {
            this.f94657g = hVar;
            return this;
        }
    }

    private final class c implements g0, d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f94660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f94661b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private io.bidmachine.media3.common.a f94663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f94664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f94665f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f94669j;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImmutableList f94662c = ImmutableList.of();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f94666g = -9223372036854775807L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private g0.a f94667h = g0.a.f94558a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Executor f94668i = n.f94625y;

        public c(Context context, int i10) {
            this.f94661b = i10;
            this.f94660a = o0.f0(context);
        }

        private void m(io.bidmachine.media3.common.a aVar) {
            aVar.b().T(n.A(aVar.C)).N();
            androidx.privacysandbox.ads.adservices.topics.a.a(q9.a.i(null));
            throw null;
        }

        private void n(List list) {
            if (n.this.f94628c.b()) {
                this.f94662c = ImmutableList.copyOf((Collection) list);
            } else {
                this.f94662c = new ImmutableList.Builder().addAll((Iterable) list).addAll((Iterable) n.this.f94630e).build();
            }
        }

        @Override // ma.g0
        public void a() {
            n.this.f94645t = this.f94666g;
            if (n.this.f94644s >= n.this.f94645t) {
                n.this.f94632g.a();
                n.this.f94646u = true;
            }
        }

        @Override // ma.g0
        public void b(int i10, io.bidmachine.media3.common.a aVar, List list) {
            q9.a.g(isInitialized());
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i10);
            }
            n(list);
            this.f94664e = i10;
            this.f94663d = aVar;
            n.this.f94645t = -9223372036854775807L;
            n.this.f94646u = false;
            m(aVar);
        }

        @Override // ma.g0
        public boolean c(long j10, boolean z10, g0.b bVar) {
            q9.a.g(isInitialized());
            if (!n.this.O()) {
                return false;
            }
            androidx.privacysandbox.ads.adservices.topics.a.a(q9.a.i(null));
            throw null;
        }

        @Override // ma.g0
        public void clearOutputSurfaceInfo() {
            n.this.y();
        }

        @Override // ma.g0
        public boolean d(io.bidmachine.media3.common.a aVar) throws g0.c {
            q9.a.g(!isInitialized());
            n.e(n.this, aVar, this.f94661b);
            return false;
        }

        @Override // ma.g0
        public void e(Surface surface, q9.f0 f0Var) {
            n.this.K(surface, f0Var);
        }

        @Override // ma.g0
        public void enableMayRenderStartOfStream() {
            n.this.f94632g.enableMayRenderStartOfStream();
        }

        @Override // ma.g0
        public void f(int i10) {
            n.this.f94632g.f(i10);
        }

        @Override // ma.g0
        public void flush(boolean z10) {
            if (isInitialized()) {
                throw null;
            }
            this.f94666g = -9223372036854775807L;
            n.this.z(z10);
            this.f94669j = false;
        }

        @Override // ma.g0
        public void g(i2.a aVar) {
            n.this.f94643r = aVar;
        }

        @Override // ma.g0
        public Surface getInputSurface() {
            q9.a.g(isInitialized());
            androidx.privacysandbox.ads.adservices.topics.a.a(q9.a.i(null));
            throw null;
        }

        @Override // ma.g0
        public void h(r rVar) {
            n.this.N(rVar);
        }

        @Override // ma.g0
        public void i(long j10, long j11) {
            i0 i0Var = n.this.f94627b;
            long j12 = this.f94666g;
            i0Var.a(j12 == -9223372036854775807L ? 0L : j12 + 1, Long.valueOf(j10));
            this.f94665f = j11;
            n.this.J(j11);
        }

        @Override // ma.g0
        public boolean isEnded() {
            return isInitialized() && n.this.C();
        }

        @Override // ma.g0
        public boolean isInitialized() {
            return false;
        }

        @Override // ma.g0
        public void j(g0.a aVar, Executor executor) {
            this.f94667h = aVar;
            this.f94668i = executor;
        }

        @Override // ma.g0
        public boolean k(boolean z10) {
            return n.this.E(z10 && isInitialized());
        }

        @Override // ma.g0
        public void l(boolean z10) {
            n.this.f94632g.l(z10);
        }

        @Override // ma.g0
        public void onRendererDisabled() {
            n.this.f94632g.onRendererDisabled();
        }

        @Override // ma.g0
        public void onRendererEnabled(boolean z10) {
            n.this.f94632g.onRendererEnabled(z10);
        }

        @Override // ma.g0
        public void onRendererStarted() {
            n.this.f94632g.onRendererStarted();
        }

        @Override // ma.g0
        public void onRendererStopped() {
            n.this.f94632g.onRendererStopped();
        }

        @Override // ma.g0
        public void release() {
            n.this.H();
        }

        @Override // ma.g0
        public void render(long j10, long j11) {
            n.this.I(j10, j11);
        }

        @Override // ma.g0
        public void setPlaybackSpeed(float f10) {
            n.this.L(f10);
        }

        @Override // ma.g0
        public void setVideoEffects(List list) {
            if (this.f94662c.equals(list)) {
                return;
            }
            n(list);
            io.bidmachine.media3.common.a aVar = this.f94663d;
            if (aVar != null) {
                m(aVar);
            }
        }
    }

    public interface d {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e implements l0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Supplier f94671a = Suppliers.memoize(new Supplier() { // from class: ma.o
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return n.e.a();
            }
        });

        private e() {
        }

        public static /* synthetic */ l0.a a() {
            try {
                Class<?> cls = Class.forName("io.bidmachine.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (l0.a) q9.a.e(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    private static final class f implements c0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l0.a f94672a;

        public f(l0.a aVar) {
            this.f94672a = aVar;
        }

        @Override // n9.c0.a
        public n9.c0 a(Context context, n9.g gVar, n9.j jVar, m0 m0Var, Executor executor, j0 j0Var, List list, long j10) throws k0 {
            try {
                ((c0.a) Class.forName("io.bidmachine.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(l0.a.class).newInstance(this.f94672a)).a(context, gVar, jVar, m0Var, executor, j0Var, list, j10);
                return null;
            } catch (Exception e10) {
                throw k0.a(e10);
            }
        }

        @Override // n9.c0.a
        public boolean b() {
            return false;
        }
    }

    /* synthetic */ n(b bVar, a aVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n9.g A(n9.g gVar) {
        return (gVar == null || !gVar.g()) ? n9.g.f95299h : gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        return this.f94641p == 0 && this.f94646u && this.f94632g.isEnded();
    }

    private boolean D() {
        return this.f94642q == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E(boolean z10) {
        return this.f94632g.k(z10 && this.f94641p == 0);
    }

    private l0 G(io.bidmachine.media3.common.a aVar, int i10) throws g0.c {
        if (i10 != 0) {
            if (!D()) {
                return null;
            }
            try {
                androidx.privacysandbox.ads.adservices.topics.a.a(q9.a.e(null));
                throw null;
            } catch (k0 e10) {
                throw new g0.c(e10, aVar);
            }
        }
        q9.a.g(this.f94642q == 0);
        n9.g gVarA = A(aVar.C);
        if (this.f94636k) {
            gVarA = n9.g.f95299h;
        } else if (gVarA.f95309c == 7 && o0.f98837a < 34) {
            gVarA = gVarA.a().e(6).a();
        }
        n9.g gVar = gVarA;
        final q9.q qVarCreateHandler = this.f94634i.createHandler((Looper) q9.a.i(Looper.myLooper()), null);
        this.f94638m = qVarCreateHandler;
        try {
            c0.a aVar2 = this.f94628c;
            Context context = this.f94626a;
            n9.j jVar = n9.j.f95413a;
            Objects.requireNonNull(qVarCreateHandler);
            aVar2.a(context, gVar, jVar, this, new Executor() { // from class: ma.k
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    qVarCreateHandler.post(runnable);
                }
            }, this.f94631f, this.f94630e, 0L);
            throw null;
        } catch (k0 e11) {
            throw new g0.c(e11, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(long j10, long j11) {
        this.f94632g.render(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(long j10) {
        this.f94647v = j10;
        this.f94632g.i(this.f94639n, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(float f10) {
        this.f94632g.setPlaybackSpeed(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(r rVar) {
        this.f94632g.h(rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O() {
        int i10 = this.f94648w;
        return i10 != -1 && i10 == this.f94649x;
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    public static /* synthetic */ void b(n nVar) {
        nVar.f94641p--;
    }

    static /* synthetic */ l0 e(n nVar, io.bidmachine.media3.common.a aVar, int i10) throws g0.c {
        nVar.G(aVar, i10);
        return null;
    }

    static /* synthetic */ n9.c0 w(n nVar) {
        nVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(boolean z10) {
        if (D()) {
            this.f94641p++;
            this.f94632g.flush(z10);
            while (this.f94627b.l() > 1) {
                this.f94627b.i();
            }
            if (this.f94627b.l() == 1) {
                this.f94632g.i(((Long) q9.a.e((Long) this.f94627b.i())).longValue(), this.f94647v);
            }
            this.f94644s = -9223372036854775807L;
            this.f94645t = -9223372036854775807L;
            this.f94646u = false;
            ((q9.q) q9.a.i(this.f94638m)).post(new Runnable() { // from class: ma.m
                @Override // java.lang.Runnable
                public final void run() {
                    n.b(this.f94624b);
                }
            });
        }
    }

    public g0 B(int i10) {
        q9.a.g(!o0.r(this.f94629d, i10));
        c cVar = new c(this.f94626a, i10);
        x(cVar);
        this.f94629d.put(i10, cVar);
        return cVar;
    }

    public void H() {
        if (this.f94642q == 2) {
            return;
        }
        q9.q qVar = this.f94638m;
        if (qVar != null) {
            qVar.removeCallbacksAndMessages(null);
        }
        this.f94640o = null;
        this.f94642q = 2;
    }

    public void K(Surface surface, q9.f0 f0Var) {
        Pair pair = this.f94640o;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((q9.f0) this.f94640o.second).equals(f0Var)) {
            return;
        }
        this.f94640o = Pair.create(surface, f0Var);
        F(surface, f0Var.b(), f0Var.a());
    }

    public void M(int i10) {
        this.f94648w = i10;
    }

    public void x(d dVar) {
        this.f94635j.add(dVar);
    }

    public void y() {
        q9.f0 f0Var = q9.f0.f98785c;
        F(null, f0Var.b(), f0Var.a());
        this.f94640o = null;
    }

    private n(b bVar) {
        this.f94626a = bVar.f94651a;
        this.f94627b = new i0();
        this.f94628c = (c0.a) q9.a.i(bVar.f94654d);
        this.f94629d = new SparseArray();
        this.f94630e = bVar.f94655e;
        this.f94631f = bVar.f94656f;
        q9.h hVar = bVar.f94657g;
        this.f94634i = hVar;
        this.f94632g = new ma.d(bVar.f94652b, hVar);
        this.f94633h = new a();
        this.f94635j = new CopyOnWriteArraySet();
        this.f94636k = bVar.f94658h;
        this.f94637l = new a.b().N();
        this.f94644s = -9223372036854775807L;
        this.f94645t = -9223372036854775807L;
        this.f94648w = -1;
        this.f94642q = 0;
    }

    private void F(Surface surface, int i10, int i11) {
    }
}
