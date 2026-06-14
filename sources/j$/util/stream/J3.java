package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class J3 extends AbstractC5680c2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Predicate f85068m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J3(AbstractC5685d2 abstractC5685d2, int i10, Predicate predicate) {
        super(abstractC5685d2, i10, 0);
        this.f85068m = predicate;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator I(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        return EnumC5671a3.ORDERED.n(abstractC5667a.f85185f) ? H(abstractC5667a, spliterator, new C5673b0(2)).spliterator() : new f4(abstractC5667a.Q(spliterator), this.f85068m, 1);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        return (F0) new Z3(this, abstractC5667a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        return new C5722l(this, interfaceC5725l2);
    }
}
