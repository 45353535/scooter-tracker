package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f22524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22526c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22530g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f22532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f22534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22536m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f22531h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f22527d = new r(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f22528e = new r(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f22529f = new r(6);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22537n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    public m(x xVar, boolean z10, boolean z11) {
        this.f22524a = xVar;
        this.f22525b = z10;
        this.f22526c = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f22531h);
        r rVar = this.f22527d;
        rVar.f22584b = false;
        rVar.f22585c = false;
        r rVar2 = this.f22528e;
        rVar2.f22584b = false;
        rVar2.f22585c = false;
        r rVar3 = this.f22529f;
        rVar3.f22584b = false;
        rVar3.f22585c = false;
        l lVar = this.f22534k;
        lVar.f22516k = false;
        lVar.f22520o = false;
        k kVar = lVar.f22519n;
        kVar.f22491b = false;
        kVar.f22490a = false;
        this.f22530g = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f22532i = e0Var.f22454e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f22453d, 2);
        this.f22533j = gVarA;
        this.f22534k = new l(gVarA, this.f22525b, this.f22526c);
        this.f22524a.a(jVar, e0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f22536m = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0241  */
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
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n r31) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m.a(com.fyber.inneractive.sdk.player.exoplayer2.util.n):void");
    }
}
