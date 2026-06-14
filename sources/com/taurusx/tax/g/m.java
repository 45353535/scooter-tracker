package com.taurusx.tax.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public class m {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Handler f66151w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Handler f66152z = new Handler(Looper.getMainLooper());

    static {
        HandlerThread handlerThread = new HandlerThread("back handler");
        handlerThread.start();
        f66151w = new Handler(handlerThread.getLooper());
    }

    public static void c(Runnable runnable) {
        Handler handler = f66152z;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static void w(Runnable runnable, long j10) {
        Handler handler = f66152z;
        if (handler != null) {
            handler.postDelayed(runnable, j10);
        }
    }

    public static void y(Runnable runnable) {
        Handler handler = f66151w;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static void z(Runnable runnable, long j10) {
        Handler handler = f66151w;
        if (handler != null) {
            handler.postDelayed(runnable, j10);
        }
    }

    public static void w(Runnable runnable) {
        Handler handler = f66152z;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public static void z(Runnable runnable) {
        Handler handler = f66151w;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }
}
