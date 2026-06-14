package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5762t0 extends AbstractC5672b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j$.util.concurrent.s f85361j;

    public C5762t0(j$.util.concurrent.s sVar, AbstractC5667a abstractC5667a, Spliterator spliterator) {
        super(abstractC5667a, spliterator);
        this.f85361j = sVar;
    }

    public C5762t0(C5762t0 c5762t0, Spliterator spliterator) {
        super(c5762t0, spliterator);
        this.f85361j = c5762t0.f85361j;
    }

    @Override // j$.util.stream.AbstractC5682d
    public final AbstractC5682d c(Spliterator spliterator) {
        return new C5762t0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5682d
    public final Object a() {
        AbstractC5667a abstractC5667a = this.f85241a;
        AbstractC5752r0 abstractC5752r0 = (AbstractC5752r0) ((Supplier) this.f85361j.f84891c).get();
        abstractC5667a.O(this.f85242b, abstractC5752r0);
        boolean z10 = abstractC5752r0.f85350b;
        if (z10 == ((EnumC5757s0) this.f85361j.f84890b).f85356b) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            AtomicReference atomicReference = this.f85220h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC5672b
    public final Object h() {
        return Boolean.valueOf(!((EnumC5757s0) this.f85361j.f84890b).f85356b);
    }
}
