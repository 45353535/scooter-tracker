package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Suppliers;
import j$.time.Duration;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Suppliers {

    @VisibleForTesting
    static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Object f28963b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Supplier f28964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f28965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile transient Object f28966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile transient long f28967f;

        ExpiringMemoizingSupplier(Supplier supplier, long j10) {
            this.f28964c = supplier;
            this.f28965d = j10;
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f28963b = new Object();
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            long j10 = this.f28967f;
            long jNanoTime = System.nanoTime();
            if (j10 == 0 || jNanoTime - j10 >= 0) {
                synchronized (this.f28963b) {
                    try {
                        if (j10 == this.f28967f) {
                            T t10 = (T) this.f28964c.get();
                            this.f28966e = t10;
                            long j11 = jNanoTime + this.f28965d;
                            if (j11 == 0) {
                                j11 = 1;
                            }
                            this.f28967f = j11;
                            return t10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) NullnessCasts.a(this.f28966e);
        }

        public String toString() {
            return "Suppliers.memoizeWithExpiration(" + this.f28964c + ", " + this.f28965d + ", NANOS)";
        }
    }

    @VisibleForTesting
    static class MemoizingSupplier<T> implements Supplier<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Object f28968b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Supplier f28969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile transient boolean f28970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        transient Object f28971e;

        MemoizingSupplier(Supplier supplier) {
            this.f28969c = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f28968b = new Object();
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            if (!this.f28970d) {
                synchronized (this.f28968b) {
                    try {
                        if (!this.f28970d) {
                            T t10 = (T) this.f28969c.get();
                            this.f28971e = t10;
                            this.f28970d = true;
                            return t10;
                        }
                    } finally {
                    }
                }
            }
            return (T) NullnessCasts.a(this.f28971e);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f28970d) {
                obj = "<supplier that returned " + this.f28971e + ">";
            } else {
                obj = this.f28969c;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @VisibleForTesting
    static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Supplier f28972e = new Supplier() { // from class: com.google.common.base.a
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Suppliers.NonSerializableMemoizingSupplier.a();
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f28973b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Supplier f28974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f28975d;

        NonSerializableMemoizingSupplier(Supplier supplier) {
            this.f28974c = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            Supplier supplier = this.f28974c;
            Supplier supplier2 = f28972e;
            if (supplier != supplier2) {
                synchronized (this.f28973b) {
                    try {
                        if (this.f28974c != supplier2) {
                            T t10 = (T) this.f28974c.get();
                            this.f28975d = t10;
                            this.f28974c = supplier2;
                            return t10;
                        }
                    } finally {
                    }
                }
            }
            return (T) NullnessCasts.a(this.f28975d);
        }

        public String toString() {
            Object obj = this.f28974c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f28972e) {
                obj = "<supplier that returned " + this.f28975d + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static class SupplierComposition<F, T> implements Supplier<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Function f28976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Supplier f28977c;

        SupplierComposition(Function function, Supplier supplier) {
            this.f28976b = (Function) Preconditions.checkNotNull(function);
            this.f28977c = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierComposition) {
                SupplierComposition supplierComposition = (SupplierComposition) obj;
                if (this.f28976b.equals(supplierComposition.f28976b) && this.f28977c.equals(supplierComposition.f28977c)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return (T) this.f28976b.apply(this.f28977c.get());
        }

        public int hashCode() {
            return Objects.hashCode(this.f28976b, this.f28977c);
        }

        public String toString() {
            return "Suppliers.compose(" + this.f28976b + ", " + this.f28977c + ")";
        }
    }

    private interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    private enum SupplierFunctionImpl implements SupplierFunction<Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }

        @Override // com.google.common.base.Function
        public Object apply(Supplier<Object> supplier) {
            return supplier.get();
        }
    }

    private static class SupplierOfInstance<T> implements Supplier<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f28979b;

        SupplierOfInstance(Object obj) {
            this.f28979b = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.equal(this.f28979b, ((SupplierOfInstance) obj).f28979b);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return (T) this.f28979b;
        }

        public int hashCode() {
            return Objects.hashCode(this.f28979b);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f28979b + ")";
        }
    }

    @J2ktIncompatible
    private static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Supplier f28980b;

        ThreadSafeSupplier(Supplier supplier) {
            this.f28980b = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            T t10;
            synchronized (this.f28980b) {
                t10 = (T) this.f28980b.get();
            }
            return t10;
        }

        public String toString() {
            return "Suppliers.synchronizedSupplier(" + this.f28980b + ")";
        }
    }

    public static <F, T> Supplier<T> compose(Function<? super F, T> function, Supplier<F> supplier) {
        return new SupplierComposition(function, supplier);
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
        return ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) ? supplier : supplier instanceof Serializable ? new MemoizingSupplier(supplier) : new NonSerializableMemoizingSupplier(supplier);
    }

    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long j10, TimeUnit timeUnit) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkArgument(j10 > 0, "duration (%s %s) must be > 0", j10, timeUnit);
        return new ExpiringMemoizingSupplier(supplier, timeUnit.toNanos(j10));
    }

    public static <T> Supplier<T> ofInstance(@ParametricNullness T t10) {
        return new SupplierOfInstance(t10);
    }

    public static <T> Function<Supplier<T>, T> supplierFunction() {
        return SupplierFunctionImpl.INSTANCE;
    }

    @J2ktIncompatible
    public static <T> Supplier<T> synchronizedSupplier(Supplier<T> supplier) {
        return new ThreadSafeSupplier(supplier);
    }

    @J2ktIncompatible
    @GwtIncompatible
    @IgnoreJRERequirement
    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, Duration duration) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkArgument((duration.isNegative() || duration.isZero()) ? false : true, "duration (%s) must be > 0", duration);
        return new ExpiringMemoizingSupplier(supplier, Internal.a(duration));
    }
}
