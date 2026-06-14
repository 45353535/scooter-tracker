package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5682d extends CountedCompleter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f85240g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5667a f85241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spliterator f85242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC5682d f85244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC5682d f85245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f85246f;

    public abstract Object a();

    public abstract AbstractC5682d c(Spliterator spliterator);

    public AbstractC5682d(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        super(null);
        this.f85241a = abstractC5667a;
        this.f85242b = spliterator;
        this.f85243c = 0L;
    }

    public AbstractC5682d(AbstractC5682d abstractC5682d, Spliterator spliterator) {
        super(abstractC5682d);
        this.f85242b = spliterator;
        this.f85241a = abstractC5682d.f85241a;
        this.f85243c = abstractC5682d.f85243c;
    }

    public static long e(long j10) {
        long j11 = j10 / ((long) f85240g);
        if (j11 > 0) {
            return j11;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f85246f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f85246f = obj;
    }

    public final boolean b() {
        return ((AbstractC5682d) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f85242b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f85243c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.f85243c = jE;
        }
        boolean z10 = false;
        AbstractC5682d abstractC5682d = this;
        while (jEstimateSize > jE && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC5682d abstractC5682dC = abstractC5682d.c(spliteratorTrySplit);
            abstractC5682d.f85244d = abstractC5682dC;
            AbstractC5682d abstractC5682dC2 = abstractC5682d.c(spliterator);
            abstractC5682d.f85245e = abstractC5682dC2;
            abstractC5682d.setPendingCount(1);
            if (z10) {
                spliterator = spliteratorTrySplit;
                abstractC5682d = abstractC5682dC;
                abstractC5682dC = abstractC5682dC2;
            } else {
                abstractC5682d = abstractC5682dC2;
            }
            z10 = !z10;
            abstractC5682dC.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC5682d.d(abstractC5682d.a());
        abstractC5682d.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f85242b = null;
        this.f85245e = null;
        this.f85244d = null;
    }
}
