package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public interface f1 {
    void a();

    void b(long j10);

    boolean isClosed();

    Future schedule(Runnable runnable, long j10);

    Future submit(Runnable runnable);
}
