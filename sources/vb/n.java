package vb;

import java.util.Arrays;
import oa.s0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final double[] f106248r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s0 f106250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f106251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f106252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q9.d0 f106253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f106254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f106255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f106256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f106257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f106258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f106259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f106260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f106261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f106262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f106263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f106264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f106265q;

    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f106266e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f106267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f106268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f106269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f106270d;

        public a(int i10) {
            this.f106270d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f106267a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f106270d;
                int length = bArr2.length;
                int i13 = this.f106268b;
                if (length < i13 + i12) {
                    this.f106270d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f106270d, this.f106268b, i12);
                this.f106268b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f106267a) {
                int i12 = this.f106268b - i11;
                this.f106268b = i12;
                if (this.f106269c != 0 || i10 != 181) {
                    this.f106267a = false;
                    return true;
                }
                this.f106269c = i12;
            } else if (i10 == 179) {
                this.f106267a = true;
            }
            byte[] bArr = f106266e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f106267a = false;
            this.f106268b = 0;
            this.f106269c = 0;
        }
    }

    public n(String str) {
        this(null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair c(vb.n.a r8, java.lang.String r9, java.lang.String r10) {
        /*
            byte[] r0 = r8.f106270d
            int r1 = r8.f106268b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            io.bidmachine.media3.common.a$b r6 = new io.bidmachine.media3.common.a$b
            r6.<init>()
            io.bidmachine.media3.common.a$b r9 = r6.f0(r9)
            io.bidmachine.media3.common.a$b r9 = r9.U(r10)
            java.lang.String r10 = "video/mpeg2"
            io.bidmachine.media3.common.a$b r9 = r9.u0(r10)
            io.bidmachine.media3.common.a$b r9 = r9.B0(r2)
            io.bidmachine.media3.common.a$b r9 = r9.d0(r4)
            io.bidmachine.media3.common.a$b r9 = r9.q0(r1)
            java.util.List r10 = java.util.Collections.singletonList(r0)
            io.bidmachine.media3.common.a$b r9 = r9.g0(r10)
            io.bidmachine.media3.common.a r9 = r9.N()
            r10 = r0[r5]
            r10 = r10 & 15
            int r10 = r10 + (-1)
            if (r10 < 0) goto L9c
            double[] r1 = vb.n.f106248r
            int r2 = r1.length
            if (r10 >= r2) goto L9c
            r4 = r1[r10]
            int r8 = r8.f106269c
            int r8 = r8 + 9
            r8 = r0[r8]
            r10 = r8 & 96
            int r10 = r10 >> r3
            r8 = r8 & 31
            if (r10 == r8) goto L94
            double r0 = (double) r10
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r8 = r8 + 1
            double r2 = (double) r8
            double r0 = r0 / r2
            double r4 = r4 * r0
        L94:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r4
            long r0 = (long) r0
            goto L9e
        L9c:
            r0 = 0
        L9e:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.n.c(vb.n$a, java.lang.String, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
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
    @Override // vb.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(q9.d0 r20) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.n.a(q9.d0):void");
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        this.f106249a = dVar.b();
        this.f106250b = tVar.track(dVar.c(), 2);
        n0 n0Var = this.f106251c;
        if (n0Var != null) {
            n0Var.b(tVar, dVar);
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
    @Override // vb.m
    public void packetFinished(boolean z10) {
        q9.a.i(this.f106250b);
        if (z10) {
            boolean z11 = this.f106264p;
            this.f106250b.e(this.f106263o, z11 ? 1 : 0, (int) (this.f106257i - this.f106262n), 0, null);
        }
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        this.f106261m = j10;
    }

    @Override // vb.m
    public void seek() {
        r9.f.c(this.f106255g);
        this.f106256h.c();
        w wVar = this.f106254f;
        if (wVar != null) {
            wVar.d();
        }
        this.f106257i = 0L;
        this.f106258j = false;
        this.f106261m = -9223372036854775807L;
        this.f106263o = -9223372036854775807L;
    }

    n(n0 n0Var, String str) {
        this.f106251c = n0Var;
        this.f106252d = str;
        this.f106255g = new boolean[4];
        this.f106256h = new a(128);
        if (n0Var != null) {
            this.f106254f = new w(178, 128);
            this.f106253e = new q9.d0();
        } else {
            this.f106254f = null;
            this.f106253e = null;
        }
        this.f106261m = -9223372036854775807L;
        this.f106263o = -9223372036854775807L;
    }
}
