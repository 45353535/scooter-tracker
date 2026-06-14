package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Closer implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Suppressor f30915e = new Suppressor() { // from class: com.google.common.io.a
        @Override // com.google.common.io.Closer.Suppressor
        public final void suppress(Closeable closeable, Throwable th2, Throwable th3) {
            Closer.c(closeable, th2, th3);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Suppressor f30916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque f30917c = new ArrayDeque(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f30918d;

    @VisibleForTesting
    interface Suppressor {
        void suppress(Closeable closeable, Throwable th2, Throwable th3);
    }

    Closer(Suppressor suppressor) {
        this.f30916b = (Suppressor) Preconditions.checkNotNull(suppressor);
    }

    public static /* synthetic */ void c(Closeable closeable, Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return;
        }
        try {
            th2.addSuppressed(th3);
        } catch (Throwable unused) {
            Closeables.f30914a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th3);
        }
    }

    public static Closer create() {
        return new Closer(f30915e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Throwable th2 = this.f30918d;
        while (!this.f30917c.isEmpty()) {
            Closeable closeable = (Closeable) this.f30917c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    this.f30916b.suppress(closeable, th2, th3);
                }
            }
        }
        if (this.f30918d != null || th2 == null) {
            return;
        }
        Throwables.throwIfInstanceOf(th2, IOException.class);
        Throwables.throwIfUnchecked(th2);
        throw new AssertionError(th2);
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public <C extends Closeable> C register(@ParametricNullness C c10) {
        if (c10 != null) {
            this.f30917c.addFirst(c10);
        }
        return c10;
    }

    public RuntimeException rethrow(Throwable th2) throws Throwable {
        Preconditions.checkNotNull(th2);
        this.f30918d = th2;
        Throwables.throwIfInstanceOf(th2, IOException.class);
        Throwables.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    public <X extends Exception> RuntimeException rethrow(Throwable th2, Class<X> cls) throws Exception {
        Preconditions.checkNotNull(th2);
        this.f30918d = th2;
        Throwables.throwIfInstanceOf(th2, IOException.class);
        Throwables.throwIfInstanceOf(th2, cls);
        Throwables.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable th2, Class<X1> cls, Class<X2> cls2) throws Exception {
        Preconditions.checkNotNull(th2);
        this.f30918d = th2;
        Throwables.throwIfInstanceOf(th2, IOException.class);
        Throwables.throwIfInstanceOf(th2, cls);
        Throwables.throwIfInstanceOf(th2, cls2);
        Throwables.throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }
}
