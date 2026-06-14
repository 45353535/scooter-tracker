package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class A3 extends C3 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f84991f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5650b.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC5650b.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        this.f84991f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != B3.NO_MORE && this.f85004a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.p(this.f84991f);
                this.f84991f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C5706h3 c5706h3 = null;
        while (true) {
            B3 b3D = d();
            if (b3D == B3.NO_MORE) {
                return;
            }
            B3 b32 = B3.MAYBE_MORE;
            Spliterator spliterator = this.f85004a;
            if (b3D == b32) {
                int i10 = this.f85006c;
                if (c5706h3 == null) {
                    c5706h3 = new C5706h3(i10);
                } else {
                    c5706h3.f85284a = 0;
                }
                long j10 = 0;
                while (spliterator.tryAdvance(c5706h3)) {
                    j10++;
                    if (j10 >= i10) {
                        break;
                    }
                }
                if (j10 == 0) {
                    return;
                }
                long jB = b(j10);
                for (int i11 = 0; i11 < jB; i11++) {
                    consumer.p(c5706h3.f85275b[i11]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.C3
    public final Spliterator c(Spliterator spliterator) {
        return new A3(spliterator, this);
    }
}
