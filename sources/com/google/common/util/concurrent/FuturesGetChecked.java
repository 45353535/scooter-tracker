package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class FuturesGetChecked {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Ordering f31489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Ordering f31490b;

    @VisibleForTesting
    interface GetCheckedTypeValidator {
        void validateClass(Class<? extends Exception> cls);
    }

    @VisibleForTesting
    static class GetCheckedTypeValidatorHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final GetCheckedTypeValidator f31491a = a();

        enum WeakSetValidator implements GetCheckedTypeValidator {
            INSTANCE;


            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final Set f31492b = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator
            public void validateClass(Class<? extends Exception> cls) {
                Iterator it = f31492b.iterator();
                while (it.hasNext()) {
                    if (cls.equals(((WeakReference) it.next()).get())) {
                        return;
                    }
                }
                FuturesGetChecked.e(cls);
                Set set = f31492b;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference(cls));
            }
        }

        static GetCheckedTypeValidator a() {
            return FuturesGetChecked.n();
        }
    }

    static {
        Ordering orderingReverse = Ordering.natural().onResultOf(new Function() { // from class: com.google.common.util.concurrent.u
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((List) obj).contains(String.class));
            }
        }).compound(Ordering.natural().onResultOf(new Function() { // from class: com.google.common.util.concurrent.v
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            }
        })).reverse();
        f31489a = orderingReverse;
        f31490b = orderingReverse.onResultOf(new Function() { // from class: com.google.common.util.concurrent.w
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Arrays.asList(((Constructor) obj).getParameterTypes());
            }
        });
    }

    private static GetCheckedTypeValidator d() {
        return GetCheckedTypeValidatorHolder.f31491a;
    }

    static void e(Class cls) {
        Preconditions.checkArgument(j(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        Preconditions.checkArgument(i(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    static Object f(GetCheckedTypeValidator getCheckedTypeValidator, Future future, Class cls) throws Exception {
        getCheckedTypeValidator.validateClass(cls);
        try {
            return future.get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw l(cls, e10);
        } catch (ExecutionException e11) {
            o(e11.getCause(), cls);
            throw new AssertionError();
        }
    }

    static Object g(Future future, Class cls) {
        return f(d(), future, cls);
    }

    static Object h(Future future, Class cls, long j10, TimeUnit timeUnit) throws Exception {
        d().validateClass(cls);
        try {
            return future.get(j10, timeUnit);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw l(cls, e10);
        } catch (ExecutionException e11) {
            o(e11.getCause(), cls);
            throw new AssertionError();
        } catch (TimeoutException e12) {
            throw l(cls, e12);
        }
    }

    private static boolean i(Class cls) {
        try {
            l(cls, new Exception());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean j(Class cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    private static Object k(Constructor constructor, Throwable th2) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            Class<?> cls = parameterTypes[i10];
            if (cls.equals(String.class)) {
                objArr[i10] = th2.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i10] = th2;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Exception l(Class cls, Throwable th2) {
        Iterator it = m(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            Exception exc = (Exception) k((Constructor) it.next(), th2);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th2);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", th2);
    }

    private static List m(List list) {
        return f31490b.sortedCopy(list);
    }

    static GetCheckedTypeValidator n() {
        return GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }

    private static void o(Throwable th2, Class cls) throws Exception {
        if (th2 instanceof Error) {
            throw new ExecutionError((Error) th2);
        }
        if (!(th2 instanceof RuntimeException)) {
            throw l(cls, th2);
        }
        throw new UncheckedExecutionException(th2);
    }
}
