package com.ironsource;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4587vb implements InterfaceC4381ja {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f45649b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f45652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f45653f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45648a = "INTERNAL";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45650c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f45651d = null;

    /* JADX INFO: renamed from: com.ironsource.vb$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4587vb.this.f45653f.run();
        }
    }

    public C4587vb(long j10, Runnable runnable, boolean z10) {
        this.f45652e = j10;
        this.f45653f = runnable;
        if (z10) {
            g();
        }
    }

    private synchronized void f() {
        Timer timer = this.f45649b;
        if (timer != null) {
            timer.cancel();
            this.f45649b = null;
        }
    }

    private synchronized void h() {
        if (this.f45649b == null) {
            Timer timer = new Timer();
            this.f45649b = timer;
            timer.schedule(new a(), this.f45652e);
            Calendar.getInstance().setTimeInMillis(this.f45651d.longValue());
        }
    }

    @Override // com.ironsource.InterfaceC4381ja
    public void b() {
        Long l10;
        if (this.f45649b == null && (l10 = this.f45651d) != null) {
            long jLongValue = l10.longValue() - System.currentTimeMillis();
            this.f45652e = jLongValue;
            if (jLongValue > 0) {
                h();
            } else {
                e();
                this.f45653f.run();
            }
        }
    }

    @Override // com.ironsource.InterfaceC4381ja
    public void c() {
    }

    @Override // com.ironsource.InterfaceC4381ja
    public void d() {
    }

    public void e() {
        f();
        this.f45650c = false;
        this.f45651d = null;
        com.ironsource.lifecycle.b.d().b(this);
    }

    public void g() {
        if (this.f45650c) {
            return;
        }
        this.f45650c = true;
        com.ironsource.lifecycle.b.d().a(this);
        this.f45651d = Long.valueOf(System.currentTimeMillis() + this.f45652e);
        if (com.ironsource.lifecycle.b.d().e()) {
            return;
        }
        h();
    }

    @Override // com.ironsource.InterfaceC4381ja
    public void a() {
        if (this.f45649b != null) {
            f();
        }
    }
}
