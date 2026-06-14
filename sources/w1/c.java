package w1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f106930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f106931b = new Handler(Looper.getMainLooper());

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(5), new a(), new b());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f106930a = threadPoolExecutor;
    }
}
