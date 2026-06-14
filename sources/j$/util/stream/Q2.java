package j$.util.stream;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class Q2 extends U2 implements Spliterator.OfInt {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R2 f85129g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.g(this, consumer);
    }

    @Override // j$.util.stream.U2
    public final void a(int i10, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i10]);
    }

    @Override // j$.util.stream.U2
    public final j$.util.b0 b(Object obj, int i10, int i11) {
        return Spliterators.spliterator((int[]) obj, i10, i11 + i10, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(R2 r22, int i10, int i11, int i12, int i13) {
        super(r22, i10, i11, i12, i13);
        this.f85129g = r22;
    }

    @Override // j$.util.stream.U2
    public final j$.util.b0 c(int i10, int i11, int i12, int i13) {
        return new Q2(this.f85129g, i10, i11, i12, i13);
    }
}
