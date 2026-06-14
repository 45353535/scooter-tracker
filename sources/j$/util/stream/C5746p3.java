package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5746p3 extends AbstractC5681c3 implements j$.util.Y {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.h(this, consumer);
    }

    @Override // j$.util.stream.AbstractC5681c3
    public final AbstractC5681c3 e(Spliterator spliterator) {
        return new C5746p3(this.f85232b, spliterator, this.f85231a);
    }

    @Override // j$.util.stream.AbstractC5681c3
    public final void d() {
        T2 t22 = new T2();
        this.f85238h = t22;
        Objects.requireNonNull(t22);
        this.f85235e = this.f85232b.P(new C5741o3(t22, 1));
        this.f85236f = new j$.time.format.r(15, this);
    }

    @Override // j$.util.stream.AbstractC5681c3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5681c3, j$.util.Spliterator
    public final j$.util.Y trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC5681c3, j$.util.Spliterator
    public final j$.util.b0 trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j10;
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            T2 t22 = (T2) this.f85238h;
            long j11 = this.f85237g;
            int iU = t22.u(j11);
            if (t22.f85226c == 0 && iU == 0) {
                j10 = ((long[]) t22.f85154e)[(int) j11];
            } else {
                j10 = ((long[][]) t22.f85155f)[iU][(int) (j11 - t22.f85227d[iU])];
            }
            longConsumer.accept(j10);
        }
        return zA;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f85238h == null && !this.f85239i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            C5741o3 c5741o3 = new C5741o3(longConsumer, 0);
            this.f85232b.O(this.f85234d, c5741o3);
            this.f85239i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
