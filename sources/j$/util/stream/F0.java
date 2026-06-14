package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public interface F0 {
    F0 b(int i10);

    long count();

    void forEach(Consumer consumer);

    F0 h(long j10, long j11, IntFunction intFunction);

    void i(Object[] objArr, int i10);

    Object[] o(IntFunction intFunction);

    int q();

    Spliterator spliterator();
}
