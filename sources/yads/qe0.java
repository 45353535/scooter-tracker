package yads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class qe0 extends pe0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f114958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final je0 f114959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f114960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f114961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f114962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f114963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f114964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f114965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f114966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f114967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f114968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f114969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f114970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f114971s;

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qe0(int r5, yads.u43 r6, int r7, yads.je0 r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.qe0.<init>(int, yads.u43, int, yads.je0, int, int, boolean):void");
    }

    public static int a(qe0 qe0Var, qe0 qe0Var2) {
        qx qxVarA = ox.a(cq.a(qe0Var.f114961i, qe0Var2.f114961i)).a(qe0Var.f114965m, qe0Var2.f114965m).a(qe0Var.f114966n, qe0Var2.f114966n).a(qe0Var.f114958f, qe0Var2.f114958f).a(qe0Var.f114960h, qe0Var2.f114960h);
        Integer numValueOf = Integer.valueOf(qe0Var.f114964l);
        Integer numValueOf2 = Integer.valueOf(qe0Var2.f114964l);
        l62.f112983b.getClass();
        qx qxVarA2 = qxVarA.a(numValueOf, numValueOf2, eo2.f110429b).a(qe0Var.f114969q, qe0Var2.f114969q).a(qe0Var.f114970r, qe0Var2.f114970r);
        if (qe0Var.f114969q && qe0Var.f114970r) {
            qxVarA2 = qxVarA2.a(qe0Var.f114971s, qe0Var2.f114971s);
        }
        return qxVarA2.a();
    }

    public static int b(qe0 qe0Var, qe0 qe0Var2) {
        f92 f92VarA = (qe0Var.f114958f && qe0Var.f114961i) ? re0.f115420i : re0.f115420i.a();
        return ox.a((qe0Var.f114959g.f109793x ? re0.f115420i.a() : re0.f115421j).compare(Integer.valueOf(qe0Var.f114962j), Integer.valueOf(qe0Var2.f114962j))).a(Integer.valueOf(qe0Var.f114963k), Integer.valueOf(qe0Var2.f114963k), f92VarA).a(Integer.valueOf(qe0Var.f114962j), Integer.valueOf(qe0Var2.f114962j), f92VarA).a();
    }

    public static int a(List list, List list2) {
        return ox.a(new Comparator() { // from class: yads.ve0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qe0.a((qe0) obj, (qe0) obj2);
            }
        }.compare((qe0) Collections.max(list, new Comparator() { // from class: yads.ve0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qe0.a((qe0) obj, (qe0) obj2);
            }
        }), (qe0) Collections.max(list2, new Comparator() { // from class: yads.ve0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qe0.a((qe0) obj, (qe0) obj2);
            }
        }))).a(list.size(), list2.size()).a((qe0) Collections.max(list, new Comparator() { // from class: yads.we0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qe0.b((qe0) obj, (qe0) obj2);
            }
        }), (qe0) Collections.max(list2, new Comparator() { // from class: yads.we0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qe0.b((qe0) obj, (qe0) obj2);
            }
        }), new Comparator() { // from class: yads.we0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qe0.b((qe0) obj, (qe0) obj2);
            }
        }).a();
    }

    public final int a(int i10, int i11) {
        if ((this.f114645e.f118391f & 16384) != 0 || !re0.a(this.f114959g.M, i10)) {
            return 0;
        }
        if (!this.f114958f && !this.f114959g.C) {
            return 0;
        }
        if (!re0.a(false, i10) || !this.f114960h || !this.f114958f || this.f114645e.f118394i == -1) {
            return 1;
        }
        je0 je0Var = this.f114959g;
        return (je0Var.f109794y || je0Var.f109793x || (i10 & i11) == 0) ? 1 : 2;
    }

    @Override // yads.pe0
    public final int a() {
        return this.f114968p;
    }

    @Override // yads.pe0
    public final boolean a(pe0 pe0Var) {
        qe0 qe0Var = (qe0) pe0Var;
        if (!this.f114967o && !w83.a(this.f114645e.f118398m, qe0Var.f114645e.f118398m)) {
            return false;
        }
        if (this.f114959g.F) {
            return true;
        }
        return this.f114969q == qe0Var.f114969q && this.f114970r == qe0Var.f114970r;
    }
}
