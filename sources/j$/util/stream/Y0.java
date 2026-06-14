package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Y0 implements F0 {
    @Override // j$.util.stream.F0
    public final long count() {
        return 0L;
    }

    public final void e(Object obj) {
    }

    @Override // j$.util.stream.F0
    public /* synthetic */ F0 h(long j10, long j11, IntFunction intFunction) {
        return AbstractC5773v1.w(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public F0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final Object[] o(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    public final void r(int i10, Object obj) {
    }
}
