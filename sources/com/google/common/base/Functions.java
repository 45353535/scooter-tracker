package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Functions {

    private static class ConstantFunction<E> implements Function<Object, E>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f28885b;

        public ConstantFunction(@ParametricNullness E e10) {
            this.f28885b = e10;
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public E apply(Object obj) {
            return (E) this.f28885b;
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ConstantFunction) {
                return Objects.equal(this.f28885b, ((ConstantFunction) obj).f28885b);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f28885b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Functions.constant(" + this.f28885b + ")";
        }
    }

    private static class ForMapWithDefault<K, V> implements Function<K, V>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f28886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f28887c;

        ForMapWithDefault(Map map, Object obj) {
            this.f28886b = (Map) Preconditions.checkNotNull(map);
            this.f28887c = obj;
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public V apply(@ParametricNullness K k10) {
            Object obj = this.f28886b.get(k10);
            return (obj != null || this.f28886b.containsKey(k10)) ? (V) NullnessCasts.a(obj) : (V) this.f28887c;
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ForMapWithDefault) {
                ForMapWithDefault forMapWithDefault = (ForMapWithDefault) obj;
                if (this.f28886b.equals(forMapWithDefault.f28886b) && Objects.equal(this.f28887c, forMapWithDefault.f28887c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f28886b, this.f28887c);
        }

        public String toString() {
            return "Functions.forMap(" + this.f28886b + ", defaultValue=" + this.f28887c + ")";
        }
    }

    private static class FunctionComposition<A, B, C> implements Function<A, C>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Function f28888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function f28889c;

        public FunctionComposition(Function<B, C> function, Function<A, ? extends B> function2) {
            this.f28888b = (Function) Preconditions.checkNotNull(function);
            this.f28889c = (Function) Preconditions.checkNotNull(function2);
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public C apply(@ParametricNullness A a10) {
            return (C) this.f28888b.apply(this.f28889c.apply(a10));
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof FunctionComposition) {
                FunctionComposition functionComposition = (FunctionComposition) obj;
                if (this.f28889c.equals(functionComposition.f28889c) && this.f28888b.equals(functionComposition.f28888b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f28889c.hashCode() ^ this.f28888b.hashCode();
        }

        public String toString() {
            return this.f28888b + "(" + this.f28889c + ")";
        }
    }

    private static class FunctionForMapNoDefault<K, V> implements Function<K, V>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f28890b;

        FunctionForMapNoDefault(Map map) {
            this.f28890b = (Map) Preconditions.checkNotNull(map);
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public V apply(@ParametricNullness K k10) {
            Object obj = this.f28890b.get(k10);
            Preconditions.checkArgument(obj != null || this.f28890b.containsKey(k10), "Key '%s' not present in map", k10);
            return (V) NullnessCasts.a(obj);
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof FunctionForMapNoDefault) {
                return this.f28890b.equals(((FunctionForMapNoDefault) obj).f28890b);
            }
            return false;
        }

        public int hashCode() {
            return this.f28890b.hashCode();
        }

        public String toString() {
            return "Functions.forMap(" + this.f28890b + ")";
        }
    }

    private enum IdentityFunction implements Function<Object, Object> {
        INSTANCE;

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            return obj;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }
    }

    private static class PredicateFunction<T> implements Function<T, Boolean>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Predicate f28892b;

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof PredicateFunction) {
                return this.f28892b.equals(((PredicateFunction) obj).f28892b);
            }
            return false;
        }

        public int hashCode() {
            return this.f28892b.hashCode();
        }

        public String toString() {
            return "Functions.forPredicate(" + this.f28892b + ")";
        }

        private PredicateFunction(Predicate predicate) {
            this.f28892b = (Predicate) Preconditions.checkNotNull(predicate);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Function
        public Boolean apply(@ParametricNullness T t10) {
            return Boolean.valueOf(this.f28892b.apply(t10));
        }
    }

    private static class SupplierFunction<F, T> implements Function<F, T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Supplier f28893b;

        @Override // com.google.common.base.Function
        @ParametricNullness
        public T apply(@ParametricNullness F f10) {
            return (T) this.f28893b.get();
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof SupplierFunction) {
                return this.f28893b.equals(((SupplierFunction) obj).f28893b);
            }
            return false;
        }

        public int hashCode() {
            return this.f28893b.hashCode();
        }

        public String toString() {
            return "Functions.forSupplier(" + this.f28893b + ")";
        }

        private SupplierFunction(Supplier supplier) {
            this.f28893b = (Supplier) Preconditions.checkNotNull(supplier);
        }
    }

    private enum ToStringFunction implements Function<Object, String> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }

        @Override // com.google.common.base.Function
        public String apply(Object obj) {
            Preconditions.checkNotNull(obj);
            return obj.toString();
        }
    }

    public static <A, B, C> Function<A, C> compose(Function<B, C> function, Function<A, ? extends B> function2) {
        return new FunctionComposition(function, function2);
    }

    public static <E> Function<Object, E> constant(@ParametricNullness E e10) {
        return new ConstantFunction(e10);
    }

    public static <K, V> Function<K, V> forMap(Map<K, V> map) {
        return new FunctionForMapNoDefault(map);
    }

    public static <T> Function<T, Boolean> forPredicate(Predicate<T> predicate) {
        return new PredicateFunction(predicate);
    }

    public static <F, T> Function<F, T> forSupplier(Supplier<T> supplier) {
        return new SupplierFunction(supplier);
    }

    public static <E> Function<E, E> identity() {
        return IdentityFunction.INSTANCE;
    }

    public static Function<Object, String> toStringFunction() {
        return ToStringFunction.INSTANCE;
    }

    public static <K, V> Function<K, V> forMap(Map<K, ? extends V> map, @ParametricNullness V v10) {
        return new ForMapWithDefault(map, v10);
    }
}
