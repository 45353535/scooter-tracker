package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface TaskExecutor {
    void executeOnTaskThread(Runnable runnable);

    Executor getMainThreadExecutor();

    SerialExecutor getSerialTaskExecutor();

    CoroutineDispatcher getTaskCoroutineDispatcher();
}
