package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class P3 extends Y implements W3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IntPredicate f85121l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P3(AbstractC5668a0 abstractC5668a0, int i10, IntPredicate intPredicate) {
        super(abstractC5668a0, i10);
        this.f85121l = intPredicate;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator I(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        return EnumC5671a3.ORDERED.n(abstractC5667a.f85185f) ? H(abstractC5667a, spliterator, new C5673b0(17)).spliterator() : new b4((Spliterator.OfInt) abstractC5667a.Q(spliterator), this.f85121l);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        return (F0) new Y3(this, abstractC5667a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        return new O3(this, interfaceC5725l2, false);
    }

    @Override // j$.util.stream.W3
    public final X3 k(InterfaceC5782x0 interfaceC5782x0, boolean z10) {
        return new O3(this, interfaceC5782x0, z10);
    }
}
