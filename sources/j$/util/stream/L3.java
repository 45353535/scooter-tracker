package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class L3 extends AbstractC5680c2 implements W3 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Predicate f85088m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L3(AbstractC5685d2 abstractC5685d2, int i10, Predicate predicate) {
        super(abstractC5685d2, i10, 0);
        this.f85088m = predicate;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator I(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        return EnumC5671a3.ORDERED.n(abstractC5667a.f85185f) ? H(abstractC5667a, spliterator, new C5673b0(2)).spliterator() : new f4(abstractC5667a.Q(spliterator), this.f85088m, 0);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        return (F0) new Y3(this, abstractC5667a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        return new K3(this, interfaceC5725l2, false);
    }

    @Override // j$.util.stream.W3
    public final X3 k(InterfaceC5782x0 interfaceC5782x0, boolean z10) {
        return new K3(this, interfaceC5782x0, z10);
    }
}
