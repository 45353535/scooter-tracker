package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5774v2 extends AbstractC5672b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC5667a f85381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IntFunction f85382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f85383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f85384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f85385n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f85386o;

    @Override // j$.util.stream.AbstractC5672b
    public final void f() {
        this.f85221i = true;
        if (this.f85386o) {
            d(AbstractC5773v1.E(this.f85381j.F()));
        }
    }

    @Override // j$.util.stream.AbstractC5682d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C5774v2 c5774v2;
        F0 f0E;
        AbstractC5682d abstractC5682d = this.f85244d;
        if (!(abstractC5682d == null)) {
            this.f85385n = ((C5774v2) abstractC5682d).f85385n + ((C5774v2) this.f85245e).f85385n;
            if (this.f85221i) {
                this.f85385n = 0L;
                f0E = AbstractC5773v1.E(this.f85381j.F());
            } else {
                f0E = this.f85385n == 0 ? AbstractC5773v1.E(this.f85381j.F()) : ((C5774v2) this.f85244d).f85385n == 0 ? (F0) ((C5774v2) this.f85245e).i() : AbstractC5773v1.C(this.f85381j.F(), (F0) ((C5774v2) this.f85244d).i(), (F0) ((C5774v2) this.f85245e).i());
            }
            F0 f0H = f0E;
            if (b()) {
                f0H = f0H.h(this.f85383l, this.f85384m >= 0 ? Math.min(f0H.count(), this.f85383l + this.f85384m) : this.f85385n, this.f85382k);
            }
            d(f0H);
            this.f85386o = true;
        }
        if (this.f85384m >= 0 && !b()) {
            long j10 = this.f85383l + this.f85384m;
            long j11 = this.f85386o ? this.f85385n : j(j10);
            if (j11 >= j10) {
                g();
            } else {
                C5774v2 c5774v22 = (C5774v2) ((AbstractC5682d) getCompleter());
                Object obj = this;
                while (true) {
                    if (c5774v22 == null) {
                        if (j11 >= j10) {
                            break;
                        }
                    } else {
                        if (obj == c5774v22.f85245e && (c5774v2 = (C5774v2) c5774v22.f85244d) != null) {
                            long j12 = c5774v2.j(j10) + j11;
                            if (j12 >= j10) {
                                break;
                            } else {
                                j11 = j12;
                            }
                        }
                        obj = c5774v22;
                        c5774v22 = (C5774v2) ((AbstractC5682d) c5774v22.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C5774v2(AbstractC5667a abstractC5667a, AbstractC5667a abstractC5667a2, Spliterator spliterator, IntFunction intFunction, long j10, long j11) {
        super(abstractC5667a2, spliterator);
        this.f85381j = abstractC5667a;
        this.f85382k = intFunction;
        this.f85383l = j10;
        this.f85384m = j11;
    }

    public C5774v2(C5774v2 c5774v2, Spliterator spliterator) {
        super(c5774v2, spliterator);
        this.f85381j = c5774v2.f85381j;
        this.f85382k = c5774v2.f85382k;
        this.f85383l = c5774v2.f85383l;
        this.f85384m = c5774v2.f85384m;
    }

    @Override // j$.util.stream.AbstractC5682d
    public final AbstractC5682d c(Spliterator spliterator) {
        return new C5774v2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5672b
    public final Object h() {
        return AbstractC5773v1.E(this.f85381j.F());
    }

    @Override // j$.util.stream.AbstractC5682d
    public final Object a() {
        if (b()) {
            EnumC5671a3 enumC5671a3 = EnumC5671a3.SIZED;
            AbstractC5667a abstractC5667a = this.f85381j;
            int i10 = abstractC5667a.f85182c;
            int i11 = enumC5671a3.f85217e;
            InterfaceC5782x0 interfaceC5782x0G = this.f85381j.G((i10 & i11) == i11 ? abstractC5667a.D(this.f85242b) : -1L, this.f85382k);
            InterfaceC5725l2 interfaceC5725l2K = this.f85381j.K(this.f85241a.f85185f, interfaceC5782x0G);
            AbstractC5667a abstractC5667a2 = this.f85241a;
            abstractC5667a2.y(this.f85242b, abstractC5667a2.P(interfaceC5725l2K));
            return interfaceC5782x0G.a();
        }
        InterfaceC5782x0 interfaceC5782x0G2 = this.f85381j.G(-1L, this.f85382k);
        if (this.f85383l == 0) {
            InterfaceC5725l2 interfaceC5725l2K2 = this.f85381j.K(this.f85241a.f85185f, interfaceC5782x0G2);
            AbstractC5667a abstractC5667a3 = this.f85241a;
            abstractC5667a3.y(this.f85242b, abstractC5667a3.P(interfaceC5725l2K2));
        } else {
            this.f85241a.O(this.f85242b, interfaceC5782x0G2);
        }
        F0 f0A = interfaceC5782x0G2.a();
        this.f85385n = f0A.count();
        this.f85386o = true;
        this.f85242b = null;
        return f0A;
    }

    public final long j(long j10) {
        if (this.f85386o) {
            return this.f85385n;
        }
        C5774v2 c5774v2 = (C5774v2) this.f85244d;
        C5774v2 c5774v22 = (C5774v2) this.f85245e;
        if (c5774v2 == null || c5774v22 == null) {
            return this.f85385n;
        }
        long j11 = c5774v2.j(j10);
        return j11 >= j10 ? j11 : c5774v22.j(j10) + j11;
    }
}
