package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5742p extends AbstractC5690e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC5667a f85332c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5742p(AbstractC5667a abstractC5667a, InterfaceC5725l2 interfaceC5725l2, int i10) {
        super(interfaceC5725l2);
        this.f85331b = i10;
        this.f85332c = abstractC5667a;
    }

    @Override // j$.util.stream.AbstractC5690e2, j$.util.stream.InterfaceC5725l2
    public void l(long j10) {
        switch (this.f85331b) {
            case 4:
                this.f85254a.l(-1L);
                break;
            default:
                super.l(j10);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        switch (this.f85331b) {
            case 0:
                this.f85254a.accept(((DoubleFunction) ((C5747q) this.f85332c).f85337n).apply(d10));
                return;
            case 1:
                ((r) this.f85332c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d10);
                throw null;
            case 2:
                ((C5756s) this.f85332c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d10);
                throw null;
            case 3:
                ((C5761t) this.f85332c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d10);
                throw null;
            case 4:
                ((r) this.f85332c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d10);
                throw null;
            default:
                ((DoubleConsumer) ((C5771v) this.f85332c).f85373n).accept(d10);
                this.f85254a.accept(d10);
                return;
        }
    }
}
