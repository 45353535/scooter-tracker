package androidx.work;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public interface RunnableScheduler {
    void cancel(Runnable runnable);

    void scheduleWithDelay(@IntRange(from = 0) long j10, Runnable runnable);
}
