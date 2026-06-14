package yads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class ma2 implements ja2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f113358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public la2 f113359c = la2.f113023b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public na2 f113360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j43 f113361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f113362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f113363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f113364h;

    public ma2(boolean z10, Handler handler) {
        this.f113357a = z10;
        this.f113358b = handler;
    }

    public final void a(long j10, na2 na2Var) {
        a();
        this.f113360d = na2Var;
        this.f113362f = j10;
        this.f113363g = j10;
        if (this.f113357a) {
            this.f113358b.post(new Runnable() { // from class: yads.fm
                @Override // java.lang.Runnable
                public final void run() {
                    ma2.a(this.f110783b);
                }
            });
        } else {
            c();
        }
    }

    public final void b() {
        if (la2.f113024c == this.f113359c) {
            this.f113359c = la2.f113025d;
            this.f113358b.removeCallbacksAndMessages(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f113364h;
            this.f113364h = jElapsedRealtime;
            long j11 = this.f113362f - j10;
            this.f113362f = j11;
            long jMax = (long) Math.max(0.0d, j11);
            j43 j43Var = this.f113361e;
            if (j43Var != null) {
                j43Var.a(jMax, this.f113363g - jMax);
            }
        }
    }

    public final void c() {
        this.f113359c = la2.f113024c;
        this.f113364h = SystemClock.elapsedRealtime();
        long jMin = (long) Math.min(200.0d, this.f113362f);
        if (jMin > 0) {
            this.f113358b.postDelayed(new ka2(this), jMin);
            return;
        }
        na2 na2Var = this.f113360d;
        if (na2Var != null) {
            na2Var.a();
        }
        a();
    }

    public final void d() {
        if (la2.f113025d == this.f113359c) {
            c();
        }
    }

    public static final void a(ma2 ma2Var) {
        ma2Var.c();
    }

    public final void a() {
        la2 la2Var = la2.f113023b;
        if (la2Var == this.f113359c) {
            return;
        }
        this.f113359c = la2Var;
        this.f113360d = null;
        this.f113358b.removeCallbacksAndMessages(null);
    }
}
