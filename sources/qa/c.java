package qa;

import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f98925d;

    private c(int i10, int i11, int i12, int i13) {
        this.f98922a = i10;
        this.f98923b = i11;
        this.f98924c = i12;
        this.f98925d = i13;
    }

    public static c b(d0 d0Var) {
        int iU = d0Var.u();
        d0Var.X(8);
        int iU2 = d0Var.u();
        int iU3 = d0Var.u();
        d0Var.X(4);
        int iU4 = d0Var.u();
        d0Var.X(12);
        return new c(iU, iU2, iU3, iU4);
    }

    public boolean a() {
        return (this.f98923b & 16) == 16;
    }

    @Override // qa.a
    public int getType() {
        return 1751742049;
    }
}
