package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class F2 extends Y {
    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        Objects.requireNonNull(interfaceC5725l2);
        return EnumC5671a3.SORTED.n(i10) ? interfaceC5725l2 : EnumC5671a3.SIZED.n(i10) ? new K2(interfaceC5725l2) : new C2(interfaceC5725l2);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5671a3.SORTED.n(abstractC5667a.f85185f)) {
            return abstractC5667a.z(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((B0) abstractC5667a.z(spliterator, true, intFunction)).d();
        Arrays.sort(iArr);
        return new C5669a1(iArr);
    }
}
