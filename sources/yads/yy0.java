package yads;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes4.dex */
public final class yy0 implements qk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av2 f118446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f118447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z43 f118448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xy0 f118449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f118450e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f118457l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f118451f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lw1 f118452g = new lw1(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lw1 f118453h = new lw1(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lw1 f118454i = new lw1(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lw1 f118455j = new lw1(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lw1 f118456k = new lw1(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f118458m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w92 f118459n = new w92();

    public yy0(av2 av2Var) {
        this.f118446a = av2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
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
    public final void a(yads.w92 r41) {
        /*
            Method dump skipped, instruction units count: 1221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yy0.a(yads.w92):void");
    }

    @Override // yads.qk0
    public final void b() {
    }

    @Override // yads.qk0
    public final void a(ap0 ap0Var, y63 y63Var) {
        y63Var.a();
        y63Var.b();
        this.f118447b = y63Var.f118107e;
        y63Var.b();
        z43 z43VarA = ap0Var.a(y63Var.f118106d, 2);
        this.f118448c = z43VarA;
        this.f118449d = new xy0(z43VarA);
        this.f118446a.a(ap0Var, y63Var);
    }

    public final void a(byte[] bArr, int i10, int i11) {
        xy0 xy0Var = this.f118449d;
        if (xy0Var.f118022f) {
            int i12 = xy0Var.f118020d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                xy0Var.f118023g = (bArr[i13] & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
                xy0Var.f118022f = false;
            } else {
                xy0Var.f118020d = (i11 - i10) + i12;
            }
        }
        if (!this.f118450e) {
            this.f118452g.a(bArr, i10, i11);
            this.f118453h.a(bArr, i10, i11);
            this.f118454i.a(bArr, i10, i11);
        }
        this.f118455j.a(bArr, i10, i11);
        this.f118456k.a(bArr, i10, i11);
    }

    @Override // yads.qk0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f118458m = j10;
        }
    }

    @Override // yads.qk0
    public final void a() {
        this.f118457l = 0L;
        this.f118458m = -9223372036854775807L;
        pw1.a(this.f118451f);
        lw1 lw1Var = this.f118452g;
        lw1Var.f113240b = false;
        lw1Var.f113241c = false;
        lw1 lw1Var2 = this.f118453h;
        lw1Var2.f113240b = false;
        lw1Var2.f113241c = false;
        lw1 lw1Var3 = this.f118454i;
        lw1Var3.f113240b = false;
        lw1Var3.f113241c = false;
        lw1 lw1Var4 = this.f118455j;
        lw1Var4.f113240b = false;
        lw1Var4.f113241c = false;
        lw1 lw1Var5 = this.f118456k;
        lw1Var5.f113240b = false;
        lw1Var5.f113241c = false;
        xy0 xy0Var = this.f118449d;
        if (xy0Var != null) {
            xy0Var.f118022f = false;
            xy0Var.f118023g = false;
            xy0Var.f118024h = false;
            xy0Var.f118025i = false;
            xy0Var.f118026j = false;
        }
    }
}
