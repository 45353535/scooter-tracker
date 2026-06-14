package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5699g1 extends AbstractC5709i1 implements j$.util.b0 {
    @Override // j$.util.b0
    public final boolean tryAdvance(Object obj) {
        E0 e02;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.b0) this.f85282d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f85281c == null && (e02 = (E0) AbstractC5709i1.a(this.f85283e)) != null) {
                j$.util.b0 b0VarSpliterator = e02.spliterator();
                this.f85282d = b0VarSpliterator;
                return b0VarSpliterator.tryAdvance(obj);
            }
            this.f85279a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(Object obj) {
        if (this.f85279a == null) {
            return;
        }
        if (this.f85282d == null) {
            Spliterator spliterator = this.f85281c;
            if (spliterator == null) {
                ArrayDeque arrayDequeB = b();
                while (true) {
                    E0 e02 = (E0) AbstractC5709i1.a(arrayDequeB);
                    if (e02 != null) {
                        e02.e(obj);
                    } else {
                        this.f85279a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.b0) spliterator).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
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
