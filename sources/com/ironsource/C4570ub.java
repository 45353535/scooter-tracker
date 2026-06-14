package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4570ub {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f45545g = "ub";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.ironsource.lifecycle.b f45546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f45547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Mf f45548c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f45550e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f45549d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4381ja f45551f = new a();

    /* JADX INFO: renamed from: com.ironsource.ub$a */
    class a implements InterfaceC4381ja {
        a() {
        }

        @Override // com.ironsource.InterfaceC4381ja
        public void a() {
            C4570ub.this.f45548c.c(System.currentTimeMillis());
            C4570ub.this.c();
        }

        @Override // com.ironsource.InterfaceC4381ja
        public void b() {
            C4570ub.this.f45548c.b(System.currentTimeMillis());
            C4570ub c4570ub = C4570ub.this;
            c4570ub.b(c4570ub.f45548c.a());
        }

        @Override // com.ironsource.InterfaceC4381ja
        public void c() {
        }

        @Override // com.ironsource.InterfaceC4381ja
        public void d() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ub$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4570ub c4570ub = C4570ub.this;
            c4570ub.f45546a.b(c4570ub.f45551f);
            C4570ub.this.f45548c.b();
            C4570ub.this.f45547b.run();
        }
    }

    public C4570ub(Runnable runnable, com.ironsource.lifecycle.b bVar, Mf mf2) {
        this.f45547b = runnable;
        this.f45546a = bVar;
        this.f45548c = mf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f45549d) {
            try {
                Timer timer = this.f45550e;
                if (timer != null) {
                    timer.cancel();
                    this.f45550e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void b() {
        c();
        this.f45546a.b(this.f45551f);
        this.f45548c.b();
    }

    public void a(long j10) {
        if (j10 < 0) {
            Log.d(f45545g, "cannot start timer with delay < 0");
            return;
        }
        this.f45546a.a(this.f45551f);
        this.f45548c.a(j10);
        if (this.f45546a.e()) {
            this.f45548c.c(System.currentTimeMillis());
        } else {
            b(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j10) {
        synchronized (this.f45549d) {
            c();
            Timer timer = new Timer();
            this.f45550e = timer;
            timer.schedule(new b(), j10);
        }
    }
}
