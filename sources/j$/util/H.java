package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public interface H extends PrimitiveIterator {
    @Override // java.util.Iterator, j$.util.InterfaceC5802z
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(DoubleConsumer doubleConsumer);

    @Override // java.util.Iterator
    Double next();

    double nextDouble();
}
