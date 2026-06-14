package j$.util.stream;

import j$.util.AbstractC5650b;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5684d1 extends AbstractC5699g1 implements j$.util.T {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.f(this, consumer);
    }
}
