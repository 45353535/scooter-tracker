package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class vp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final op0 f117140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa f117141b;

    public /* synthetic */ vp0(Context context, c4 c4Var, es2 es2Var, op0 op0Var) {
        this(op0Var, new xa(context, es2Var, c4Var));
    }

    public final void a(long j10) {
        op0 op0Var = this.f117140a;
        if (j10 <= op0Var.f114383c) {
            this.f117141b.a(op0Var.f114382b, x53.f117715e);
        }
    }

    public vp0(op0 op0Var, xa xaVar) {
        this.f117140a = op0Var;
        this.f117141b = xaVar;
    }
}
