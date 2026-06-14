package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5678c0 extends AbstractC5700g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC5667a f85229c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5678c0(AbstractC5667a abstractC5667a, InterfaceC5725l2 interfaceC5725l2, int i10) {
        super(interfaceC5725l2);
        this.f85228b = i10;
        this.f85229c = abstractC5667a;
    }

    @Override // j$.util.stream.AbstractC5700g2, j$.util.stream.InterfaceC5725l2
    public void l(long j10) {
        switch (this.f85228b) {
            case 4:
                this.f85266a.l(-1L);
                break;
            default:
                super.l(j10);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5720k2, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        switch (this.f85228b) {
            case 0:
                this.f85266a.accept(((LongFunction) ((C5747q) this.f85229c).f85337n).apply(j10));
                return;
            case 1:
                ((C5761t) this.f85229c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j10);
                throw null;
            case 2:
                ((C5756s) this.f85229c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j10);
                throw null;
            case 3:
                ((r) this.f85229c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j10);
                throw null;
            case 4:
                ((C5761t) this.f85229c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j10);
                throw null;
            default:
                ((LongConsumer) ((C5693f0) this.f85229c).f85260n).accept(j10);
                this.f85266a.accept(j10);
                return;
        }
    }
}
