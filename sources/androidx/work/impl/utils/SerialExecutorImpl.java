package androidx.work.impl.utils;

import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class SerialExecutorImpl implements SerialExecutor {

    @GuardedBy("mLock")
    private Runnable mActive;
    private final Executor mExecutor;
    private final ArrayDeque<Task> mTasks = new ArrayDeque<>();
    final Object mLock = new Object();

    static class Task implements Runnable {
        final Runnable mRunnable;
        final SerialExecutorImpl mSerialExecutor;

        Task(SerialExecutorImpl serialExecutorImpl, Runnable runnable) {
            this.mSerialExecutor = serialExecutorImpl;
            this.mRunnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mRunnable.run();
                synchronized (this.mSerialExecutor.mLock) {
                    this.mSerialExecutor.scheduleNext();
                }
            } catch (Throwable th2) {
                synchronized (this.mSerialExecutor.mLock) {
                    this.mSerialExecutor.scheduleNext();
                    throw th2;
                }
            }
        }
    }

    public SerialExecutorImpl(Executor executor) {
        this.mExecutor = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.mLock) {
            try {
                this.mTasks.add(new Task(this, runnable));
                if (this.mActive == null) {
                    scheduleNext();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public Executor getDelegatedExecutor() {
        return this.mExecutor;
    }

    @Override // androidx.work.impl.utils.taskexecutor.SerialExecutor
    public boolean hasPendingTasks() {
        boolean z10;
        synchronized (this.mLock) {
            z10 = !this.mTasks.isEmpty();
        }
        return z10;
    }

    @GuardedBy("mLock")
    void scheduleNext() {
        Task taskPoll = this.mTasks.poll();
        this.mActive = taskPoll;
        if (taskPoll != null) {
            this.mExecutor.execute(taskPoll);
        }
    }
}
