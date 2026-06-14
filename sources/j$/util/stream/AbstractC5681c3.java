package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5681c3 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f85231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5667a f85232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Supplier f85233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spliterator f85234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC5725l2 f85235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BooleanSupplier f85236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f85237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AbstractC5677c f85238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f85239i;

    public abstract void d();

    public abstract AbstractC5681c3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC5650b.e(this, i10);
    }

    public AbstractC5681c3(AbstractC5667a abstractC5667a, Supplier supplier, boolean z10) {
        this.f85232b = abstractC5667a;
        this.f85233c = supplier;
        this.f85234d = null;
        this.f85231a = z10;
    }

    public AbstractC5681c3(AbstractC5667a abstractC5667a, Spliterator spliterator, boolean z10) {
        this.f85232b = abstractC5667a;
        this.f85233c = null;
        this.f85234d = spliterator;
        this.f85231a = z10;
    }

    public final void c() {
        if (this.f85234d == null) {
            this.f85234d = (Spliterator) this.f85233c.get();
            this.f85233c = null;
        }
    }

    public final boolean a() {
        AbstractC5677c abstractC5677c = this.f85238h;
        if (abstractC5677c == null) {
            if (this.f85239i) {
                return false;
            }
            c();
            d();
            this.f85237g = 0L;
            this.f85235e.l(this.f85234d.getExactSizeIfKnown());
            return b();
        }
        long j10 = this.f85237g + 1;
        this.f85237g = j10;
        boolean z10 = j10 < abstractC5677c.count();
        if (z10) {
            return z10;
        }
        this.f85237g = 0L;
        this.f85238h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f85231a || this.f85238h != null || this.f85239i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.f85234d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }

    public final boolean b() {
        while (this.f85238h.count() == 0) {
            if (this.f85235e.n() || !this.f85236f.getAsBoolean()) {
                if (this.f85239i) {
                    return false;
                }
                this.f85235e.k();
                this.f85239i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f85234d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC5671a3.SIZED.n(this.f85232b.f85185f)) {
            return this.f85234d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i10 = this.f85232b.f85185f;
        int i11 = i10 & ((~i10) >> 1) & EnumC5671a3.f85200j & EnumC5671a3.f85196f;
        return (i11 & 64) != 0 ? (i11 & (-16449)) | (this.f85234d.characteristics() & 16448) : i11;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC5650b.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f85234d);
    }
}
