package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5675b2 extends AbstractC5685d2 {
    @Override // j$.util.stream.AbstractC5685d2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!this.f85180a.f85190k) {
            M().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC5685d2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!this.f85180a.f85190k) {
            M().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final InterfaceC5697g unordered() {
        return !EnumC5671a3.ORDERED.n(this.f85185f) ? this : new Z1(this, EnumC5671a3.f85208r, 1);
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
