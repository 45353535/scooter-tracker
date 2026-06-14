package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class wy0 implements qk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av2 f117632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f117633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f117634c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f117638g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f117640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z43 f117641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public vy0 f117642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f117643l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f117645n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f117639h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lw1 f117635d = new lw1(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw1 f117636e = new lw1(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lw1 f117637f = new lw1(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f117644m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w92 f117646o = new w92();

    public wy0(av2 av2Var, boolean z10, boolean z11) {
        this.f117632a = av2Var;
        this.f117633b = z10;
        this.f117634c = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0323  */
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
            Method dump skipped, instruction units count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wy0.a(yads.w92):void");
    }

    @Override // yads.qk0
    public final void b() {
    }

    @Override // yads.qk0
    public final void a(ap0 ap0Var, y63 y63Var) {
        y63Var.a();
        y63Var.b();
        this.f117640i = y63Var.f118107e;
        y63Var.b();
        z43 z43VarA = ap0Var.a(y63Var.f118106d, 2);
        this.f117641j = z43VarA;
        this.f117642k = new vy0(z43VarA, this.f117633b, this.f117634c);
        this.f117632a.a(ap0Var, y63Var);
    }

    @Override // yads.qk0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f117644m = j10;
        }
        this.f117645n = ((i10 & 2) != 0) | this.f117645n;
    }

    @Override // yads.qk0
    public final void a() {
        this.f117638g = 0L;
        this.f117645n = false;
        this.f117644m = -9223372036854775807L;
        pw1.a(this.f117639h);
        lw1 lw1Var = this.f117635d;
        lw1Var.f113240b = false;
        lw1Var.f113241c = false;
        lw1 lw1Var2 = this.f117636e;
        lw1Var2.f113240b = false;
        lw1Var2.f113241c = false;
        lw1 lw1Var3 = this.f117637f;
        lw1Var3.f113240b = false;
        lw1Var3.f113241c = false;
        vy0 vy0Var = this.f117642k;
        if (vy0Var != null) {
            vy0Var.a();
        }
    }
}
