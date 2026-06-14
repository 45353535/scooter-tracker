package j$.util.stream;

import j$.util.EnumC5653e;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class H2 extends AbstractC5680c2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f85047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Comparator f85048n;

    public H2(AbstractC5685d2 abstractC5685d2) {
        super(abstractC5685d2, EnumC5671a3.f85207q | EnumC5671a3.f85205o, 0);
        this.f85047m = true;
        this.f85048n = EnumC5653e.INSTANCE;
    }

    public H2(AbstractC5685d2 abstractC5685d2, Comparator comparator) {
        super(abstractC5685d2, EnumC5671a3.f85207q | EnumC5671a3.f85206p, 0);
        this.f85047m = false;
        this.f85048n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        Objects.requireNonNull(interfaceC5725l2);
        if (EnumC5671a3.SORTED.n(i10) && this.f85047m) {
            return interfaceC5725l2;
        }
        boolean zN = EnumC5671a3.SIZED.n(i10);
        Comparator comparator = this.f85048n;
        if (zN) {
            return new M2(interfaceC5725l2, comparator);
        }
        return new I2(interfaceC5725l2, comparator);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5671a3.SORTED.n(abstractC5667a.f85185f) && this.f85047m) {
            return abstractC5667a.z(spliterator, false, intFunction);
        }
        Object[] objArrO = abstractC5667a.z(spliterator, true, intFunction).o(intFunction);
        Arrays.sort(objArrO, this.f85048n);
        return new I0(objArrO);
    }
}
