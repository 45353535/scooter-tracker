package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5780w3 extends AbstractC5795z3 implements j$.util.T, DoubleConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f85394f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.f(this, consumer);
    }

    @Override // j$.util.stream.C3
    public final Spliterator c(Spliterator spliterator) {
        return new C5780w3((j$.util.T) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC5795z3
    public final void e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f85394f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f85394f = d10;
    }

    @Override // j$.util.stream.AbstractC5795z3
    public final AbstractC5701g3 h(int i10) {
        return new C5686d3(i10);
    }
}
