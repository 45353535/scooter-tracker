package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Callables {
    public static /* synthetic */ void a(Supplier supplier, Runnable runnable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zG = g((String) supplier.get(), threadCurrentThread);
        try {
            runnable.run();
        } finally {
            if (zG) {
                g(name, threadCurrentThread);
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <T> AsyncCallable<T> asAsyncCallable(final Callable<T> callable, final ListeningExecutorService listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        return new AsyncCallable() { // from class: com.google.common.util.concurrent.m
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                return listeningExecutorService.submit(callable);
            }
        };
    }

    public static /* synthetic */ Object c(Supplier supplier, Callable callable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zG = g((String) supplier.get(), threadCurrentThread);
        try {
            return callable.call();
        } finally {
            if (zG) {
                g(name, threadCurrentThread);
            }
        }
    }

    public static /* synthetic */ Object d(Object obj) {
        return obj;
    }

    static Runnable e(final Runnable runnable, final Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new Runnable() { // from class: com.google.common.util.concurrent.o
            @Override // java.lang.Runnable
            public final void run() {
                Callables.a(supplier, runnable);
            }
        };
    }

    static Callable f(final Callable callable, final Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new Callable() { // from class: com.google.common.util.concurrent.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Callables.c(supplier, callable);
            }
        };
    }

    private static boolean g(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static <T> Callable<T> returning(@ParametricNullness final T t10) {
        return new Callable() { // from class: com.google.common.util.concurrent.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Callables.d(t10);
            }
        };
    }
}
