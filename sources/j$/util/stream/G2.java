package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class G2 extends AbstractC5703h0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f85037m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G2(AbstractC5667a abstractC5667a, int i10, int i11) {
        super(abstractC5667a, i10, 0);
        this.f85037m = i11;
    }

    @Override // j$.util.stream.AbstractC5667a
    public Spliterator I(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        switch (this.f85037m) {
            case 1:
                return EnumC5671a3.ORDERED.n(abstractC5667a.f85185f) ? H(abstractC5667a, spliterator, new C5673b0(18)).spliterator() : new e4((j$.util.Y) abstractC5667a.Q(spliterator), 1);
            default:
                return super.I(abstractC5667a, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        switch (this.f85037m) {
            case 0:
                if (EnumC5671a3.SORTED.n(abstractC5667a.f85185f)) {
                    return abstractC5667a.z(spliterator, false, intFunction);
                }
                long[] jArr = (long[]) ((D0) abstractC5667a.z(spliterator, true, intFunction)).d();
                Arrays.sort(jArr);
                return new C5714j1(jArr);
            default:
                return (F0) new Z3(this, abstractC5667a, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        switch (this.f85037m) {
            case 0:
                Objects.requireNonNull(interfaceC5725l2);
                if (EnumC5671a3.SORTED.n(i10)) {
                    return interfaceC5725l2;
                }
                return EnumC5671a3.SIZED.n(i10) ? new L2(interfaceC5725l2) : new D2(interfaceC5725l2);
            default:
                return new Q3(this, interfaceC5725l2);
        }
    }
}
