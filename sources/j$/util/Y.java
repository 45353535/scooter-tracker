package j$.util;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public interface Y extends b0 {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.b0, j$.util.Spliterator
    Y trySplit();
}
