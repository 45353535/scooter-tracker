package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class V0 extends Y0 implements B0 {
    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC5773v1.r(this, consumer);
    }

    @Override // j$.util.stream.Y0, j$.util.stream.F0
    public final /* synthetic */ F0 h(long j10, long j11, IntFunction intFunction) {
        return AbstractC5773v1.u(this, j10, j11);
    }

    @Override // j$.util.stream.Y0, j$.util.stream.F0
    public final /* bridge */ /* synthetic */ F0 b(int i10) {
        b(i10);
        throw null;
    }

    @Override // j$.util.stream.Y0, j$.util.stream.F0
    public final E0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void i(Object[] objArr, int i10) {
        AbstractC5773v1.o(this, (Integer[]) objArr, i10);
    }

    @Override // j$.util.stream.E0
    public final /* bridge */ /* synthetic */ Object d() {
        return AbstractC5773v1.f85378e;
    }

    @Override // j$.util.stream.F0
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.f84805b;
    }

    @Override // j$.util.stream.F0
    public final /* bridge */ /* synthetic */ j$.util.b0 spliterator() {
        return Spliterators.f84805b;
    }
}
