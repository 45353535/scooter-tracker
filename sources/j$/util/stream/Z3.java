package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class Z3 extends AbstractC5672b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC5667a f85174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IntFunction f85175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f85176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f85177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f85178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f85179o;

    @Override // j$.util.stream.AbstractC5672b
    public final void f() {
        this.f85221i = true;
        if (this.f85176l && this.f85179o) {
            d(AbstractC5773v1.E(this.f85174j.F()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.AbstractC5682d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.d r0 = r8.f85244d
            if (r0 != 0) goto L6
            goto L8b
        L6:
            j$.util.stream.Z3 r0 = (j$.util.stream.Z3) r0
            boolean r0 = r0.f85178n
            j$.util.stream.d r1 = r8.f85245e
            j$.util.stream.Z3 r1 = (j$.util.stream.Z3) r1
            boolean r1 = r1.f85178n
            r0 = r0 | r1
            r8.f85178n = r0
            boolean r0 = r8.f85176l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.f85221i
            if (r0 == 0) goto L2a
            r8.f85177m = r1
            j$.util.stream.a r0 = r8.f85174j
            j$.util.stream.b3 r0 = r0.F()
            j$.util.stream.Y0 r0 = j$.util.stream.AbstractC5773v1.E(r0)
            goto L88
        L2a:
            boolean r0 = r8.f85176l
            if (r0 == 0) goto L41
            j$.util.stream.d r0 = r8.f85244d
            j$.util.stream.Z3 r0 = (j$.util.stream.Z3) r0
            boolean r3 = r0.f85178n
            if (r3 == 0) goto L41
            long r1 = r0.f85177m
            r8.f85177m = r1
            java.lang.Object r0 = r0.i()
            j$.util.stream.F0 r0 = (j$.util.stream.F0) r0
            goto L88
        L41:
            j$.util.stream.d r0 = r8.f85244d
            j$.util.stream.Z3 r0 = (j$.util.stream.Z3) r0
            long r3 = r0.f85177m
            j$.util.stream.d r5 = r8.f85245e
            j$.util.stream.Z3 r5 = (j$.util.stream.Z3) r5
            long r6 = r5.f85177m
            long r3 = r3 + r6
            r8.f85177m = r3
            long r3 = r0.f85177m
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L5d
            java.lang.Object r0 = r5.i()
            j$.util.stream.F0 r0 = (j$.util.stream.F0) r0
            goto L88
        L5d:
            long r3 = r5.f85177m
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L6a
            java.lang.Object r0 = r0.i()
            j$.util.stream.F0 r0 = (j$.util.stream.F0) r0
            goto L88
        L6a:
            j$.util.stream.a r0 = r8.f85174j
            j$.util.stream.b3 r0 = r0.F()
            j$.util.stream.d r1 = r8.f85244d
            j$.util.stream.Z3 r1 = (j$.util.stream.Z3) r1
            java.lang.Object r1 = r1.i()
            j$.util.stream.F0 r1 = (j$.util.stream.F0) r1
            j$.util.stream.d r2 = r8.f85245e
            j$.util.stream.Z3 r2 = (j$.util.stream.Z3) r2
            java.lang.Object r2 = r2.i()
            j$.util.stream.F0 r2 = (j$.util.stream.F0) r2
            j$.util.stream.H0 r0 = j$.util.stream.AbstractC5773v1.C(r0, r1, r2)
        L88:
            r8.d(r0)
        L8b:
            r0 = 1
            r8.f85179o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.Z3.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    public Z3(AbstractC5667a abstractC5667a, AbstractC5667a abstractC5667a2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC5667a2, spliterator);
        this.f85174j = abstractC5667a;
        this.f85175k = intFunction;
        this.f85176l = EnumC5671a3.ORDERED.n(abstractC5667a2.f85185f);
    }

    public Z3(Z3 z32, Spliterator spliterator) {
        super(z32, spliterator);
        this.f85174j = z32.f85174j;
        this.f85175k = z32.f85175k;
        this.f85176l = z32.f85176l;
    }

    @Override // j$.util.stream.AbstractC5682d
    public final AbstractC5682d c(Spliterator spliterator) {
        return new Z3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5672b
    public final Object h() {
        return AbstractC5773v1.E(this.f85174j.F());
    }

    @Override // j$.util.stream.AbstractC5682d
    public final Object a() {
        InterfaceC5782x0 interfaceC5782x0G = this.f85241a.G(-1L, this.f85175k);
        InterfaceC5725l2 interfaceC5725l2K = this.f85174j.K(this.f85241a.f85185f, interfaceC5782x0G);
        AbstractC5667a abstractC5667a = this.f85241a;
        boolean zY = abstractC5667a.y(this.f85242b, abstractC5667a.P(interfaceC5725l2K));
        this.f85178n = zY;
        if (zY) {
            g();
        }
        F0 f0A = interfaceC5782x0G.a();
        this.f85177m = f0A.count();
        return f0A;
    }
}
