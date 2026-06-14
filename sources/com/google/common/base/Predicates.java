package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Predicates {

    private static class AndPredicate<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f28919b;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t10) {
            for (int i10 = 0; i10 < this.f28919b.size(); i10++) {
                if (!((Predicate) this.f28919b.get(i10)).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.f28919b.equals(((AndPredicate) obj).f28919b);
            }
            return false;
        }

        public int hashCode() {
            return this.f28919b.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.e("and", this.f28919b);
        }

        private AndPredicate(List list) {
            this.f28919b = list;
        }
    }

    private static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Predicate f28920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Function f28921c;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness A a10) {
            return this.f28920b.apply(this.f28921c.apply(a10));
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof CompositionPredicate) {
                CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
                if (this.f28921c.equals(compositionPredicate.f28921c) && this.f28920b.equals(compositionPredicate.f28920b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f28921c.hashCode() ^ this.f28920b.hashCode();
        }

        public String toString() {
            return this.f28920b + "(" + this.f28921c + ")";
        }

        private CompositionPredicate(Predicate predicate, Function function) {
            this.f28920b = (Predicate) Preconditions.checkNotNull(predicate);
            this.f28921c = (Function) Preconditions.checkNotNull(function);
        }
    }

    @GwtIncompatible
    private static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        ContainsPatternFromStringPredicate(String str) {
            super(Platform.a(str));
        }

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public String toString() {
            return "Predicates.containsPattern(" + this.f28922b.pattern() + ")";
        }
    }

    @GwtIncompatible
    private static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CommonPattern f28922b;

        ContainsPatternPredicate(CommonPattern commonPattern) {
            this.f28922b = (CommonPattern) Preconditions.checkNotNull(commonPattern);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof ContainsPatternPredicate) {
                ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
                if (Objects.equal(this.f28922b.pattern(), containsPatternPredicate.f28922b.pattern()) && this.f28922b.flags() == containsPatternPredicate.f28922b.flags()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f28922b.pattern(), Integer.valueOf(this.f28922b.flags()));
        }

        public String toString() {
            return "Predicates.contains(" + MoreObjects.toStringHelper(this.f28922b).add("pattern", this.f28922b.pattern()).add("pattern.flags", this.f28922b.flags()).toString() + ")";
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(CharSequence charSequence) {
            return this.f28922b.matcher(charSequence).find();
        }
    }

    private static class InPredicate<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Collection f28923b;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t10) {
            try {
                return this.f28923b.contains(t10);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof InPredicate) {
                return this.f28923b.equals(((InPredicate) obj).f28923b);
            }
            return false;
        }

        public int hashCode() {
            return this.f28923b.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f28923b + ")";
        }

        private InPredicate(Collection collection) {
            this.f28923b = (Collection) Preconditions.checkNotNull(collection);
        }
    }

    @GwtIncompatible
    private static class InstanceOfPredicate<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f28924b;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t10) {
            return this.f28924b.isInstance(t10);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            return (obj instanceof InstanceOfPredicate) && this.f28924b == ((InstanceOfPredicate) obj).f28924b;
        }

        public int hashCode() {
            return this.f28924b.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f28924b.getName() + ")";
        }

        private InstanceOfPredicate(Class cls) {
            this.f28924b = (Class) Preconditions.checkNotNull(cls);
        }
    }

    private static class IsEqualToPredicate implements Predicate<Object>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f28925b;

        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f28925b.equals(obj);
        }

        Predicate d() {
            return this;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.f28925b.equals(((IsEqualToPredicate) obj).f28925b);
            }
            return false;
        }

        public int hashCode() {
            return this.f28925b.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f28925b + ")";
        }

        private IsEqualToPredicate(Object obj) {
            this.f28925b = obj;
        }
    }

    private static class NotPredicate<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Predicate f28926b;

        NotPredicate(Predicate predicate) {
            this.f28926b = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t10) {
            return !this.f28926b.apply(t10);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.f28926b.equals(((NotPredicate) obj).f28926b);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f28926b.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f28926b + ")";
        }
    }

    enum ObjectPredicate implements Predicate<Object> {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicate
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicate
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicate
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicate
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        Predicate g() {
            return this;
        }
    }

    private static class OrPredicate<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f28928b;

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t10) {
            for (int i10 = 0; i10 < this.f28928b.size(); i10++) {
                if (((Predicate) this.f28928b.get(i10)).apply(t10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof OrPredicate) {
                return this.f28928b.equals(((OrPredicate) obj).f28928b);
            }
            return false;
        }

        public int hashCode() {
            return this.f28928b.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.e("or", this.f28928b);
        }

        private OrPredicate(List list) {
            this.f28928b = list;
        }
    }

    @GwtIncompatible
    @J2ktIncompatible
    private static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f28929b;

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            return (obj instanceof SubtypeOfPredicate) && this.f28929b == ((SubtypeOfPredicate) obj).f28929b;
        }

        public int hashCode() {
            return this.f28929b.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f28929b.getName() + ")";
        }

        private SubtypeOfPredicate(Class cls) {
            this.f28929b = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Class<?> cls) {
            return this.f28929b.isAssignableFrom(cls);
        }
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysFalse() {
        return ObjectPredicate.ALWAYS_FALSE.g();
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysTrue() {
        return ObjectPredicate.ALWAYS_TRUE.g();
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new AndPredicate(c(iterable));
    }

    private static List b(Predicate predicate, Predicate predicate2) {
        return Arrays.asList(predicate, predicate2);
    }

    static List c(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Preconditions.checkNotNull(it.next()));
        }
        return arrayList;
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new CompositionPredicate(predicate, function);
    }

    @GwtIncompatible("java.util.regex.Pattern")
    public static Predicate<CharSequence> contains(Pattern pattern) {
        return new ContainsPatternPredicate(new JdkPattern(pattern));
    }

    @GwtIncompatible
    public static Predicate<CharSequence> containsPattern(String str) {
        return new ContainsPatternFromStringPredicate(str);
    }

    private static List d(Object... objArr) {
        return c(Arrays.asList(objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> Predicate<T> equalTo(@ParametricNullness T t10) {
        return t10 == null ? isNull() : new IsEqualToPredicate(t10).d();
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new InPredicate(collection);
    }

    @GwtIncompatible
    public static <T> Predicate<T> instanceOf(Class<?> cls) {
        return new InstanceOfPredicate(cls);
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> isNull() {
        return ObjectPredicate.IS_NULL.g();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new NotPredicate(predicate);
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> notNull() {
        return ObjectPredicate.NOT_NULL.g();
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new OrPredicate(c(iterable));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new SubtypeOfPredicate(cls);
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new AndPredicate(d(predicateArr));
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
        return new OrPredicate(d(predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new AndPredicate(b((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new OrPredicate(b((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }
}
