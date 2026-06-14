package kd;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public interface e {
    void cancel(Runnable runnable);

    void execute(Runnable runnable);

    void schedule(Runnable runnable, long j10);

    void schedule(Runnable runnable, long j10, TimeUnit timeUnit);
}
