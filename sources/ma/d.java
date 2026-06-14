package ma;

import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.common.MimeTypes;
import io.bidmachine.media3.common.a;
import io.bidmachine.media3.exoplayer.i2;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import ma.d;
import ma.g0;
import ma.u;
import n9.n0;

/* JADX INFO: loaded from: classes12.dex */
final class d implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f94535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.h f94536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f94537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f94538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f94539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private io.bidmachine.media3.common.a f94540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f94541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f94542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g0.a f94543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Executor f94544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private r f94545k;

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.bidmachine.media3.common.a f94546a;

        private b() {
        }

        @Override // ma.u.a
        public void a(final n0 n0Var) {
            this.f94546a = new a.b().B0(n0Var.f95436a).d0(n0Var.f95437b).u0(MimeTypes.VIDEO_RAW).N();
            d.this.f94544j.execute(new Runnable() { // from class: ma.e
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar = this.f94550b;
                    d.this.f94543i.b(d.this, n0Var);
                }
            });
        }

        @Override // ma.u.a
        public void b(long j10, long j11, boolean z10) {
            if (z10 && d.this.f94539e != null) {
                d.this.f94544j.execute(new Runnable() { // from class: ma.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.b bVar = this.f94554b;
                        d.this.f94543i.a(d.this);
                    }
                });
            }
            io.bidmachine.media3.common.a aVarN = this.f94546a;
            if (aVarN == null) {
                aVarN = new a.b().N();
            }
            d.this.f94545k.a(j11, d.this.f94536b.nanoTime(), aVarN, null);
            ((g0.b) d.this.f94538d.remove()).b(j10);
        }

        @Override // ma.u.a
        public void dropFrame() {
            d.this.f94544j.execute(new Runnable() { // from class: ma.g
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar = this.f94557b;
                    d.this.f94543i.c(d.this);
                }
            });
            ((g0.b) d.this.f94538d.remove()).a();
        }
    }

    public d(s sVar, q9.h hVar) {
        this.f94535a = sVar;
        sVar.o(hVar);
        this.f94536b = hVar;
        this.f94537c = new u(new b(), sVar);
        this.f94538d = new ArrayDeque();
        this.f94540f = new a.b().N();
        this.f94541g = -9223372036854775807L;
        this.f94543i = g0.a.f94558a;
        this.f94544j = new Executor() { // from class: ma.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                d.n(runnable);
            }
        };
        this.f94545k = new r() { // from class: ma.c
            @Override // ma.r
            public final void a(long j10, long j11, io.bidmachine.media3.common.a aVar, MediaFormat mediaFormat) {
                d.m(j10, j11, aVar, mediaFormat);
            }
        };
    }

    public static /* synthetic */ void m(long j10, long j11, io.bidmachine.media3.common.a aVar, MediaFormat mediaFormat) {
    }

    public static /* synthetic */ void n(Runnable runnable) {
    }

    @Override // ma.g0
    public void a() {
        this.f94537c.l();
    }

    @Override // ma.g0
    public void b(int i10, io.bidmachine.media3.common.a aVar, List list) {
        q9.a.g(list.isEmpty());
        int i11 = aVar.f80568v;
        io.bidmachine.media3.common.a aVar2 = this.f94540f;
        if (i11 != aVar2.f80568v || aVar.f80569w != aVar2.f80569w) {
            this.f94537c.i(i11, aVar.f80569w);
        }
        float f10 = aVar.f80570x;
        if (f10 != this.f94540f.f80570x) {
            this.f94535a.p(f10);
        }
        this.f94540f = aVar;
    }

    @Override // ma.g0
    public boolean c(long j10, boolean z10, g0.b bVar) {
        this.f94538d.add(bVar);
        this.f94537c.g(j10 - this.f94542h);
        return true;
    }

    @Override // ma.g0
    public void clearOutputSurfaceInfo() {
        this.f94539e = null;
        this.f94535a.q(null);
    }

    @Override // ma.g0
    public boolean d(io.bidmachine.media3.common.a aVar) {
        return true;
    }

    @Override // ma.g0
    public void e(Surface surface, q9.f0 f0Var) {
        this.f94539e = surface;
        this.f94535a.q(surface);
    }

    @Override // ma.g0
    public void enableMayRenderStartOfStream() {
        this.f94535a.a();
    }

    @Override // ma.g0
    public void f(int i10) {
        this.f94535a.n(i10);
    }

    @Override // ma.g0
    public void flush(boolean z10) {
        if (z10) {
            this.f94535a.m();
        }
        this.f94537c.b();
        this.f94538d.clear();
    }

    @Override // ma.g0
    public void g(i2.a aVar) {
        throw new UnsupportedOperationException();
    }

    @Override // ma.g0
    public Surface getInputSurface() {
        return (Surface) q9.a.i(this.f94539e);
    }

    @Override // ma.g0
    public void h(r rVar) {
        this.f94545k = rVar;
    }

    @Override // ma.g0
    public void i(long j10, long j11) {
        if (j10 != this.f94541g) {
            this.f94537c.h(j10);
            this.f94541g = j10;
        }
        this.f94542h = j11;
    }

    @Override // ma.g0
    public boolean isEnded() {
        return this.f94537c.d();
    }

    @Override // ma.g0
    public boolean isInitialized() {
        return true;
    }

    @Override // ma.g0
    public void j(g0.a aVar, Executor executor) {
        this.f94543i = aVar;
        this.f94544j = executor;
    }

    @Override // ma.g0
    public boolean k(boolean z10) {
        return this.f94535a.d(z10);
    }

    @Override // ma.g0
    public void l(boolean z10) {
        this.f94535a.e(z10);
    }

    @Override // ma.g0
    public void onRendererDisabled() {
        this.f94535a.g();
    }

    @Override // ma.g0
    public void onRendererEnabled(boolean z10) {
        this.f94535a.h(z10);
    }

    @Override // ma.g0
    public void onRendererStarted() {
        this.f94535a.k();
    }

    @Override // ma.g0
    public void onRendererStopped() {
        this.f94535a.l();
    }

    @Override // ma.g0
    public void render(long j10, long j11) throws g0.c {
        try {
            this.f94537c.j(j10, j11);
        } catch (io.bidmachine.media3.exoplayer.s e10) {
            throw new g0.c(e10, this.f94540f);
        }
    }

    @Override // ma.g0
    public void setPlaybackSpeed(float f10) {
        this.f94535a.r(f10);
    }

    @Override // ma.g0
    public void setVideoEffects(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // ma.g0
    public void release() {
    }
}
