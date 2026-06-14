package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5749q1 extends CountedCompleter implements InterfaceC5725l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f85338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5667a f85339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f85341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f85342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85344g;

    public /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC5773v1.k();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        AbstractC5773v1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public abstract AbstractC5749q1 b(Spliterator spliterator, long j10, long j11);

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    public AbstractC5749q1(Spliterator spliterator, AbstractC5667a abstractC5667a, int i10) {
        this.f85338a = spliterator;
        this.f85339b = abstractC5667a;
        this.f85340c = AbstractC5682d.e(spliterator.estimateSize());
        this.f85341d = 0L;
        this.f85342e = i10;
    }

    public AbstractC5749q1(AbstractC5749q1 abstractC5749q1, Spliterator spliterator, long j10, long j11, int i10) {
        super(abstractC5749q1);
        this.f85338a = spliterator;
        this.f85339b = abstractC5749q1.f85339b;
        this.f85340c = abstractC5749q1.f85340c;
        this.f85341d = j10;
        this.f85342e = j11;
        if (j10 < 0 || j11 < 0 || (j10 + j11) - 1 >= i10) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j10), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f85338a;
        AbstractC5749q1 abstractC5749q1B = this;
        while (spliterator.estimateSize() > abstractC5749q1B.f85340c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC5749q1B.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            AbstractC5749q1 abstractC5749q1 = abstractC5749q1B;
            abstractC5749q1.b(spliteratorTrySplit, abstractC5749q1B.f85341d, jEstimateSize).fork();
            abstractC5749q1B = abstractC5749q1.b(spliterator, abstractC5749q1.f85341d + jEstimateSize, abstractC5749q1.f85342e - jEstimateSize);
        }
        AbstractC5749q1 abstractC5749q12 = abstractC5749q1B;
        abstractC5749q12.f85339b.O(spliterator, abstractC5749q12);
        abstractC5749q12.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        long j11 = this.f85342e;
        if (j10 > j11) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i10 = (int) this.f85341d;
        this.f85343f = i10;
        this.f85344g = i10 + ((int) j11);
    }
}
