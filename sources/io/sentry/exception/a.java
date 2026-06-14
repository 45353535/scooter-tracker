package io.sentry.exception;

import io.sentry.protocol.l;
import io.sentry.util.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f83447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f83448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Thread f83449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f83450e;

    public a(l lVar, Throwable th2, Thread thread, boolean z10) {
        this.f83447b = (l) w.c(lVar, "Mechanism is required.");
        this.f83448c = (Throwable) w.c(th2, "Throwable is required.");
        this.f83449d = (Thread) w.c(thread, "Thread is required.");
        this.f83450e = z10;
    }

    public l d() {
        return this.f83447b;
    }

    public Thread g() {
        return this.f83449d;
    }

    public Throwable h() {
        return this.f83448c;
    }

    public boolean i() {
        return this.f83450e;
    }

    public a(l lVar, Throwable th2, Thread thread) {
        this(lVar, th2, thread, false);
    }
}
