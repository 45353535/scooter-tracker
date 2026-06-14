package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class zn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u43 f118742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f118743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118744c;

    public zn0(int i10, u43 u43Var, int[] iArr) {
        if (iArr.length == 0) {
            uf1.a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f118742a = u43Var;
        this.f118743b = iArr;
        this.f118744c = i10;
    }
}
