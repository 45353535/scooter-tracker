package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class xx implements wh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vh1 f118006a = new vh1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wh1[] f118007b;

    public xx(wh1... wh1VarArr) {
        this.f118007b = wh1VarArr;
    }

    @Override // yads.wh1
    public final vh1 a(int i10, int i11) {
        wh1[] wh1VarArr = this.f118007b;
        int length = wh1VarArr.length;
        int i12 = 0;
        while (i12 < length) {
            vh1 vh1VarA = wh1VarArr[i12].a(i10, i11);
            int i13 = vh1VarA.f117010a;
            i12++;
            i11 = vh1VarA.f117011b;
            i10 = i13;
        }
        vh1 vh1Var = this.f118006a;
        vh1Var.f117010a = i10;
        vh1Var.f117011b = i11;
        return vh1Var;
    }
}
