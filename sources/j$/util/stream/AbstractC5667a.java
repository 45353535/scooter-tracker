package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5667a implements InterfaceC5697g, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5667a f85180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5667a f85181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC5667a f85183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Spliterator f85186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f85187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f85188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f85189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f85190k;

    public abstract F0 C(AbstractC5667a abstractC5667a, Spliterator spliterator, boolean z10, IntFunction intFunction);

    public abstract boolean E(Spliterator spliterator, InterfaceC5725l2 interfaceC5725l2);

    public abstract EnumC5676b3 F();

    public abstract InterfaceC5782x0 G(long j10, IntFunction intFunction);

    public abstract boolean J();

    public abstract InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2);

    public abstract Spliterator N(AbstractC5667a abstractC5667a, Supplier supplier, boolean z10);

    public AbstractC5667a(Spliterator spliterator, int i10, boolean z10) {
        this.f85181b = null;
        this.f85186g = spliterator;
        this.f85180a = this;
        int i11 = EnumC5671a3.f85197g & i10;
        this.f85182c = i11;
        this.f85185f = (~(i11 << 1)) & EnumC5671a3.f85202l;
        this.f85184e = 0;
        this.f85190k = z10;
    }

    public AbstractC5667a(AbstractC5667a abstractC5667a, int i10) {
        if (abstractC5667a.f85187h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC5667a.f85187h = true;
        abstractC5667a.f85183d = this;
        this.f85181b = abstractC5667a;
        this.f85182c = EnumC5671a3.f85198h & i10;
        this.f85185f = EnumC5671a3.j(i10, abstractC5667a.f85185f);
        AbstractC5667a abstractC5667a2 = abstractC5667a.f85180a;
        this.f85180a = abstractC5667a2;
        if (J()) {
            abstractC5667a2.f85188i = true;
        }
        this.f85184e = abstractC5667a.f85184e + 1;
    }

    public final Object A(G3 g32) {
        if (this.f85187h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f85187h = true;
        if (this.f85180a.f85190k) {
            return g32.c(this, L(g32.d()));
        }
        return g32.b(this, L(g32.d()));
    }

    public final F0 B(IntFunction intFunction) {
        AbstractC5667a abstractC5667a;
        if (this.f85187h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f85187h = true;
        if (this.f85180a.f85190k && (abstractC5667a = this.f85181b) != null && J()) {
            this.f85184e = 0;
            return H(abstractC5667a, abstractC5667a.L(0), intFunction);
        }
        return z(L(0), true, intFunction);
    }

    public final Spliterator M() {
        AbstractC5667a abstractC5667a = this.f85180a;
        if (this != abstractC5667a) {
            throw new IllegalStateException();
        }
        if (this.f85187h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f85187h = true;
        Spliterator spliterator = abstractC5667a.f85186g;
        if (spliterator != null) {
            abstractC5667a.f85186g = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final InterfaceC5697g sequential() {
        this.f85180a.f85190k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final InterfaceC5697g parallel() {
        this.f85180a.f85190k = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f85187h = true;
        this.f85186g = null;
        AbstractC5667a abstractC5667a = this.f85180a;
        Runnable runnable = abstractC5667a.f85189j;
        if (runnable != null) {
            abstractC5667a.f85189j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final InterfaceC5697g onClose(Runnable runnable) {
        if (this.f85187h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC5667a abstractC5667a = this.f85180a;
        Runnable runnable2 = abstractC5667a.f85189j;
        if (runnable2 != null) {
            runnable = new F3(runnable2, runnable);
        }
        abstractC5667a.f85189j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC5697g
    public Spliterator spliterator() {
        if (this.f85187h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f85187h = true;
        AbstractC5667a abstractC5667a = this.f85180a;
        if (this == abstractC5667a) {
            Spliterator spliterator = abstractC5667a.f85186g;
            if (spliterator != null) {
                abstractC5667a.f85186g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return N(this, new j$.time.format.r(4, this), abstractC5667a.f85190k);
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final boolean isParallel() {
        return this.f85180a.f85190k;
    }

    public final F0 z(Spliterator spliterator, boolean z10, IntFunction intFunction) {
        if (this.f85180a.f85190k) {
            return C(this, spliterator, z10, intFunction);
        }
        InterfaceC5782x0 interfaceC5782x0G = G(D(spliterator), intFunction);
        O(spliterator, interfaceC5782x0G);
        return interfaceC5782x0G.a();
    }

    public final Spliterator L(int i10) {
        int i11;
        int i12;
        AbstractC5667a abstractC5667a = this.f85180a;
        Spliterator spliteratorI = abstractC5667a.f85186g;
        if (spliteratorI != null) {
            abstractC5667a.f85186g = null;
            if (abstractC5667a.f85190k && abstractC5667a.f85188i) {
                AbstractC5667a abstractC5667a2 = abstractC5667a.f85183d;
                int i13 = 1;
                while (abstractC5667a != this) {
                    int i14 = abstractC5667a2.f85182c;
                    if (abstractC5667a2.J()) {
                        if (EnumC5671a3.SHORT_CIRCUIT.n(i14)) {
                            i14 &= ~EnumC5671a3.f85211u;
                        }
                        spliteratorI = abstractC5667a2.I(abstractC5667a, spliteratorI);
                        if (spliteratorI.hasCharacteristics(64)) {
                            i11 = (~EnumC5671a3.f85210t) & i14;
                            i12 = EnumC5671a3.f85209s;
                        } else {
                            i11 = (~EnumC5671a3.f85209s) & i14;
                            i12 = EnumC5671a3.f85210t;
                        }
                        i14 = i11 | i12;
                        i13 = 0;
                    }
                    int i15 = i13 + 1;
                    abstractC5667a2.f85184e = i13;
                    abstractC5667a2.f85185f = EnumC5671a3.j(i14, abstractC5667a.f85185f);
                    AbstractC5667a abstractC5667a3 = abstractC5667a2;
                    abstractC5667a2 = abstractC5667a2.f85183d;
                    abstractC5667a = abstractC5667a3;
                    i13 = i15;
                }
            }
            if (i10 != 0) {
                this.f85185f = EnumC5671a3.j(i10, this.f85185f);
            }
            return spliteratorI;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public final long D(Spliterator spliterator) {
        if (EnumC5671a3.SIZED.n(this.f85185f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public final InterfaceC5725l2 O(Spliterator spliterator, InterfaceC5725l2 interfaceC5725l2) {
        x(spliterator, P((InterfaceC5725l2) Objects.requireNonNull(interfaceC5725l2)));
        return interfaceC5725l2;
    }

    public final void x(Spliterator spliterator, InterfaceC5725l2 interfaceC5725l2) {
        Objects.requireNonNull(interfaceC5725l2);
        if (!EnumC5671a3.SHORT_CIRCUIT.n(this.f85185f)) {
            interfaceC5725l2.l(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(interfaceC5725l2);
            interfaceC5725l2.k();
            return;
        }
        y(spliterator, interfaceC5725l2);
    }

    public final boolean y(Spliterator spliterator, InterfaceC5725l2 interfaceC5725l2) {
        AbstractC5667a abstractC5667a = this;
        while (abstractC5667a.f85184e > 0) {
            abstractC5667a = abstractC5667a.f85181b;
        }
        interfaceC5725l2.l(spliterator.getExactSizeIfKnown());
        boolean zE = abstractC5667a.E(spliterator, interfaceC5725l2);
        interfaceC5725l2.k();
        return zE;
    }

    public final InterfaceC5725l2 P(InterfaceC5725l2 interfaceC5725l2) {
        Objects.requireNonNull(interfaceC5725l2);
        AbstractC5667a abstractC5667a = this;
        while (abstractC5667a.f85184e > 0) {
            AbstractC5667a abstractC5667a2 = abstractC5667a.f85181b;
            interfaceC5725l2 = abstractC5667a.K(abstractC5667a2.f85185f, interfaceC5725l2);
            abstractC5667a = abstractC5667a2;
        }
        return interfaceC5725l2;
    }

    public final Spliterator Q(Spliterator spliterator) {
        return this.f85184e == 0 ? spliterator : N(this, new j$.time.format.r(5, spliterator), this.f85180a.f85190k);
    }

    public F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator I(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        return H(abstractC5667a, spliterator, new j$.time.format.a(9)).spliterator();
    }
}
