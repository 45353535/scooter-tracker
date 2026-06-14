package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5736n3 extends AbstractC5681c3 implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.g(this, consumer);
    }

    @Override // j$.util.stream.AbstractC5681c3
    public final AbstractC5681c3 e(Spliterator spliterator) {
        return new C5736n3(this.f85232b, spliterator, this.f85231a);
    }

    @Override // j$.util.stream.AbstractC5681c3
    public final void d() {
        R2 r22 = new R2();
        this.f85238h = r22;
        Objects.requireNonNull(r22);
        this.f85235e = this.f85232b.P(new C5731m3(r22, 1));
        this.f85236f = new j$.time.format.r(14, this);
    }

    @Override // j$.util.stream.AbstractC5681c3, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5681c3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5681c3, j$.util.Spliterator
    public final j$.util.b0 trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i10;
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            R2 r22 = (R2) this.f85238h;
            long j10 = this.f85237g;
            int iU = r22.u(j10);
            if (r22.f85226c == 0 && iU == 0) {
                i10 = ((int[]) r22.f85154e)[(int) j10];
            } else {
                i10 = ((int[][]) r22.f85155f)[iU][(int) (j10 - r22.f85227d[iU])];
            }
            intConsumer.accept(i10);
        }
        return zA;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f85238h == null && !this.f85239i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            C5731m3 c5731m3 = new C5731m3(intConsumer, 0);
            this.f85232b.O(this.f85234d, c5731m3);
            this.f85239i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
