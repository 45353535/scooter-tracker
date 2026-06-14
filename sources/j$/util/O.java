package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public interface O extends PrimitiveIterator {
    @Override // java.util.Iterator, j$.util.InterfaceC5802z
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(LongConsumer longConsumer);

    @Override // java.util.Iterator
    Long next();

    long nextLong();
}
