package yads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ne0 extends pe0 implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f113832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f113833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f113834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f113835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f113836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f113837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f113838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f113839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f113840n;

    public ne0(int i10, u43 u43Var, int i11, je0 je0Var, int i12, String str) {
        int iA;
        super(i10, i11, u43Var);
        int i13 = 0;
        this.f113833g = re0.a(false, i12);
        int i14 = this.f114645e.f118390e & (~je0Var.f109791v);
        this.f113834h = (i14 & 1) != 0;
        this.f113835i = (i14 & 2) != 0;
        y31 y31VarA = je0Var.f109789t.isEmpty() ? y31.a("") : je0Var.f109789t;
        int i15 = 0;
        while (true) {
            if (i15 >= y31VarA.size()) {
                i15 = Integer.MAX_VALUE;
                iA = 0;
                break;
            } else {
                iA = re0.a(this.f114645e, (String) y31VarA.get(i15), je0Var.f109792w);
                if (iA > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f113836j = i15;
        this.f113837k = iA;
        int iA2 = re0.a(this.f114645e.f118391f, je0Var.f109790u);
        this.f113838l = iA2;
        this.f113840n = (this.f114645e.f118391f & 1088) != 0;
        int iA3 = re0.a(this.f114645e, str, re0.b(str) == null);
        this.f113839m = iA3;
        boolean z10 = iA > 0 || (je0Var.f109789t.isEmpty() && iA2 > 0) || this.f113834h || (this.f113835i && iA3 > 0);
        if (re0.a(je0Var.M, i12) && z10) {
            i13 = 1;
        }
        this.f113832f = i13;
    }

    public static int a(List list, List list2) {
        return ((ne0) list.get(0)).compareTo((ne0) list2.get(0));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ne0 ne0Var) {
        qx qxVarA = ox.a(cq.a(this.f113833g, ne0Var.f113833g));
        Integer numValueOf = Integer.valueOf(this.f113836j);
        Integer numValueOf2 = Integer.valueOf(ne0Var.f113836j);
        Comparator comparator = l62.f112983b;
        comparator.getClass();
        eo2 eo2Var = eo2.f110429b;
        qx qxVarA2 = qxVarA.a(numValueOf, numValueOf2, eo2Var).a(this.f113837k, ne0Var.f113837k).a(this.f113838l, ne0Var.f113838l).a(this.f113834h, ne0Var.f113834h);
        Boolean boolValueOf = Boolean.valueOf(this.f113835i);
        Boolean boolValueOf2 = Boolean.valueOf(ne0Var.f113835i);
        if (this.f113837k != 0) {
            comparator = eo2Var;
        }
        qx qxVarA3 = qxVarA2.a(boolValueOf, boolValueOf2, comparator).a(this.f113839m, ne0Var.f113839m);
        if (this.f113838l == 0) {
            qxVarA3 = qxVarA3.b(this.f113840n, ne0Var.f113840n);
        }
        return qxVarA3.a();
    }

    @Override // yads.pe0
    public final int a() {
        return this.f113832f;
    }

    @Override // yads.pe0
    public final /* bridge */ /* synthetic */ boolean a(pe0 pe0Var) {
        return false;
    }
}
