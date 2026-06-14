package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class Finalizer implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f28986e = Logger.getLogger(Finalizer.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Constructor f28987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Field f28988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f28989h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f28990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PhantomReference f28991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f28992d;

    static {
        Constructor constructorD = d();
        f28987f = constructorD;
        f28988g = constructorD == null ? f() : null;
    }

    private Finalizer(Class cls, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        this.f28992d = referenceQueue;
        this.f28990b = new WeakReference(cls);
        this.f28991c = phantomReference;
    }

    private boolean a(Reference reference) {
        Reference referencePoll;
        Method methodE = e();
        if (methodE == null || !b(reference, methodE)) {
            return false;
        }
        do {
            referencePoll = this.f28992d.poll();
            if (referencePoll == null) {
                return true;
            }
        } while (b(referencePoll, methodE));
        return false;
    }

    private boolean b(Reference reference, Method method) {
        reference.clear();
        if (reference == this.f28991c) {
            return false;
        }
        try {
            method.invoke(reference, null);
            return true;
        } catch (Throwable th2) {
            f28986e.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            return true;
        }
    }

    private static Constructor d() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    private Method e() {
        Class cls = (Class) this.f28990b.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", null);
        } catch (NoSuchMethodException e10) {
            throw new AssertionError(e10);
        }
    }

    private static Field f() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            f28986e.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    public static void startFinalizer(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        Thread thread;
        if (!cls.getName().equals("com.google.common.base.FinalizableReference")) {
            throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        Finalizer finalizer = new Finalizer(cls, referenceQueue, phantomReference);
        String name = Finalizer.class.getName();
        Constructor constructor = f28987f;
        if (constructor != null) {
            try {
                thread = (Thread) constructor.newInstance(null, finalizer, name, 0L, Boolean.FALSE);
            } catch (Throwable th2) {
                f28986e.log(Level.INFO, "Failed to create a thread without inherited thread-local values", th2);
                thread = null;
            }
        } else {
            thread = null;
        }
        if (thread == null) {
            thread = new Thread(null, finalizer, name);
        }
        thread.setDaemon(true);
        try {
            Field field = f28988g;
            if (field != null) {
                field.set(thread, null);
            }
        } catch (Throwable th3) {
            f28986e.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", th3);
        }
        thread.start();
    }

    @Override // java.lang.Runnable
    public void run() {
        while (a(this.f28992d.remove())) {
        }
    }
}
