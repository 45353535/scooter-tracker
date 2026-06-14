package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final double[] f22476n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f22481e = new boolean[4];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f22482f = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22489m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f22481e);
        i iVar = this.f22482f;
        iVar.f22472a = false;
        iVar.f22473b = 0;
        iVar.f22474c = 0;
        this.f22486j = false;
        this.f22483g = false;
        this.f22484h = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f22477a = e0Var.f22454e;
        e0Var.b();
        this.f22478b = jVar.a(e0Var.f22453d, 2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        boolean z11 = j10 != -9223372036854775807L;
        this.f22486j = z11;
        if (z11) {
            this.f22485i = j10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
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
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n r28) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j.a(com.fyber.inneractive.sdk.player.exoplayer2.util.n):void");
    }
}
