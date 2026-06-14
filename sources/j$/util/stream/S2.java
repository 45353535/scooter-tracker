package j$.util.stream;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.AbstractC5650b;
import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class S2 extends U2 implements j$.util.Y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T2 f85139g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.h(this, consumer);
    }

    @Override // j$.util.stream.U2
    public final void a(int i10, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i10]);
    }

    @Override // j$.util.stream.U2
    public final j$.util.b0 b(Object obj, int i10, int i11) {
        long[] jArr = (long[]) obj;
        int i12 = i11 + i10;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, i10, i12);
        return new j$.util.q0(jArr, i10, i12, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(T2 t22, int i10, int i11, int i12, int i13) {
        super(t22, i10, i11, i12, i13);
        this.f85139g = t22;
    }

    @Override // j$.util.stream.U2
    public final j$.util.b0 c(int i10, int i11, int i12, int i13) {
        return new S2(this.f85139g, i10, i11, i12, i13);
    }
}
