package io.sentry.android.core;

import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.impl.H2;
import io.sentry.android.core.AppState;
import io.sentry.g7;
import io.sentry.j4;
import io.sentry.k8;
import io.sentry.util.q;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
final class s1 implements AppState.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f82748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f82749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimerTask f82750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.q f82751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.util.a f82752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.b1 f82753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f82754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f82755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.transport.p f82756j;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (s1.this.f82754h) {
                s1.this.f82753g.f();
            }
            s1.this.f82753g.getOptions().getReplayController().stop();
            s1.this.f82753g.getOptions().getContinuousProfiler().b(false);
        }
    }

    s1(io.sentry.b1 b1Var, long j10, boolean z10, boolean z11) {
        this(b1Var, j10, z10, z11, io.sentry.transport.n.a());
    }

    public static /* synthetic */ void a(s1 s1Var, io.sentry.y0 y0Var) {
        k8 session;
        if (s1Var.f82748b.get() != 0 || (session = y0Var.getSession()) == null || session.k() == null) {
            return;
        }
        s1Var.f82748b.set(session.k().getTime());
    }

    public static /* synthetic */ Timer b() {
        return new Timer(true);
    }

    private void e(String str) {
        if (this.f82755i) {
            io.sentry.e eVar = new io.sentry.e();
            eVar.y(NotificationCompat.CATEGORY_NAVIGATION);
            eVar.v("state", str);
            eVar.u("app.lifecycle");
            eVar.w(g7.INFO);
            this.f82753g.e(eVar);
        }
    }

    private void f() {
        io.sentry.g1 g1VarD = this.f82752f.d();
        try {
            TimerTask timerTask = this.f82750d;
            if (timerTask != null) {
                timerTask.cancel();
                this.f82750d = null;
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void g() {
        io.sentry.g1 g1VarD = this.f82752f.d();
        try {
            f();
            this.f82750d = new a();
            ((Timer) this.f82751e.a()).schedule(this.f82750d, this.f82749c);
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void h() {
        f();
        long currentTimeMillis = this.f82756j.getCurrentTimeMillis();
        this.f82753g.x(new j4() { // from class: io.sentry.android.core.r1
            @Override // io.sentry.j4
            public final void a(io.sentry.y0 y0Var) {
                s1.a(this.f82741a, y0Var);
            }
        });
        long j10 = this.f82748b.get();
        if (j10 == 0 || j10 + this.f82749c <= currentTimeMillis) {
            if (this.f82754h) {
                this.f82753g.d();
            }
            this.f82753g.getOptions().getReplayController().start();
        }
        this.f82753g.getOptions().getReplayController().resume();
        this.f82748b.set(currentTimeMillis);
    }

    @Override // io.sentry.android.core.AppState.a
    public void m() {
        h();
        e("foreground");
    }

    @Override // io.sentry.android.core.AppState.a
    public void n() {
        this.f82748b.set(this.f82756j.getCurrentTimeMillis());
        this.f82753g.getOptions().getReplayController().pause();
        g();
        e(H2.f75840g);
    }

    s1(io.sentry.b1 b1Var, long j10, boolean z10, boolean z11, io.sentry.transport.p pVar) {
        this.f82748b = new AtomicLong(0L);
        this.f82751e = new io.sentry.util.q(new q.a() { // from class: io.sentry.android.core.q1
            @Override // io.sentry.util.q.a
            public final Object a() {
                return s1.b();
            }
        });
        this.f82752f = new io.sentry.util.a();
        this.f82749c = j10;
        this.f82754h = z10;
        this.f82755i = z11;
        this.f82753g = b1Var;
        this.f82756j = pVar;
    }
}
