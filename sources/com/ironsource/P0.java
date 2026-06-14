package com.ironsource;

import com.ironsource.N0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N0 f41527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Db f41528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4570ub f41529c = c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Timer f41530d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P0.this.f41528b.b();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            P0.this.f41528b.b();
        }
    }

    public P0(N0 n02, @NotNull Db db2) {
        this.f41527a = n02;
        this.f41528b = db2;
    }

    private synchronized void b(long j10) {
        j();
        Timer timer = new Timer();
        this.f41530d = timer;
        timer.schedule(new b(), j10);
    }

    private C4570ub c() {
        return new C4570ub(new a(), com.ironsource.lifecycle.b.d(), new Mf());
    }

    private synchronized void j() {
        Timer timer = this.f41530d;
        if (timer != null) {
            timer.cancel();
            this.f41530d = null;
        }
    }

    protected boolean d() {
        return this.f41527a.c() > 0;
    }

    public void e() {
        if (this.f41527a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.f41527a.c());
        }
    }

    public void f() {
        if (this.f41527a.a() == N0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.f41527a.d());
        }
    }

    public void g() {
        if (this.f41527a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f41527a.a() != N0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f41527a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.f41527a.d());
    }

    protected void i() {
        C4570ub c4570ub = this.f41529c;
        if (c4570ub != null) {
            c4570ub.b();
        }
    }

    public void k() {
        if (this.f41527a.a() != N0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f41527a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f41527a.b());
    }

    public void a() {
        if (this.f41527a.a() == N0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    protected N0 b() {
        return this.f41527a;
    }

    protected void a(long j10) {
        C4570ub c4570ub = this.f41529c;
        if (c4570ub != null) {
            c4570ub.a(j10);
        }
    }
}
