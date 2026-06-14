package io.bidmachine;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
class l extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile l f80496b;

    l(int i10) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static l a() {
        if (f80496b == null) {
            synchronized (l.class) {
                try {
                    if (f80496b == null) {
                        f80496b = new l(Runtime.getRuntime().availableProcessors() * 2);
                    }
                } finally {
                }
            }
        }
        return f80496b;
    }
}
