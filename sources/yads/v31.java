package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class v31 extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y31 f116865d;

    public v31(int i10, y31 y31Var) {
        super(y31Var.size(), i10);
        this.f116865d = y31Var;
    }

    @Override // yads.f
    public final Object a(int i10) {
        return this.f116865d.get(i10);
    }
}
