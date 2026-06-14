package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class X1 extends AbstractC5682d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC5773v1 f85162h;

    @Override // j$.util.stream.AbstractC5682d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC5682d abstractC5682d = this.f85244d;
        if (abstractC5682d != null) {
            Q1 q12 = (Q1) ((X1) abstractC5682d).f85246f;
            q12.g((Q1) ((X1) this.f85245e).f85246f);
            this.f85246f = q12;
        }
        super.onCompletion(countedCompleter);
    }

    public X1(AbstractC5773v1 abstractC5773v1, AbstractC5667a abstractC5667a, Spliterator spliterator) {
        super(abstractC5667a, spliterator);
        this.f85162h = abstractC5773v1;
    }

    public X1(X1 x12, Spliterator spliterator) {
        super(x12, spliterator);
        this.f85162h = x12.f85162h;
    }

    @Override // j$.util.stream.AbstractC5682d
    public final AbstractC5682d c(Spliterator spliterator) {
        return new X1(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5682d
    public final Object a() {
        AbstractC5667a abstractC5667a = this.f85241a;
        Q1 q1Q = this.f85162h.Q();
        abstractC5667a.O(this.f85242b, q1Q);
        return q1Q;
    }
}
