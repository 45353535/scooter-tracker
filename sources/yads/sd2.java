package yads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class sd2 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f115756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f115757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f115758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f115759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f43[] f115760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object[] f115761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f115762l;

    public sd2(List list, fw2 fw2Var) {
        super(fw2Var);
        int size = list.size();
        this.f115758h = new int[size];
        this.f115759i = new int[size];
        this.f115760j = new f43[size];
        this.f115761k = new Object[size];
        this.f115762l = new HashMap();
        Iterator it = list.iterator();
        int iB = 0;
        int iA = 0;
        int i10 = 0;
        while (it.hasNext()) {
            ql1 ql1Var = (ql1) it.next();
            this.f115760j[i10] = ql1Var.b();
            this.f115759i[i10] = iB;
            this.f115758h[i10] = iA;
            iB += this.f115760j[i10].b();
            iA += this.f115760j[i10].a();
            this.f115761k[i10] = ql1Var.a();
            this.f115762l.put(this.f115761k[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f115756f = iB;
        this.f115757g = iA;
    }

    @Override // yads.f43
    public final int a() {
        return this.f115757g;
    }

    @Override // yads.f43
    public final int b() {
        return this.f115756f;
    }
}
