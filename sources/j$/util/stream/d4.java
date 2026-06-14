package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d4 extends g4 implements IntConsumer, Spliterator.OfInt {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IntPredicate f85248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85249f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.g(this, consumer);
    }

    @Override // j$.util.b0
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    public d4(Spliterator.OfInt ofInt, IntPredicate intPredicate) {
        super(ofInt);
        this.f85248e = intPredicate;
    }

    public d4(Spliterator.OfInt ofInt, d4 d4Var) {
        super(ofInt, d4Var);
        this.f85248e = d4Var.f85248e;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f85271d = (this.f85271d + 1) & 63;
        this.f85249f = i10;
    }

    @Override // j$.util.b0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((IntConsumer) obj);
    }
}
