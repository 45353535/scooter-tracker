package kd;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends a {
    protected abstract Handler b();

    protected boolean c() {
        return Looper.myLooper() == b().getLooper();
    }

    @Override // kd.a, kd.e
    public void cancel(Runnable runnable) {
        super.cancel(runnable);
        b().removeCallbacks(runnable);
    }

    @Override // kd.a, kd.e
    public void execute(Runnable runnable) {
        super.execute(runnable);
        if (c()) {
            runnable.run();
        } else {
            b().post(runnable);
        }
    }

    @Override // kd.a, kd.e
    public void schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        super.schedule(runnable, j10, timeUnit);
        b().postDelayed(runnable, timeUnit.toMillis(j10));
    }
}
