package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class Y3 extends AbstractC5682d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC5667a f85168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IntFunction f85169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f85170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f85171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f85172l;

    @Override // j$.util.stream.AbstractC5682d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC5682d abstractC5682d = this.f85244d;
        if (abstractC5682d != null) {
            if (this.f85170j) {
                Y3 y32 = (Y3) abstractC5682d;
                long j10 = y32.f85172l;
                this.f85172l = j10;
                if (j10 == y32.f85171k) {
                    this.f85172l = j10 + ((Y3) this.f85245e).f85172l;
                }
            }
            Y3 y33 = (Y3) abstractC5682d;
            long j11 = y33.f85171k;
            Y3 y34 = (Y3) this.f85245e;
            this.f85171k = j11 + y34.f85171k;
            F0 f0C = y33.f85171k == 0 ? (F0) y34.f85246f : y34.f85171k == 0 ? (F0) y33.f85246f : AbstractC5773v1.C(this.f85168h.F(), (F0) ((Y3) this.f85244d).f85246f, (F0) ((Y3) this.f85245e).f85246f);
            if (b() && this.f85170j) {
                f0C = f0C.h(this.f85172l, f0C.count(), this.f85169i);
            }
            this.f85246f = f0C;
        }
        super.onCompletion(countedCompleter);
    }

    public Y3(AbstractC5667a abstractC5667a, AbstractC5667a abstractC5667a2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC5667a2, spliterator);
        this.f85168h = abstractC5667a;
        this.f85169i = intFunction;
        this.f85170j = EnumC5671a3.ORDERED.n(abstractC5667a2.f85185f);
    }

    public Y3(Y3 y32, Spliterator spliterator) {
        super(y32, spliterator);
        this.f85168h = y32.f85168h;
        this.f85169i = y32.f85169i;
        this.f85170j = y32.f85170j;
    }

    @Override // j$.util.stream.AbstractC5682d
    public final AbstractC5682d c(Spliterator spliterator) {
        return new Y3(this, spliterator);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // j$.util.stream.AbstractC5682d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            r5 = this;
            boolean r0 = r5.b()
            if (r0 != 0) goto L1c
            boolean r1 = r5.f85170j
            if (r1 == 0) goto L1c
            j$.util.stream.a3 r1 = j$.util.stream.EnumC5671a3.SIZED
            j$.util.stream.a r2 = r5.f85168h
            int r3 = r2.f85182c
            int r1 = r1.f85217e
            r3 = r3 & r1
            if (r3 != r1) goto L1c
            j$.util.Spliterator r1 = r5.f85242b
            long r1 = r2.D(r1)
            goto L1e
        L1c:
            r1 = -1
        L1e:
            j$.util.stream.a r3 = r5.f85241a
            java.util.function.IntFunction r4 = r5.f85169i
            j$.util.stream.x0 r1 = r3.G(r1, r4)
            j$.util.stream.a r2 = r5.f85168h
            j$.util.stream.W3 r2 = (j$.util.stream.W3) r2
            boolean r3 = r5.f85170j
            if (r3 == 0) goto L32
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            j$.util.stream.X3 r0 = r2.k(r1, r0)
            j$.util.stream.a r2 = r5.f85241a
            j$.util.Spliterator r3 = r5.f85242b
            r2.O(r3, r0)
            j$.util.stream.F0 r1 = r1.a()
            long r2 = r1.count()
            r5.f85171k = r2
            long r2 = r0.f()
            r5.f85172l = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.Y3.a():java.lang.Object");
    }
}
