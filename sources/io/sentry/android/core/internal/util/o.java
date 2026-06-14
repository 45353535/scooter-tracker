package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f82588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.p f82589b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f82591d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f82590c = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f82592e = new AtomicLong(0);

    public o(io.sentry.transport.p pVar, long j10, int i10) {
        this.f82589b = pVar;
        this.f82588a = j10;
        this.f82591d = i10 <= 0 ? 1 : i10;
    }

    public boolean a() {
        long currentTimeMillis = this.f82589b.getCurrentTimeMillis();
        if (this.f82592e.get() == 0 || this.f82592e.get() + this.f82588a <= currentTimeMillis) {
            this.f82590c.set(0);
            this.f82592e.set(currentTimeMillis);
            return false;
        }
        if (this.f82590c.incrementAndGet() < this.f82591d) {
            return false;
        }
        this.f82590c.set(0);
        return true;
    }
}
