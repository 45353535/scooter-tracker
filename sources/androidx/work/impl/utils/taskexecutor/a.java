package androidx.work.impl.utils.taskexecutor;

import eg.w0;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static void a(TaskExecutor taskExecutor, Runnable runnable) {
        taskExecutor.getSerialTaskExecutor().execute(runnable);
    }

    public static CoroutineDispatcher b(TaskExecutor taskExecutor) {
        return w0.b(taskExecutor.getSerialTaskExecutor());
    }
}
