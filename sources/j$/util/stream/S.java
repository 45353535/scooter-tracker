package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class S extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Spliterator f85135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5725l2 f85136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5667a f85137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f85138d;

    public S(AbstractC5667a abstractC5667a, Spliterator spliterator, InterfaceC5725l2 interfaceC5725l2) {
        super(null);
        this.f85136b = interfaceC5725l2;
        this.f85137c = abstractC5667a;
        this.f85135a = spliterator;
        this.f85138d = 0L;
    }

    public S(S s10, Spliterator spliterator) {
        super(s10);
        this.f85135a = spliterator;
        this.f85136b = s10.f85136b;
        this.f85138d = s10.f85138d;
        this.f85137c = s10.f85137c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f85135a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f85138d;
        if (jE == 0) {
            jE = AbstractC5682d.e(jEstimateSize);
            this.f85138d = jE;
        }
        boolean zN = EnumC5671a3.SHORT_CIRCUIT.n(this.f85137c.f85185f);
        InterfaceC5725l2 interfaceC5725l2 = this.f85136b;
        boolean z10 = false;
        S s10 = this;
        while (true) {
            if (zN && interfaceC5725l2.n()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            S s11 = new S(s10, spliteratorTrySplit);
            s10.addToPendingCount(1);
            if (z10) {
                spliterator = spliteratorTrySplit;
            } else {
                S s12 = s10;
                s10 = s11;
                s11 = s12;
            }
            z10 = !z10;
            s10.fork();
            s10 = s11;
            jEstimateSize = spliterator.estimateSize();
        }
        s10.f85137c.x(spliterator, interfaceC5725l2);
        s10.f85135a = null;
        s10.propagateCompletion();
    }
}
