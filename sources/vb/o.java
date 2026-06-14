package vb;

import io.bidmachine.media3.common.a;
import java.util.Arrays;
import java.util.Collections;
import oa.s0;
import q9.o0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f106274m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f106275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.d0 f106277c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f106280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f106281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f106282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f106283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s0 f106284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f106285k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f106278d = new boolean[4];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f106279e = new a(128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f106286l = -9223372036854775807L;

    private static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f106287f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f106288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f106289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f106290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f106291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f106292e;

        public a(int i10) {
            this.f106292e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f106288a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f106292e;
                int length = bArr2.length;
                int i13 = this.f106290c;
                if (length < i13 + i12) {
                    this.f106292e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f106292e, this.f106290c, i12);
                this.f106290c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f106289b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f106290c -= i11;
                                this.f106288a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            q9.u.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f106291d = this.f106290c;
                            this.f106289b = 4;
                        }
                    } else if (i10 > 31) {
                        q9.u.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f106289b = 3;
                    }
                } else if (i10 != 181) {
                    q9.u.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f106289b = 2;
                }
            } else if (i10 == 176) {
                this.f106289b = 1;
                this.f106288a = true;
            }
            byte[] bArr = f106287f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f106288a = false;
            this.f106290c = 0;
            this.f106289b = 0;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0 f106293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f106294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f106295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f106296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f106297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f106298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f106299g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f106300h;

        public b(s0 s0Var) {
            this.f106293a = s0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f106295c) {
                int i12 = this.f106298f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f106298f = i12 + (i11 - i10);
                } else {
                    this.f106296d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f106295c = false;
                }
            }
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
        public void b(long j10, int i10, boolean z10) {
            q9.a.g(this.f106300h != -9223372036854775807L);
            if (this.f106297e == 182 && z10 && this.f106294b) {
                this.f106293a.e(this.f106300h, this.f106296d ? 1 : 0, (int) (j10 - this.f106299g), i10, null);
            }
            if (this.f106297e != 179) {
                this.f106299g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f106297e = i10;
            this.f106296d = false;
            this.f106294b = i10 == 182 || i10 == 179;
            this.f106295c = i10 == 182;
            this.f106298f = 0;
            this.f106300h = j10;
        }

        public void d() {
            this.f106294b = false;
            this.f106295c = false;
            this.f106296d = false;
            this.f106297e = -1;
        }
    }

    o(n0 n0Var, String str) {
        this.f106275a = n0Var;
        this.f106276b = str;
        if (n0Var != null) {
            this.f106280f = new w(178, 128);
            this.f106277c = new q9.d0();
        } else {
            this.f106280f = null;
            this.f106277c = null;
        }
    }

    private static io.bidmachine.media3.common.a c(a aVar, int i10, String str, String str2) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f106292e, aVar.f106290c);
        q9.c0 c0Var = new q9.c0(bArrCopyOf);
        c0Var.s(i10);
        c0Var.s(4);
        c0Var.q();
        c0Var.r(8);
        if (c0Var.g()) {
            c0Var.r(4);
            c0Var.r(3);
        }
        int iH = c0Var.h(4);
        float f10 = 1.0f;
        if (iH == 15) {
            int iH2 = c0Var.h(8);
            int iH3 = c0Var.h(8);
            if (iH3 == 0) {
                q9.u.h("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = iH2 / iH3;
            }
        } else {
            float[] fArr = f106274m;
            if (iH < fArr.length) {
                f10 = fArr[iH];
            } else {
                q9.u.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (c0Var.g()) {
            c0Var.r(2);
            c0Var.r(1);
            if (c0Var.g()) {
                c0Var.r(15);
                c0Var.q();
                c0Var.r(15);
                c0Var.q();
                c0Var.r(15);
                c0Var.q();
                c0Var.r(3);
                c0Var.r(11);
                c0Var.q();
                c0Var.r(15);
                c0Var.q();
            }
        }
        if (c0Var.h(2) != 0) {
            q9.u.h("H263Reader", "Unhandled video object layer shape");
        }
        c0Var.q();
        int iH4 = c0Var.h(16);
        c0Var.q();
        if (c0Var.g()) {
            if (iH4 == 0) {
                q9.u.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iH4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                c0Var.r(i11);
            }
        }
        c0Var.q();
        int iH5 = c0Var.h(13);
        c0Var.q();
        int iH6 = c0Var.h(13);
        c0Var.q();
        c0Var.q();
        return new a.b().f0(str).U(str2).u0("video/mp4v-es").B0(iH5).d0(iH6).q0(f10).g0(Collections.singletonList(bArrCopyOf)).N();
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) {
        q9.a.i(this.f106281g);
        q9.a.i(this.f106284j);
        int iF = d0Var.f();
        int iG = d0Var.g();
        byte[] bArrE = d0Var.e();
        this.f106282h += (long) d0Var.a();
        this.f106284j.c(d0Var, d0Var.a());
        while (true) {
            int iE = r9.f.e(bArrE, iF, iG, this.f106278d);
            if (iE == iG) {
                break;
            }
            int i10 = iE + 3;
            int i11 = d0Var.e()[i10] & 255;
            int i12 = iE - iF;
            int i13 = 0;
            if (!this.f106285k) {
                if (i12 > 0) {
                    this.f106279e.a(bArrE, iF, iE);
                }
                if (this.f106279e.b(i11, i12 < 0 ? -i12 : 0)) {
                    s0 s0Var = this.f106284j;
                    a aVar = this.f106279e;
                    s0Var.f(c(aVar, aVar.f106291d, (String) q9.a.e(this.f106283i), this.f106276b));
                    this.f106285k = true;
                }
            }
            this.f106281g.a(bArrE, iF, iE);
            w wVar = this.f106280f;
            if (wVar != null) {
                if (i12 > 0) {
                    wVar.a(bArrE, iF, iE);
                } else {
                    i13 = -i12;
                }
                if (this.f106280f.b(i13)) {
                    w wVar2 = this.f106280f;
                    ((q9.d0) o0.i(this.f106277c)).U(this.f106280f.f106456d, r9.f.L(wVar2.f106456d, wVar2.f106457e));
                    ((n0) o0.i(this.f106275a)).a(this.f106286l, this.f106277c);
                }
                if (i11 == 178 && d0Var.e()[iE + 2] == 1) {
                    this.f106280f.e(i11);
                }
            }
            int i14 = iG - iE;
            this.f106281g.b(this.f106282h - ((long) i14), i14, this.f106285k);
            this.f106281g.c(i11, this.f106286l);
            iF = i10;
        }
        if (!this.f106285k) {
            this.f106279e.a(bArrE, iF, iG);
        }
        this.f106281g.a(bArrE, iF, iG);
        w wVar3 = this.f106280f;
        if (wVar3 != null) {
            wVar3.a(bArrE, iF, iG);
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        this.f106283i = dVar.b();
        s0 s0VarTrack = tVar.track(dVar.c(), 2);
        this.f106284j = s0VarTrack;
        this.f106281g = new b(s0VarTrack);
        n0 n0Var = this.f106275a;
        if (n0Var != null) {
            n0Var.b(tVar, dVar);
        }
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
        q9.a.i(this.f106281g);
        if (z10) {
            this.f106281g.b(this.f106282h, 0, this.f106285k);
            this.f106281g.d();
        }
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        this.f106286l = j10;
    }

    @Override // vb.m
    public void seek() {
        r9.f.c(this.f106278d);
        this.f106279e.c();
        b bVar = this.f106281g;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f106280f;
        if (wVar != null) {
            wVar.d();
        }
        this.f106282h = 0L;
        this.f106286l = -9223372036854775807L;
    }
}
