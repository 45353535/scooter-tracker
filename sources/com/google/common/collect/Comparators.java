package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j$.util.Comparator;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Comparators {
    @IgnoreJRERequirement
    public static <T> Collector<T, ?, List<T>> greatest(int i10, Comparator<? super T> comparator) {
        return least(i10, Comparator.EL.reversed(comparator));
    }

    public static <T> boolean isInOrder(Iterable<? extends T> iterable, java.util.Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> boolean isInStrictOrder(Iterable<? extends T> iterable, java.util.Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    @IgnoreJRERequirement
    public static <T> Collector<T, ?, List<T>> least(final int i10, final java.util.Comparator<? super T> comparator) {
        CollectPreconditions.b(i10, CampaignEx.JSON_KEY_AD_K);
        Preconditions.checkNotNull(comparator);
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.z1
            @Override // java.util.function.Supplier
            public final Object get() {
                return TopKSelector.least(i10, comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.a2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((TopKSelector) obj).offer(obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.b2
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((TopKSelector) obj).a((TopKSelector) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.c2
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TopKSelector) obj).topK();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Collector.Characteristics.UNORDERED);
    }

    public static <T, S extends T> java.util.Comparator<Iterable<S>> lexicographical(java.util.Comparator<T> comparator) {
        return new LexicographicalOrdering((java.util.Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <T extends Comparable<? super T>> T max(T t10, T t11) {
        return t10.compareTo(t11) >= 0 ? t10 : t11;
    }

    public static <T extends Comparable<? super T>> T min(T t10, T t11) {
        return t10.compareTo(t11) <= 0 ? t10 : t11;
    }

    @ParametricNullness
    public static <T> T max(@ParametricNullness T t10, @ParametricNullness T t11, java.util.Comparator<? super T> comparator) {
        return comparator.compare(t10, t11) >= 0 ? t10 : t11;
    }

    @ParametricNullness
    public static <T> T min(@ParametricNullness T t10, @ParametricNullness T t11, java.util.Comparator<? super T> comparator) {
        return comparator.compare(t10, t11) <= 0 ? t10 : t11;
    }
}
