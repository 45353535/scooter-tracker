package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public class L0 extends AbstractC5682d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC5667a f85081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LongFunction f85082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BinaryOperator f85083j;

    @Override // j$.util.stream.AbstractC5682d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC5682d abstractC5682d = this.f85244d;
        if (abstractC5682d != null) {
            this.f85246f = (F0) this.f85083j.apply((F0) ((L0) abstractC5682d).f85246f, (F0) ((L0) this.f85245e).f85246f);
        }
        super.onCompletion(countedCompleter);
    }

    public L0(AbstractC5667a abstractC5667a, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC5667a, spliterator);
        this.f85081h = abstractC5667a;
        this.f85082i = longFunction;
        this.f85083j = binaryOperator;
    }

    public L0(L0 l02, Spliterator spliterator) {
        super(l02, spliterator);
        this.f85081h = l02.f85081h;
        this.f85082i = l02.f85082i;
        this.f85083j = l02.f85083j;
    }

    @Override // j$.util.stream.AbstractC5682d
    public AbstractC5682d c(Spliterator spliterator) {
        return new L0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5682d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final F0 a() {
        InterfaceC5782x0 interfaceC5782x0 = (InterfaceC5782x0) this.f85082i.apply(this.f85081h.D(this.f85242b));
        this.f85081h.O(this.f85242b, interfaceC5782x0);
        return interfaceC5782x0.a();
    }
}
