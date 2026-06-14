package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5667a f85122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spliterator f85123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f85125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P f85126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q f85127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F0 f85128g;

    public Q(AbstractC5667a abstractC5667a, Spliterator spliterator, P p10) {
        super(null);
        this.f85122a = abstractC5667a;
        this.f85123b = spliterator;
        this.f85124c = AbstractC5682d.e(spliterator.estimateSize());
        this.f85125d = new ConcurrentHashMap(Math.max(16, AbstractC5682d.f85240g << 1));
        this.f85126e = p10;
        this.f85127f = null;
    }

    public Q(Q q10, Spliterator spliterator, Q q11) {
        super(q10);
        this.f85122a = q10.f85122a;
        this.f85123b = spliterator;
        this.f85124c = q10.f85124c;
        this.f85125d = q10.f85125d;
        this.f85126e = q10.f85126e;
        this.f85127f = q11;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f85123b;
        long j10 = this.f85124c;
        boolean z10 = false;
        Q q10 = this;
        while (spliterator.estimateSize() > j10 && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            Q q11 = new Q(q10, spliteratorTrySplit, q10.f85127f);
            Q q12 = new Q(q10, spliterator, q11);
            q10.addToPendingCount(1);
            q12.addToPendingCount(1);
            q10.f85125d.put(q11, q12);
            if (q10.f85127f != null) {
                q11.addToPendingCount(1);
                if (q10.f85125d.replace(q10.f85127f, q10, q11)) {
                    q10.addToPendingCount(-1);
                } else {
                    q11.addToPendingCount(-1);
                }
            }
            if (z10) {
                spliterator = spliteratorTrySplit;
                q10 = q11;
                q11 = q12;
            } else {
                q10 = q12;
            }
            z10 = !z10;
            q11.fork();
        }
        if (q10.getPendingCount() > 0) {
            D d10 = new D(8);
            AbstractC5667a abstractC5667a = q10.f85122a;
            InterfaceC5782x0 interfaceC5782x0G = abstractC5667a.G(abstractC5667a.D(spliterator), d10);
            q10.f85122a.O(spliterator, interfaceC5782x0G);
            q10.f85128g = interfaceC5782x0G.a();
            q10.f85123b = null;
        }
        q10.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        F0 f02 = this.f85128g;
        if (f02 != null) {
            f02.forEach(this.f85126e);
            this.f85128g = null;
        } else {
            Spliterator spliterator = this.f85123b;
            if (spliterator != null) {
                this.f85122a.O(spliterator, this.f85126e);
                this.f85123b = null;
            }
        }
        Q q10 = (Q) this.f85125d.remove(this);
        if (q10 != null) {
            q10.tryComplete();
        }
    }
}
