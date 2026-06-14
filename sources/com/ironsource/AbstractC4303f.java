package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4303f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f43062a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f43063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f43064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected T f43065d;

    /* JADX INFO: renamed from: com.ironsource.f$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4303f.this.b();
        }
    }

    public AbstractC4303f() {
    }

    protected boolean a() {
        return this.f43064c <= 0;
    }

    protected abstract void b();

    protected void c() {
        synchronized (this.f43062a) {
            try {
                Timer timer = this.f43063b;
                if (timer != null) {
                    timer.cancel();
                    this.f43063b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        this.f43065d = null;
    }

    protected void a(T t10) {
        if (a() || t10 == null) {
            return;
        }
        this.f43065d = t10;
        c();
        synchronized (this.f43062a) {
            Timer timer = new Timer();
            this.f43063b = timer;
            timer.schedule(new a(), this.f43064c);
        }
    }

    public AbstractC4303f(long j10) {
        this.f43064c = j10;
    }
}
