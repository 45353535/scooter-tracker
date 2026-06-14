package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5284n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5334p0 f77802a;

    public RunnableC5284n0(C5334p0 c5334p0) {
        this.f77802a = c5334p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5334p0 c5334p0 = this.f77802a;
        synchronized (c5334p0) {
            if (c5334p0.f77940a != null && c5334p0.a()) {
                try {
                    c5334p0.f77943d = null;
                    c5334p0.f77940a.unbindService(c5334p0.f77948i);
                } catch (Throwable unused) {
                }
            }
            c5334p0.f77943d = null;
        }
    }
}
