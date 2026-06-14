package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class Q0 extends H0 {
    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new C5704h1(this);
    }

    @Override // j$.util.stream.F0
    public final void i(Object[] objArr, int i10) {
        Objects.requireNonNull(objArr);
        F0 f02 = this.f85040a;
        f02.i(objArr, i10);
        this.f85041b.i(objArr, i10 + ((int) f02.count()));
    }

    @Override // j$.util.stream.F0
    public final Object[] o(IntFunction intFunction) {
        long j10 = this.f85042c;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j10);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.F0
    public final void forEach(Consumer consumer) {
        this.f85040a.forEach(consumer);
        this.f85041b.forEach(consumer);
    }

    @Override // j$.util.stream.F0
    public final F0 h(long j10, long j11, IntFunction intFunction) {
        if (j10 == 0 && j11 == this.f85042c) {
            return this;
        }
        long jCount = this.f85040a.count();
        if (j10 >= jCount) {
            return this.f85041b.h(j10 - jCount, j11 - jCount, intFunction);
        }
        if (j11 > jCount) {
            return AbstractC5773v1.C(EnumC5676b3.REFERENCE, this.f85040a.h(j10, jCount, intFunction), this.f85041b.h(0L, j11 - jCount, intFunction));
        }
        return this.f85040a.h(j10, j11, intFunction);
    }

    public final String toString() {
        long j10 = this.f85042c;
        return j10 < 32 ? String.format("ConcNode[%s.%s]", this.f85040a, this.f85041b) : String.format("ConcNode[size=%d]", Long.valueOf(j10));
    }
}
