package j$.util;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public interface T extends b0 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.b0, j$.util.Spliterator
    T trySplit();
}
