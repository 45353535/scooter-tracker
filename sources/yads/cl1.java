package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class cl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl1 f109443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f109444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iq2[] f109445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f109446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f109447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public el1 f109448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f109449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f109450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jo[] f109451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f53 f109452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vl1 f109453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public cl1 f109454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v43 f109455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g53 f109456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f109457o;

    public cl1(jo[] joVarArr, long j10, f53 f53Var, va0 va0Var, vl1 vl1Var, el1 el1Var, g53 g53Var) {
        this.f109451i = joVarArr;
        this.f109457o = j10;
        this.f109452j = f53Var;
        this.f109453k = vl1Var;
        kl1 kl1Var = el1Var.f110409a;
        this.f109444b = kl1Var.f109962a;
        this.f109448f = el1Var;
        this.f109455m = v43.f116871e;
        this.f109456n = g53Var;
        this.f109445c = new iq2[joVarArr.length];
        this.f109450h = new boolean[joVarArr.length];
        this.f109443a = a(kl1Var, vl1Var, va0Var, el1Var.f110410b, el1Var.f110412d);
    }

    public final long a(g53 g53Var, long j10, boolean z10, boolean[] zArr) {
        g53 g53Var2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= g53Var.f111076a) {
                break;
            }
            boolean[] zArr2 = this.f109450h;
            if (z10 || (g53Var2 = this.f109456n) == null || !w83.a(g53Var.f111077b[i11], g53Var2.f111077b[i11]) || !w83.a(g53Var.f111078c[i11], g53Var2.f111078c[i11])) {
                z11 = false;
            }
            zArr2[i11] = z11;
            i11++;
        }
        iq2[] iq2VarArr = this.f109445c;
        int i12 = 0;
        while (true) {
            jo[] joVarArr = this.f109451i;
            if (i12 >= joVarArr.length) {
                break;
            }
            if (joVarArr[i12].f112407b == -2) {
                iq2VarArr[i12] = null;
            }
            i12++;
        }
        a();
        this.f109456n = g53Var;
        if (this.f109454l == null) {
            int i13 = 0;
            while (true) {
                g53 g53Var3 = this.f109456n;
                if (i13 >= g53Var3.f111076a) {
                    break;
                }
                boolean zA = g53Var3.a(i13);
                bo0 bo0Var = this.f109456n.f111078c[i13];
                if (zA && bo0Var != null) {
                    bo0Var.a();
                }
                i13++;
            }
        }
        long jA = this.f109443a.a(g53Var.f111078c, this.f109450h, this.f109445c, zArr, j10);
        iq2[] iq2VarArr2 = this.f109445c;
        int i14 = 0;
        while (true) {
            jo[] joVarArr2 = this.f109451i;
            if (i14 >= joVarArr2.length) {
                break;
            }
            if (joVarArr2[i14].f112407b == -2 && this.f109456n.a(i14)) {
                iq2VarArr2[i14] = new sk0();
            }
            i14++;
        }
        this.f109447e = false;
        while (true) {
            iq2[] iq2VarArr3 = this.f109445c;
            if (i10 >= iq2VarArr3.length) {
                return jA;
            }
            if (iq2VarArr3[i10] != null) {
                if (!g53Var.a(i10)) {
                    throw new IllegalStateException();
                }
                if (this.f109451i[i10].f112407b != -2) {
                    this.f109447e = true;
                }
            } else if (g53Var.f111078c[i10] != null) {
                throw new IllegalStateException();
            }
            i10++;
        }
    }

    public final void b() {
        a();
        vl1 vl1Var = this.f109453k;
        bl1 bl1Var = this.f109443a;
        try {
            if (!(bl1Var instanceof dv)) {
                tl1 tl1Var = (tl1) vl1Var.f117066c.remove(bl1Var);
                tl1Var.getClass();
                tl1Var.f116286a.releasePeriod(bl1Var);
                tl1Var.f116288c.remove(((gh1) bl1Var).f111194b);
                if (!vl1Var.f117066c.isEmpty()) {
                    Iterator it = vl1Var.f117072i.iterator();
                    while (it.hasNext()) {
                        tl1 tl1Var2 = (tl1) it.next();
                        if (tl1Var2.f116288c.isEmpty()) {
                            sl1 sl1Var = (sl1) vl1Var.f117071h.get(tl1Var2);
                            if (sl1Var != null) {
                                sl1Var.f115862a.disable(sl1Var.f115863b);
                            }
                            it.remove();
                        }
                    }
                }
                if (tl1Var.f116290e && tl1Var.f116288c.isEmpty()) {
                    sl1 sl1Var2 = (sl1) vl1Var.f117071h.remove(tl1Var);
                    sl1Var2.getClass();
                    sl1Var2.f115862a.releaseSource(sl1Var2.f115863b);
                    sl1Var2.f115862a.removeEventListener(sl1Var2.f115864c);
                    sl1Var2.f115862a.removeDrmEventListener(sl1Var2.f115864c);
                    vl1Var.f117072i.remove(tl1Var);
                    return;
                }
                return;
            }
            bl1 bl1Var2 = ((dv) bl1Var).f110077b;
            tl1 tl1Var3 = (tl1) vl1Var.f117066c.remove(bl1Var2);
            tl1Var3.getClass();
            tl1Var3.f116286a.releasePeriod(bl1Var2);
            tl1Var3.f116288c.remove(((gh1) bl1Var2).f111194b);
            if (!vl1Var.f117066c.isEmpty()) {
                Iterator it2 = vl1Var.f117072i.iterator();
                while (it2.hasNext()) {
                    tl1 tl1Var4 = (tl1) it2.next();
                    if (tl1Var4.f116288c.isEmpty()) {
                        sl1 sl1Var3 = (sl1) vl1Var.f117071h.get(tl1Var4);
                        if (sl1Var3 != null) {
                            sl1Var3.f115862a.disable(sl1Var3.f115863b);
                        }
                        it2.remove();
                    }
                }
            }
            if (tl1Var3.f116290e && tl1Var3.f116288c.isEmpty()) {
                sl1 sl1Var4 = (sl1) vl1Var.f117071h.remove(tl1Var3);
                sl1Var4.getClass();
                sl1Var4.f115862a.releaseSource(sl1Var4.f115863b);
                sl1Var4.f115862a.removeEventListener(sl1Var4.f115864c);
                sl1Var4.f115862a.removeDrmEventListener(sl1Var4.f115864c);
                vl1Var.f117072i.remove(tl1Var3);
            }
        } catch (RuntimeException e10) {
            uf1.b("MediaPeriodHolder", uf1.a("Period release failed.", e10));
        }
    }

    public static bl1 a(kl1 kl1Var, vl1 vl1Var, va0 va0Var, long j10, long j11) {
        vl1Var.getClass();
        Object objC = e.c(kl1Var.f109962a);
        kl1 kl1VarA = kl1Var.a(e.b(kl1Var.f109962a));
        tl1 tl1Var = (tl1) vl1Var.f117067d.get(objC);
        tl1Var.getClass();
        vl1Var.f117072i.add(tl1Var);
        sl1 sl1Var = (sl1) vl1Var.f117071h.get(tl1Var);
        if (sl1Var != null) {
            sl1Var.f115862a.enable(sl1Var.f115863b);
        }
        tl1Var.f116288c.add(kl1VarA);
        gh1 gh1VarCreatePeriod = tl1Var.f116286a.createPeriod(kl1VarA, va0Var, j10);
        vl1Var.f117066c.put(gh1VarCreatePeriod, tl1Var);
        Iterator it = vl1Var.f117072i.iterator();
        while (it.hasNext()) {
            tl1 tl1Var2 = (tl1) it.next();
            if (tl1Var2.f116288c.isEmpty()) {
                sl1 sl1Var2 = (sl1) vl1Var.f117071h.get(tl1Var2);
                if (sl1Var2 != null) {
                    sl1Var2.f115862a.disable(sl1Var2.f115863b);
                }
                it.remove();
            }
        }
        return j11 != -9223372036854775807L ? new dv(gh1VarCreatePeriod, true, 0L, j11) : gh1VarCreatePeriod;
    }

    public final void a() {
        if (this.f109454l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            g53 g53Var = this.f109456n;
            if (i10 >= g53Var.f111076a) {
                return;
            }
            boolean zA = g53Var.a(i10);
            bo0 bo0Var = this.f109456n.f111078c[i10];
            if (zA && bo0Var != null) {
                bo0Var.b();
            }
            i10++;
        }
    }
}
