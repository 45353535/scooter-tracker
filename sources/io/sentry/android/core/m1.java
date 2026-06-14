package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.ILogger;
import io.sentry.g7;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class m1 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f82668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.r0 f82669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f82670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f82671d;

    private static final class a implements io.sentry.hints.e, io.sentry.hints.k, io.sentry.hints.p, io.sentry.hints.i, io.sentry.hints.b, io.sentry.hints.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f82672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f82673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CountDownLatch f82674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f82675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ILogger f82676e;

        public a(long j10, ILogger iLogger) {
            reset();
            this.f82675d = j10;
            this.f82676e = (ILogger) io.sentry.util.w.c(iLogger, "ILogger is required.");
        }

        @Override // io.sentry.hints.k
        public boolean b() {
            return this.f82672a;
        }

        @Override // io.sentry.hints.p
        public void c(boolean z10) {
            this.f82673b = z10;
            this.f82674c.countDown();
        }

        @Override // io.sentry.hints.k
        public void d(boolean z10) {
            this.f82672a = z10;
        }

        @Override // io.sentry.hints.i
        public boolean h() {
            try {
                return this.f82674c.await(this.f82675d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f82676e.a(g7.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }

        @Override // io.sentry.hints.p
        public boolean isSuccess() {
            return this.f82673b;
        }

        @Override // io.sentry.hints.j
        public void reset() {
            this.f82674c = new CountDownLatch(1);
            this.f82672a = false;
            this.f82673b = false;
        }
    }

    m1(String str, io.sentry.r0 r0Var, ILogger iLogger, long j10) {
        super(str);
        this.f82668a = str;
        this.f82669b = (io.sentry.r0) io.sentry.util.w.c(r0Var, "Envelope sender is required.");
        this.f82670c = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
        this.f82671d = j10;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, String str) {
        if (str == null || i10 != 8) {
            return;
        }
        this.f82670c.c(g7.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i10), this.f82668a, str);
        io.sentry.i0 i0VarE = io.sentry.util.m.e(new a(this.f82671d, this.f82670c));
        this.f82669b.a(this.f82668a + File.separator + str, i0VarE);
    }
}
