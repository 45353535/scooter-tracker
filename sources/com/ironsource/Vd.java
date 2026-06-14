package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes8.dex */
public class Vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4460o2 f41907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Wd f41908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Timer f41909c = null;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Vd.this.f41908b.b();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Vd.this.f41908b.b();
        }
    }

    public Vd(C4460o2 c4460o2, Wd wd2) {
        this.f41907a = c4460o2;
        this.f41908b = wd2;
    }

    private void d() {
        Timer timer = this.f41909c;
        if (timer != null) {
            timer.cancel();
            this.f41909c = null;
        }
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.f41908b.b();
    }

    public synchronized void c() {
        d();
        Timer timer = new Timer();
        this.f41909c = timer;
        timer.schedule(new a(), this.f41907a.j());
    }

    public synchronized void a() {
        d();
        Timer timer = new Timer();
        this.f41909c = timer;
        timer.schedule(new b(), this.f41907a.b());
    }
}
