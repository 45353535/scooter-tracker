package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public final class Utils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f32107a = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    public static /* synthetic */ Object a(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    @Deprecated
    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f32107a, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.u
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return Utils.a(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    @CanIgnoreReturnValue
    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
