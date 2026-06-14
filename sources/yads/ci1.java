package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ci1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00 f109405a;

    public ci1(k00 k00Var) {
        this.f109405a = k00Var;
    }

    public final Float a() {
        int i10;
        int i11;
        k00 k00Var = this.f109405a;
        t00 t00Var = k00Var.f112529a;
        m00 m00Var = k00Var.f112532d;
        if (t00Var != null) {
            return Float.valueOf(t00Var.f116004a);
        }
        if (m00Var == null || (i10 = m00Var.f113283c) <= 0 || (i11 = m00Var.f113284d) <= 0) {
            return null;
        }
        return Float.valueOf(i10 / i11);
    }
}
