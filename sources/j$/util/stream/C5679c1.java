package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5679c1 extends R2 implements B0, InterfaceC5772v0 {
    @Override // j$.util.stream.InterfaceC5772v0, j$.util.stream.InterfaceC5782x0
    public final B0 a() {
        return this;
    }

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
    public final /* synthetic */ void accept(long j10) {
        AbstractC5773v1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 h(long j10, long j11, IntFunction intFunction) {
        return AbstractC5773v1.u(this, j10, j11);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC5715j2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5773v1.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC5773v1.m(this, intFunction);
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
        AbstractC5773v1.o(this, (Integer[]) objArr, i10);
    }

    @Override // j$.util.stream.V2, j$.util.stream.E0
    public final void e(Object obj) {
        super.e((IntConsumer) obj);
    }

    @Override // j$.util.stream.V2, j$.util.stream.E0
    public final void r(int i10, Object obj) {
        super.r(i10, (int[]) obj);
    }

    @Override // j$.util.stream.R2, j$.util.stream.V2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.R2, j$.util.stream.V2, java.lang.Iterable
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
        return (int[]) super.d();
    }
}
