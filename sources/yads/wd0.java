package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class wd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f117428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f117429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kl1 f117430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f117431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f117432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xd0 f117433g;

    public wd0(xd0 xd0Var, String str, int i10, kl1 kl1Var) {
        this.f117433g = xd0Var;
        this.f117427a = str;
        this.f117428b = i10;
        this.f117429c = kl1Var == null ? -1L : kl1Var.f109965d;
        if (kl1Var == null || !kl1Var.a()) {
            return;
        }
        this.f117430d = kl1Var;
    }

    public final boolean a(re reVar) {
        long j10 = this.f117429c;
        if (j10 == -1) {
            return false;
        }
        kl1 kl1Var = reVar.f115413d;
        if (kl1Var == null) {
            return this.f117428b != reVar.f115412c;
        }
        if (kl1Var.f109965d > j10) {
            return true;
        }
        if (this.f117430d == null) {
            return false;
        }
        int iA = reVar.f115411b.a(kl1Var.f109962a);
        int iA2 = reVar.f115411b.a(this.f117430d.f109962a);
        kl1 kl1Var2 = reVar.f115413d;
        if (kl1Var2.f109965d < this.f117430d.f109965d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        if (!kl1Var2.a()) {
            int i10 = reVar.f115413d.f109966e;
            return i10 == -1 || i10 > this.f117430d.f109963b;
        }
        kl1 kl1Var3 = reVar.f115413d;
        int i11 = kl1Var3.f109963b;
        int i12 = kl1Var3.f109964c;
        kl1 kl1Var4 = this.f117430d;
        int i13 = kl1Var4.f109963b;
        return i11 > i13 || (i11 == i13 && i12 > kl1Var4.f109964c);
    }
}
