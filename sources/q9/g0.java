package q9;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes12.dex */
public class g0 implements h {
    protected g0() {
    }

    @Override // q9.h
    public q createHandler(Looper looper, Handler.Callback callback) {
        return new h0(new Handler(looper, callback));
    }

    @Override // q9.h
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // q9.h
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // q9.h
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // q9.h
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // q9.h
    public void onThreadBlocked() {
    }
}
