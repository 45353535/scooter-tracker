package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class hh1 extends bw0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f111593f = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f111594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f111595e;

    public hh1(f43 f43Var, Object obj, Object obj2) {
        super(f43Var);
        this.f111594d = obj;
        this.f111595e = obj2;
    }

    @Override // yads.bw0, yads.f43
    public final int a(Object obj) {
        Object obj2;
        f43 f43Var = this.f109134c;
        if (f111593f.equals(obj) && (obj2 = this.f111595e) != null) {
            obj = obj2;
        }
        return f43Var.a(obj);
    }

    @Override // yads.f43
    public final c43 a(int i10, c43 c43Var, boolean z10) {
        this.f109134c.a(i10, c43Var, z10);
        if (w83.a(c43Var.f109215c, this.f111595e) && z10) {
            c43Var.f109215c = f111593f;
        }
        return c43Var;
    }

    @Override // yads.bw0, yads.f43
    public final Object a(int i10) {
        Object objA = this.f109134c.a(i10);
        return w83.a(objA, this.f111595e) ? f111593f : objA;
    }

    @Override // yads.bw0, yads.f43
    public final e43 a(int i10, e43 e43Var, long j10) {
        this.f109134c.a(i10, e43Var, j10);
        if (w83.a(e43Var.f110187b, this.f111594d)) {
            e43Var.f110187b = e43.f110183s;
        }
        return e43Var;
    }

    public static hh1 a(rk1 rk1Var) {
        return new hh1(new ih1(rk1Var), e43.f110183s, f111593f);
    }

    public static hh1 a(f43 f43Var) {
        return new hh1(f43Var, null, null);
    }
}
