package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5760s3 extends AbstractC5765t3 implements j$.util.Y {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.h(this, consumer);
    }

    @Override // j$.util.stream.AbstractC5775v3
    public final Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new C5760s3((j$.util.Y) spliterator, j10, j11, j12, j13);
    }

    @Override // j$.util.stream.AbstractC5765t3
    public final Object b() {
        return new C0(1);
    }
}
