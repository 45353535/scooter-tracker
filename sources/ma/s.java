package ma;

import android.content.Context;
import android.view.Surface;
import com.unity3d.services.core.di.ServiceProvider;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f94689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f94690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f94691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f94692d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f94695g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f94698j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f94701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f94702n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f94693e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f94694f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f94696h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f94697i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f94699k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q9.h f94700l = q9.h.f98789a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f94703a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f94704b = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f94703a = -9223372036854775807L;
            this.f94704b = -9223372036854775807L;
        }

        public long f() {
            return this.f94703a;
        }

        public long g() {
            return this.f94704b;
        }
    }

    public interface b {
        boolean shouldDropFrame(long j10, long j11, boolean z10);

        boolean shouldForceReleaseFrame(long j10, long j11);

        boolean shouldIgnoreFrame(long j10, long j11, long j12, boolean z10, boolean z11);
    }

    public s(Context context, b bVar, long j10) {
        this.f94689a = bVar;
        this.f94691c = j10;
        this.f94690b = new t(context);
    }

    private long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / ((double) this.f94699k));
        return this.f94692d ? j13 - (o0.P0(this.f94700l.elapsedRealtime()) - j11) : j13;
    }

    private void f(int i10) {
        this.f94693e = Math.min(this.f94693e, i10);
    }

    private boolean s(long j10, long j11, long j12) {
        if (this.f94697i != -9223372036854775807L && !this.f94698j) {
            return false;
        }
        int i10 = this.f94693e;
        if (i10 == 0) {
            return this.f94692d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 == 3) {
            return this.f94692d && this.f94689a.shouldForceReleaseFrame(j11, o0.P0(this.f94700l.elapsedRealtime()) - this.f94695g);
        }
        throw new IllegalStateException();
    }

    public void a() {
        if (this.f94693e == 0) {
            this.f94693e = 1;
        }
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, boolean z11, a aVar) {
        aVar.h();
        if (this.f94694f == -9223372036854775807L) {
            this.f94694f = j11;
        }
        if (this.f94696h != j10) {
            this.f94690b.h(j10);
            this.f94696h = j10;
        }
        aVar.f94703a = b(j11, j12, j10);
        if (z10 && !z11) {
            return 3;
        }
        if (!this.f94701m) {
            this.f94702n = true;
            if (this.f94689a.shouldIgnoreFrame(aVar.f94703a, j11, j12, z11, true)) {
                return 4;
            }
            return (!this.f94692d || aVar.f94703a >= 30000) ? 5 : 3;
        }
        if (s(j11, aVar.f94703a, j13)) {
            return 0;
        }
        if (!this.f94692d || j11 == this.f94694f) {
            return 5;
        }
        long jNanoTime = this.f94700l.nanoTime();
        aVar.f94704b = this.f94690b.b((aVar.f94703a * 1000) + jNanoTime);
        aVar.f94703a = (aVar.f94704b - jNanoTime) / 1000;
        boolean z12 = (this.f94697i == -9223372036854775807L || this.f94698j) ? false : true;
        if (this.f94689a.shouldIgnoreFrame(aVar.f94703a, j11, j12, z11, z12)) {
            return 4;
        }
        return this.f94689a.shouldDropFrame(aVar.f94703a, j12, z11) ? z12 ? 3 : 2 : aVar.f94703a > ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT ? 5 : 1;
    }

    public boolean d(boolean z10) {
        if (z10 && (this.f94693e == 3 || (!this.f94701m && this.f94702n))) {
            this.f94697i = -9223372036854775807L;
            return true;
        }
        if (this.f94697i == -9223372036854775807L) {
            return false;
        }
        if (this.f94700l.elapsedRealtime() < this.f94697i) {
            return true;
        }
        this.f94697i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z10) {
        this.f94698j = z10;
        this.f94697i = this.f94691c > 0 ? this.f94700l.elapsedRealtime() + this.f94691c : -9223372036854775807L;
    }

    public void g() {
        f(0);
    }

    public void h(boolean z10) {
        this.f94693e = z10 ? 1 : 0;
    }

    public boolean i() {
        boolean z10 = this.f94693e != 3;
        this.f94693e = 3;
        this.f94695g = o0.P0(this.f94700l.elapsedRealtime());
        return z10;
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.f94692d = true;
        this.f94695g = o0.P0(this.f94700l.elapsedRealtime());
        this.f94690b.k();
    }

    public void l() {
        this.f94692d = false;
        this.f94697i = -9223372036854775807L;
        this.f94690b.l();
    }

    public void m() {
        this.f94690b.j();
        this.f94696h = -9223372036854775807L;
        this.f94694f = -9223372036854775807L;
        f(1);
        this.f94697i = -9223372036854775807L;
    }

    public void n(int i10) {
        this.f94690b.o(i10);
    }

    public void o(q9.h hVar) {
        this.f94700l = hVar;
    }

    public void p(float f10) {
        this.f94690b.g(f10);
    }

    public void q(Surface surface) {
        this.f94701m = surface != null;
        this.f94702n = false;
        this.f94690b.m(surface);
        f(1);
    }

    public void r(float f10) {
        q9.a.a(f10 > 0.0f);
        if (f10 == this.f94699k) {
            return;
        }
        this.f94699k = f10;
        this.f94690b.i(f10);
    }
}
