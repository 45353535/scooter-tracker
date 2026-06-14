package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5776w extends AbstractC5786y {
    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final B sequential() {
        this.f85180a.f85190k = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final B parallel() {
        this.f85180a.f85190k = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC5786y, j$.util.stream.B
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.f85180a.f85190k) {
            super.forEach(doubleConsumer);
        } else {
            AbstractC5786y.R(M()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC5786y, j$.util.stream.B
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.f85180a.f85190k) {
            super.forEachOrdered(doubleConsumer);
        } else {
            AbstractC5786y.R(M()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final InterfaceC5697g unordered() {
        return !EnumC5671a3.ORDERED.n(this.f85185f) ? this : new r(this, EnumC5671a3.f85208r, 1);
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
