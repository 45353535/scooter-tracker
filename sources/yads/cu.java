package yads;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cu implements iq2, ev2, je1, ne1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f109573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yv0[] f109574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f109575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n20 f109576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dv2 f109577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ol1 f109578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fe1 f109579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qe1 f109580j = new qe1("ChunkSampleStream");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xt f109581k = new xt();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f109582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f109583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hq2 f109584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hq2[] f109585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Cdo f109586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public tt f109587q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public yv0 f109588r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public bu f109589s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f109590t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f109591u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f109592v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public bo f109593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f109594x;

    public cu(int i10, int[] iArr, yv0[] yv0VarArr, ac0 ac0Var, dv2 dv2Var, ke keVar, long j10, nj0 nj0Var, jj0 jj0Var, fe1 fe1Var, ol1 ol1Var) {
        this.f109572b = i10;
        this.f109573c = iArr;
        this.f109574d = yv0VarArr;
        this.f109576f = ac0Var;
        this.f109577g = dv2Var;
        this.f109578h = ol1Var;
        this.f109579i = fe1Var;
        ArrayList arrayList = new ArrayList();
        this.f109582l = arrayList;
        this.f109583m = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f109585o = new hq2[length];
        this.f109575e = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        hq2[] hq2VarArr = new hq2[i11];
        hq2 hq2VarA = hq2.a(keVar, nj0Var, jj0Var);
        this.f109584n = hq2VarA;
        int i12 = 0;
        iArr2[0] = i10;
        hq2VarArr[0] = hq2VarA;
        while (i12 < length) {
            hq2 hq2VarA2 = hq2.a(keVar);
            this.f109585o[i12] = hq2VarA2;
            int i13 = i12 + 1;
            hq2VarArr[i13] = hq2VarA2;
            iArr2[i13] = this.f109573c[i12];
            i12 = i13;
        }
        this.f109586p = new Cdo(iArr2, hq2VarArr);
        this.f109590t = j10;
        this.f109591u = j10;
    }

    public final bo a(int i10) {
        bo boVar = (bo) this.f109582l.get(i10);
        ArrayList arrayList = this.f109582l;
        int size = arrayList.size();
        int i11 = w83.f117341a;
        if (i10 < 0 || size > arrayList.size() || i10 > size) {
            throw new IllegalArgumentException();
        }
        if (i10 != size) {
            arrayList.subList(i10, size).clear();
        }
        this.f109592v = Math.max(this.f109592v, this.f109582l.size());
        int i12 = 0;
        this.f109584n.c(boVar.a(0));
        while (true) {
            hq2[] hq2VarArr = this.f109585o;
            if (i12 >= hq2VarArr.length) {
                return boVar;
            }
            hq2 hq2Var = hq2VarArr[i12];
            i12++;
            hq2Var.c(boVar.a(i12));
        }
    }

    public final boolean b(int i10) {
        hq2 hq2Var;
        bo boVar = (bo) this.f109582l.get(i10);
        hq2 hq2Var2 = this.f109584n;
        if (hq2Var2.f111696q + hq2Var2.f111698s > boVar.a(0)) {
            return true;
        }
        int i11 = 0;
        do {
            hq2[] hq2VarArr = this.f109585o;
            if (i11 >= hq2VarArr.length) {
                return false;
            }
            hq2Var = hq2VarArr[i11];
            i11++;
        } while (hq2Var.f111696q + hq2Var.f111698s <= boVar.a(i11));
        return true;
    }

    @Override // yads.iq2
    public final boolean c() {
        return !d() && this.f109584n.a(this.f109594x);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x02ab  */
    @Override // yads.ev2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean continueLoading(long r58) {
        /*
            Method dump skipped, instruction units count: 1271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cu.continueLoading(long):boolean");
    }

    public final boolean d() {
        return this.f109590t != -9223372036854775807L;
    }

    public final void e() {
        hq2 hq2Var = this.f109584n;
        int iA = a(hq2Var.f111696q + hq2Var.f111698s, this.f109592v - 1);
        while (true) {
            int i10 = this.f109592v;
            if (i10 > iA) {
                return;
            }
            this.f109592v = i10 + 1;
            bo boVar = (bo) this.f109582l.get(i10);
            yv0 yv0Var = boVar.f116366d;
            if (!yv0Var.equals(this.f109588r)) {
                ol1 ol1Var = this.f109578h;
                ol1Var.a(new tk1(1, this.f109572b, yv0Var, boVar.f116367e, boVar.f116368f, ol1Var.a(boVar.f116369g), -9223372036854775807L));
            }
            this.f109588r = yv0Var;
        }
    }

    @Override // yads.ev2
    public final long getBufferedPositionUs() {
        long j10;
        if (this.f109594x) {
            return Long.MIN_VALUE;
        }
        if (d()) {
            return this.f109590t;
        }
        long jMax = this.f109591u;
        ArrayList arrayList = this.f109582l;
        bo boVar = (bo) arrayList.get(arrayList.size() - 1);
        if (!boVar.d()) {
            if (this.f109582l.size() > 1) {
                boVar = (bo) this.f109582l.get(r2.size() - 2);
            } else {
                boVar = null;
            }
        }
        if (boVar != null) {
            jMax = Math.max(jMax, boVar.f116370h);
        }
        hq2 hq2Var = this.f109584n;
        synchronized (hq2Var) {
            j10 = hq2Var.f111701v;
        }
        return Math.max(jMax, j10);
    }

    @Override // yads.ev2
    public final long getNextLoadPositionUs() {
        if (d()) {
            return this.f109590t;
        }
        if (this.f109594x) {
            return Long.MIN_VALUE;
        }
        return ((bo) this.f109582l.get(r0.size() - 1)).f116370h;
    }

    @Override // yads.ev2
    public final boolean isLoading() {
        return this.f109580j.b();
    }

    @Override // yads.ev2
    public final void reevaluateBuffer(long j10) {
        if (this.f109580j.f114976c == null && !d()) {
            if (this.f109580j.b()) {
                tt ttVar = this.f109587q;
                ttVar.getClass();
                boolean z10 = ttVar instanceof bo;
                if (z10 && b(this.f109582l.size() - 1)) {
                    return;
                }
                n20 n20Var = this.f109576f;
                List list = this.f109583m;
                ac0 ac0Var = (ac0) n20Var;
                if (ac0Var.f108635l == null && ac0Var.f108632i.a(j10, ttVar, list)) {
                    le1 le1Var = this.f109580j.f114975b;
                    if (le1Var == null) {
                        throw new IllegalStateException();
                    }
                    le1Var.a(false);
                    if (z10) {
                        this.f109593w = (bo) ttVar;
                        return;
                    }
                    return;
                }
                return;
            }
            n20 n20Var2 = this.f109576f;
            List list2 = this.f109583m;
            ac0 ac0Var2 = (ac0) n20Var2;
            int size = (ac0Var2.f108635l != null || ac0Var2.f108632i.g() < 2) ? list2.size() : ac0Var2.f108632i.a(j10, list2);
            if (size < this.f109582l.size()) {
                if (this.f109580j.b()) {
                    throw new IllegalStateException();
                }
                int size2 = this.f109582l.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!b(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size == -1) {
                    return;
                }
                long j11 = ((bo) this.f109582l.get(r1.size() - 1)).f116370h;
                bo boVarA = a(size);
                if (this.f109582l.isEmpty()) {
                    this.f109590t = this.f109591u;
                }
                this.f109594x = false;
                ol1 ol1Var = this.f109578h;
                ol1Var.b(new tk1(1, this.f109572b, null, 3, null, ol1Var.a(boVarA.f116369g), ol1Var.a(j11)));
            }
        }
    }

    @Override // yads.iq2
    public final void a() throws IOException {
        this.f109580j.a(Integer.MIN_VALUE);
        hq2 hq2Var = this.f109584n;
        hj0 hj0Var = hq2Var.f111687h;
        if (hj0Var != null && hj0Var.c() == 1) {
            gj0 gj0VarD = hq2Var.f111687h.d();
            gj0VarD.getClass();
            throw gj0VarD;
        }
        if (this.f109580j.b()) {
            return;
        }
        ac0 ac0Var = (ac0) this.f109576f;
        ro roVar = ac0Var.f108635l;
        if (roVar == null) {
            ac0Var.f108624a.a();
            return;
        }
        throw roVar;
    }

    @Override // yads.ne1
    public final void b() {
        hq2 hq2Var = this.f109584n;
        hq2Var.b(true);
        hq2Var.d();
        for (hq2 hq2Var2 : this.f109585o) {
            hq2Var2.b(true);
            hq2Var2.d();
        }
        for (yb0 yb0Var : ((ac0) this.f109576f).f108631h) {
            wt wtVar = yb0Var.f118132a;
            if (wtVar != null) {
                ((rq) wtVar).f115546b.release();
            }
        }
        bu buVar = this.f109589s;
        if (buVar != null) {
            u20 u20Var = (u20) buVar;
            synchronized (u20Var) {
                com.monetization.ads.exo.source.dash.k kVar = (com.monetization.ads.exo.source.dash.k) u20Var.f116454o.remove(this);
                if (kVar != null) {
                    hq2 hq2Var3 = kVar.f58998a;
                    hq2Var3.b(true);
                    hq2Var3.d();
                }
            }
        }
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11, boolean z10) {
        tt ttVar = (tt) me1Var;
        this.f109587q = null;
        this.f109593w = null;
        long j12 = ttVar.f116363a;
        Uri uri = ttVar.f116371i.f109698c;
        ge1 ge1Var = new ge1();
        this.f109579i.getClass();
        ol1 ol1Var = this.f109578h;
        ol1Var.a(ge1Var, new tk1(ttVar.f116365c, this.f109572b, ttVar.f116366d, ttVar.f116367e, ttVar.f116368f, ol1Var.a(ttVar.f116369g), ol1Var.a(ttVar.f116370h)));
        if (z10) {
            return;
        }
        if (d()) {
            this.f109584n.b(false);
            for (hq2 hq2Var : this.f109585o) {
                hq2Var.b(false);
            }
        } else if (ttVar instanceof bo) {
            a(this.f109582l.size() - 1);
            if (this.f109582l.isEmpty()) {
                this.f109590t = this.f109591u;
            }
        }
        this.f109577g.a(this);
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11) {
        tt ttVar = (tt) me1Var;
        this.f109587q = null;
        ac0 ac0Var = (ac0) this.f109576f;
        ac0Var.getClass();
        if (ttVar instanceof a51) {
            int iA = ac0Var.f108632i.a(((a51) ttVar).f116366d);
            yb0[] yb0VarArr = ac0Var.f108631h;
            yb0 yb0Var = yb0VarArr[iA];
            if (yb0Var.f118135d == null) {
                wt wtVar = yb0Var.f118132a;
                nu2 nu2Var = ((rq) wtVar).f115553i;
                yt ytVar = nu2Var instanceof yt ? (yt) nu2Var : null;
                if (ytVar != null) {
                    gm2 gm2Var = yb0Var.f118133b;
                    yb0VarArr[iA] = new yb0(yb0Var.f118136e, gm2Var, yb0Var.f118134c, wtVar, yb0Var.f118137f, new x20(ytVar, gm2Var.f111279c));
                }
            }
        }
        com.monetization.ads.exo.source.dash.k kVar = ac0Var.f108630g;
        if (kVar != null) {
            long j12 = kVar.f59001d;
            if (j12 == -9223372036854775807L || ttVar.f116370h > j12) {
                kVar.f59001d = ttVar.f116370h;
            }
            kVar.f59002e.f59009h = true;
        }
        long j13 = ttVar.f116363a;
        Uri uri = ttVar.f116371i.f109698c;
        ge1 ge1Var = new ge1();
        this.f109579i.getClass();
        ol1 ol1Var = this.f109578h;
        ol1Var.b(ge1Var, new tk1(ttVar.f116365c, this.f109572b, ttVar.f116366d, ttVar.f116367e, ttVar.f116368f, ol1Var.a(ttVar.f116369g), ol1Var.a(ttVar.f116370h)));
        this.f109577g.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b7  */
    @Override // yads.je1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.ke1 a(yads.me1 r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cu.a(yads.me1, long, long, java.io.IOException, int):yads.ke1");
    }

    public final int a(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f109582l.size()) {
                return this.f109582l.size() - 1;
            }
        } while (((bo) this.f109582l.get(i11)).a(0) <= i10);
        return i11 - 1;
    }

    @Override // yads.iq2
    public final int a(zv0 zv0Var, fa0 fa0Var, int i10) {
        if (d()) {
            return -3;
        }
        bo boVar = this.f109593w;
        if (boVar != null) {
            int iA = boVar.a(0);
            hq2 hq2Var = this.f109584n;
            if (iA <= hq2Var.f111696q + hq2Var.f111698s) {
                return -3;
            }
        }
        e();
        return this.f109584n.a(zv0Var, fa0Var, i10, this.f109594x);
    }

    @Override // yads.iq2
    public final int a(long j10) throws Throwable {
        if (d()) {
            return 0;
        }
        int iA = this.f109584n.a(j10, this.f109594x);
        bo boVar = this.f109593w;
        if (boVar != null) {
            int iA2 = boVar.a(0);
            hq2 hq2Var = this.f109584n;
            iA = Math.min(iA, iA2 - (hq2Var.f111696q + hq2Var.f111698s));
        }
        hq2 hq2Var2 = this.f109584n;
        synchronized (hq2Var2) {
            if (iA >= 0) {
                int i10 = hq2Var2.f111698s + iA;
                if (i10 <= hq2Var2.f111695p) {
                    hq2Var2.f111698s = i10;
                }
            }
            throw new IllegalArgumentException();
        }
        e();
        return iA;
    }
}
