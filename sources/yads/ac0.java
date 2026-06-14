package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ac0 implements n20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se1 f108624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final no f108625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f108626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f108627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c30 f108628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f108629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.monetization.ads.exo.source.dash.k f108630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yb0[] f108631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public bo0 f108632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p20 f108633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f108634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ro f108635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f108636m;

    public ac0(ut utVar, se1 se1Var, p20 p20Var, no noVar, int i10, int[] iArr, bo0 bo0Var, int i11, c30 c30Var, long j10, boolean z10, ArrayList arrayList, com.monetization.ads.exo.source.dash.k kVar, wc2 wc2Var) {
        this.f108624a = se1Var;
        this.f108633j = p20Var;
        this.f108625b = noVar;
        this.f108626c = iArr;
        this.f108632i = bo0Var;
        int i12 = i11;
        this.f108627d = i12;
        this.f108628e = c30Var;
        this.f108634k = i10;
        this.f108629f = j10;
        com.monetization.ads.exo.source.dash.k kVar2 = kVar;
        this.f108630g = kVar2;
        long jC = p20Var.c(i10);
        ArrayList arrayListA = a();
        this.f108631h = new yb0[bo0Var.g()];
        int i13 = 0;
        while (i13 < this.f108631h.length) {
            gm2 gm2Var = (gm2) arrayListA.get(bo0Var.b(i13));
            mo moVarB = noVar.b(gm2Var.f111278b);
            yb0[] yb0VarArr = this.f108631h;
            mo moVar = moVarB == null ? (mo) gm2Var.f111278b.get(0) : moVarB;
            wt wtVarA = utVar.a(i12, gm2Var.f111277a, z10, arrayList, kVar2, wc2Var);
            long j11 = jC;
            yb0VarArr[i13] = new yb0(j11, gm2Var, moVar, wtVarA, 0L, gm2Var.d());
            i13++;
            kVar2 = kVar;
            jC = j11;
            i12 = i11;
        }
    }

    public final ArrayList a() {
        List list = ((sa2) this.f108633j.f114538m.get(this.f108634k)).f115732c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f108626c) {
            arrayList.addAll(((xb) list.get(i10)).f117770c);
        }
        return arrayList;
    }
}
