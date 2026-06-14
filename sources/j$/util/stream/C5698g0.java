package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5698g0 extends AbstractC5708i0 {
    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final InterfaceC5723l0 sequential() {
        this.f85180a.f85190k = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final InterfaceC5723l0 parallel() {
        this.f85180a.f85190k = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC5708i0, j$.util.stream.InterfaceC5723l0
    public final void forEach(LongConsumer longConsumer) {
        if (this.f85180a.f85190k) {
            super.forEach(longConsumer);
        } else {
            AbstractC5708i0.R(M()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC5708i0, j$.util.stream.InterfaceC5723l0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.f85180a.f85190k) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC5708i0.R(M()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final InterfaceC5697g unordered() {
        return !EnumC5671a3.ORDERED.n(this.f85185f) ? this : new C5761t(this, EnumC5671a3.f85208r, 4);
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
