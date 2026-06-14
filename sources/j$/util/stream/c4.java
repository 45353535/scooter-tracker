package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class c4 extends d4 {
    @Override // j$.util.stream.g4
    public final Spliterator c(Spliterator spliterator) {
        return new c4((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTest;
        if (this.f85270c && b() && ((Spliterator.OfInt) this.f85268a).tryAdvance((IntConsumer) this)) {
            zTest = this.f85248e.test(this.f85249f);
            if (zTest) {
                intConsumer.accept(this.f85249f);
                return true;
            }
        } else {
            zTest = true;
        }
        this.f85270c = false;
        if (!zTest) {
            this.f85269b.set(true);
        }
        return false;
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        if (this.f85269b.get()) {
            return null;
        }
        return (Spliterator.OfInt) super.trySplit();
    }
}
