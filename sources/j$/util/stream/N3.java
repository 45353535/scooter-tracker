package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class N3 extends Y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IntPredicate f85107l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(AbstractC5668a0 abstractC5668a0, int i10, IntPredicate intPredicate) {
        super(abstractC5668a0, i10);
        this.f85107l = intPredicate;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator I(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        return EnumC5671a3.ORDERED.n(abstractC5667a.f85185f) ? H(abstractC5667a, spliterator, new C5673b0(16)).spliterator() : new c4((Spliterator.OfInt) abstractC5667a.Q(spliterator), this.f85107l);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        return (F0) new Z3(this, abstractC5667a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        return new M3(this, interfaceC5725l2);
    }
}
