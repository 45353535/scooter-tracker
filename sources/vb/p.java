package vb;

import android.util.SparseArray;
import io.bidmachine.media3.common.a;
import java.util.ArrayList;
import java.util.Arrays;
import n9.g;
import oa.s0;
import q9.o0;
import r9.f;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f106301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f106302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f106303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f106304d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f106308h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f106310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s0 f106311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f106312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f106313m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f106315o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f106309i = new boolean[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f106305e = new w(7, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f106306f = new w(8, 128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f106307g = new w(6, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f106314n = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final q9.d0 f106316p = new q9.d0();

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0 f106317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f106318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f106319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray f106320d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray f106321e = new SparseArray();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final r9.h f106322f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f106323g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f106324h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f106325i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f106326j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f106327k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f106328l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f106329m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f106330n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f106331o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f106332p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f106333q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f106334r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f106335s;

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f106336a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f106337b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private f.m f106338c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f106339d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f106340e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f106341f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f106342g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f106343h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f106344i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f106345j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f106346k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f106347l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f106348m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f106349n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f106350o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f106351p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f106336a) {
                    return false;
                }
                if (!aVar.f106336a) {
                    return true;
                }
                f.m mVar = (f.m) q9.a.i(this.f106338c);
                f.m mVar2 = (f.m) q9.a.i(aVar.f106338c);
                return (this.f106341f == aVar.f106341f && this.f106342g == aVar.f106342g && this.f106343h == aVar.f106343h && (!this.f106344i || !aVar.f106344i || this.f106345j == aVar.f106345j) && (((i10 = this.f106339d) == (i11 = aVar.f106339d) || (i10 != 0 && i11 != 0)) && (((i12 = mVar.f99315n) != 0 || mVar2.f99315n != 0 || (this.f106348m == aVar.f106348m && this.f106349n == aVar.f106349n)) && ((i12 != 1 || mVar2.f99315n != 1 || (this.f106350o == aVar.f106350o && this.f106351p == aVar.f106351p)) && (z10 = this.f106346k) == aVar.f106346k && (!z10 || this.f106347l == aVar.f106347l))))) ? false : true;
            }

            public void b() {
                this.f106337b = false;
                this.f106336a = false;
            }

            public boolean d() {
                if (!this.f106337b) {
                    return false;
                }
                int i10 = this.f106340e;
                return i10 == 7 || i10 == 2;
            }

            public void e(f.m mVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f106338c = mVar;
                this.f106339d = i10;
                this.f106340e = i11;
                this.f106341f = i12;
                this.f106342g = i13;
                this.f106343h = z10;
                this.f106344i = z11;
                this.f106345j = z12;
                this.f106346k = z13;
                this.f106347l = i14;
                this.f106348m = i15;
                this.f106349n = i16;
                this.f106350o = i17;
                this.f106351p = i18;
                this.f106336a = true;
                this.f106337b = true;
            }

            public void f(int i10) {
                this.f106340e = i10;
                this.f106337b = true;
            }
        }

        public b(s0 s0Var, boolean z10, boolean z11) {
            this.f106317a = s0Var;
            this.f106318b = z10;
            this.f106319c = z11;
            this.f106329m = new a();
            this.f106330n = new a();
            byte[] bArr = new byte[128];
            this.f106323g = bArr;
            this.f106322f = new r9.h(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void d(int i10) {
            long j10 = this.f106333q;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f106326j;
                long j12 = this.f106332p;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f106317a.e(j10, this.f106334r ? 1 : 0, i11, i10, null);
            }
        }

        private void h() {
            boolean zD = this.f106318b ? this.f106330n.d() : this.f106335s;
            boolean z10 = this.f106334r;
            int i10 = this.f106325i;
            boolean z11 = true;
            if (i10 != 5 && (!zD || i10 != 1)) {
                z11 = false;
            }
            this.f106334r = z10 | z11;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 426
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: vb.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10) {
            if (this.f106325i == 9 || (this.f106319c && this.f106330n.c(this.f106329m))) {
                if (z10 && this.f106331o) {
                    d(i10 + ((int) (j10 - this.f106326j)));
                }
                this.f106332p = this.f106326j;
                this.f106333q = this.f106328l;
                this.f106334r = false;
                this.f106331o = true;
            }
            h();
            this.f106325i = 24;
            return this.f106334r;
        }

        public boolean c() {
            return this.f106319c;
        }

        public void e(f.l lVar) {
            this.f106321e.append(lVar.f99299a, lVar);
        }

        public void f(f.m mVar) {
            this.f106320d.append(mVar.f99305d, mVar);
        }

        public void g() {
            this.f106327k = false;
            this.f106331o = false;
            this.f106330n.b();
        }

        public void i(long j10, int i10, long j11, boolean z10) {
            this.f106325i = i10;
            this.f106328l = j11;
            this.f106326j = j10;
            this.f106335s = z10;
            if (!this.f106318b || i10 != 1) {
                if (!this.f106319c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f106329m;
            this.f106329m = this.f106330n;
            this.f106330n = aVar;
            aVar.b();
            this.f106324h = 0;
            this.f106327k = true;
        }
    }

    public p(g0 g0Var, boolean z10, boolean z11, String str) {
        this.f106301a = g0Var;
        this.f106302b = z10;
        this.f106303c = z11;
        this.f106304d = str;
    }

    private void c() {
        q9.a.i(this.f106311k);
        o0.i(this.f106312l);
    }

    private void d(long j10, int i10, int i11, long j11) {
        if (!this.f106313m || this.f106312l.c()) {
            this.f106305e.b(i11);
            this.f106306f.b(i11);
            if (this.f106313m) {
                if (this.f106305e.c()) {
                    w wVar = this.f106305e;
                    f.m mVarC = r9.f.C(wVar.f106456d, 3, wVar.f106457e);
                    this.f106301a.f(mVarC.f99321t);
                    this.f106312l.f(mVarC);
                    this.f106305e.d();
                } else if (this.f106306f.c()) {
                    w wVar2 = this.f106306f;
                    this.f106312l.e(r9.f.A(wVar2.f106456d, 3, wVar2.f106457e));
                    this.f106306f.d();
                }
            } else if (this.f106305e.c() && this.f106306f.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f106305e;
                arrayList.add(Arrays.copyOf(wVar3.f106456d, wVar3.f106457e));
                w wVar4 = this.f106306f;
                arrayList.add(Arrays.copyOf(wVar4.f106456d, wVar4.f106457e));
                w wVar5 = this.f106305e;
                f.m mVarC2 = r9.f.C(wVar5.f106456d, 3, wVar5.f106457e);
                w wVar6 = this.f106306f;
                f.l lVarA = r9.f.A(wVar6.f106456d, 3, wVar6.f106457e);
                this.f106311k.f(new a.b().f0(this.f106310j).U(this.f106304d).u0("video/avc").S(q9.i.d(mVarC2.f99302a, mVarC2.f99303b, mVarC2.f99304c)).B0(mVarC2.f99307f).d0(mVarC2.f99308g).T(new g.b().d(mVarC2.f99318q).c(mVarC2.f99319r).e(mVarC2.f99320s).g(mVarC2.f99310i + 8).b(mVarC2.f99311j + 8).a()).q0(mVarC2.f99309h).g0(arrayList).l0(mVarC2.f99321t).N());
                this.f106313m = true;
                this.f106301a.f(mVarC2.f99321t);
                this.f106312l.f(mVarC2);
                this.f106312l.e(lVarA);
                this.f106305e.d();
                this.f106306f.d();
            }
        }
        if (this.f106307g.b(i11)) {
            w wVar7 = this.f106307g;
            this.f106316p.U(this.f106307g.f106456d, r9.f.L(wVar7.f106456d, wVar7.f106457e));
            this.f106316p.W(4);
            this.f106301a.c(j11, this.f106316p);
        }
        if (this.f106312l.b(j10, i10, this.f106313m)) {
            this.f106315o = false;
        }
    }

    private void e(byte[] bArr, int i10, int i11) {
        if (!this.f106313m || this.f106312l.c()) {
            this.f106305e.a(bArr, i10, i11);
            this.f106306f.a(bArr, i10, i11);
        }
        this.f106307g.a(bArr, i10, i11);
        this.f106312l.a(bArr, i10, i11);
    }

    private void f(long j10, int i10, long j11) {
        if (!this.f106313m || this.f106312l.c()) {
            this.f106305e.e(i10);
            this.f106306f.e(i10);
        }
        this.f106307g.e(i10);
        this.f106312l.i(j10, i10, j11, this.f106315o);
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) {
        int i10;
        c();
        int iF = d0Var.f();
        int iG = d0Var.g();
        byte[] bArrE = d0Var.e();
        this.f106308h += (long) d0Var.a();
        this.f106311k.c(d0Var, d0Var.a());
        while (true) {
            int iE = r9.f.e(bArrE, iF, iG, this.f106309i);
            if (iE == iG) {
                e(bArrE, iF, iG);
                return;
            }
            int iJ = r9.f.j(bArrE, iE);
            if (iE <= 0 || bArrE[iE - 1] != 0) {
                i10 = 3;
            } else {
                iE--;
                i10 = 4;
            }
            int i11 = iE;
            int i12 = i10;
            int i13 = i11 - iF;
            if (i13 > 0) {
                e(bArrE, iF, i11);
            }
            int i14 = iG - i11;
            long j10 = this.f106308h - ((long) i14);
            d(j10, i14, i13 < 0 ? -i13 : 0, this.f106314n);
            f(j10, iJ, this.f106314n);
            iF = i11 + i12;
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        this.f106310j = dVar.b();
        s0 s0VarTrack = tVar.track(dVar.c(), 2);
        this.f106311k = s0VarTrack;
        this.f106312l = new b(s0VarTrack, this.f106302b, this.f106303c);
        this.f106301a.d(tVar, dVar);
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
        c();
        if (z10) {
            this.f106301a.e();
            d(this.f106308h, 0, 0, this.f106314n);
            f(this.f106308h, 9, this.f106314n);
            d(this.f106308h, 0, 0, this.f106314n);
        }
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        this.f106314n = j10;
        this.f106315o |= (i10 & 2) != 0;
    }

    @Override // vb.m
    public void seek() {
        this.f106308h = 0L;
        this.f106315o = false;
        this.f106314n = -9223372036854775807L;
        r9.f.c(this.f106309i);
        this.f106305e.d();
        this.f106306f.d();
        this.f106307g.d();
        this.f106301a.b();
        b bVar = this.f106312l;
        if (bVar != null) {
            bVar.g();
        }
    }
}
