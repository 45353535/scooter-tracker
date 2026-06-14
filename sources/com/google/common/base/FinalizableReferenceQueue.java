package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.internal.Finalizer;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public class FinalizableReferenceQueue implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f28877e = Logger.getLogger(FinalizableReferenceQueue.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Method f28878f = o(p(new SystemLoader(), new DecoupledLoader(), new DirectLoader()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ReferenceQueue f28879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final PhantomReference f28880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f28881d;

    static class DecoupledLoader implements FinalizerLoader {
        DecoupledLoader() {
        }

        URL a() throws IOException {
            String str = "com.google.common.base.internal.Finalizer".replace('.', IOUtils.DIR_SEPARATOR_UNIX) + ".class";
            URL resource = getClass().getClassLoader().getResource(str);
            if (resource == null) {
                throw new FileNotFoundException(str);
            }
            String string = resource.toString();
            if (string.endsWith(str)) {
                return new URL(resource, string.substring(0, string.length() - str.length()));
            }
            throw new IOException("Unsupported path style: " + string);
        }

        URLClassLoader b(URL url) {
            return new URLClassLoader(new URL[]{url}, null);
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public Class<?> loadFinalizer() {
            try {
                return b(a()).loadClass("com.google.common.base.internal.Finalizer");
            } catch (Exception e10) {
                FinalizableReferenceQueue.f28877e.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", (Throwable) e10);
                return null;
            }
        }
    }

    static class DirectLoader implements FinalizerLoader {
        DirectLoader() {
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public Class<?> loadFinalizer() {
            try {
                int i10 = Finalizer.f28989h;
                return Finalizer.class;
            } catch (ClassNotFoundException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    interface FinalizerLoader {
        Class<?> loadFinalizer();
    }

    static class SystemLoader implements FinalizerLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static boolean f28882a;

        SystemLoader() {
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public Class<?> loadFinalizer() {
            if (f28882a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                FinalizableReferenceQueue.f28877e.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public FinalizableReferenceQueue() {
        boolean z10 = true;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f28879b = referenceQueue;
        PhantomReference phantomReference = new PhantomReference(this, referenceQueue);
        this.f28880c = phantomReference;
        try {
            f28878f.invoke(null, FinalizableReference.class, referenceQueue, phantomReference);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (Throwable th2) {
            f28877e.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th2);
            z10 = false;
        }
        this.f28881d = z10;
    }

    static Method o(Class cls) {
        try {
            return cls.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e10) {
            throw new AssertionError(e10);
        }
    }

    private static Class p(FinalizerLoader... finalizerLoaderArr) {
        for (FinalizerLoader finalizerLoader : finalizerLoaderArr) {
            Class<?> clsLoadFinalizer = finalizerLoader.loadFinalizer();
            if (clsLoadFinalizer != null) {
                return clsLoadFinalizer;
            }
        }
        throw new AssertionError();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28880c.enqueue();
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void n() {
        if (this.f28881d) {
            return;
        }
        while (true) {
            Reference referencePoll = this.f28879b.poll();
            if (referencePoll == 0) {
                return;
            }
            referencePoll.clear();
            try {
                ((FinalizableReference) referencePoll).finalizeReferent();
            } catch (Throwable th2) {
                f28877e.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            }
        }
    }
}
