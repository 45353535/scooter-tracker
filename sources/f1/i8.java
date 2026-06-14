package f1;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public class i8 {
    public long a() {
        return System.currentTimeMillis();
    }

    public long b() {
        return System.nanoTime();
    }

    public long c() {
        return SystemClock.uptimeMillis();
    }
}
