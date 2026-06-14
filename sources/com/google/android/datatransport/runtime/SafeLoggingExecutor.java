package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
class SafeLoggingExecutor implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f24360b;

    static class SafeLoggingRunnable implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f24361b;

        SafeLoggingRunnable(Runnable runnable) {
            this.f24361b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f24361b.run();
            } catch (Exception e10) {
                Logging.e("Executor", "Background execution failure.", e10);
            }
        }
    }

    SafeLoggingExecutor(Executor executor) {
        this.f24360b = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f24360b.execute(new SafeLoggingRunnable(runnable));
    }
}
