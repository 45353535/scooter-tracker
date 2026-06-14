package com.amazon.aps.shared.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public class ApsAsyncUtil {
    private static ApsAsyncUtil INSTANCE = null;
    private static final String TAG = "ApsAsyncUtil";
    private final ExecutorService executorService = Executors.newFixedThreadPool(1);
    private boolean shutdownInProgress = false;

    public interface ApsExecutionListener<T> {
        void onExecutionCompleted(ApsResult apsResult, T t10);
    }

    public interface ApsReturnRunnable<T> {
        T run();
    }

    private ApsAsyncUtil() {
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.aps.shared.util.ApsAsyncUtil.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    ApsAsyncUtil.this.shutdownInProgress = true;
                    Log.d(ApsAsyncUtil.TAG, "App is shutting down, terminating the thread executor");
                    ApsAsyncUtil.this.executorService.shutdown();
                } catch (RuntimeException e10) {
                    Log.e(ApsAsyncUtil.TAG, "Error in stopping the executor", e10);
                }
            }
        });
    }

    public static /* synthetic */ void a(ApsExecutionListener apsExecutionListener, ApsResult apsResult, Object obj) {
        if (apsExecutionListener != null) {
            apsExecutionListener.onExecutionCompleted(apsResult, obj);
        }
    }

    public static /* synthetic */ void b(ApsReturnRunnable apsReturnRunnable, ApsExecutionListener apsExecutionListener) {
        final Object objRun;
        try {
            objRun = apsReturnRunnable.run();
        } catch (RuntimeException unused) {
            objRun = null;
        }
        if (apsExecutionListener != null) {
            getInstance().runAsyncAndCallback(new ApsReturnRunnable() { // from class: com.amazon.aps.shared.util.c
                @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsReturnRunnable
                public final Object run() {
                    return ApsAsyncUtil.e(objRun);
                }
            }, apsExecutionListener);
        }
    }

    public static /* synthetic */ void c(ApsReturnRunnable apsReturnRunnable, final ApsExecutionListener apsExecutionListener) {
        final ApsResult apsResult = ApsResult.FAILURE;
        final Object objRun = null;
        try {
            try {
                objRun = apsReturnRunnable.run();
                final ApsResult apsResult2 = ApsResult.SUCCESS;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.shared.util.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ApsAsyncUtil.a(apsExecutionListener, apsResult2, objRun);
                    }
                });
            } catch (Exception e10) {
                Log.e(TAG, "Error running the thread", e10);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.shared.util.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ApsAsyncUtil.a(apsExecutionListener, apsResult, objRun);
                    }
                });
            }
        } catch (Throwable th2) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.shared.util.e
                @Override // java.lang.Runnable
                public final void run() {
                    ApsAsyncUtil.a(apsExecutionListener, apsResult, objRun);
                }
            });
            throw th2;
        }
    }

    public static /* synthetic */ void d(ApsReturnRunnable apsReturnRunnable, ApsExecutionListener apsExecutionListener) {
        ApsResult apsResult = ApsResult.FAILURE;
        Object objRun = null;
        try {
            try {
                objRun = apsReturnRunnable.run();
                ApsResult apsResult2 = ApsResult.SUCCESS;
                if (apsExecutionListener != null) {
                    apsExecutionListener.onExecutionCompleted(apsResult2, objRun);
                }
            } catch (Exception e10) {
                Log.e(TAG, "Error running the thread", e10);
                if (apsExecutionListener != null) {
                    apsExecutionListener.onExecutionCompleted(apsResult, objRun);
                }
            }
        } catch (Throwable th2) {
            if (apsExecutionListener != null) {
                apsExecutionListener.onExecutionCompleted(apsResult, objRun);
            }
            throw th2;
        }
    }

    public static /* synthetic */ Object e(Object obj) {
        return obj;
    }

    public static ApsAsyncUtil getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApsAsyncUtil();
        }
        return INSTANCE;
    }

    public synchronized <T> void runAsyncAndCallback(final ApsReturnRunnable<T> apsReturnRunnable, final ApsExecutionListener<T> apsExecutionListener) {
        APSSharedUtil.checkNullAndThrowException(apsReturnRunnable);
        try {
            if (!this.shutdownInProgress) {
                this.executorService.execute(new Runnable() { // from class: com.amazon.aps.shared.util.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ApsAsyncUtil.d(apsReturnRunnable, apsExecutionListener);
                    }
                });
            }
        } catch (RuntimeException e10) {
            Log.e(TAG, "Error running the thread", e10);
        }
    }

    public synchronized <T> void runAsyncAndCallbackOnUiThread(final ApsReturnRunnable<T> apsReturnRunnable, final ApsExecutionListener<T> apsExecutionListener) {
        APSSharedUtil.checkNullAndThrowException(apsReturnRunnable, apsExecutionListener);
        try {
            if (!this.shutdownInProgress) {
                this.executorService.execute(new Runnable() { // from class: com.amazon.aps.shared.util.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ApsAsyncUtil.c(apsReturnRunnable, apsExecutionListener);
                    }
                });
            }
        } catch (RuntimeException e10) {
            Log.e(TAG, "Error running the thread", e10);
        }
    }

    public <T> void runOnUiThreadAndAsyncCallback(final ApsReturnRunnable<T> apsReturnRunnable, final ApsExecutionListener<T> apsExecutionListener) {
        APSSharedUtil.checkNullAndThrowException(apsReturnRunnable);
        try {
            if (this.shutdownInProgress) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.shared.util.d
                @Override // java.lang.Runnable
                public final void run() {
                    ApsAsyncUtil.b(apsReturnRunnable, apsExecutionListener);
                }
            });
        } catch (RuntimeException e10) {
            Log.e(TAG, "Error running the thread", e10);
        }
    }
}
