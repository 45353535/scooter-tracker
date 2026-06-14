package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ty0 implements qk0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f116406l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u83 f116407a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sy0 f116412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f116413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f116414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z43 f116415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f116416j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f116409c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ry0 f116410d = new ry0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f116417k = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw1 f116411e = new lw1(178);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f116408b = new w92();

    public ty0(u83 u83Var) {
        this.f116407a = u83Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
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
    @Override // yads.qk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.w92 r29) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ty0.a(yads.w92):void");
    }

    @Override // yads.qk0
    public final void b() {
    }

    @Override // yads.qk0
    public final void a(ap0 ap0Var, y63 y63Var) {
        y63Var.a();
        y63Var.b();
        this.f116414h = y63Var.f118107e;
        y63Var.b();
        z43 z43VarA = ap0Var.a(y63Var.f118106d, 2);
        this.f116415i = z43VarA;
        this.f116412f = new sy0(z43VarA);
        u83 u83Var = this.f116407a;
        if (u83Var != null) {
            u83Var.a(ap0Var, y63Var);
        }
    }

    @Override // yads.qk0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f116417k = j10;
        }
    }

    @Override // yads.qk0
    public final void a() {
        pw1.a(this.f116409c);
        ry0 ry0Var = this.f116410d;
        ry0Var.f115640a = false;
        ry0Var.f115642c = 0;
        ry0Var.f115641b = 0;
        sy0 sy0Var = this.f116412f;
        if (sy0Var != null) {
            sy0Var.f115981b = false;
            sy0Var.f115982c = false;
            sy0Var.f115983d = false;
            sy0Var.f115984e = -1;
        }
        lw1 lw1Var = this.f116411e;
        if (lw1Var != null) {
            lw1Var.f113240b = false;
            lw1Var.f113241c = false;
        }
        this.f116413g = 0L;
        this.f116417k = -9223372036854775807L;
    }
}
