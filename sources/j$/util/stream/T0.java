package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class T0 extends P2 implements InterfaceC5792z0, InterfaceC5767u0 {
    @Override // j$.util.stream.InterfaceC5782x0
    public final F0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC5767u0, j$.util.stream.InterfaceC5782x0
    public final InterfaceC5792z0 a() {
        return this;
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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 h(long j10, long j11, IntFunction intFunction) {
        return AbstractC5773v1.t(this, j10, j11);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC5773v1.m(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC5710i2
    public final /* synthetic */ void p(Double d10) {
        AbstractC5773v1.e(this, d10);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final /* bridge */ /* synthetic */ F0 b(int i10) {
        b(i10);
        throw null;
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final E0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void i(Object[] objArr, int i10) {
        AbstractC5773v1.n(this, (Double[]) objArr, i10);
    }

    @Override // j$.util.stream.V2, j$.util.stream.E0
    public final void e(Object obj) {
        super.e((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.V2, j$.util.stream.E0
    public final void r(int i10, Object obj) {
        super.r(i10, (double[]) obj);
    }

    @Override // j$.util.stream.P2, j$.util.stream.V2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.P2, j$.util.stream.V2, java.lang.Iterable
    public final j$.util.b0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        clear();
        v(j10);
    }

    @Override // j$.util.stream.V2, j$.util.stream.E0
    public final Object d() {
        return (double[]) super.d();
    }
}
