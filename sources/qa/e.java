package qa;

import java.util.Arrays;
import oa.m0;
import oa.n0;
import oa.s;
import oa.s0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f98933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s0 f98934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f98935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f98936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f98937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f98938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f98939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f98940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f98941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f98942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f98943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f98944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f98945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f98946n;

    public e(int i10, d dVar, s0 s0Var) {
        this.f98933a = dVar;
        int iB = dVar.b();
        boolean z10 = true;
        if (iB != 1 && iB != 2) {
            z10 = false;
        }
        q9.a.a(z10);
        this.f98935c = d(i10, iB == 2 ? 1667497984 : 1651965952);
        this.f98937e = dVar.a();
        this.f98934b = s0Var;
        this.f98936d = iB == 2 ? d(i10, 1650720768) : -1;
        this.f98944l = -1L;
        this.f98945m = new long[512];
        this.f98946n = new int[512];
        this.f98938f = dVar.f98930e;
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f98937e * ((long) i10)) / ((long) this.f98938f);
    }

    private n0 h(int i10) {
        return new n0(((long) this.f98946n[i10]) * g(), this.f98945m[i10]);
    }

    public void a() {
        this.f98941i++;
    }

    public void b(long j10, boolean z10) {
        if (this.f98944l == -1) {
            this.f98944l = j10;
        }
        if (z10) {
            if (this.f98943k == this.f98946n.length) {
                long[] jArr = this.f98945m;
                this.f98945m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f98946n;
                this.f98946n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f98945m;
            int i10 = this.f98943k;
            jArr2[i10] = j10;
            this.f98946n[i10] = this.f98942j;
            this.f98943k = i10 + 1;
        }
        this.f98942j++;
    }

    public void c() {
        int i10;
        this.f98945m = Arrays.copyOf(this.f98945m, this.f98943k);
        this.f98946n = Arrays.copyOf(this.f98946n, this.f98943k);
        if (!k() || this.f98933a.f98932g == 0 || (i10 = this.f98943k) <= 0) {
            return;
        }
        this.f98938f = i10;
    }

    public long f() {
        return e(this.f98941i);
    }

    public long g() {
        return e(1);
    }

    public m0.a i(long j10) {
        if (this.f98943k == 0) {
            return new m0.a(new n0(0L, this.f98944l));
        }
        int iG = (int) (j10 / g());
        int iG2 = o0.g(this.f98946n, iG, true, true);
        if (this.f98946n[iG2] == iG) {
            return new m0.a(h(iG2));
        }
        n0 n0VarH = h(iG2);
        int i10 = iG2 + 1;
        return i10 < this.f98945m.length ? new m0.a(n0VarH, h(i10)) : new m0.a(n0VarH);
    }

    public boolean j(int i10) {
        return this.f98935c == i10 || this.f98936d == i10;
    }

    public boolean k() {
        return (this.f98935c & 1651965952) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f98946n, this.f98941i) >= 0;
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
    public boolean m(s sVar) {
        int i10 = this.f98940h;
        int iB = i10 - this.f98934b.b(sVar, i10, false);
        this.f98940h = iB;
        boolean z10 = iB == 0;
        if (z10) {
            if (this.f98939g > 0) {
                this.f98934b.e(f(), l() ? 1 : 0, this.f98939g, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f98939g = i10;
        this.f98940h = i10;
    }

    public void o(long j10) {
        if (this.f98943k == 0) {
            this.f98941i = 0;
        } else {
            this.f98941i = this.f98946n[o0.h(this.f98945m, j10, true, true)];
        }
    }
}
