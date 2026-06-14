package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class g53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hl2[] f111077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bo0[] f111078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63 f111079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f111080e;

    public g53(hl2[] hl2VarArr, bo0[] bo0VarArr, b63 b63Var, zg1 zg1Var) {
        this.f111077b = hl2VarArr;
        this.f111078c = (bo0[]) bo0VarArr.clone();
        this.f111079d = b63Var;
        this.f111080e = zg1Var;
        this.f111076a = hl2VarArr.length;
    }

    public final boolean a(int i10) {
        return this.f111077b[i10] != null;
    }
}
