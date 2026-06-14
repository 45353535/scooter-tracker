package com.my.tracker.obfuscated;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Handler f61885a = m.f61657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicBoolean f61886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Runnable f61887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f61888d;

    private w2(long j10, final Runnable runnable) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f61886b = atomicBoolean;
        this.f61888d = j10;
        this.f61887c = new Runnable() { // from class: com.my.tracker.obfuscated.f7
            @Override // java.lang.Runnable
            public final void run() {
                this.f61515b.a(runnable);
            }
        };
        atomicBoolean.set(false);
    }

    private void c() {
        this.f61885a.removeCallbacks(this.f61887c);
        this.f61886b.set(true);
        this.f61885a.postDelayed(this.f61887c, this.f61888d);
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f61886b) {
            z10 = !this.f61886b.get();
        }
        return z10;
    }

    public void d() {
        synchronized (this.f61886b) {
            try {
                if (a()) {
                    c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f61886b) {
            try {
                if (this.f61886b.get()) {
                    return;
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f() {
        synchronized (this.f61886b) {
            this.f61886b.set(false);
            this.f61885a.removeCallbacks(this.f61887c);
        }
    }

    public static w2 a(long j10, Runnable runnable) {
        return new w2(j10, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        synchronized (this.f61886b) {
            try {
                if (this.f61886b.get()) {
                    c();
                    runnable.run();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f61886b) {
            z10 = !b();
        }
        return z10;
    }
}
