package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f22551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f22554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22555e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22563m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f22556f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f22557g = new r(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f22558h = new r(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f22559i = new r(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f22560j = new r(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f22561k = new r(40);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22564n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    public o(x xVar) {
        this.f22551a = xVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f22556f);
        r rVar = this.f22557g;
        rVar.f22584b = false;
        rVar.f22585c = false;
        r rVar2 = this.f22558h;
        rVar2.f22584b = false;
        rVar2.f22585c = false;
        r rVar3 = this.f22559i;
        rVar3.f22584b = false;
        rVar3.f22585c = false;
        r rVar4 = this.f22560j;
        rVar4.f22584b = false;
        rVar4.f22585c = false;
        r rVar5 = this.f22561k;
        rVar5.f22584b = false;
        rVar5.f22585c = false;
        n nVar = this.f22554d;
        nVar.f22543f = false;
        nVar.f22544g = false;
        nVar.f22545h = false;
        nVar.f22546i = false;
        nVar.f22547j = false;
        this.f22562l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f22552b = e0Var.f22454e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f22453d, 2);
        this.f22553c = gVarA;
        this.f22554d = new n(gVarA);
        this.f22551a.a(jVar, e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[PHI: r12 r15 r17 r18
  0x00a8: PHI (r12v1 int) = (r12v0 int), (r12v0 int), (r12v0 int), (r12v4 int) binds: [B:37:0x00cb, B:39:0x00d1, B:41:0x00d7, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r15v6 int) binds: [B:37:0x00cb, B:39:0x00d1, B:41:0x00d7, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r17v1 int) = (r17v0 int), (r17v0 int), (r17v0 int), (r17v3 int) binds: [B:37:0x00cb, B:39:0x00d1, B:41:0x00d7, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r18v1 long) = (r18v0 long), (r18v0 long), (r18v0 long), (r18v3 long) binds: [B:37:0x00cb, B:39:0x00d1, B:41:0x00d7, B:34:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
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
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n r42) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.o.a(com.fyber.inneractive.sdk.player.exoplayer2.util.n):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f22563m = j10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f22555e) {
            n nVar = this.f22554d;
            if (nVar.f22543f) {
                int i12 = nVar.f22541d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    nVar.f22544g = (bArr[i13] & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
                    nVar.f22543f = false;
                } else {
                    nVar.f22541d = (i11 - i10) + i12;
                }
            }
        } else {
            this.f22557g.a(bArr, i10, i11);
            this.f22558h.a(bArr, i10, i11);
            this.f22559i.a(bArr, i10, i11);
        }
        this.f22560j.a(bArr, i10, i11);
        this.f22561k.a(bArr, i10, i11);
    }
}
