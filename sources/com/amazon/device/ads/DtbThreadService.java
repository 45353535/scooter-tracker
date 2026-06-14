package com.amazon.device.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
class DtbThreadService {
    private static final long SCHEDULE_INTERVAL = 10;
    private static final DtbThreadService threadServiceInstance = new DtbThreadService();
    private ScheduledExecutorService scheduler;
    private boolean shutdownInProgress = false;
    private final ExecutorService executor = Executors.newFixedThreadPool(1);

    private DtbThreadService() {
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.device.ads.DtbThreadService.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DtbThreadService.threadServiceInstance.shutdownInProgress = true;
                DtbLog.debug("App is shutting down, terminating the fixed thread pool");
                DtbThreadService.this.executor.shutdown();
            }
        });
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.device.ads.DtbThreadService.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DtbThreadService.threadServiceInstance.shutdownInProgress = true;
                DtbLog.debug("App is shutting down, terminating the thread pool");
                if (DtbThreadService.this.scheduler != null) {
                    DtbThreadService.this.scheduler.shutdown();
                }
            }
        });
    }

    static void executeOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    static DtbThreadService getInstance() {
        return threadServiceInstance;
    }

    private void handleError(InternalError internalError) {
        internalError.getLocalizedMessage().contains("shutdown");
        throw internalError;
    }

    void execute(Runnable runnable) {
        try {
            if (this.shutdownInProgress) {
                return;
            }
            this.executor.execute(runnable);
        } catch (InternalError e10) {
            handleError(e10);
        }
    }

    void schedule(Runnable runnable) {
        try {
            if (this.shutdownInProgress) {
                return;
            }
            if (this.scheduler == null) {
                this.scheduler = Executors.newScheduledThreadPool(1);
            }
            this.scheduler.schedule(runnable, 10L, TimeUnit.SECONDS);
        } catch (InternalError e10) {
            handleError(e10);
        }
    }
}
