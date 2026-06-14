package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5790y3 extends AbstractC5795z3 implements j$.util.Y, LongConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f85405f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.h(this, consumer);
    }

    @Override // j$.util.stream.C3
    public final Spliterator c(Spliterator spliterator) {
        return new C5790y3((j$.util.Y) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC5795z3
    public final void e(Object obj) {
        ((LongConsumer) obj).accept(this.f85405f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f85405f = j10;
    }

    @Override // j$.util.stream.AbstractC5795z3
    public final AbstractC5701g3 h(int i10) {
        return new C5696f3(i10);
    }
}
