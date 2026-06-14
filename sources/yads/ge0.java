package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ge0 extends pe0 implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f111152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f111153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f111154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final je0 f111155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f111156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f111157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f111158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f111159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f111160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f111161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f111162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f111163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f111164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f111165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f111166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f111167u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f111168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f111169w;

    public ge0(int i10, u43 u43Var, int i11, je0 je0Var, int i12, boolean z10, je2 je2Var) {
        int i13;
        int iA;
        int iA2;
        super(i10, i11, u43Var);
        this.f111155i = je0Var;
        this.f111154h = re0.b(this.f114645e.f118389d);
        this.f111156j = re0.a(false, i12);
        int i14 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i14 >= je0Var.f109784o.size()) {
                iA = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iA = re0.a(this.f114645e, (String) je0Var.f109784o.get(i14), false);
                if (iA > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f111158l = i14;
        this.f111157k = iA;
        this.f111159m = re0.a(this.f114645e.f118391f, je0Var.f109785p);
        yv0 yv0Var = this.f114645e;
        int i15 = yv0Var.f118391f;
        this.f111160n = i15 == 0 || (i15 & 1) != 0;
        this.f111163q = (yv0Var.f118390e & 1) != 0;
        int i16 = yv0Var.f118411z;
        this.f111164r = i16;
        this.f111165s = yv0Var.A;
        int i17 = yv0Var.f118394i;
        this.f111166t = i17;
        this.f111153g = (i17 == -1 || i17 <= je0Var.f109787r) && (i16 == -1 || i16 <= je0Var.f109786q) && je2Var.apply(yv0Var);
        String[] strArrD = w83.d();
        int i18 = 0;
        while (true) {
            if (i18 >= strArrD.length) {
                iA2 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            } else {
                iA2 = re0.a(this.f114645e, strArrD[i18], false);
                if (iA2 > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.f111161o = i18;
        this.f111162p = iA2;
        int i19 = 0;
        while (true) {
            if (i19 < je0Var.f109788s.size()) {
                String str = this.f114645e.f118398m;
                if (str != null && str.equals(je0Var.f109788s.get(i19))) {
                    i13 = i19;
                    break;
                }
                i19++;
            } else {
                break;
            }
        }
        this.f111167u = i13;
        this.f111168v = jo.a(i12) == 128;
        this.f111169w = jo.b(i12) == 64;
        this.f111152f = a(z10, i12);
    }

    public static int a(List list, List list2) {
        return ((ge0) Collections.max(list)).compareTo((ge0) Collections.max(list2));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ge0 ge0Var) {
        f92 f92VarA = (this.f111153g && this.f111156j) ? re0.f115420i : re0.f115420i.a();
        qx qxVarA = ox.a(cq.a(this.f111156j, ge0Var.f111156j));
        Integer numValueOf = Integer.valueOf(this.f111158l);
        Integer numValueOf2 = Integer.valueOf(ge0Var.f111158l);
        l62.f112983b.getClass();
        eo2 eo2Var = eo2.f110429b;
        qx qxVarA2 = qxVarA.a(numValueOf, numValueOf2, eo2Var).a(this.f111157k, ge0Var.f111157k).a(this.f111159m, ge0Var.f111159m).a(this.f111163q, ge0Var.f111163q).a(this.f111160n, ge0Var.f111160n).a(Integer.valueOf(this.f111161o), Integer.valueOf(ge0Var.f111161o), eo2Var).a(this.f111162p, ge0Var.f111162p).a(this.f111153g, ge0Var.f111153g).a(Integer.valueOf(this.f111167u), Integer.valueOf(ge0Var.f111167u), eo2Var).a(Integer.valueOf(this.f111166t), Integer.valueOf(ge0Var.f111166t), this.f111155i.f109793x ? re0.f115420i.a() : re0.f115421j).a(this.f111168v, ge0Var.f111168v).a(this.f111169w, ge0Var.f111169w).a(Integer.valueOf(this.f111164r), Integer.valueOf(ge0Var.f111164r), f92VarA).a(Integer.valueOf(this.f111165s), Integer.valueOf(ge0Var.f111165s), f92VarA);
        Integer numValueOf3 = Integer.valueOf(this.f111166t);
        Integer numValueOf4 = Integer.valueOf(ge0Var.f111166t);
        if (!w83.a(this.f111154h, ge0Var.f111154h)) {
            f92VarA = re0.f115421j;
        }
        return qxVarA2.a(numValueOf3, numValueOf4, f92VarA).a();
    }

    public final int a(boolean z10, int i10) {
        if (!re0.a(this.f111155i.M, i10)) {
            return 0;
        }
        if (!this.f111153g && !this.f111155i.G) {
            return 0;
        }
        if (!re0.a(false, i10) || !this.f111153g || this.f114645e.f118394i == -1) {
            return 1;
        }
        je0 je0Var = this.f111155i;
        if (je0Var.f109794y || je0Var.f109793x) {
            return 1;
        }
        return (je0Var.O || !z10) ? 2 : 1;
    }

    @Override // yads.pe0
    public final int a() {
        return this.f111152f;
    }

    @Override // yads.pe0
    public final boolean a(pe0 pe0Var) {
        int i10;
        String str;
        int i11;
        ge0 ge0Var = (ge0) pe0Var;
        je0 je0Var = this.f111155i;
        if (!je0Var.J && ((i11 = this.f114645e.f118411z) == -1 || i11 != ge0Var.f114645e.f118411z)) {
            return false;
        }
        if (!je0Var.H && ((str = this.f114645e.f118398m) == null || !TextUtils.equals(str, ge0Var.f114645e.f118398m))) {
            return false;
        }
        je0 je0Var2 = this.f111155i;
        if (!je0Var2.I && ((i10 = this.f114645e.A) == -1 || i10 != ge0Var.f114645e.A)) {
            return false;
        }
        if (je0Var2.K) {
            return true;
        }
        return this.f111168v == ge0Var.f111168v && this.f111169w == ge0Var.f111169w;
    }
}
