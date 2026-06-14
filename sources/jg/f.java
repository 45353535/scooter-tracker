package jg;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection f85872a = kotlin.sequences.k.c0(kotlin.sequences.k.h(ServiceLoader.load(eg.c0.class, eg.c0.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f85872a;
    }

    public static final void b(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }
}
