package j$.util;

import j$.util.stream.C5675b2;
import j$.util.stream.EnumC5671a3;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public interface Collection<E> extends j$.lang.a {
    @Override // j$.util.Collection, j$.lang.a
    void forEach(Consumer<? super E> consumer);

    Stream<E> parallelStream();

    boolean removeIf(Predicate<? super E> predicate);

    Spliterator<E> spliterator();

    Stream<E> stream();

    <T> T[] toArray(IntFunction<T[]> intFunction);

    /* JADX INFO: renamed from: j$.util.Collection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            Objects.requireNonNull(predicate);
            Iterator<E> it = collection.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        public static Stream $default$stream(java.util.Collection collection) {
            Spliterator spliteratorT = AbstractC5650b.t(collection);
            Objects.requireNonNull(spliteratorT);
            return new C5675b2(spliteratorT, EnumC5671a3.m(spliteratorT), false);
        }

        public static Stream $default$parallelStream(java.util.Collection collection) {
            Spliterator spliteratorT = AbstractC5650b.t(collection);
            Objects.requireNonNull(spliteratorT);
            return new C5675b2(spliteratorT, EnumC5671a3.m(spliteratorT), true);
        }
    }
}
