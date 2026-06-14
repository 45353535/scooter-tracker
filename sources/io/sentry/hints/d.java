package io.sentry.hints;

import io.sentry.ILogger;
import io.sentry.g7;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements f, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f83591a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f83592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f83593c;

    public d(long j10, ILogger iLogger) {
        this.f83592b = j10;
        this.f83593c = iLogger;
    }

    @Override // io.sentry.hints.f
    public void a() {
        this.f83591a.countDown();
    }

    @Override // io.sentry.hints.i
    public boolean h() {
        try {
            return this.f83591a.await(this.f83592b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f83593c.a(g7.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e10);
            return false;
        }
    }
}
