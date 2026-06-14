package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5745p2 extends Y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f85334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f85335m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5745p2(AbstractC5668a0 abstractC5668a0, int i10, long j10, long j11) {
        super(abstractC5668a0, i10);
        this.f85334l = j10;
        this.f85335m = j11;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator I(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        long jD = abstractC5667a.D(spliterator);
        long j10 = this.f85335m;
        if (jD > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator.OfInt ofInt = (Spliterator.OfInt) abstractC5667a.Q(spliterator);
            long j11 = this.f85334l;
            return new C5755r3(ofInt, j11, AbstractC5779w2.c(j11, j10));
        }
        if (EnumC5671a3.ORDERED.n(abstractC5667a.f85185f)) {
            return ((F0) new C5774v2(this, abstractC5667a, spliterator, new C5673b0(11), this.f85334l, this.f85335m).invoke()).spliterator();
        }
        Spliterator.OfInt ofInt2 = (Spliterator.OfInt) abstractC5667a.Q(spliterator);
        long j12 = this.f85334l;
        if (j12 <= jD) {
            long jMin = jD - j12;
            if (j10 >= 0) {
                jMin = Math.min(j10, jMin);
            }
            j10 = jMin;
            j12 = 0;
        }
        return new C5785x3(ofInt2, j12, j10);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j10;
        long jD = abstractC5667a.D(spliterator);
        if (jD <= 0 || !spliterator.hasCharacteristics(16384)) {
            if (!EnumC5671a3.ORDERED.n(abstractC5667a.f85185f)) {
                Spliterator.OfInt ofInt = (Spliterator.OfInt) abstractC5667a.Q(spliterator);
                long j11 = this.f85334l;
                long j12 = this.f85335m;
                if (j11 <= jD) {
                    long j13 = jD - j11;
                    jMin = j12 >= 0 ? Math.min(j12, j13) : j13;
                    j10 = 0;
                } else {
                    jMin = j12;
                    j10 = j11;
                }
                return AbstractC5773v1.A(this, new C5785x3(ofInt, j10, jMin), true);
            }
            return (F0) new C5774v2(this, abstractC5667a, spliterator, intFunction, this.f85334l, this.f85335m).invoke();
        }
        AbstractC5667a abstractC5667a2 = abstractC5667a;
        while (abstractC5667a2.f85184e > 0) {
            abstractC5667a2 = abstractC5667a2.f85181b;
        }
        return AbstractC5773v1.A(abstractC5667a, AbstractC5779w2.b(abstractC5667a2.F(), spliterator, this.f85334l, this.f85335m), true);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        return new C5740o2(this, interfaceC5725l2);
    }
}
