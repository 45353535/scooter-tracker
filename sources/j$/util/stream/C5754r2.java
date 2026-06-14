package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5754r2 extends AbstractC5703h0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f85351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f85352n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5754r2(AbstractC5708i0 abstractC5708i0, int i10, long j10, long j11) {
        super(abstractC5708i0, i10, 0);
        this.f85351m = j10;
        this.f85352n = j11;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator I(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        long jD = abstractC5667a.D(spliterator);
        long j10 = this.f85352n;
        if (jD > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.Y y10 = (j$.util.Y) abstractC5667a.Q(spliterator);
            long j11 = this.f85351m;
            return new C5760s3(y10, j11, AbstractC5779w2.c(j11, j10));
        }
        if (EnumC5671a3.ORDERED.n(abstractC5667a.f85185f)) {
            return ((F0) new C5774v2(this, abstractC5667a, spliterator, new C5673b0(12), this.f85351m, this.f85352n).invoke()).spliterator();
        }
        j$.util.Y y11 = (j$.util.Y) abstractC5667a.Q(spliterator);
        long j12 = this.f85351m;
        if (j12 <= jD) {
            long jMin = jD - j12;
            if (j10 >= 0) {
                jMin = Math.min(j10, jMin);
            }
            j10 = jMin;
            j12 = 0;
        }
        return new C5790y3(y11, j12, j10);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 H(AbstractC5667a abstractC5667a, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j10;
        long jD = abstractC5667a.D(spliterator);
        if (jD <= 0 || !spliterator.hasCharacteristics(16384)) {
            if (!EnumC5671a3.ORDERED.n(abstractC5667a.f85185f)) {
                j$.util.Y y10 = (j$.util.Y) abstractC5667a.Q(spliterator);
                long j11 = this.f85351m;
                long j12 = this.f85352n;
                if (j11 <= jD) {
                    long j13 = jD - j11;
                    jMin = j12 >= 0 ? Math.min(j12, j13) : j13;
                    j10 = 0;
                } else {
                    jMin = j12;
                    j10 = j11;
                }
                return AbstractC5773v1.B(this, new C5790y3(y10, j10, jMin), true);
            }
            return (F0) new C5774v2(this, abstractC5667a, spliterator, intFunction, this.f85351m, this.f85352n).invoke();
        }
        AbstractC5667a abstractC5667a2 = abstractC5667a;
        while (abstractC5667a2.f85184e > 0) {
            abstractC5667a2 = abstractC5667a2.f85181b;
        }
        return AbstractC5773v1.B(abstractC5667a, AbstractC5779w2.b(abstractC5667a2.F(), spliterator, this.f85351m, this.f85352n), true);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        return new C5750q2(this, interfaceC5725l2);
    }
}
