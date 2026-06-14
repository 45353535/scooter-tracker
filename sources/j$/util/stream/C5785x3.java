package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5785x3 extends AbstractC5795z3 implements Spliterator.OfInt, IntConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85400f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.g(this, consumer);
    }

    @Override // j$.util.stream.C3
    public final Spliterator c(Spliterator spliterator) {
        return new C5785x3((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC5795z3
    public final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f85400f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f85400f = i10;
    }

    @Override // j$.util.stream.AbstractC5795z3
    public final AbstractC5701g3 h(int i10) {
        return new C5691e3(i10);
    }
}
