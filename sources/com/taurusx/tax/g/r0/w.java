package com.taurusx.tax.g.r0;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.taurusx.tax.g.r;
import com.taurusx.tax.log.LogUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Executor f66341w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static Handler f66342y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static Executor f66343z;

    /* JADX INFO: renamed from: com.taurusx.tax.g.r0.w$w, reason: collision with other inner class name */
    public class RunnableC0806w implements Runnable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Object[] f66344w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ AsyncTask f66345z;

        public RunnableC0806w(AsyncTask asyncTask, Object[] objArr) {
            this.f66345z = asyncTask;
            this.f66344w = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f66345z.executeOnExecutor(w.f66341w, this.f66344w);
        }
    }

    public class z implements Runnable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Object[] f66346w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ AsyncTask f66347z;

        public z(AsyncTask asyncTask, Object[] objArr) {
            this.f66347z = asyncTask;
            this.f66346w = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f66347z.executeOnExecutor(w.f66343z, this.f66346w);
        }
    }

    static {
        y();
    }

    public static void y() {
        f66343z = AsyncTask.THREAD_POOL_EXECUTOR;
        f66341w = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        f66342y = new Handler(Looper.getMainLooper());
    }

    public static <P> void w(AsyncTask<P, ?, ?> asyncTask, P... pArr) {
        r.z(asyncTask, "Unable to execute null AsyncTask.");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            asyncTask.executeOnExecutor(f66341w, pArr);
        } else {
            LogUtil.v("taurusx", "Posting AsyncTask to main thread for execution.");
            f66342y.post(new RunnableC0806w(asyncTask, pArr));
        }
    }

    public static <P> void z(AsyncTask<P, ?, ?> asyncTask, P... pArr) {
        r.z(asyncTask, "Unable to execute null AsyncTask.");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            asyncTask.executeOnExecutor(f66343z, pArr);
        } else {
            LogUtil.v("taurusx", "Posting AsyncTask to main thread for execution.");
            f66342y.post(new z(asyncTask, pArr));
        }
    }
}
