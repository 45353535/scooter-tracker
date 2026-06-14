package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class vj implements sj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w92 f117014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f117017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f117018e;

    public vj(oj ojVar) {
        w92 w92Var = ojVar.f114339b;
        this.f117014a = w92Var;
        w92Var.e(12);
        this.f117016c = w92Var.p() & 255;
        this.f117015b = w92Var.p();
    }

    @Override // yads.sj
    public final int a() {
        return -1;
    }

    @Override // yads.sj
    public final int b() {
        return this.f117015b;
    }

    @Override // yads.sj
    public final int c() {
        int i10 = this.f117016c;
        if (i10 == 8) {
            return this.f117014a.m();
        }
        if (i10 == 16) {
            return this.f117014a.r();
        }
        int i11 = this.f117017d;
        this.f117017d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f117018e & 15;
        }
        int iM = this.f117014a.m();
        this.f117018e = iM;
        return (iM & 240) >> 4;
    }
}
