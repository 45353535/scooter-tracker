package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class E3 extends AbstractC5681c3 {
    @Override // j$.util.stream.AbstractC5681c3
    public final AbstractC5681c3 e(Spliterator spliterator) {
        return new E3(this.f85232b, spliterator, this.f85231a);
    }

    @Override // j$.util.stream.AbstractC5681c3
    public final void d() {
        W2 w22 = new W2();
        this.f85238h = w22;
        Objects.requireNonNull(w22);
        this.f85235e = this.f85232b.P(new D3(w22, 0));
        this.f85236f = new j$.time.format.r(16, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        W2 w22 = (W2) this.f85238h;
        long j10 = this.f85237g;
        if (w22.f85226c != 0) {
            if (j10 >= w22.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j10));
            }
            for (int i10 = 0; i10 <= w22.f85226c; i10++) {
                long j11 = w22.f85227d[i10];
                Object[] objArr = w22.f85161f[i10];
                if (j10 < ((long) objArr.length) + j11) {
                    obj = objArr[(int) (j10 - j11)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        if (j10 < w22.f85225b) {
            obj = w22.f85160e[(int) j10];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        consumer.p(obj);
        return zA;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f85238h == null && !this.f85239i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            D3 d32 = new D3(consumer, 1);
            this.f85232b.O(this.f85234d, d32);
            this.f85239i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
