package io.sentry.util;

import io.sentry.g1;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ReentrantLock {

    /* JADX INFO: renamed from: io.sentry.util.a$a, reason: collision with other inner class name */
    static final class C1015a implements g1, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReentrantLock f84292b;

        C1015a(ReentrantLock reentrantLock) {
            this.f84292b = reentrantLock;
        }

        @Override // io.sentry.g1, java.lang.AutoCloseable
        public void close() {
            this.f84292b.unlock();
        }
    }

    public g1 d() {
        lock();
        return new C1015a(this);
    }
}
