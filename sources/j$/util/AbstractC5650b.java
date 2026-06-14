package j$.util;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5650b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f84823a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f84824b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};

    public static /* synthetic */ Stream s(java.util.Collection collection) {
        return collection instanceof Collection ? ((Collection) collection).parallelStream() : Collection.CC.$default$parallelStream(collection);
    }

    public static /* synthetic */ Stream u(java.util.Collection collection) {
        return collection instanceof Collection ? ((Collection) collection).stream() : Collection.CC.$default$stream(collection);
    }

    public static java.util.Optional m(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return java.util.Optional.of(optional.get());
        }
        return java.util.Optional.empty();
    }

    public static Optional i(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    public static OptionalDouble n(B b10) {
        if (b10 == null) {
            return null;
        }
        boolean z10 = b10.f84773a;
        if (!z10) {
            return OptionalDouble.empty();
        }
        if (z10) {
            return OptionalDouble.of(b10.f84774b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static B j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return B.f84772c;
        }
        return new B(optionalDouble.getAsDouble());
    }

    public static OptionalLong p(D d10) {
        if (d10 == null) {
            return null;
        }
        boolean z10 = d10.f84784a;
        if (!z10) {
            return OptionalLong.empty();
        }
        if (z10) {
            return OptionalLong.of(d10.f84785b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static D l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return D.f84783c;
        }
        return new D(optionalLong.getAsLong());
    }

    public static OptionalInt o(C c10) {
        if (c10 == null) {
            return null;
        }
        boolean z10 = c10.f84781a;
        if (!z10) {
            return OptionalInt.empty();
        }
        if (z10) {
            return OptionalInt.of(c10.f84782b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static C k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return C.f84780c;
        }
        return new C(optionalInt.getAsInt());
    }

    public static void r(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC5802z) {
            ((InterfaceC5802z) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static Spliterator t(java.util.Collection collection) {
        if (collection instanceof Collection) {
            return ((Collection) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return Spliterators.spliterator((LinkedHashSet) collection, 17);
        }
        if (!(collection instanceof java.util.SortedSet)) {
            return collection instanceof java.util.Set ? Spliterators.spliterator((java.util.Set) collection, 1) : collection instanceof java.util.List ? List.CC.$default$spliterator((java.util.List) collection) : Spliterators.spliterator(collection, 0);
        }
        java.util.SortedSet sortedSet = (java.util.SortedSet) collection;
        return new P(sortedSet, sortedSet);
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(Spliterator spliterator, int i10) {
        return (spliterator.characteristics() & i10) == i10;
    }

    public static void q(java.util.Collection collection, Consumer consumer) {
        if (collection instanceof Collection) {
            ((Collection) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static boolean g(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (s0.f84982a) {
            s0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return ofInt.tryAdvance((IntConsumer) new I(consumer, 0));
    }

    public static void b(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else {
            if (s0.f84982a) {
                s0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            ofInt.forEachRemaining((IntConsumer) new I(consumer, 0));
        }
    }

    public static boolean h(Y y10, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return y10.tryAdvance((LongConsumer) consumer);
        }
        if (s0.f84982a) {
            s0.a(y10.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return y10.tryAdvance((LongConsumer) new L(consumer, 0));
    }

    public static void c(Y y10, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            y10.forEachRemaining((LongConsumer) consumer);
        } else {
            if (s0.f84982a) {
                s0.a(y10.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            y10.forEachRemaining((LongConsumer) new L(consumer, 0));
        }
    }

    public static boolean f(T t10, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return t10.tryAdvance((DoubleConsumer) consumer);
        }
        if (s0.f84982a) {
            s0.a(t10.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return t10.tryAdvance((DoubleConsumer) new E(consumer, 0));
    }

    public static void a(T t10, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            t10.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (s0.f84982a) {
                s0.a(t10.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            t10.forEachRemaining((DoubleConsumer) new E(consumer, 0));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
