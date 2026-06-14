package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5672b extends AbstractC5682d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f85220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f85221i;

    public abstract Object h();

    public AbstractC5672b(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        super(abstractC5667a, spliterator);
        this.f85220h = new AtomicReference(null);
    }

    public AbstractC5672b(AbstractC5672b abstractC5672b, Spliterator spliterator) {
        super(abstractC5672b, spliterator);
        this.f85220h = abstractC5672b.f85220h;
    }

    @Override // j$.util.stream.AbstractC5682d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objH;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f85242b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f85243c;
        if (jE == 0) {
            jE = AbstractC5682d.e(jEstimateSize);
            this.f85243c = jE;
        }
        AtomicReference atomicReference = this.f85220h;
        boolean z10 = false;
        AbstractC5672b abstractC5672b = this;
        while (true) {
            objH = atomicReference.get();
            if (objH != null) {
                break;
            }
            boolean z11 = abstractC5672b.f85221i;
            if (!z11) {
                CountedCompleter<?> completer = abstractC5672b.getCompleter();
                while (true) {
                    AbstractC5672b abstractC5672b2 = (AbstractC5672b) ((AbstractC5682d) completer);
                    if (z11 || abstractC5672b2 == null) {
                        break;
                    }
                    z11 = abstractC5672b2.f85221i;
                    completer = abstractC5672b2.getCompleter();
                }
            }
            if (z11) {
                objH = abstractC5672b.h();
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC5672b abstractC5672b3 = (AbstractC5672b) abstractC5672b.c(spliteratorTrySplit);
            abstractC5672b.f85244d = abstractC5672b3;
            AbstractC5672b abstractC5672b4 = (AbstractC5672b) abstractC5672b.c(spliterator);
            abstractC5672b.f85245e = abstractC5672b4;
            abstractC5672b.setPendingCount(1);
            if (z10) {
                spliterator = spliteratorTrySplit;
                abstractC5672b = abstractC5672b3;
                abstractC5672b3 = abstractC5672b4;
            } else {
                abstractC5672b = abstractC5672b4;
            }
            z10 = !z10;
            abstractC5672b3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objH = abstractC5672b.a();
        abstractC5672b.d(objH);
        abstractC5672b.tryComplete();
    }

    @Override // j$.util.stream.AbstractC5682d
    public final void d(Object obj) {
        if (!b()) {
            this.f85246f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.f85220h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC5682d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public final Object i() {
        if (b()) {
            Object obj = this.f85220h.get();
            return obj == null ? h() : obj;
        }
        return this.f85246f;
    }

    public void f() {
        this.f85221i = true;
    }

    public final void g() {
        AbstractC5672b abstractC5672b = this;
        for (AbstractC5672b abstractC5672b2 = (AbstractC5672b) ((AbstractC5682d) getCompleter()); abstractC5672b2 != null; abstractC5672b2 = (AbstractC5672b) ((AbstractC5682d) abstractC5672b2.getCompleter())) {
            if (abstractC5672b2.f85244d == abstractC5672b) {
                AbstractC5672b abstractC5672b3 = (AbstractC5672b) abstractC5672b2.f85245e;
                if (!abstractC5672b3.f85221i) {
                    abstractC5672b3.f();
                }
            }
            abstractC5672b = abstractC5672b2;
        }
    }
}
