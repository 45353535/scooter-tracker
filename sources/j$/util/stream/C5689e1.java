package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5689e1 extends AbstractC5699g1 implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.g(this, consumer);
    }
}
