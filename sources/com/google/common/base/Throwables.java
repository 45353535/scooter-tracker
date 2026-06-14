package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Throwables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f28981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f28982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f28983c;

    static {
        Object objF = f();
        f28981a = objF;
        f28982b = objF == null ? null : e();
        f28983c = objF != null ? h(objF) : null;
    }

    private static Method e() {
        return g("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Object f() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method g(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<Throwable> getCausalChain(Throwable th2) {
        Preconditions.checkNotNull(th2);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th2);
        boolean z10 = false;
        Throwable cause = th2;
        while (true) {
            th2 = th2.getCause();
            if (th2 == null) {
                return DesugarCollections.unmodifiableList(arrayList);
            }
            arrayList.add(th2);
            if (th2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", th2);
            }
            if (z10) {
                cause = cause.getCause();
            }
            z10 = !z10;
        }
    }

    @GwtIncompatible
    public static <X extends Throwable> X getCauseAs(Throwable th2, Class<X> cls) {
        try {
            return cls.cast(th2.getCause());
        } catch (ClassCastException e10) {
            e10.initCause(th2);
            throw e10;
        }
    }

    public static Throwable getRootCause(Throwable th2) {
        boolean z10 = false;
        Throwable cause = th2;
        while (true) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                return th2;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z10) {
                cause = cause.getCause();
            }
            z10 = !z10;
            th2 = cause2;
        }
    }

    @GwtIncompatible
    public static String getStackTraceAsString(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static Method h(Object obj) {
        try {
            Method methodG = g("getStackTraceDepth", Throwable.class);
            if (methodG == null) {
                return null;
            }
            methodG.invoke(obj, new Throwable());
            return methodG;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object i(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw propagate(e11.getCause());
        }
    }

    private static List j(final Throwable th2) {
        Preconditions.checkNotNull(th2);
        return new AbstractList<StackTraceElement>() { // from class: com.google.common.base.Throwables.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                Method method = Throwables.f28983c;
                j$.util.Objects.requireNonNull(method);
                Object obj = Throwables.f28981a;
                j$.util.Objects.requireNonNull(obj);
                return ((Integer) Throwables.i(method, obj, th2)).intValue();
            }

            @Override // java.util.AbstractList, java.util.List
            public StackTraceElement get(int i10) {
                Method method = Throwables.f28982b;
                j$.util.Objects.requireNonNull(method);
                Object obj = Throwables.f28981a;
                j$.util.Objects.requireNonNull(obj);
                return (StackTraceElement) Throwables.i(method, obj, th2, Integer.valueOf(i10));
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static List<StackTraceElement> lazyStackTrace(Throwable th2) {
        return lazyStackTraceIsLazy() ? j(th2) : DesugarCollections.unmodifiableList(Arrays.asList(th2.getStackTrace()));
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        return (f28982b == null || f28983c == null) ? false : true;
    }

    @GwtIncompatible
    @Deprecated
    @CanIgnoreReturnValue
    @J2ktIncompatible
    public static RuntimeException propagate(Throwable th2) {
        throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X extends Throwable> void propagateIfInstanceOf(Throwable th2, Class<X> cls) throws Throwable {
        if (th2 != null) {
            throwIfInstanceOf(th2, cls);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static void propagateIfPossible(Throwable th2) {
        if (th2 != null) {
            throwIfUnchecked(th2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @GwtIncompatible
    public static <X extends Throwable> void throwIfInstanceOf(Throwable th2, Class<X> cls) throws Throwable {
        Preconditions.checkNotNull(th2);
        if (cls.isInstance(th2)) {
            throw cls.cast(th2);
        }
    }

    public static void throwIfUnchecked(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X extends Throwable> void propagateIfPossible(Throwable th2, Class<X> cls) throws Throwable {
        propagateIfInstanceOf(th2, cls);
        propagateIfPossible(th2);
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(Throwable th2, Class<X1> cls, Class<X2> cls2) throws Throwable {
        Preconditions.checkNotNull(cls2);
        propagateIfInstanceOf(th2, cls);
        propagateIfPossible(th2, cls2);
    }
}
