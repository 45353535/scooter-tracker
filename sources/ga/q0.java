package ga;

import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import ga.f0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n9.e0;
import n9.r;

/* JADX INFO: loaded from: classes12.dex */
public final class q0 extends h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final n9.r f72411w = new r.c().c("MergingMediaSource").a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f72412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f72413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f0[] f72414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f72415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n9.e0[] f72416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList f72417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final j f72418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map f72419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Multimap f72420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f72421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long[][] f72422u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c f72423v;

    private static final class b extends w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long[] f72424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long[] f72425g;

        public b(n9.e0 e0Var, Map map) {
            super(e0Var);
            int iP = e0Var.p();
            this.f72425g = new long[e0Var.p()];
            e0.c cVar = new e0.c();
            for (int i10 = 0; i10 < iP; i10++) {
                this.f72425g[i10] = e0Var.n(i10, cVar).f95283m;
            }
            int i11 = e0Var.i();
            this.f72424f = new long[i11];
            e0.b bVar = new e0.b();
            for (int i12 = 0; i12 < i11; i12++) {
                e0Var.g(i12, bVar, true);
                long jLongValue = ((Long) q9.a.e((Long) map.get(bVar.f95255b))).longValue();
                long[] jArr = this.f72424f;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f95257d : jLongValue;
                jArr[i12] = jLongValue;
                long j10 = bVar.f95257d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f72425g;
                    int i13 = bVar.f95256c;
                    jArr2[i13] = jArr2[i13] - (j10 - jLongValue);
                }
            }
        }

        @Override // ga.w, n9.e0
        public e0.b g(int i10, e0.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f95257d = this.f72424f[i10];
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // ga.w, n9.e0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public n9.e0.c o(int r5, n9.e0.c r6, long r7) {
            /*
                r4 = this;
                super.o(r5, r6, r7)
                long[] r7 = r4.f72425g
                r0 = r7[r5]
                r6.f95283m = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f95282l
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f95282l
            L20:
                r6.f95282l = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ga.q0.b.o(int, n9.e0$c, long):n9.e0$c");
        }
    }

    public static final class c extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f72426b;

        public c(int i10) {
            this.f72426b = i10;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0.b f72427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0 f72428b;

        private d(f0.b bVar, c0 c0Var) {
            this.f72427a = bVar;
            this.f72428b = c0Var;
        }
    }

    public q0(f0... f0VarArr) {
        this(false, f0VarArr);
    }

    private void E() {
        e0.b bVar = new e0.b();
        for (int i10 = 0; i10 < this.f72421t; i10++) {
            long j10 = -this.f72416o[0].f(i10, bVar).n();
            int i11 = 1;
            while (true) {
                n9.e0[] e0VarArr = this.f72416o;
                if (i11 < e0VarArr.length) {
                    this.f72422u[i10][i11] = j10 - (-e0VarArr[i11].f(i10, bVar).n());
                    i11++;
                }
            }
        }
    }

    private void H() {
        n9.e0[] e0VarArr;
        e0.b bVar = new e0.b();
        for (int i10 = 0; i10 < this.f72421t; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                e0VarArr = this.f72416o;
                if (i11 >= e0VarArr.length) {
                    break;
                }
                long j11 = e0VarArr[i11].f(i10, bVar).j();
                if (j11 != -9223372036854775807L) {
                    long j12 = j11 + this.f72422u[i10][i11];
                    if (j10 == Long.MIN_VALUE || j12 < j10) {
                        j10 = j12;
                    }
                }
                i11++;
            }
            Object objM = e0VarArr[0].m(i10);
            this.f72419r.put(objM, Long.valueOf(j10));
            Iterator it = this.f72420s.get(objM).iterator();
            while (it.hasNext()) {
                ((e) it.next()).m(0L, j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ga.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public f0.b z(Integer num, f0.b bVar) {
        List list = (List) this.f72415n.get(num.intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((d) list.get(i10)).f72427a.equals(bVar)) {
                return ((d) ((List) this.f72415n.get(0)).get(i10)).f72427a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ga.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void C(Integer num, f0 f0Var, n9.e0 e0Var) {
        if (this.f72423v != null) {
            return;
        }
        if (this.f72421t == -1) {
            this.f72421t = e0Var.i();
        } else if (e0Var.i() != this.f72421t) {
            this.f72423v = new c(0);
            return;
        }
        if (this.f72422u.length == 0) {
            this.f72422u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f72421t, this.f72416o.length);
        }
        this.f72417p.remove(f0Var);
        this.f72416o[num.intValue()] = e0Var;
        if (this.f72417p.isEmpty()) {
            if (this.f72412k) {
                E();
            }
            n9.e0 bVar = this.f72416o[0];
            if (this.f72413l) {
                H();
                bVar = new b(bVar, this.f72419r);
            }
            w(bVar);
        }
    }

    @Override // ga.f0
    public void c(c0 c0Var) {
        if (this.f72413l) {
            e eVar = (e) c0Var;
            Iterator it = this.f72420s.entries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((e) entry.getValue()).equals(eVar)) {
                    this.f72420s.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            c0Var = eVar.f72232b;
        }
        p0 p0Var = (p0) c0Var;
        for (int i10 = 0; i10 < this.f72414m.length; i10++) {
            List list = (List) this.f72415n.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((d) list.get(i11)).f72428b.equals(c0Var)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            this.f72414m[i10].c(p0Var.g(i10));
        }
    }

    @Override // ga.f0
    public c0 e(f0.b bVar, ka.b bVar2, long j10) {
        int length = this.f72414m.length;
        c0[] c0VarArr = new c0[length];
        int iB = this.f72416o[0].b(bVar.f72270a);
        for (int i10 = 0; i10 < length; i10++) {
            f0.b bVarA = bVar.a(this.f72416o[i10].m(iB));
            c0VarArr[i10] = this.f72414m[i10].e(bVarA, bVar2, j10 - this.f72422u[iB][i10]);
            ((List) this.f72415n.get(i10)).add(new d(bVarA, c0VarArr[i10]));
        }
        p0 p0Var = new p0(this.f72418q, this.f72422u[iB], c0VarArr);
        if (!this.f72413l) {
            return p0Var;
        }
        e eVar = new e(p0Var, false, 0L, ((Long) q9.a.e((Long) this.f72419r.get(bVar.f72270a))).longValue());
        this.f72420s.put(bVar.f72270a, eVar);
        return eVar;
    }

    @Override // ga.f0
    public n9.r getMediaItem() {
        f0[] f0VarArr = this.f72414m;
        return f0VarArr.length > 0 ? f0VarArr[0].getMediaItem() : f72411w;
    }

    @Override // ga.a, ga.f0
    public void h(n9.r rVar) {
        this.f72414m[0].h(rVar);
    }

    @Override // ga.h, ga.f0
    public void maybeThrowSourceInfoRefreshError() throws c {
        c cVar = this.f72423v;
        if (cVar != null) {
            throw cVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // ga.h, ga.a
    protected void v(s9.y yVar) {
        super.v(yVar);
        for (int i10 = 0; i10 < this.f72414m.length; i10++) {
            D(Integer.valueOf(i10), this.f72414m[i10]);
        }
    }

    @Override // ga.h, ga.a
    protected void x() {
        super.x();
        Arrays.fill(this.f72416o, (Object) null);
        this.f72421t = -1;
        this.f72423v = null;
        this.f72417p.clear();
        Collections.addAll(this.f72417p, this.f72414m);
    }

    public q0(boolean z10, f0... f0VarArr) {
        this(z10, false, f0VarArr);
    }

    public q0(boolean z10, boolean z11, f0... f0VarArr) {
        this(z10, z11, new k(), f0VarArr);
    }

    public q0(boolean z10, boolean z11, j jVar, f0... f0VarArr) {
        this.f72412k = z10;
        this.f72413l = z11;
        this.f72414m = f0VarArr;
        this.f72418q = jVar;
        this.f72417p = new ArrayList(Arrays.asList(f0VarArr));
        this.f72421t = -1;
        this.f72415n = new ArrayList(f0VarArr.length);
        for (int i10 = 0; i10 < f0VarArr.length; i10++) {
            this.f72415n.add(new ArrayList());
        }
        this.f72416o = new n9.e0[f0VarArr.length];
        this.f72422u = new long[0][];
        this.f72419r = new HashMap();
        this.f72420s = MultimapBuilder.hashKeys().arrayListValues().build();
    }
}
