package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pe0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u43 f114643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f114644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yv0 f114645e;

    public pe0(int i10, int i11, u43 u43Var) {
        this.f114642b = i10;
        this.f114643c = u43Var;
        this.f114644d = i11;
        this.f114645e = u43Var.a(i11);
    }

    public abstract int a();

    public abstract boolean a(pe0 pe0Var);
}
