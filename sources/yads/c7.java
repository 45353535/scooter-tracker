package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class c7 implements iv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a7 f109263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109264b;

    public c7(a7 a7Var, int i10) {
        this.f109263a = a7Var;
        this.f109264b = i10;
    }

    @Override // yads.iv
    public final boolean a() {
        return this.f109263a.f108587b <= this.f109264b;
    }
}
