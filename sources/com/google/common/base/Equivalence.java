package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Equivalence<T> {

    static final class Equals extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Equals f28871b = new Equals();

        Equals() {
        }

        private Object readResolve() {
            return f28871b;
        }

        @Override // com.google.common.base.Equivalence
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    private static final class EquivalentToPredicate<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Equivalence f28872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f28873c;

        EquivalentToPredicate(Equivalence equivalence, Object obj) {
            this.f28872b = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f28873c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.base.Predicate
        public boolean apply(T t10) {
            return this.f28872b.equivalent(t10, this.f28873c);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EquivalentToPredicate) {
                EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
                if (this.f28872b.equals(equivalentToPredicate.f28872b) && Objects.equal(this.f28873c, equivalentToPredicate.f28873c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f28872b, this.f28873c);
        }

        public String toString() {
            return this.f28872b + ".equivalentTo(" + this.f28873c + ")";
        }
    }

    static final class Identity extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Identity f28874b = new Identity();

        Identity() {
        }

        private Object readResolve() {
            return f28874b;
        }

        @Override // com.google.common.base.Equivalence
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Equivalence f28875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f28876c;

        /* JADX WARN: Multi-variable type inference failed */
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.f28875b.equals(wrapper.f28875b)) {
                return this.f28875b.equivalent(this.f28876c, wrapper.f28876c);
            }
            return false;
        }

        @ParametricNullness
        public T get() {
            return (T) this.f28876c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            return this.f28875b.hash(this.f28876c);
        }

        public String toString() {
            return this.f28875b + ".wrap(" + this.f28876c + ")";
        }

        private Wrapper(Equivalence equivalence, Object obj) {
            this.f28875b = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f28876c = obj;
        }
    }

    protected Equivalence() {
    }

    public static Equivalence<Object> equals() {
        return Equals.f28871b;
    }

    public static Equivalence<Object> identity() {
        return Identity.f28874b;
    }

    protected abstract boolean a(Object obj, Object obj2);

    protected abstract int b(Object obj);

    public final boolean equivalent(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return a(t10, t11);
    }

    public final Predicate<T> equivalentTo(T t10) {
        return new EquivalentToPredicate(this, t10);
    }

    public final int hash(T t10) {
        if (t10 == null) {
            return 0;
        }
        return b(t10);
    }

    public final <F> Equivalence<F> onResultOf(Function<? super F, ? extends T> function) {
        return new FunctionalEquivalence(function, this);
    }

    @GwtCompatible(serializable = true)
    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
        return new PairwiseEquivalence(this);
    }

    public final <S extends T> Wrapper<S> wrap(@ParametricNullness S s10) {
        return new Wrapper<>(s10);
    }
}
