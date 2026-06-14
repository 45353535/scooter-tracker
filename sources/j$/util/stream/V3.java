package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class V3 extends AbstractC5781x implements W3 {
    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator I(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        return EnumC5671a3.ORDERED.n(abstractC5667a.f85185f) ? H(abstractC5667a, spliterator, new C5673b0(21)).spliterator() : new a4((j$.util.T) abstractC5667a.Q(spliterator), 0);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        return (F0) new Y3(this, abstractC5667a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        return new U3(this, interfaceC5725l2, false);
    }

    @Override // j$.util.stream.W3
    public final X3 k(InterfaceC5782x0 interfaceC5782x0, boolean z10) {
        return new U3(this, interfaceC5782x0, z10);
    }
}
