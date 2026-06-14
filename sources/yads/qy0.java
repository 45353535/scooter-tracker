package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class qy0 implements qk0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f115196q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f115197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z43 f115198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u83 f115199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w92 f115200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw1 f115201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f115202f = new boolean[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final py0 f115203g = new py0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f115204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f115205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f115206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f115207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f115208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f115209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f115210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f115211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f115212p;

    public qy0(u83 u83Var) {
        this.f115199c = u83Var;
        if (u83Var != null) {
            this.f115201e = new lw1(178);
            this.f115200d = new w92();
        } else {
            this.f115201e = null;
            this.f115200d = null;
        }
        this.f115208l = -9223372036854775807L;
        this.f115210n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0210  */
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
    public final void a(yads.w92 r31) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.qy0.a(yads.w92):void");
    }

    @Override // yads.qk0
    public final void b() {
    }

    @Override // yads.qk0
    public final void a(ap0 ap0Var, y63 y63Var) {
        y63Var.a();
        y63Var.b();
        this.f115197a = y63Var.f118107e;
        y63Var.b();
        this.f115198b = ap0Var.a(y63Var.f118106d, 2);
        u83 u83Var = this.f115199c;
        if (u83Var != null) {
            u83Var.a(ap0Var, y63Var);
        }
    }

    @Override // yads.qk0
    public final void a(int i10, long j10) {
        this.f115208l = j10;
    }

    @Override // yads.qk0
    public final void a() {
        pw1.a(this.f115202f);
        py0 py0Var = this.f115203g;
        py0Var.f114809a = false;
        py0Var.f114810b = 0;
        py0Var.f114811c = 0;
        lw1 lw1Var = this.f115201e;
        if (lw1Var != null) {
            lw1Var.f113240b = false;
            lw1Var.f113241c = false;
        }
        this.f115204h = 0L;
        this.f115205i = false;
        this.f115208l = -9223372036854775807L;
        this.f115210n = -9223372036854775807L;
    }
}
