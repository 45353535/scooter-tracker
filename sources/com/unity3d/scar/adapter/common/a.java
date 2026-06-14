package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f67920a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f67921b;

    private void d() {
        Runnable runnable;
        if (this.f67920a > 0 || (runnable = this.f67921b) == null) {
            return;
        }
        runnable.run();
    }

    public synchronized void a() {
        this.f67920a++;
    }

    public synchronized void b() {
        this.f67920a--;
        d();
    }

    public void c(Runnable runnable) {
        this.f67921b = runnable;
        d();
    }
}
