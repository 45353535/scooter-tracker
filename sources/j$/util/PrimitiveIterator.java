package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public interface PrimitiveIterator<T, T_CONS> extends Iterator<T> {
    void forEachRemaining(T_CONS t_cons);

    public interface OfInt extends PrimitiveIterator<Integer, IntConsumer> {
        @Override // j$.util.PrimitiveIterator.OfInt
        void forEachRemaining(Consumer<? super Integer> consumer);

        void forEachRemaining(IntConsumer intConsumer);

        @Override // j$.util.PrimitiveIterator.OfInt
        Integer next();

        int nextInt();

        /* JADX INFO: renamed from: j$.util.PrimitiveIterator$OfInt$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$forEachRemaining(OfInt ofInt, IntConsumer intConsumer) {
                Objects.requireNonNull(intConsumer);
                while (ofInt.hasNext()) {
                    intConsumer.accept(ofInt.nextInt());
                }
            }

            public static void $default$forEachRemaining(OfInt ofInt, Consumer consumer) {
                if (consumer instanceof IntConsumer) {
                    ofInt.forEachRemaining((IntConsumer) consumer);
                    return;
                }
                Objects.requireNonNull(consumer);
                if (s0.f84982a) {
                    s0.a(ofInt.getClass(), "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
                    throw null;
                }
                Objects.requireNonNull(consumer);
                ofInt.forEachRemaining((IntConsumer) new I(consumer, 0));
            }
        }
    }
}
