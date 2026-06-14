package q9;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes12.dex */
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f98789a = new g0();

    q createHandler(Looper looper, Handler.Callback callback);

    long currentTimeMillis();

    long elapsedRealtime();

    long nanoTime();

    void onThreadBlocked();

    long uptimeMillis();
}
