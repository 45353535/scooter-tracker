package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5753r1 extends W2 implements F0, InterfaceC5782x0 {
    @Override // j$.util.stream.InterfaceC5782x0
    public final F0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(int i10) {
        AbstractC5773v1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(long j10) {
        AbstractC5773v1.l();
        throw null;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 h(long j10, long j11, IntFunction intFunction) {
        return AbstractC5773v1.w(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final F0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final void i(Object[] objArr, int i10) {
        long j10 = i10;
        long jCount = count() + j10;
        if (jCount > objArr.length || jCount < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f85226c == 0) {
            System.arraycopy(this.f85160e, 0, objArr, i10, this.f85225b);
            return;
        }
        for (int i11 = 0; i11 < this.f85226c; i11++) {
            Object[] objArr2 = this.f85161f[i11];
            System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
            i10 += this.f85161f[i11].length;
        }
        int i12 = this.f85225b;
        if (i12 > 0) {
            System.arraycopy(this.f85160e, 0, objArr, i10, i12);
        }
    }

    @Override // j$.util.stream.F0
    public final Object[] o(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        clear();
        s(j10);
    }
}
