package kd;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements e {
    private void a(Runnable runnable, boolean z10) {
        try {
            if (runnable instanceof jd.a) {
                ((jd.a) runnable).a(z10);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // kd.e
    public void cancel(Runnable runnable) {
        a(runnable, true);
    }

    @Override // kd.e
    public void execute(Runnable runnable) {
        a(runnable, false);
    }

    @Override // kd.e
    public /* synthetic */ void schedule(Runnable runnable, long j10) {
        d.a(this, runnable, j10);
    }

    @Override // kd.e
    public void schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        a(runnable, false);
    }
}
