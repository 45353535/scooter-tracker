package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class N0 extends P0 implements B0 {
    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC5773v1.r(this, consumer);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 h(long j10, long j11, IntFunction intFunction) {
        return AbstractC5773v1.u(this, j10, j11);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void i(Object[] objArr, int i10) {
        AbstractC5773v1.o(this, (Integer[]) objArr, i10);
    }

    @Override // j$.util.stream.E0
    public final Object c(int i10) {
        return new int[i10];
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new C5689e1(this);
    }

    @Override // j$.util.stream.F0
    public final j$.util.b0 spliterator() {
        return new C5689e1(this);
    }
}
