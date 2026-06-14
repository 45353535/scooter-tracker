package com.mbridge.msdk.foundation.same.threadpool;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ThreadPoolExecutor f48903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadPoolExecutor f48904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f48905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ThreadPoolExecutor f48906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ThreadPoolExecutor f48907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ThreadPoolExecutor f48908f;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.threadpool.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0521a implements ThreadFactory {
        ThreadFactoryC0521a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("BitmapThreadPool");
            return threadNewThread;
        }
    }

    class b implements ThreadFactory {
        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("CommonThreadPool");
            return threadNewThread;
        }
    }

    class c implements ThreadFactory {
        c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("NwtThreadPool");
            return threadNewThread;
        }
    }

    class d implements ThreadFactory {
        d() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("ReportThreadPool");
            return threadNewThread;
        }
    }

    class e implements ThreadFactory {
        e() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("rv-load-tread");
            return thread;
        }
    }

    private static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
        }
    }

    public static ThreadPoolExecutor a() {
        if (f48904b == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10), new ThreadFactoryC0521a(), new ThreadPoolExecutor.DiscardPolicy());
            f48904b = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f48904b;
    }

    public static ThreadPoolExecutor b() {
        if (f48903a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 25, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new b(), new ThreadPoolExecutor.DiscardPolicy());
            f48903a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f48903a;
    }

    public static Handler c() {
        if (f48905c == null) {
            f48905c = new f();
        }
        return f48905c;
    }

    public static ThreadPoolExecutor d() {
        if (f48906d == null) {
            f48906d = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new c(), new ThreadPoolExecutor.DiscardPolicy());
        }
        return f48906d;
    }

    public static ThreadPoolExecutor e() {
        if (f48907e == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new d(), new ThreadPoolExecutor.DiscardPolicy());
            f48907e = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f48907e;
    }

    public static ThreadPoolExecutor f() {
        if (f48908f == null) {
            e eVar = new e();
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors * 2, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(30), eVar, new ThreadPoolExecutor.DiscardPolicy());
            f48908f = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f48908f;
    }
}
