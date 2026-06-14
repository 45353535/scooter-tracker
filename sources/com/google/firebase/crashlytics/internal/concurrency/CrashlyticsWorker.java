package com.google.firebase.crashlytics.internal.concurrency;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public class CrashlyticsWorker implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f32144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f32145c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Task f32146d = Tasks.forResult(null);

    CrashlyticsWorker(ExecutorService executorService) {
        this.f32144b = executorService;
    }

    public static /* synthetic */ Task a(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ Task d(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.forResult(null);
    }

    public static /* synthetic */ Task e(SuccessContinuation successContinuation, Task task) {
        return task.isSuccessful() ? successContinuation.then(task.getResult()) : task.getException() != null ? Tasks.forException(task.getException()) : Tasks.forCanceled();
    }

    public static /* synthetic */ Task f(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public static /* synthetic */ Task g(Callable callable, Task task) {
        return (Task) callable.call();
    }

    @VisibleForTesting
    public void await() throws ExecutionException, InterruptedException, TimeoutException {
        Tasks.await(submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.concurrency.d
            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsWorker.c();
            }
        }), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f32144b.execute(runnable);
    }

    public ExecutorService getExecutor() {
        return this.f32144b;
    }

    @CanIgnoreReturnValue
    public <T> Task<T> submit(final Callable<T> callable) {
        Task<T> taskContinueWithTask;
        synchronized (this.f32145c) {
            taskContinueWithTask = this.f32146d.continueWithTask(this.f32144b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.c
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Tasks.forResult(callable.call());
                }
            });
            this.f32146d = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @CanIgnoreReturnValue
    public <T> Task<T> submitTask(final Callable<Task<T>> callable) {
        Task<T> taskContinueWithTask;
        synchronized (this.f32145c) {
            taskContinueWithTask = this.f32146d.continueWithTask(this.f32144b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.e
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.g(callable, task);
                }
            });
            this.f32146d = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @CanIgnoreReturnValue
    public <T, R> Task<R> submitTaskOnSuccess(final Callable<Task<T>> callable, final SuccessContinuation<T, R> successContinuation) {
        Task<R> taskContinueWithTask;
        synchronized (this.f32145c) {
            taskContinueWithTask = this.f32146d.continueWithTask(this.f32144b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.g
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.f(callable, task);
                }
            }).continueWithTask(this.f32144b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.h
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.e(successContinuation, task);
                }
            });
            this.f32146d = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @CanIgnoreReturnValue
    public Task<Void> submit(final Runnable runnable) {
        Task<Void> taskContinueWithTask;
        synchronized (this.f32145c) {
            taskContinueWithTask = this.f32146d.continueWithTask(this.f32144b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.b
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.d(runnable, task);
                }
            });
            this.f32146d = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @CanIgnoreReturnValue
    public <T, R> Task<R> submitTask(final Callable<Task<T>> callable, Continuation<T, Task<R>> continuation) {
        Task<R> taskContinueWithTask;
        synchronized (this.f32145c) {
            taskContinueWithTask = this.f32146d.continueWithTask(this.f32144b, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.f
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.a(callable, task);
                }
            }).continueWithTask(this.f32144b, continuation);
            this.f32146d = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }
}
