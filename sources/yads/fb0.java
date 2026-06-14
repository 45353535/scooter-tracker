package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class fb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tk[] f110682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gw2 f110683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pz2 f110684c;

    public fb0(tk[] tkVarArr, gw2 gw2Var, pz2 pz2Var) {
        tk[] tkVarArr2 = new tk[tkVarArr.length + 2];
        this.f110682a = tkVarArr2;
        System.arraycopy(tkVarArr, 0, tkVarArr2, 0, tkVarArr.length);
        this.f110683b = gw2Var;
        this.f110684c = pz2Var;
        tkVarArr2[tkVarArr.length] = gw2Var;
        tkVarArr2[tkVarArr.length + 1] = pz2Var;
    }

    public final tk[] a() {
        return this.f110682a;
    }
}
