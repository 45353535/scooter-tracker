package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends AbstractC5668a0 {
    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final IntStream sequential() {
        this.f85180a.f85190k = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final IntStream parallel() {
        this.f85180a.f85190k = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC5668a0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.f85180a.f85190k) {
            super.forEach(intConsumer);
        } else {
            AbstractC5668a0.R(M()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC5668a0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.f85180a.f85190k) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC5668a0.R(M()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final InterfaceC5697g unordered() {
        return !EnumC5671a3.ORDERED.n(this.f85185f) ? this : new C5756s(this, EnumC5671a3.f85208r, 2);
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.AbstractC5667a
    public final boolean J() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        throw new UnsupportedOperationException();
    }
}
