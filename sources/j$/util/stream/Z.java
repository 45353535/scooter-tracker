package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z extends AbstractC5668a0 {
    @Override // j$.util.stream.AbstractC5667a
    public final boolean J() {
        return false;
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final IntStream sequential() {
        this.f85180a.f85190k = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final IntStream parallel() {
        this.f85180a.f85190k = true;
        return this;
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final InterfaceC5697g unordered() {
        return !EnumC5671a3.ORDERED.n(this.f85185f) ? this : new C5756s(this, EnumC5671a3.f85208r, 2);
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
