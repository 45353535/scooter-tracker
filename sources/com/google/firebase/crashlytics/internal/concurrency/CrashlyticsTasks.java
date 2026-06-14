package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class CrashlyticsTasks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f32143a = new androidx.media3.exoplayer.hls.offline.a();

    public static /* synthetic */ Task a(TaskCompletionSource taskCompletionSource, AtomicBoolean atomicBoolean, CancellationTokenSource cancellationTokenSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.cancel();
        }
        return Tasks.forResult(null);
    }

    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Continuation<T, Task<TContinuationResult>> continuation = new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.a
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return CrashlyticsTasks.a(taskCompletionSource, atomicBoolean, cancellationTokenSource, task3);
            }
        };
        Executor executor = f32143a;
        task.continueWithTask(executor, continuation);
        task2.continueWithTask(executor, continuation);
        return taskCompletionSource.getTask();
    }
}
