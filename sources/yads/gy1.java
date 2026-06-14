package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class gy1 implements ql0, h41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iy1 f111398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f111399b;

    public /* synthetic */ gy1(Context context, c4 c4Var, es2 es2Var, t9 t9Var) {
        iy1 iy1Var = new iy1();
        this(iy1Var, new f1(context, c4Var, es2Var, t9Var, iy1Var));
    }

    @Override // yads.ql0
    public final void a() {
        this.f111398a.a();
    }

    @Override // yads.h41
    public final void a(i5 i5Var) {
        this.f111398a.a(i5Var);
    }

    public gy1(iy1 iy1Var, f1 f1Var) {
        this.f111398a = iy1Var;
        this.f111399b = f1Var;
    }
}
