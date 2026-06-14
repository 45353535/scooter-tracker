package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutorImpl;
import eg.w0;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkManagerTaskExecutor implements TaskExecutor {
    private final SerialExecutorImpl mBackgroundExecutor;
    private final CoroutineDispatcher mTaskDispatcher;
    final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
    private final Executor mMainThreadExecutor = new Executor() { // from class: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            WorkManagerTaskExecutor.this.mMainThreadHandler.post(runnable);
        }
    };

    public WorkManagerTaskExecutor(Executor executor) {
        SerialExecutorImpl serialExecutorImpl = new SerialExecutorImpl(executor);
        this.mBackgroundExecutor = serialExecutorImpl;
        this.mTaskDispatcher = w0.b(serialExecutorImpl);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public /* synthetic */ void executeOnTaskThread(Runnable runnable) {
        a.a(this, runnable);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public Executor getMainThreadExecutor() {
        return this.mMainThreadExecutor;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public CoroutineDispatcher getTaskCoroutineDispatcher() {
        return this.mTaskDispatcher;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public SerialExecutorImpl getSerialTaskExecutor() {
        return this.mBackgroundExecutor;
    }
}
