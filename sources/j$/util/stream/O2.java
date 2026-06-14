package j$.util.stream;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.AbstractC5650b;
import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class O2 extends U2 implements j$.util.T {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P2 f85112g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.f(this, consumer);
    }

    @Override // j$.util.stream.U2
    public final void a(int i10, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i10]);
    }

    @Override // j$.util.stream.U2
    public final j$.util.b0 b(Object obj, int i10, int i11) {
        double[] dArr = (double[]) obj;
        int i12 = i11 + i10;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, i10, i12);
        return new j$.util.i0(dArr, i10, i12, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O2(P2 p22, int i10, int i11, int i12, int i13) {
        super(p22, i10, i11, i12, i13);
        this.f85112g = p22;
    }

    @Override // j$.util.stream.U2
    public final j$.util.b0 c(int i10, int i11, int i12, int i13) {
        return new O2(this.f85112g, i10, i11, i12, i13);
    }
}
