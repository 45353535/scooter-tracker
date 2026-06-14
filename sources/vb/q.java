package vb;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import io.bidmachine.media3.common.a;
import java.util.Collections;
import n9.g;
import oa.s0;
import q9.o0;
import r9.f;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f106352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f106354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s0 f106355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f106356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f106357f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f106364m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f106358g = new boolean[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f106359h = new w(32, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f106360i = new w(33, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f106361j = new w(34, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f106362k = new w(39, 128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w f106363l = new w(40, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f106365n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final q9.d0 f106366o = new q9.d0();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0 f106367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f106368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f106369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f106370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f106371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f106372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f106373g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f106374h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f106375i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f106376j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f106377k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f106378l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f106379m;

        public a(s0 s0Var) {
            this.f106367a = s0Var;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
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
            long j10 = this.f106378l;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f106368b;
                long j12 = this.f106377k;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f106367a.e(j10, this.f106379m ? 1 : 0, i11, i10, null);
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f106376j && this.f106373g) {
                this.f106379m = this.f106369c;
                this.f106376j = false;
            } else if (this.f106374h || this.f106373g) {
                if (z10 && this.f106375i) {
                    d(i10 + ((int) (j10 - this.f106368b)));
                }
                this.f106377k = this.f106368b;
                this.f106378l = this.f106371e;
                this.f106379m = this.f106369c;
                this.f106375i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f106372f) {
                int i12 = this.f106370d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f106370d = i12 + (i11 - i10);
                } else {
                    this.f106373g = (bArr[i13] & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
                    this.f106372f = false;
                }
            }
        }

        public void f() {
            this.f106372f = false;
            this.f106373g = false;
            this.f106374h = false;
            this.f106375i = false;
            this.f106376j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f106373g = false;
            this.f106374h = false;
            this.f106371e = j11;
            this.f106370d = 0;
            this.f106368b = j10;
            if (!c(i11)) {
                if (this.f106375i && !this.f106376j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f106375i = false;
                }
                if (b(i11)) {
                    this.f106374h = !this.f106376j;
                    this.f106376j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f106369c = z11;
            this.f106372f = z11 || i11 <= 9;
        }
    }

    public q(g0 g0Var, String str) {
        this.f106352a = g0Var;
        this.f106353b = str;
    }

    private void c() {
        q9.a.i(this.f106355d);
        o0.i(this.f106356e);
    }

    private void d(long j10, int i10, int i11, long j11) {
        this.f106356e.a(j10, i10, this.f106357f);
        if (!this.f106357f) {
            this.f106359h.b(i11);
            this.f106360i.b(i11);
            this.f106361j.b(i11);
            if (this.f106359h.c() && this.f106360i.c() && this.f106361j.c()) {
                io.bidmachine.media3.common.a aVarF = f(this.f106354c, this.f106359h, this.f106360i, this.f106361j, this.f106353b);
                this.f106355d.f(aVarF);
                Preconditions.checkState(aVarF.f80563q != -1);
                this.f106352a.f(aVarF.f80563q);
                this.f106357f = true;
            }
        }
        if (this.f106362k.b(i11)) {
            w wVar = this.f106362k;
            this.f106366o.U(this.f106362k.f106456d, r9.f.L(wVar.f106456d, wVar.f106457e));
            this.f106366o.X(5);
            this.f106352a.c(j11, this.f106366o);
        }
        if (this.f106363l.b(i11)) {
            w wVar2 = this.f106363l;
            this.f106366o.U(this.f106363l.f106456d, r9.f.L(wVar2.f106456d, wVar2.f106457e));
            this.f106366o.X(5);
            this.f106352a.c(j11, this.f106366o);
        }
    }

    private void e(byte[] bArr, int i10, int i11) {
        this.f106356e.e(bArr, i10, i11);
        if (!this.f106357f) {
            this.f106359h.a(bArr, i10, i11);
            this.f106360i.a(bArr, i10, i11);
            this.f106361j.a(bArr, i10, i11);
        }
        this.f106362k.a(bArr, i10, i11);
        this.f106363l.a(bArr, i10, i11);
    }

    private static io.bidmachine.media3.common.a f(String str, w wVar, w wVar2, w wVar3, String str2) {
        int i10 = wVar.f106457e;
        byte[] bArr = new byte[wVar2.f106457e + i10 + wVar3.f106457e];
        System.arraycopy(wVar.f106456d, 0, bArr, 0, i10);
        System.arraycopy(wVar2.f106456d, 0, bArr, wVar.f106457e, wVar2.f106457e);
        System.arraycopy(wVar3.f106456d, 0, bArr, wVar.f106457e + wVar2.f106457e, wVar3.f106457e);
        f.h hVarU = r9.f.u(wVar2.f106456d, 3, wVar2.f106457e, null);
        f.c cVar = hVarU.f99277c;
        return new a.b().f0(str).U(str2).u0("video/hevc").S(cVar != null ? q9.i.f(cVar.f99251a, cVar.f99252b, cVar.f99253c, cVar.f99254d, cVar.f99255e, cVar.f99256f) : null).B0(hVarU.f99282h).d0(hVarU.f99283i).T(new g.b().d(hVarU.f99286l).c(hVarU.f99287m).e(hVarU.f99288n).g(hVarU.f99279e + 8).b(hVarU.f99280f + 8).a()).q0(hVarU.f99284j).l0(hVarU.f99285k).m0(hVarU.f99276b + 1).g0(Collections.singletonList(bArr)).N();
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f106356e.g(j10, i10, i11, j11, this.f106357f);
        if (!this.f106357f) {
            this.f106359h.e(i11);
            this.f106360i.e(i11);
            this.f106361j.e(i11);
        }
        this.f106362k.e(i11);
        this.f106363l.e(i11);
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) {
        int i10;
        c();
        while (d0Var.a() > 0) {
            int iF = d0Var.f();
            int iG = d0Var.g();
            byte[] bArrE = d0Var.e();
            this.f106364m += (long) d0Var.a();
            this.f106355d.c(d0Var, d0Var.a());
            while (iF < iG) {
                int iE = r9.f.e(bArrE, iF, iG, this.f106358g);
                if (iE == iG) {
                    e(bArrE, iF, iG);
                    return;
                }
                int i11 = r9.f.i(bArrE, iE);
                if (iE <= 0 || bArrE[iE - 1] != 0) {
                    i10 = 3;
                } else {
                    iE--;
                    i10 = 4;
                }
                int i12 = iE;
                int i13 = i10;
                int i14 = i12 - iF;
                if (i14 > 0) {
                    e(bArrE, iF, i12);
                }
                int i15 = iG - i12;
                long j10 = this.f106364m - ((long) i15);
                d(j10, i15, i14 < 0 ? -i14 : 0, this.f106365n);
                g(j10, i15, i11, this.f106365n);
                iF = i12 + i13;
            }
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        this.f106354c = dVar.b();
        s0 s0VarTrack = tVar.track(dVar.c(), 2);
        this.f106355d = s0VarTrack;
        this.f106356e = new a(s0VarTrack);
        this.f106352a.d(tVar, dVar);
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
        c();
        if (z10) {
            this.f106352a.e();
            d(this.f106364m, 0, 0, this.f106365n);
            g(this.f106364m, 0, 48, this.f106365n);
        }
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        this.f106365n = j10;
    }

    @Override // vb.m
    public void seek() {
        this.f106364m = 0L;
        this.f106365n = -9223372036854775807L;
        r9.f.c(this.f106358g);
        this.f106359h.d();
        this.f106360i.d();
        this.f106361j.d();
        this.f106362k.d();
        this.f106363l.d();
        this.f106352a.b();
        a aVar = this.f106356e;
        if (aVar != null) {
            aVar.f();
        }
    }
}
