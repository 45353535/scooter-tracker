package io.bidmachine.media3.exoplayer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n9.e0;

/* JADX INFO: loaded from: classes12.dex */
final class h2 extends u9.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f80895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f80896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f80897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f80898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n9.e0[] f80899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object[] f80900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f80901n;

    class a extends ga.w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final e0.c f80902f;

        a(n9.e0 e0Var) {
            super(e0Var);
            this.f80902f = new e0.c();
        }

        @Override // ga.w, n9.e0
        public e0.b g(int i10, e0.b bVar, boolean z10) {
            e0.b bVarG = super.g(i10, bVar, z10);
            if (super.n(bVarG.f95256c, this.f80902f).f()) {
                bVarG.t(bVar.f95254a, bVar.f95255b, bVar.f95256c, bVar.f95257d, bVar.f95258e, n9.b.f95190g, true);
                return bVarG;
            }
            bVarG.f95259f = true;
            return bVarG;
        }
    }

    public h2(Collection collection, ga.e1 e1Var) {
        this(G(collection), H(collection), e1Var);
    }

    private static n9.e0[] G(Collection collection) {
        n9.e0[] e0VarArr = new n9.e0[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            e0VarArr[i10] = ((q1) it.next()).getTimeline();
            i10++;
        }
        return e0VarArr;
    }

    private static Object[] H(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = ((q1) it.next()).getUid();
            i10++;
        }
        return objArr;
    }

    @Override // u9.a
    protected int A(int i10) {
        return this.f80898k[i10];
    }

    @Override // u9.a
    protected n9.e0 D(int i10) {
        return this.f80899l[i10];
    }

    public h2 E(ga.e1 e1Var) {
        n9.e0[] e0VarArr = new n9.e0[this.f80899l.length];
        int i10 = 0;
        while (true) {
            n9.e0[] e0VarArr2 = this.f80899l;
            if (i10 >= e0VarArr2.length) {
                return new h2(e0VarArr, this.f80900m, e1Var);
            }
            e0VarArr[i10] = new a(e0VarArr2[i10]);
            i10++;
        }
    }

    List F() {
        return Arrays.asList(this.f80899l);
    }

    @Override // n9.e0
    public int i() {
        return this.f80896i;
    }

    @Override // n9.e0
    public int p() {
        return this.f80895h;
    }

    @Override // u9.a
    protected int s(Object obj) {
        Integer num = (Integer) this.f80901n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // u9.a
    protected int t(int i10) {
        return q9.o0.g(this.f80897j, i10 + 1, false, false);
    }

    @Override // u9.a
    protected int u(int i10) {
        return q9.o0.g(this.f80898k, i10 + 1, false, false);
    }

    @Override // u9.a
    protected Object x(int i10) {
        return this.f80900m[i10];
    }

    @Override // u9.a
    protected int z(int i10) {
        return this.f80897j[i10];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private h2(n9.e0[] e0VarArr, Object[] objArr, ga.e1 e1Var) {
        super(false, e1Var);
        int i10 = 0;
        int length = e0VarArr.length;
        this.f80899l = e0VarArr;
        this.f80897j = new int[length];
        this.f80898k = new int[length];
        this.f80900m = objArr;
        this.f80901n = new HashMap();
        int length2 = e0VarArr.length;
        int iP = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length2) {
            n9.e0 e0Var = e0VarArr[i10];
            this.f80899l[i12] = e0Var;
            this.f80898k[i12] = iP;
            this.f80897j[i12] = i11;
            iP += e0Var.p();
            i11 += this.f80899l[i12].i();
            this.f80901n.put(objArr[i12], Integer.valueOf(i12));
            i10++;
            i12++;
        }
        this.f80895h = iP;
        this.f80896i = i11;
    }
}
