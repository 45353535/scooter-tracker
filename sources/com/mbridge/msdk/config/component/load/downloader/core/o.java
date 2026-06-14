package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes10.dex */
public class o implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47031a;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f47032a;

        a(Runnable runnable) {
            this.f47032a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(o.this.f47031a);
            } catch (Throwable unused) {
            }
            try {
                this.f47032a.run();
            } catch (Exception unused2) {
            }
        }
    }

    o(int i10) {
        this.f47031a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }
}
