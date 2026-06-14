package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends AbstractC5695f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC5667a f85142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(AbstractC5667a abstractC5667a, InterfaceC5725l2 interfaceC5725l2, int i10) {
        super(interfaceC5725l2);
        this.f85141b = i10;
        this.f85142c = abstractC5667a;
    }

    @Override // j$.util.stream.AbstractC5695f2, j$.util.stream.InterfaceC5725l2
    public void l(long j10) {
        switch (this.f85141b) {
            case 5:
                this.f85261a.l(-1L);
                break;
            default:
                super.l(j10);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5715j2, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        switch (this.f85141b) {
            case 0:
                this.f85261a.accept(((IntFunction) ((C5747q) this.f85142c).f85337n).apply(i10));
                return;
            case 1:
                ((IntConsumer) ((U) this.f85142c).f85145m).accept(i10);
                this.f85261a.accept(i10);
                return;
            case 2:
                ((C5756s) this.f85142c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i10);
                throw null;
            case 3:
                ((C5761t) this.f85142c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i10);
                throw null;
            case 4:
                ((r) this.f85142c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i10);
                throw null;
            default:
                if (((IntPredicate) ((U) this.f85142c).f85145m).test(i10)) {
                    this.f85261a.accept(i10);
                    return;
                }
                return;
        }
    }
}
