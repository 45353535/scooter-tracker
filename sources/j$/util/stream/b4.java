package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class b4 extends d4 {
    @Override // j$.util.stream.g4
    public final Spliterator c(Spliterator spliterator) {
        return new b4((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTryAdvance;
        boolean z10 = this.f85270c;
        Spliterator spliterator = this.f85268a;
        if (z10) {
            boolean z11 = false;
            this.f85270c = false;
            while (true) {
                zTryAdvance = ((Spliterator.OfInt) spliterator).tryAdvance((IntConsumer) this);
                if (!zTryAdvance || !b() || !this.f85248e.test(this.f85249f)) {
                    break;
                }
                z11 = true;
            }
            if (zTryAdvance) {
                if (z11) {
                    this.f85269b.set(true);
                }
                intConsumer.accept(this.f85249f);
            }
            return zTryAdvance;
        }
        return ((Spliterator.OfInt) spliterator).tryAdvance(intConsumer);
    }
}
