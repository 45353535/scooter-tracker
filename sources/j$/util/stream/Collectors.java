package j$.util.stream;

import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import j$.util.stream.Collector;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class Collectors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f85010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f85011b;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        f85010a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        f85011b = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    public static <T, A, R, RR> Collector<T, A, RR> collectingAndThen(Collector<T, A, R> collector, Function<R, RR> function) {
        Set setCharacteristics = collector.characteristics();
        Collector.Characteristics characteristics = Collector.Characteristics.IDENTITY_FINISH;
        if (setCharacteristics.contains(characteristics)) {
            if (setCharacteristics.size() == 1) {
                setCharacteristics = f85011b;
            } else {
                EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setCharacteristics);
                enumSetCopyOf.remove(characteristics);
                setCharacteristics = Collections.unmodifiableSet(enumSetCopyOf);
            }
        }
        return new C5717k(collector.supplier(), collector.accumulator(), collector.combiner(), collector.finisher().mo7820andThen(function), setCharacteristics);
    }

    public static void a(double[] dArr, double d10) {
        double d11 = d10 - dArr[1];
        double d12 = dArr[0];
        double d13 = d12 + d11;
        dArr[1] = (d13 - d12) - d11;
        dArr[0] = d13;
    }

    public static <T, K, U, M extends Map<K, U>> Collector<T, ?, M> toMap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends U> function2, final BinaryOperator<U> binaryOperator, Supplier<M> supplier) {
        return new C5717k(supplier, new BiConsumer() { // from class: j$.util.stream.j
            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Set set = Collectors.f85010a;
                Map.EL.merge((java.util.Map) obj, function.apply(obj2), function2.apply(obj2), binaryOperator);
            }
        }, new j$.time.format.r(6, binaryOperator), f85010a);
    }
}
