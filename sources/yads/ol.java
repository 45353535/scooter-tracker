package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ol implements nu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f114362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ql f114363b;

    public ol(ql qlVar, long j10) {
        this.f114363b = qlVar;
        this.f114362a = j10;
    }

    @Override // yads.nu2
    public final boolean b() {
        return true;
    }

    @Override // yads.nu2
    public final long c() {
        return this.f114362a;
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        lu2 lu2VarB = this.f114363b.f115060g[0].b(j10);
        int i10 = 1;
        while (true) {
            zt[] ztVarArr = this.f114363b.f115060g;
            if (i10 >= ztVarArr.length) {
                return lu2VarB;
            }
            lu2 lu2VarB2 = ztVarArr[i10].b(j10);
            if (lu2VarB2.f113228a.f114790b < lu2VarB.f113228a.f114790b) {
                lu2VarB = lu2VarB2;
            }
            i10++;
        }
    }
}
