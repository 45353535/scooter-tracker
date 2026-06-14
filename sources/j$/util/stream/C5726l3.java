package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5726l3 extends AbstractC5681c3 implements j$.util.T {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.f(this, consumer);
    }

    @Override // j$.util.stream.AbstractC5681c3
    public final AbstractC5681c3 e(Spliterator spliterator) {
        return new C5726l3(this.f85232b, spliterator, this.f85231a);
    }

    @Override // j$.util.stream.AbstractC5681c3
    public final void d() {
        P2 p22 = new P2();
        this.f85238h = p22;
        Objects.requireNonNull(p22);
        this.f85235e = this.f85232b.P(new C5721k3(p22, 1));
        this.f85236f = new j$.time.format.r(13, this);
    }

    @Override // j$.util.stream.AbstractC5681c3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.T) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5681c3, j$.util.Spliterator
    public final j$.util.T trySplit() {
        return (j$.util.T) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5681c3, j$.util.Spliterator
    public final j$.util.b0 trySplit() {
        return (j$.util.T) super.trySplit();
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d10;
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            P2 p22 = (P2) this.f85238h;
            long j10 = this.f85237g;
            int iU = p22.u(j10);
            if (p22.f85226c == 0 && iU == 0) {
                d10 = ((double[]) p22.f85154e)[(int) j10];
            } else {
                d10 = ((double[][]) p22.f85155f)[iU][(int) (j10 - p22.f85227d[iU])];
            }
            doubleConsumer.accept(d10);
        }
        return zA;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f85238h == null && !this.f85239i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            C5721k3 c5721k3 = new C5721k3(doubleConsumer, 0);
            this.f85232b.O(this.f85234d, c5721k3);
            this.f85239i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
