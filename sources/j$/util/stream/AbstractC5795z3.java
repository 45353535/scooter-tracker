package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5795z3 extends C3 implements j$.util.b0 {
    public abstract void e(Object obj);

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5650b.d(this);
    }

    public abstract AbstractC5701g3 h(int i10);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC5650b.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (d() != B3.NO_MORE && ((j$.util.b0) this.f85004a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC5701g3 abstractC5701g3H = null;
        while (true) {
            B3 b3D = d();
            if (b3D == B3.NO_MORE) {
                return;
            }
            B3 b32 = B3.MAYBE_MORE;
            Spliterator spliterator = this.f85004a;
            if (b3D == b32) {
                int i10 = this.f85006c;
                if (abstractC5701g3H == null) {
                    abstractC5701g3H = h(i10);
                } else {
                    abstractC5701g3H.f85267b = 0;
                }
                long j10 = 0;
                while (((j$.util.b0) spliterator).tryAdvance(abstractC5701g3H)) {
                    j10++;
                    if (j10 >= i10) {
                        break;
                    }
                }
                if (j10 == 0) {
                    return;
                } else {
                    abstractC5701g3H.b(obj, b(j10));
                }
            } else {
                ((j$.util.b0) spliterator).forEachRemaining(obj);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
