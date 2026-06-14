package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class C implements G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f84998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Predicate f84999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier f85000d;

    public C(boolean z10, EnumC5676b3 enumC5676b3, Object obj, Predicate predicate, Supplier supplier) {
        this.f84997a = (z10 ? 0 : EnumC5671a3.f85208r) | EnumC5671a3.f85211u;
        this.f84998b = obj;
        this.f84999c = predicate;
        this.f85000d = supplier;
    }

    @Override // j$.util.stream.G3
    public final int d() {
        return this.f84997a;
    }

    @Override // j$.util.stream.G3
    public final Object b(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        H3 h32 = (H3) this.f85000d.get();
        abstractC5667a.O(spliterator, h32);
        Object obj = h32.get();
        return obj != null ? obj : this.f84998b;
    }

    @Override // j$.util.stream.G3
    public final Object c(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        return new J(this, EnumC5671a3.ORDERED.n(abstractC5667a.f85185f), abstractC5667a, spliterator).invoke();
    }
}
