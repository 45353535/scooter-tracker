package io.bidmachine.media3.exoplayer;

import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import ga.f0;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
final class f2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final f0.b f80827u = new f0.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9.e0 f80828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.b f80829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f80830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f80831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f80832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f80833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f80834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ga.m1 f80835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ja.x f80836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f80837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f0.b f80838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f80839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f80840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f80841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n9.z f80842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f80843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f80844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f80845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f80846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f80847t;

    public f2(n9.e0 e0Var, f0.b bVar, long j10, long j11, int i10, s sVar, boolean z10, ga.m1 m1Var, ja.x xVar, List list, f0.b bVar2, boolean z11, int i11, int i12, n9.z zVar, long j12, long j13, long j14, long j15, boolean z12) {
        this.f80828a = e0Var;
        this.f80829b = bVar;
        this.f80830c = j10;
        this.f80831d = j11;
        this.f80832e = i10;
        this.f80833f = sVar;
        this.f80834g = z10;
        this.f80835h = m1Var;
        this.f80836i = xVar;
        this.f80837j = list;
        this.f80838k = bVar2;
        this.f80839l = z11;
        this.f80840m = i11;
        this.f80841n = i12;
        this.f80842o = zVar;
        this.f80844q = j12;
        this.f80845r = j13;
        this.f80846s = j14;
        this.f80847t = j15;
        this.f80843p = z12;
    }

    public static f2 k(ja.x xVar) {
        n9.e0 e0Var = n9.e0.f95245a;
        f0.b bVar = f80827u;
        return new f2(e0Var, bVar, -9223372036854775807L, 0L, 1, null, false, ga.m1.f72378d, xVar, ImmutableList.of(), bVar, false, 1, 0, n9.z.f95676d, 0L, 0L, 0L, 0L, false);
    }

    public static f0.b l() {
        return f80827u;
    }

    public f2 a() {
        return new f2(this.f80828a, this.f80829b, this.f80830c, this.f80831d, this.f80832e, this.f80833f, this.f80834g, this.f80835h, this.f80836i, this.f80837j, this.f80838k, this.f80839l, this.f80840m, this.f80841n, this.f80842o, this.f80844q, this.f80845r, m(), SystemClock.elapsedRealtime(), this.f80843p);
    }

    public f2 b(boolean z10) {
        return new f2(this.f80828a, this.f80829b, this.f80830c, this.f80831d, this.f80832e, this.f80833f, z10, this.f80835h, this.f80836i, this.f80837j, this.f80838k, this.f80839l, this.f80840m, this.f80841n, this.f80842o, this.f80844q, this.f80845r, this.f80846s, this.f80847t, this.f80843p);
    }

    public f2 c(f0.b bVar) {
        return new f2(this.f80828a, this.f80829b, this.f80830c, this.f80831d, this.f80832e, this.f80833f, this.f80834g, this.f80835h, this.f80836i, this.f80837j, bVar, this.f80839l, this.f80840m, this.f80841n, this.f80842o, this.f80844q, this.f80845r, this.f80846s, this.f80847t, this.f80843p);
    }

    public f2 d(f0.b bVar, long j10, long j11, long j12, long j13, ga.m1 m1Var, ja.x xVar, List list) {
        return new f2(this.f80828a, bVar, j11, j12, this.f80832e, this.f80833f, this.f80834g, m1Var, xVar, list, this.f80838k, this.f80839l, this.f80840m, this.f80841n, this.f80842o, this.f80844q, j13, j10, SystemClock.elapsedRealtime(), this.f80843p);
    }

    public f2 e(boolean z10, int i10, int i11) {
        return new f2(this.f80828a, this.f80829b, this.f80830c, this.f80831d, this.f80832e, this.f80833f, this.f80834g, this.f80835h, this.f80836i, this.f80837j, this.f80838k, z10, i10, i11, this.f80842o, this.f80844q, this.f80845r, this.f80846s, this.f80847t, this.f80843p);
    }

    public f2 f(s sVar) {
        return new f2(this.f80828a, this.f80829b, this.f80830c, this.f80831d, this.f80832e, sVar, this.f80834g, this.f80835h, this.f80836i, this.f80837j, this.f80838k, this.f80839l, this.f80840m, this.f80841n, this.f80842o, this.f80844q, this.f80845r, this.f80846s, this.f80847t, this.f80843p);
    }

    public f2 g(n9.z zVar) {
        return new f2(this.f80828a, this.f80829b, this.f80830c, this.f80831d, this.f80832e, this.f80833f, this.f80834g, this.f80835h, this.f80836i, this.f80837j, this.f80838k, this.f80839l, this.f80840m, this.f80841n, zVar, this.f80844q, this.f80845r, this.f80846s, this.f80847t, this.f80843p);
    }

    public f2 h(int i10) {
        return new f2(this.f80828a, this.f80829b, this.f80830c, this.f80831d, i10, this.f80833f, this.f80834g, this.f80835h, this.f80836i, this.f80837j, this.f80838k, this.f80839l, this.f80840m, this.f80841n, this.f80842o, this.f80844q, this.f80845r, this.f80846s, this.f80847t, this.f80843p);
    }

    public f2 i(boolean z10) {
        return new f2(this.f80828a, this.f80829b, this.f80830c, this.f80831d, this.f80832e, this.f80833f, this.f80834g, this.f80835h, this.f80836i, this.f80837j, this.f80838k, this.f80839l, this.f80840m, this.f80841n, this.f80842o, this.f80844q, this.f80845r, this.f80846s, this.f80847t, z10);
    }

    public f2 j(n9.e0 e0Var) {
        return new f2(e0Var, this.f80829b, this.f80830c, this.f80831d, this.f80832e, this.f80833f, this.f80834g, this.f80835h, this.f80836i, this.f80837j, this.f80838k, this.f80839l, this.f80840m, this.f80841n, this.f80842o, this.f80844q, this.f80845r, this.f80846s, this.f80847t, this.f80843p);
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f80846s;
        }
        do {
            j10 = this.f80847t;
            j11 = this.f80846s;
        } while (j10 != this.f80847t);
        return q9.o0.P0(q9.o0.q1(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f80842o.f95679a)));
    }

    public boolean n() {
        return this.f80832e == 3 && this.f80839l && this.f80841n == 0;
    }

    public void o(long j10) {
        this.f80846s = j10;
        this.f80847t = SystemClock.elapsedRealtime();
    }
}
